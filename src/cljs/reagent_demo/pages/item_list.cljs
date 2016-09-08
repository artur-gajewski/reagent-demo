(ns reagent-demo.pages.item-list
  (:require [reagent-demo.state :as state]
            [reagent-demo.components.title :as title]
            [reagent-demo.components.item-form :as item-form]
            [reagent-demo.components.item :as item]))

(defn item-list []
  [:div
   [title/render "Item list"]

   [:div
    [:a {:href "/"} "« Back to the main page"]]

    [:p
     "Fill-in the form and add new item to the list by clicking the submit button."]

   [:div
    [:h3 "Items"]]

   [:div
    [item-form/render]]

   [:div
    [:ul
     (for [{:keys [id description]} @state/items]
       ^{:key id} [item/render description])]]])
