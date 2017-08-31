(defn __
  [x]
  (
   ;; Begin code
   (fn [x]
     (* 2 x))
   ;; End code
   x))
(= (__ 2) 4)

(= (__ 3) 6)
(= (__ 11) 22)
(= (__ 7) 14)

