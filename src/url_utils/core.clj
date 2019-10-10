(ns url-utils.core
  (:import java.net.URLEncoder))

(defn encode-params [request-params]
  (let [encode #(URLEncoder/encode (str %) "UTF-8")
        coded (for [[n v] request-params] (str (encode (name n)) "=" (encode v)))]
    (apply str (interpose "&" coded))))
