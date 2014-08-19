(ns ephemeral-client.request
  (:require [ajax.core :refer
             [json-request-format json-response-format ajax-request]]))

(def response-format (json-response-format {:keywords? true}))

(defn GET [url f]
  (ajax-request {:uri url
                 :method :get
                 :handler f
                 :format response-format}))

(defn PUT [url data f]
  (ajax-request {:uri url
                 :method :put
                 :params data
                 :handler f
                 :format (json-request-format)
                 :response-format response-format}))
