(ns reagent-demo.state
  (:require [reagent.core :as reagent :refer [atom]]))

(defonce message-revealed (reagent/atom false))

(defonce items (reagent/atom []))

(defonce filter-text (reagent/atom ""))

(defonce filtered-items (reagent/atom [{:id 1 :description "January"}
                                       {:id 2 :description "February"}
                                       {:id 3 :description "March"}
                                       {:id 4 :description "April"}
                                       {:id 5 :description "May"}
                                       {:id 6 :description "June"}
                                       {:id 7 :description "July"}
                                       {:id 8 :description "August"}
                                       {:id 9 :description "September"}
                                       {:id 10 :description "October"}
                                       {:id 11 :description "November"}
                                       {:id 12 :description "December"}]))

(defonce item-id (reagent/atom nil))
