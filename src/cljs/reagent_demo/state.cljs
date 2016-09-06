(ns reagent-demo.state
  (:require [reagent.core :as reagent :refer [atom]]))

(defonce message-revealed (reagent/atom false))
(defonce items (reagent/atom []))
