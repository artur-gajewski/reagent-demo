(ns reagent-demo.handler
  (:require [compojure.core :refer [GET defroutes]]
            [compojure.route :refer [not-found resources]]
            [hiccup.page :refer [include-js include-css html5]]
            [reagent-demo.middleware :refer [wrap-middleware]]
            [config.core :refer [env]]))

(defn head []
  [:head
   [:title "Reagent Demo"]
   [:meta {:charset "utf-8"}]
   [:meta {:name "viewport"
           :content "width=device-width, initial-scale=1"}]
   (include-css (if (env :dev) "/css/site.css" "/css/site.min.css"))])

(defn base-html []
  (html5
    (head)
    [:body {:class "body-container"}
     [:div#app]
     (include-js "/js/app.js")]))


(defroutes routes
  (GET "/*" [] (base-html))

  (resources "/")
  (not-found "Not Found"))

(def app (wrap-middleware #'routes))
