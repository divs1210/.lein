{:repl {:plugins [[cider/cider-nrepl "0.16.0"]
                  [refactor-nrepl "2.3.1"]]
        :dependencies [^:replace [org.clojure/tools.nrepl "0.2.12"]
                       [venantius/pyro "0.1.2"]]
        :injections [(require '[pyro.printer :as printer])
                     (printer/swap-stacktrace-engine!)]}}
