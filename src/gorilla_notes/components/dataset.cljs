(ns gorilla-notes.components.dataset
  (:require ["ag-grid-react" :as rs :refer [AgGridReact]]
            [pinkgorilla.ui.config :refer [link-css]]))

;; Inspired by gorilla-ui aggrid component

(defn ^{:category :gorilla-notes}
  Dataset
  "displays data in a table, uses ag-grid
   [aggrid {:columnDefs [{:headerName \"Make\" :field \"make\"}
                         {:headerName \"Model\" :field \"model\"}
                         {:headerName \"Price\" :field \"price\"}]
            :rowData [{:make \"Toyota\" :model \"Celica\" :price 35000}
                      {:make \"Ford\" :model \"Mondeo\" :price 32000}
                      {:make \"Porsche\" :model \"Boxter\" :price 72000}]}]"
  [data]
  [:<>
   [:> AgGridReact data]])