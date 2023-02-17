(ns fold-transformations.core)

(defn fold
  [f acc coll]
  (if (not (empty? coll))
    (let [element (first coll)
          acc (f element acc)]
        (fold f acc (rest coll)))
    acc))

(defn len
  [coll]
  (fold (fn [_ n] (+ n 1)) 0 coll))

(defn reverse
  [coll]
  (fold (fn [element acc] (concat [element] acc)) [] coll))
