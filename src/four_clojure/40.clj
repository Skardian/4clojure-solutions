(defn __
  [x y]
  (
   ;; Begin code
   (fn [sep x]
     (butlast (mapcat #(list % sep) x)))
   ;; End code
   x y))
(__ 0 [1 2 3])
	
(= (__ 0 [1 2 3]) [1 0 2 0 3])
(= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")
(= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])
