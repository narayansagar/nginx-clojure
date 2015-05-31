(defproject nginx-clojure/nginx-jersey "0.1.0"
  :description "Intergrate Jersey into Nginx by Nignx-Clojure Module so that 
                Nginx can Support Java standard RESTful Web Services (JAX-RS)"
  :url "https://github.com/nginx-clojure/nginx-clojure/nginx-tomcat"
  :license {:name "BSD 3-Clause license"
            :url "http://opensource.org/licenses/BSD-3-Clause"}
  :plugins [[lein-junit "1.1.7"]]
  :dependencies [
                 [javax.ws.rs/javax.ws.rs-api "2.0.1"]
                 [org.glassfish.jersey.core/jersey-common "2.17"]
                 [org.glassfish.jersey.core/jersey-server "2.17"]
                 ;[org.glassfish.jersey.media/jersey-media-json-jackson "2.17"]
                 [nginx-clojure/nginx-clojure "0.4.0"]
                 ]
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :jar-exclusions [#"^test" #"\.java$" #"Test.*class$" #".*for_test.clj$"]
  :javac-options ["-target" "1.7" "-source" "1.7" "-g" "-nowarn"]
  :profiles {
           :dev {:dependencies [;only for test / compile usage
                                [junit/junit "4.11"]
                                ]}}
  )