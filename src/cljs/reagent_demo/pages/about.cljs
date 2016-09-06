(ns reagent-demo.pages.about
  (:require [reagent-demo.state :as state :refer [revealed]]
            [reagent-demo.components.title :as title :refer [render]]
            [reagent-demo.action :as action :refer [toggle-message-visibility]]))

(defn about []
  [:div [title/render "About Reagent"]

   [:div
    [:button {:class "toggle-button" :on-click #(action/toggle-message-visibility)} "Toggle message on/off"]]

   [:div
    [:a {:href "/"} "Back to the main page"]]

   (when @state/revealed
     [:div 
      [:h3 "You clicked on the button!!!"]])])
