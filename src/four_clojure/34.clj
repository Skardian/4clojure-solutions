(defn __
  [x y]
  (
   ;; Begin code
   (fn [s e]
     (take (- e s) (iterate inc s)))
   ;; End code
   x y))
(__ 1 4)

(= (__ 1 4) '(1 2 3))
(= (__ -2 2) '(-2 -1 0 1))
(= (__ 5 8) '(5 6 7))


; Old version
(defn __2
  [x y]
  (
   ;; Start code
   (fn [s e]
     ((fn my-range
        [s x e]
        (if (< s e)
          (my-range (inc s) (conj x s) e)
          x))
      s [] e))
   ;; End code
   x y))
(__ 1 4)

