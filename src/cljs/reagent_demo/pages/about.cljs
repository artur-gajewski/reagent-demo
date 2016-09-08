(ns reagent-demo.pages.about
  (:require [reagent-demo.state :as state]
            [reagent-demo.action :as action]
            [reagent-demo.components.title :as title]))

(defn about []
  [:div
   [title/render "About Reagent"]

   [:div
    [:button {:class "toggle-button" :on-click #(action/toggle-message-visibility)} "Toggle information text on/off"]]

   [:div
    [:a {:href "/"} "« Back to the main page"]]

   (when @state/message-revealed
     [:div
      [:h3 "Reagent is React with ClojureScript"]
      [:p
       "Reagent provides a minimalistic interface between ClojureScript and React. It allows you to define efficient React components using nothing but plain ClojureScript functions and data, that describe your UI using a Hiccup-like syntax."]
      [:p
       "The goal of Reagent is to make it possible to define arbitrarily complex UIs using just a couple of basic concepts, and to be fast enough by default that you rarely have to care about performance."]])])
