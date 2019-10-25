(ns main)

(def my-name "some other name")

(defn hello-message
  [name]
  (str "Hello " name "!"))

(defn -main
  [& args]
  (println (hello-message my-name)))
