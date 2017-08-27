(defn __
  [x]
  (
   ;; Begin code
   (fn factorial [x]
     (reduce * (map inc (range x))))
   ;; End code
   x))
(__ 1)
	
(= (__ 1) 1)
(= (__ 3) 6)
(= (__ 5) 120)
(= (__ 8) 40320)
