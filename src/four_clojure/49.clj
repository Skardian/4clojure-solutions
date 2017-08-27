(defn __
  [x y]
  (
   ;; Begin code
   (fn split-in-half [c x]
     [(take c x) (drop c x)])
   ;; End code
   x y))

(= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
(= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])
(= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])
