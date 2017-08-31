(defn __
  [& x]
  (apply
   ;; Begin code
   (fn [& x]
     (reduce #(if (> % %2) % %2) x))
   ;; End code
   x))
(__ 1 4)

(= (__ 1 8 3 4) 8)
(= (__ 30 20) 30)
(= (__ 45 67 11) 67)
