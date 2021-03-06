(ns reagent-demo.router
  (:require [reagent.session :as session]
            [secretary.core :as secretary :include-macros true]
            [reagent-demo.action :as action]
            [reagent-demo.pages.home :refer [home]]
            [reagent-demo.pages.about :refer [about]]
            [reagent-demo.pages.item-list :refer [item-list]]
            [reagent-demo.pages.filter-items :refer [filter-items]]
            [reagent-demo.pages.item :refer [item]]))

(defn create-routes []
  (secretary/defroute "/" []
                      (session/put! :current-page #'home))

  (secretary/defroute "/about" []
                      (action/reset-toggle-message)
                      (session/put! :current-page #'about))

  (secretary/defroute "/item-list" []
                      (session/put! :current-page #'item-list))

  (secretary/defroute "/filter-items" []
                      (action/reset-filter-text)
                      (session/put! :current-page #'filter-items))

  (secretary/defroute "/item/:id" [id]
                      (action/reset-item-id id)
                      (session/put! :current-page #'item)))