(defproject sandbox "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-http "2.3.0"]
                 [tupelo "0.9.22"]]

  :resource-paths ["src/main/resource"]
  :main ^:skip-aot sandbox.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
