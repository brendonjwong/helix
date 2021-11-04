(ns foo
  (:require
    ["react" :as r]
    ["react-dom/server" :as rds]
    [devcards.core :as dc :include-macros true]
    [helix.core :as helix :refer [$ <> defnc defnc-]]
    [helix.dom :as d]
    [helix.hooks :as hooks]))


(defnc- private-comp
  []
  (d/div "bye"))


(defn- bar
  []
  1)


(prn "METADATA!!!" (meta #'private-comp))
(prn "METADATA!!!" (meta #'bar))


(defnc public-comp
  []
  (d/div "hi"))
