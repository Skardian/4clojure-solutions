(defproject four-clojure "0.1.0-SNAPSHOT"
  :description "4Clojure solutions"
  :url "http://example.com/FIXME"
  :license {:name "MIT License"
            :url "https://choosealicense.com/licenses/mit/"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot four-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
