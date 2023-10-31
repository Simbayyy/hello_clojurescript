(ns hello-clojurescript.prod
  (:require [hello-clojurescript.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
