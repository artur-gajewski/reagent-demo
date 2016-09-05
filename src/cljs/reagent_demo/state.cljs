(ns reagent-demo.state
  (:require [reagent.core :as reagent :refer [atom]]))

(defonce revealed (reagent/atom false))