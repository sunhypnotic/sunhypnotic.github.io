(defn mobile-btn
  []
  [:div#nav-icon {:onClick "toggleMenu()"}
   [:span] [:span] [:span] [:span]])

(defn nav
  [build-url]
  (let [links [[(build-url "/")         "Home"]
               [(build-url "/releases")    "Releases"]
               ["https://sunhypnotic.bandcamp.com"    "Shop"]
               ["https://github.com/sunhypnotic/firn"    "Github"]]]
    ;; left nav.
    [:nav.nav
     [:div.nav-container
      [:div.nav-left
       (mobile-btn)
       [:img.nav-logo {:width 32 :src (build-url "/static/img/ico-light.png")}]]
      [:div.nav-links
       (for [l links]
         [:a.nav-links-item {:href (first l)}
          [:span (second l)]])]]]))
