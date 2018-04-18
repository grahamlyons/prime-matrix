(defproject prime_matrix "0.1.0-SNAPSHOT"
  :description "Generates matrix of multiples of prime numbers"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure "1.9.0"]
    [org.clojure/math.numeric-tower "0.0.4"]
    [net.mikera/core.matrix "0.58.0"]
  ]
  :plugins [[venantius/ultra "0.5.1"]]
  :main ^:skip-aot prime-matrix.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
