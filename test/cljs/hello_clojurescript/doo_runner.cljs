(ns hello-clojurescript.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [hello-clojurescript.core-test]))

(doo-tests 'hello-clojurescript.core-test)
