(ns reagent-demo.components.editable-item
  (:require [reagent-demo.action :as action]))

(defn render [id description]
  [:li (str description " ")
   [:button {:onClick #(action/remove-item id)} "Remove"]])
