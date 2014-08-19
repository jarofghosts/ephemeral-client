(ns ephemeral-client.core
  (:require [ephemeral-client.request :as request]))

(enable-console-print!)

(request/GET "http://localhost:3000/" (fn [ok result]
                                           (if (true? (first ok))
                                             (println (second ok))
                                             ("error!"))))
