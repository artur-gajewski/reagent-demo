(ns reagent-demo.pages.home
  (:require [reagent-demo.components.title :as title]))

(defn home []
  [:div
   [title/render "Welcome to Reagent demo"]

   [:div
    [:a {:href "/about"} "» Read about Reagent"]]

   [:div
    [:a {:href "/items"} "» Create item list"]]

   [:div
    [:a {:href "/filter-items"} "» Filter a list"]]])
