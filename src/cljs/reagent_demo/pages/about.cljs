(ns reagent-demo.pages.about
  (:require [reagent.core :as reagent]
            [reagent-demo.state :as state]
            [reagent-demo.action :as action]
            [reagent-demo.components.title :as title]
            [reagent-demo.components.item-form :as item-form]
            [reagent-demo.components.item :as item]))

(defn about []
  [:div
   [title/render "About Reagent"]

   [:div
    [:button {:class "toggle-button" :on-click #(action/toggle-message-visibility)} "Toggle message on/off"]]

   [:div
    [:a {:href "/"} "Back to the main page"]]

   (when @state/revealed
     [:div
      [:h3 "Reagent is React with ClojureScript"]
      [:p
       "Reagent provides a minimalistic interface between ClojureScript and React. It allows you to define efficient React components using nothing but plain ClojureScript functions and data, that describe your UI using a Hiccup-like syntax."]
      [:p
       "The goal of Reagent is to make it possible to define arbitrarily complex UIs using just a couple of basic concepts, and to be fast enough by default that you rarely have to care about performance."]])

   [:div
    [:h3 "Items"]]

   [:div
    [item-form/render]]

   [:div
    [:ul
     (for [{:keys [id description]} @state/items]
       ^{:key id} [item/render description])]]])