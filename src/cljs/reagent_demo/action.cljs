(ns reagent-demo.action
  (:require [reagent-demo.state :as state]))

(defn toggle-message-visibility []
  (reset! state/message-revealed (not @state/message-revealed)))

(defn reset-toggle-message []
  (reset! state/message-revealed false))

(defn add-item [item]
  (reset! state/items (concat [item] @state/items)))
