# Changes

## Next Release

* Add [ThriftMux](http://twitter.github.io/finagle/docs/index.html#com.twitter.finagle.mux.package) support in finagle-clojure/thriftmux
  * thriftmux projects can be generated using the finagle-clojure-template lein template by passing the args `project-type thriftmux`
  * e.g. `lein new finagle-clojure dogs project-type thriftmux`
  * the default for finagle-clojure projects remains thrift
* Upgrade Finagle to version 6.24.0 (from 6.18.0)

### Version 0.1.1

* Initial release!
* Releasing version 0.1.0 was aborted as missing scm info in project.cljs prevented promition on clojars.
