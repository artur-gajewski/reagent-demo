(ns reagent-demo.pages.filter-items
  (:require [reagent-demo.state :as state]
            [reagent-demo.components.title :as title]
            [reagent-demo.components.filter_item_form :as filter-item-form]
            [reagent-demo.components.item :as item]
            [clojure.string :refer [lower-case includes?]]))

(defn filter-items []
  [:div
   [title/render "Filter items"]

   [:div
    [:a {:href "/"} "« Back to the main page"]]

   [:p
    "Filter the below list to narrow down the options."]

   [:div
    [:h3 "Items"]]

   [:div
    [filter-item-form/render]]

    (let [items @state/filtered-items
          filtered (if-not (empty? @state/filter-text)
                     (doall
                      (filter
                       #(-> (lower-case (% :description)) (includes? (lower-case @state/filter-text)))
                       items))
                     items)]
       [:div
        [:ul
         (for [{:keys [id description]} filtered]
           ^{:key id} [item/render description])]])])
