(ns kubernetes.api.v1
  (:require [kubernetes.api.swagger :as swagger]
            [kubernetes.api.util :as util]))

(def make-context util/make-context)

(swagger/render-full-api "v1")
