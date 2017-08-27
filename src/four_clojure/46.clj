(defn __
  [x]
  (
   ;; Begin code
   (fn flip-args [f]
     (fn [& xs]
       (apply f (reverse xs))))
   ;; End code
   x))

(= 3 ((__ nth) 2 [1 2 3 4 5]))
	
(= 3 ((__ nth) 2 [1 2 3 4 5]))
(= true ((__ >) 7 8))
(= 4 ((__ quot) 2 8))
(= [1 2 3] ((__ take) [1 2 3 4 5] 3))
(= [1 2 3] ((__ take) [1 2 3 4 5] 3))
