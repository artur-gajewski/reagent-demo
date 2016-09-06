(ns reagent-demo.action
  (:require [reagent-demo.state :as state]))

(defn toggle-message-visibility []
  (reset! state/revealed (not @state/revealed)))

(defn reset-toggle-message []
  (reset! state/revealed false))
