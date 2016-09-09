(ns reagent-demo.action
  (:require [reagent-demo.state :as state]))

(defn toggle-message-visibility []
  (reset! state/message-revealed (not @state/message-revealed)))

(defn reset-toggle-message []
  (reset! state/message-revealed false))

(defn add-item [item]
  (reset! state/items (concat [item] @state/items)))

(defn remove-item [id]
  (reset! state/items (vec (remove #(= id (:id %)) @state/items))))

(defn set-filter-text [text]
  (reset! state/filter-text text))

(defn reset-filter-text []
  (reset! state/filter-text ""))

(defn reset-item-id [id]
  (reset! state/item-id id))