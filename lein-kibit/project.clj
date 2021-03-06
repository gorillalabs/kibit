(defproject gorillalabs/lein-kibit "0.0.0"
  :plugins [[lein-monolith "1.2.0"]
            [com.roomkey/lein-v "7.1.0"]]
  :monolith/inherit true
  :middleware [leiningen.v/version-from-scm
               leiningen.v/dependency-version-from-scm
               leiningen.v/add-workspace-data]
  :description "kibit lein plugin"
  :url "https://github.com/jonase/kibit"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/tools.namespace "0.2.11"]
                 [gorillalabs/kibit ~(:version (clojure.edn/read-string (slurp "lein-kibit/resources/version.edn")))]]
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :prep-tasks [["v" "cache" "lein-kibit/resources" "edn"]]
  :eval-in-leiningen true)
