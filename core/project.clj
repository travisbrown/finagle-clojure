(defproject finagle-clojure/core "0.1.0"
  :description "A light wrapper around Finagle & Twitter Util for Clojure"
  :url "https://github.com/crashlytics/finagle-clojure"
  :plugins [[lein-midje "3.1.3"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.6.0"]
                                  [midje "1.6.3" :exclusions [org.clojure/clojure]]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}}
  :repositories [["twitter" "http://maven.twttr.com/"]]
  :dependencies [[com.twitter/finagle-core "6.6.2"]])