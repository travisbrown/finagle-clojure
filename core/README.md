# core

This module contains wrappers for `com.twitter.util.Future` & core Finagle classes.

### Dependency

    [finagle-clojure/core "0.1.1"]


### Namespaces

* `finagle-clojure.duration`: wrappers for creating `Duration` & `Time` objects, used for setting timeouts.
* `finagle-clojure.filter`: wrappers for composing `Filter`.s
* `finagle-clojure.future-pool`: run an operation on a `ThreadPool` & return a `Future`.
* `finagle-clojure.futures`: wrappers around `Future` operations.
* `finagle-clojure.scala`: sugar for Clojure/Scala interop.
* `finagle-clojure.service`: wrappers for operations on `Service`.
