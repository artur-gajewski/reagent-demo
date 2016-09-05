(ns reagent-demo.pages.home
  (:require [reagent-demo.components.title :as title :refer [render]]))

(defn home []
  [:div
   (title/render "Welcome to Reagent demo")

   [:div
    [:a {:href "/about"} "Go to about page"]]])