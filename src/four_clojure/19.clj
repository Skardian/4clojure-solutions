(defn __
  [x]
  (
   ;; Begin code
   #(first (reverse %))
   ;; End code
   x))

(= (__ [1 2 3 4 5]) 5)
(= (__ '(5 4 3)) 3)
(= (__ ["b" "c" "d"]) "d")
