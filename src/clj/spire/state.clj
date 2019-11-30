(ns spire.state)

;; the currect execution sessions that each idempotent call will use
;; in lockstep mode, this will be all the current connection
;; in parallel mode this will usually be one of the current connections
;; is a vector of host strings
(def ^:dynamic *sessions* [])

;; all the host strings needed to complete a step or action
;; this will be the complete set of hosts to operate on and will be
;; the same in parallel or lockstep modes
(def ^:dynamic *connections* [])