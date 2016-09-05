(ns reagent-demo.pages.about
  (:require [reagent-demo.state :as state :refer [revealed]]
            [reagent-demo.components.title :as title :refer [render]]
            [reagent-demo.action :as action :refer [toggle-button]]))

(defn about []
  [:div (title/render "About Reagent")

   [:div
    [:button {:on-click #(action/toggle-button)} "Toggle message on/off"]]

   [:div
    [:a {:href "/"} "Back to the main page"]]

   (when @state/revealed
     [:div 
      [:h3 "You clicked on the button!!!"]])])
