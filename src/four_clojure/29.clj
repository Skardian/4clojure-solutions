(defn __
  [x]
  (
   ;; Begin code
   (fn [x]
     (apply str (re-seq #"[A-Z]" x)))
   ;; End code
   x))
(__ "HeLlO, WoRlD!")

(= (__ "HeLlO, WoRlD!") "HLOWRD")
(empty? (__ "nothing"))
(= (__ "$#A(*&987Zf") "AZ")
