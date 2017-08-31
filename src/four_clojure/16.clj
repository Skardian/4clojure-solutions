(defn __
  [x]
  (
   ;; Begin code
   (fn [x]
     (str "Hello, " x "!"))
   ;; End code
   x))
(= (__ "Dave") "Hello, Dave!")
(= (__ "Jenn") "Hello, Jenn!")
(= (__ "Rhea") "Hello, Rhea!")

