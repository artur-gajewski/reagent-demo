(ns reagent-demo.components.filter-item-form
  (:require [reagent-demo.state :as state]
            [reagent-demo.action :as action]))

(defn render []
  [:div
   [:input {:type "text"
            :placeholder "Enter item"
            :value @state/filter-text
            :onChange #(action/set-filter-text (-> % .-target .-value))}]])
