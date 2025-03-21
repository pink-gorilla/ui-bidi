(ns frontend.page.service
  (:require
   [taoensso.timbre :refer-macros [info warn]]
   [re-frame.core :refer [dispatch]]
   [frontend.routes.events]
   [webly.spa.mode :refer [get-routing-path]]))

(defn make-routes-frontend [rpath user-routes-app]
  [rpath user-routes-app])

(defn start-bidi [user-routes-app]
  (let [rpath (get-routing-path)
        routes-frontend (make-routes-frontend rpath user-routes-app)]
    (warn "bidi routes: " routes-frontend)
    (dispatch [:bidi/init routes-frontend])))