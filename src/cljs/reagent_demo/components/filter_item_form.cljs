(ns reagent-demo.components.filter-item-form
  (:require [reagent-demo.action :as action]))

(defn render []
  [:div
   [:input {:type "text"
            :placeholder "Enter item"
            :onChange #(action/set-filter-text (-> % .-target .-value))}]])
