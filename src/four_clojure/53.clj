(defn __
  [x]
  (
   ;; Begin code
   (fn longest-sub-seq [s]
     (let [longest (->>
                     (partition 2 1 s)
                     (partition-by (fn [[x y]] (< x y)))
                     (remove (fn [[[x y]]] (> x y)))
                     (map flatten)
                     (map #(partition-by identity %))
                     (map #(map first %))
                     (sort-by #(count %) >)
                     (first)
                     )
           ]
     (if (nil? longest) [] longest)))
   ;; End code
   x))
(__ [3 2 1 0 1 2 3 0 4 5])

(= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3])
(= (__ [5 6 1 3 2 7]) [5 6])
(= (__ [2 3 3 4 5]) [3 4 5])
(= (__ [7 6 5 4]) [])
