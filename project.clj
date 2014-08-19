(defproject ephemeral-client "0.1.0-SNAPSHOT"
  :description "web front-end for ephemeral"
  :url "https://jarofghosts.github.io/ephemeral-client"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]
                 [org.clojure/core.async "0.1.319.0-6b1aca-alpha"]
                 [cljs-ajax "0.2.6"]
                 [kioo "0.4.0"]
                 [om "0.7.1"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "ephemeral-client"
              :source-paths ["src"]
              :compiler {
                :output-to "ephemeral_client.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
