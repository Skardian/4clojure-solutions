(defn __
  [x]
  (
   ;; Begin code
   (fn [x]
      (= (seq x) (reverse x)))
   ;; End code
   x))
(__ "racecar")

(false? (__ '(1 2 3 4 5)))
(true? (__ "racecar"))
(true? (__ [:foo :bar :foo]))
(true? (__ '(1 1 3 3 1 1)))
(false? (__ '(:a :b :c)))
