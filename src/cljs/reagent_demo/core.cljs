(ns reagent-demo.core
    (:require [reagent.core :as reagent :refer [atom]]
              [reagent.session :as session]
              [secretary.core :as secretary :include-macros true]
              [accountant.core :as accountant]
              [reagent-demo.action :as action]
              [reagent-demo.pages.home :refer [home]]
              [reagent-demo.pages.about :refer [about]]
              [reagent-demo.pages.items :refer [items]]))

(defn current-page []
  [:div [(session/get :current-page)]])

(secretary/defroute "/" []
                    (action/reset-toggle-message)
                    (session/put! :current-page #'home))

(secretary/defroute "/about" []
                    (action/reset-toggle-message)
                    (session/put! :current-page #'about))

(secretary/defroute "/items" []
                    (session/put! :current-page #'items))

(defn mount-root []
  (reagent/render [current-page] (.getElementById js/document "app")))

(defn init! []
  (accountant/configure-navigation!
    {:nav-handler
     (fn [path]
       (secretary/dispatch! path))
     :path-exists?
     (fn [path]
       (secretary/locate-route path))})
  (accountant/dispatch-current!)
  (mount-root))
