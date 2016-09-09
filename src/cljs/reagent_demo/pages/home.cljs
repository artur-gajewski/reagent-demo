(ns reagent-demo.pages.home
  (:require [reagent-demo.components.title :as title]))

(defn home []
  [:div
   [title/render "Welcome to Reagent demo"]

   [:div
    [:p "This site is built on Reagent, a ClojureScript wrapper for React which is transpiled to native javascript
     React application. All pages on this site feature functions coded with Reagent. Feel free to click around and
     see how Reagent performs, and don't forget to check the Github repository for source code of this boilerplate."]]

   [:div
    [:a {:href "/about"} "» Read about Reagent"]]

   [:div
    [:a {:href "/item-list"} "» Create item list"]]

   [:div
    [:a {:href "/filter-items"} "» Filter a list"]]

   [:div
    [:a {:href "/item/3"} "» Route parameter"]]

   [:div
    [:a {:href "https://github.com/artur-gajewski/reagent-demo"} "» Source code"]]

   [:div
    [:h3 "About me"]

    [:p "Twitter: "
     [:a
      {:href "https://twitter.com/GajewskiArtur"}
      "https://twitter.com/GajewskiArtur"]]

    [:p "LinkedIn: "
     [:a
      {:href "https://fi.linkedin.com/in/arturgajewski"}
      "https://fi.linkedin.com/in/arturgajewski"]]]])
