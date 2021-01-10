(ns gorilla-notes.view
  (:require
   [gorilla-notes.state :as state]
   [gorilla-notes.components] ;; This is necessary for components registraion.
   [gorilla-notes.components.notes :as notes]
   [pinkie.pinkie :refer [tag-inject]]
   [cljsjs.highlight]
   [cljsjs.highlight.langs.clojure]))

(defn main []
  [:div #_{:class "container"}
   (let [{:keys [ids id->content options]}     @state/*state
         {:keys [reverse-notes? header? notes-in-cards?
                 custom-header custom-footer]} options
         notes                                 (map (juxt identity
                                                          id->content)
                                                    ids)]
     (into [:div]
           (concat [(tag-inject custom-header)
                    (tag-inject (when header?
                                  [notes/Header {:notes notes}]))]
                   (->> notes
                        (map-indexed
                         (fn [idx [id note]]
                           (when note
                             (let [panel-id (str "panel#" id)]
                               ^{:key panel-id}
                               [:div
                                [:div {:ref #(when %
                                              (.scrollIntoView %))}
                                (if notes-in-cards?
                                  [notes/NoteCard {:id id
                                                   :idx  idx
                                                   :note note}]
                                  [notes/Note {:note note}])]]))))
                        ((if reverse-notes?
                           reverse
                           identity)))
                   [(tag-inject custom-footer)])))])


