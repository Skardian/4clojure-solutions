(defn __
  [& x]
  (apply
   ;; Begin code
   (fn my-con [& fs]
     (fn [& args]
       (first (reduce
                (fn [acc next-f]
                  (list (apply next-f acc)))
                args
                (reverse fs)))))
   ;; End code
   x))
((__ rest reverse) [1 2 3 4])

(= [3 2 1] ((__ rest reverse) [1 2 3 4]))
(= 5 ((__ (partial + 3) second) [1 2 3 4]))
(= true ((__ zero? #(mod % 8) +) 3 5 7 9))
(= "HELLO" ((__ #(.toUpperCase %) #(apply str %) take) 5 "hello world"))
