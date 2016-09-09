(ns reagent-demo.components.item
  (:require [reagent-demo.action :as action]))

(defn render [id description]
  [:li description])
