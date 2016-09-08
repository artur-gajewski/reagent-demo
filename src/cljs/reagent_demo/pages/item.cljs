(ns reagent-demo.pages.item
  (:require [reagent-demo.state :as state]
            [reagent-demo.components.title :as title]))

(defn item []
  [:div
   [title/render "Route param example"]

   [:div
    [:a {:href "/"} "« Back to the main page"]]

     [:div
      [:p
       (str "You requested page with item ID: " @state/item-id)]]])
