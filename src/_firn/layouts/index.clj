(defn header
  []
  [:header.index-nav
   [:div.flex.align-start
    [:h1.h2.m0 "SunHypnotic"]
    [:a {:target "_blank" :href "https://github.com/theiceshelf/firn/releases"}
     [:sup.self-start "v.0.0.12"]]]
   [:div.h4.my2.italics "Experimental & Electronic media."]
   [:div.index-download-btns
    [:a.mx2 {:target "_blank" :href "/getting-started"} "News"]
    [:a.mx2 {:href "/releases"} "Releases"]]
   [:div {:style "padding-top: 48px;"}
    [:svg {:xmlns "http://www.w3.org/2000/svg", :fill "none", :viewbox "0 0 24 24", :height "24", :width "24"}
     [:path {:xmlns "http://www.w3.org/2000/svg", :d "M17 10L12 16L7 10H17Z", :fill "#afafaf"}]]]])


(defn index
  [{:keys [render build-url partials site-url site-title] :as data}]
  (let [{:keys [head nav footer]} partials]
    [:html
     (head data)
     [:body
      [:div (nav build-url)]
      (header)
      [:main.content {:style "max-width: 42em; padding: 32px; margin: 0 auto;"}
       [:div.py3
        (render "Details" :content)]]

      (footer)]]))
