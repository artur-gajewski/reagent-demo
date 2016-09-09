(ns reagent-demo.components.item-form
  (:require [reagent.core :as reagent]
            [cljs-uuid.core :as uuid]
            [reagent-demo.action :as action]))

(defonce item-data (reagent/atom {:id nil
                                  :description nil}))

(defn clear-item-form []
  (swap! item-data assoc :id nil :description nil))

(defn- submit-form []
  (swap! item-data assoc :id (uuid/make-random))
  (action/add-item @item-data)
  (clear-item-form))

(defn render []
  [:div
   [:form {:onSubmit (fn [e] (.preventDefault e))}
    [:input {:type "text"
             :placeholder "Enter item description"
             :value (:description @item-data)
             :onChange #(swap! item-data assoc
                               :description (-> % .-target .-value))}]
    [:button {:onClick #(submit-form)} "Add item"]]])
