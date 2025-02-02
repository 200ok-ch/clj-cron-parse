(defproject ai.finity/clj-cron-parse "0.1.5-SNAPSHOT"
  :description "A Clojure library for using cron expressions"
  :url "https://github.com/finity-ai/clj-cron-parse"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [clj-time "0.15.2"]

                 [org.clojure/core.match "1.0.0"]]
  :pedantic? :abort
  :profiles {:dev {:dependencies [[midje "1.10.5"]]
                   :plugins [[lein-cljfmt "0.8.0"]
                             [lein-midje "3.2.2"]]}})
