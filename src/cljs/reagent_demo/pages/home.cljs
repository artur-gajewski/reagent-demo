(ns reagent-demo.pages.home
  (:require [reagent-demo.components.title :as title]))

(defn home []
  [:div
   [title/render "Welcome to Reagent demo"]

   [:div
    [:a {:href "/about"} "» Read about Reagent"]]

   [:div
    [:a {:href "/item-list"} "» Create item list"]]

   [:div
    [:a {:href "/filter-items"} "» Filter a list"]]

   [:div
    [:a {:href "/item/3"} "» Route parameter"]]

   [:div
    [:a {:href "https://github.com/artur-gajewski/reagent-demo"} "» Source code"]]])
