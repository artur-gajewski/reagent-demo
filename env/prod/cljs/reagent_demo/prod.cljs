(ns reagent-demo.prod
  (:require [reagent-demo.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
