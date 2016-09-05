(ns reagent-demo.action
  (:require [reagent-demo.state :refer [revealed]]))

(defn toggle-button []
  (reset! revealed (not @revealed)))

(defn reset-toggle-message []
  (reset! revealed false))
