(ns gorilla-notes.components.leaflet.providers-info)

;; Generated from "data/leaflet_providers.json" using Jet.
;; https://github.com/borkdude/jet

(def info
  {:OpenWeatherMap   {:url      "http://{s}.tile.openweathermap.org/map/{variant}/{z}/{x}/{y}.png?appid={apiKey}",
                      :options  {:maxZoom     19,
                                 :attribution "Map data &copy; <a href=\"http://openweathermap.org\">OpenWeatherMap</a>",
                                 :apiKey      "<insert your api key here>",
                                 :opacity     0.5},
                      :variants {:Temperature          "temp",
                                 :PressureContour      "pressure_cntr",
                                 :CloudsClassic        "clouds_cls",
                                 :PrecipitationClassic "precipitation_cls",
                                 :Snow                 "snow",
                                 :Pressure             "pressure",
                                 :Precipitation        "precipitation",
                                 :Rain                 "rain",
                                 :RainClassic          "rain_cls",
                                 :Clouds               "clouds",
                                 :Wind                 "wind"}},
   :NLS              {:url     "https://nls-{s}.tileserver.com/nls/{z}/{x}/{y}.jpg",
                      :options {:attribution "<a href=\"http://geo.nls.uk/maps/\">National Library of Scotland Historic Maps</a>",
                                :bounds      [[49.6 -12] [61.7 3]],
                                :minZoom     1,
                                :maxZoom     18,
                                :subdomains  "0123"}},
   :OpenTopoMap      {:url     "https://{s}.tile.opentopomap.org/{z}/{x}/{y}.png",
                      :options {:maxZoom     17,
                                :attribution "Map data: &copy; <a href=\"https://www.openstreetmap.org/copyright\">OpenStreetMap</a> contributors, <a href=\"http://viewfinderpanoramas.org\">SRTM</a> | Map style: &copy; <a href=\"https://opentopomap.org\">OpenTopoMap</a> (<a href=\"https://creativecommons.org/licenses/by-sa/3.0/\">CC-BY-SA</a>)"}},
   :Hydda            {:url      "https://{s}.tile.openstreetmap.se/hydda/{variant}/{z}/{x}/{y}.png",
                      :options  {:maxZoom     20,
                                 :variant     "full",
                                 :attribution "Tiles courtesy of <a href=\"http://openstreetmap.se/\" target=\"_blank\">OpenStreetMap Sweden</a> &mdash; Map data {attribution.OpenStreetMap}"},
                      :variants {:Full           "full",
                                 :Base           "base",
                                 :RoadsAndLabels "roads_and_labels"}},
   :Thunderforest    {:url      "https://{s}.tile.thunderforest.com/{variant}/{z}/{x}/{y}.png?apikey={apikey}",
                      :options  {:attribution "&copy; <a href=\"http://www.thunderforest.com/\">Thunderforest</a>, {attribution.OpenStreetMap}",
                                 :variant     "cycle",
                                 :apikey      "<insert your api key here>",
                                 :maxZoom     22},
                      :variants {:Pioneer       "pioneer",
                                 :OpenCycleMap  "cycle",
                                 :MobileAtlas   "mobile-atlas",
                                 :Landscape     "landscape",
                                 :SpinalMap     {:options {:variant "spinal-map"}},
                                 :Neighbourhood "neighbourhood",
                                 :Outdoors      "outdoors",
                                 :Transport     {:options {:variant "transport"}},
                                 :TransportDark {:options {:variant "transport-dark"}}}},
   :MapTiler         {:url      "https://api.maptiler.com/maps/{variant}/{z}/{x}/{y}{r}.{ext}?key={key}",
                      :options  {:attribution "<a href=\"https://www.maptiler.com/copyright/\" target=\"_blank\">&copy; MapTiler</a> <a href=\"https://www.openstreetmap.org/copyright\" target=\"_blank\">&copy; OpenStreetMap contributors</a>",
                                 :variant     "streets",
                                 :ext         "png",
                                 :key         "<insert your MapTiler Cloud API key here>",
                                 :tileSize    512,
                                 :zoomOffset  -1,
                                 :minZoom     0,
                                 :maxZoom     21},
                      :variants {:Pastel   "pastel",
                                 :Hybrid   {:options {:variant "hybrid",
                                                      :ext     "jpg"}},
                                 :Positron "positron",
                                 :Voyager  "voyager",
                                 :Streets  "streets",
                                 :Basic    "basic",
                                 :Toner    "toner",
                                 :Bright   "bright",
                                 :Topo     "topo"}},
   :OpenPtMap        {:url     "http://openptmap.org/tiles/{z}/{x}/{y}.png",
                      :options {:maxZoom     17,
                                :attribution "Map data: &copy; <a href=\"http://www.openptmap.org\">OpenPtMap</a> contributors"}},
   :FreeMapSK        {:url     "https://{s}.freemap.sk/T/{z}/{x}/{y}.jpeg",
                      :options {:minZoom     8,
                                :maxZoom     16,
                                :subdomains  "abcd",
                                :bounds      [[47.204642 15.996093]
                                         [49.830896 22.576904]],
                                :attribution "&copy; <a href=\"https://www.openstreetmap.org/copyright\">OpenStreetMap</a> contributors, vizualization CC-By-SA 2.0 <a href=\"http://freemap.sk\">Freemap.sk</a>"}},
   :Esri             {:url      "https://server.arcgisonline.com/ArcGIS/rest/services/{variant}/MapServer/tile/{z}/{y}/{x}",
                      :options  {:variant     "World_Street_Map",
                                 :attribution "Tiles &copy; Esri"},
                      :variants {:WorldTopoMap      {:options {:variant     "World_Topo_Map",
                                                               :attribution "{attribution.Esri} &mdash; Esri, DeLorme, NAVTEQ, TomTom, Intermap, iPC, USGS, FAO, NPS, NRCAN, GeoBase, Kadaster NL, Ordnance Survey, Esri Japan, METI, Esri China (Hong Kong), and the GIS User Community"}},
                                 :WorldImagery      {:options {:variant     "World_Imagery",
                                                               :attribution "{attribution.Esri} &mdash; Source: Esri, i-cubed, USDA, USGS, AEX, GeoEye, Getmapping, Aerogrid, IGN, IGP, UPR-EGP, and the GIS User Community"}},
                                 :NatGeoWorldMap    {:options {:variant     "NatGeo_World_Map",
                                                               :maxZoom     16,
                                                               :attribution "{attribution.Esri} &mdash; National Geographic, Esri, DeLorme, NAVTEQ, UNEP-WCMC, USGS, NASA, ESA, METI, NRCAN, GEBCO, NOAA, iPC"}},
                                 :WorldShadedRelief {:options {:variant     "World_Shaded_Relief",
                                                               :maxZoom     13,
                                                               :attribution "{attribution.Esri} &mdash; Source: Esri"}},
                                 :WorldStreetMap    {:options {:attribution "{attribution.Esri} &mdash; Source: Esri, DeLorme, NAVTEQ, USGS, Intermap, iPC, NRCAN, Esri Japan, METI, Esri China (Hong Kong), Esri (Thailand), TomTom, 2012"}},
                                 :DeLorme           {:options {:variant     "Specialty/DeLorme_World_Base_Map",
                                                               :minZoom     1,
                                                               :maxZoom     11,
                                                               :attribution "{attribution.Esri} &mdash; Copyright: &copy;2012 DeLorme"}},
                                 :WorldPhysical     {:options {:variant     "World_Physical_Map",
                                                               :maxZoom     8,
                                                               :attribution "{attribution.Esri} &mdash; Source: US National Park Service"}},
                                 :OceanBasemap      {:options {:variant     "Ocean_Basemap",
                                                               :maxZoom     13,
                                                               :attribution "{attribution.Esri} &mdash; Sources: GEBCO, NOAA, CHS, OSU, UNH, CSUMB, National Geographic, DeLorme, NAVTEQ, and Esri"}},
                                 :WorldGrayCanvas   {:options {:variant     "Canvas/World_Light_Gray_Base",
                                                               :maxZoom     16,
                                                               :attribution "{attribution.Esri} &mdash; Esri, DeLorme, NAVTEQ"}},
                                 :WorldTerrain      {:options {:variant     "World_Terrain_Base",
                                                               :maxZoom     13,
                                                               :attribution "{attribution.Esri} &mdash; Source: USGS, Esri, TANA, DeLorme, and NPS"}}}},
   :CartoDB          {:url      "https://{s}.basemaps.cartocdn.com/{variant}/{z}/{x}/{y}{r}.png",
                      :options  {:attribution "{attribution.OpenStreetMap} &copy; <a href=\"https://carto.com/attributions\">CARTO</a>",
                                 :subdomains  "abcd",
                                 :maxZoom     19,
                                 :variant     "light_all"},
                      :variants {:VoyagerOnlyLabels    "rastertiles/voyager_only_labels",
                                 :PositronNoLabels     "light_nolabels",
                                 :DarkMatter           "dark_all",
                                 :DarkMatterOnlyLabels "dark_only_labels",
                                 :VoyagerNoLabels      "rastertiles/voyager_nolabels",
                                 :Positron             "light_all",
                                 :DarkMatterNoLabels   "dark_nolabels",
                                 :Voyager              "rastertiles/voyager",
                                 :VoyagerLabelsUnder   "rastertiles/voyager_labels_under",
                                 :PositronOnlyLabels   "light_only_labels"}},
   :Jawg             {:url      "https://{s}.tile.jawg.io/{variant}/{z}/{x}/{y}{r}.png?access-token={accessToken}",
                      :options  {:attribution "<a href=\"http://jawg.io\" title=\"Tiles Courtesy of Jawg Maps\" target=\"_blank\">&copy; <b>Jawg</b>Maps</a> {attribution.OpenStreetMap}",
                                 :minZoom     0,
                                 :maxZoom     22,
                                 :subdomains  "abcd",
                                 :variant     "jawg-terrain",
                                 :accessToken "<insert your access token here>"},
                      :variants {:Streets "jawg-streets",
                                 :Terrain "jawg-terrain",
                                 :Sunny   "jawg-sunny",
                                 :Dark    "jawg-dark",
                                 :Light   "jawg-light",
                                 :Matrix  "jawg-matrix"}},
   :OpenSeaMap       {:url     "https://tiles.openseamap.org/seamark/{z}/{x}/{y}.png",
                      :options {:attribution "Map data: &copy; <a href=\"http://www.openseamap.org\">OpenSeaMap</a> contributors"}},
   :HEREv3           {:url      "https://{s}.{base}.maps.ls.hereapi.com/maptile/2.1/{type}/{mapID}/{variant}/{z}/{x}/{y}/{size}/{format}?apiKey={apiKey}&lg={language}",
                      :options  {:format      "png8",
                                 :variant     "normal.day",
                                 :subdomains  "1234",
                                 :mapID       "newest",
                                 :apiKey      "<insert your apiKey here>",
                                 :type        "maptile",
                                 :size        "256",
                                 :maxZoom     20,
                                 :language    "eng",
                                 :attribution "Map &copy; 1987-2020 <a href=\"http://developer.here.com\">HERE</a>",
                                 :base        "base"},
                      :variants {:normalNightTransit       "normal.night.transit",
                                 :normalNightMobile        "normal.night.mobile",
                                 :trafficFlow              {:options {:base "traffic",
                                                                      :type "flowtile"}},
                                 :hybridDayTransit         {:options {:base    "aerial",
                                                                      :variant "hybrid.day.transit"}},
                                 :normalDayCustom          "normal.day.custom",
                                 :reducedDay               "reduced.day",
                                 :normalDayGreyMobile      "normal.day.grey.mobile",
                                 :normalDayTransitMobile   "normal.day.transit.mobile",
                                 :normalDayTransit         "normal.day.transit",
                                 :normalNightTransitMobile "normal.night.transit.mobile",
                                 :carnavDayGrey            "carnav.day.grey",
                                 :normalDay                "normal.day",
                                 :terrainDayMobile         {:options {:base    "aerial",
                                                                      :variant "terrain.day.mobile"}},
                                 :normalDayGrey            "normal.day.grey",
                                 :hybridDayGrey            {:options {:base    "aerial",
                                                                      :variant "hybrid.grey.day"}},
                                 :satelliteDay             {:options {:base    "aerial",
                                                                      :variant "satellite.day"}},
                                 :pedestrianDay            "pedestrian.day",
                                 :terrainDay               {:options {:base    "aerial",
                                                                      :variant "terrain.day"}},
                                 :normalDayMobile          "normal.day.mobile",
                                 :hybridDay                {:options {:base    "aerial",
                                                                      :variant "hybrid.day"}},
                                 :normalNightGrey          "normal.night.grey",
                                 :normalNight              "normal.night",
                                 :reducedNight             "reduced.night",
                                 :basicMap                 {:options {:type "basetile"}},
                                 :pedestrianNight          "pedestrian.night",
                                 :normalNightGreyMobile    "normal.night.grey.mobile",
                                 :mapLabels                {:options {:type   "labeltile",
                                                                      :format "png"}},
                                 :hybridDayMobile          {:options {:base    "aerial",
                                                                      :variant "hybrid.day.mobile"}}}},
   :JusticeMap       {:url      "http://www.justicemap.org/tile/{size}/{variant}/{z}/{x}/{y}.png",
                      :options  {:attribution "<a href=\"http://www.justicemap.org/terms.php\">Justice Map</a>",
                                 :size        "county",
                                 :bounds      [[14 -180] [72 -56]]},
                      :variants {:americanIndian "indian",
                                 :white          "white",
                                 :plurality      "plural",
                                 :asian          "asian",
                                 :multi          "multi",
                                 :nonWhite       "nonwhite",
                                 :income         "income",
                                 :hispanic       "hispanic",
                                 :black          "black"}},
   :Stamen           {:url      "https://stamen-tiles-{s}.a.ssl.fastly.net/{variant}/{z}/{x}/{y}{r}.{ext}",
                      :options  {:attribution "Map tiles by <a href=\"http://stamen.com\">Stamen Design</a>, <a href=\"http://creativecommons.org/licenses/by/3.0\">CC BY 3.0</a> &mdash; Map data {attribution.OpenStreetMap}",
                                 :subdomains  "abcd",
                                 :minZoom     0,
                                 :maxZoom     20,
                                 :variant     "toner",
                                 :ext         "png"},
                      :variants {:TopOSMFeatures    {:options {:variant "toposm-features",
                                                               :bounds  [[22 -132]
                                                                        [51 -56]],
                                                               :opacity 0.9}},
                                 :TerrainBackground {:options {:variant "terrain-background",
                                                               :minZoom 0,
                                                               :maxZoom 18}},
                                 :Terrain           {:options {:variant "terrain",
                                                               :minZoom 0,
                                                               :maxZoom 18}},
                                 :TonerHybrid       "toner-hybrid",
                                 :TonerLabels       "toner-labels",
                                 :TonerBackground   "toner-background",
                                 :TonerLines        "toner-lines",
                                 :Toner             "toner",
                                 :TonerLite         "toner-lite",
                                 :TopOSMRelief      {:url     "https://stamen-tiles-{s}.a.ssl.fastly.net/{variant}/{z}/{x}/{y}.{ext}",
                                                     :options {:variant "toposm-color-relief",
                                                               :ext     "jpg",
                                                               :bounds  [[22 -132]
                                                                        [51 -56]]}},
                                 :TerrainLabels     {:options {:variant "terrain-labels",
                                                               :minZoom 0,
                                                               :maxZoom 18}},
                                 :Watercolor        {:url     "https://stamen-tiles-{s}.a.ssl.fastly.net/{variant}/{z}/{x}/{y}.{ext}",
                                                     :options {:variant "watercolor",
                                                               :ext     "jpg",
                                                               :minZoom 1,
                                                               :maxZoom 16}}}},
   :Stadia           {:url      "https://tiles.stadiamaps.com/tiles/alidade_smooth/{z}/{x}/{y}{r}.png",
                      :options  {:maxZoom     20,
                                 :attribution "&copy; <a href=\"https://stadiamaps.com/\">Stadia Maps</a>, &copy; <a href=\"https://openmaptiles.org/\">OpenMapTiles</a> &copy; <a href=\"http://openstreetmap.org\">OpenStreetMap</a> contributors"},
                      :variants {:AlidadeSmooth     {:url "https://tiles.stadiamaps.com/tiles/alidade_smooth/{z}/{x}/{y}{r}.png"},
                                 :AlidadeSmoothDark {:url "https://tiles.stadiamaps.com/tiles/alidade_smooth_dark/{z}/{x}/{y}{r}.png"},
                                 :OSMBright         {:url "https://tiles.stadiamaps.com/tiles/osm_bright/{z}/{x}/{y}{r}.png"},
                                 :Outdoors          {:url "https://tiles.stadiamaps.com/tiles/outdoors/{z}/{x}/{y}{r}.png"}}},
   :nlmaps           {:url      "https://geodata.nationaalgeoregister.nl/tiles/service/wmts/{variant}/EPSG:3857/{z}/{x}/{y}.png",
                      :options  {:minZoom     6,
                                 :maxZoom     19,
                                 :bounds      [[50.5 3.25] [54 7.6]],
                                 :attribution "Kaartgegevens &copy; <a href=\"kadaster.nl\">Kadaster</a>"},
                      :variants {:standaard "brtachtergrondkaart",
                                 :pastel    "brtachtergrondkaartpastel",
                                 :grijs     "brtachtergrondkaartgrijs",
                                 :luchtfoto {:url "https://geodata.nationaalgeoregister.nl/luchtfoto/rgb/wmts/2018_ortho25/EPSG:3857/{z}/{x}/{y}.png"}}},
   :MapBox           {:url     "https://api.mapbox.com/styles/v1/{id}/tiles/{z}/{x}/{y}{r}?access_token={accessToken}",
                      :options {:attribution "&copy; <a href=\"https://www.mapbox.com/about/maps/\" target=\"_blank\">Mapbox</a> {attribution.OpenStreetMap} <a href=\"https://www.mapbox.com/map-feedback/\" target=\"_blank\">Improve this map</a>",
                                :tileSize    512,
                                :maxZoom     18,
                                :zoomOffset  -1,
                                :id          "mapbox/streets-v11",
                                :accessToken "<insert your access token here>"}},
   :OpenStreetMap    {:url      "https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png",
                      :options  {:maxZoom     19,
                                 :attribution "&copy; <a href=\"https://www.openstreetmap.org/copyright\">OpenStreetMap</a> contributors"},
                      :variants {:Mapnik {},
                                 :DE     {:url     "https://{s}.tile.openstreetmap.de/tiles/osmde/{z}/{x}/{y}.png",
                                          :options {:maxZoom 18}},
                                 :CH     {:url     "https://tile.osm.ch/switzerland/{z}/{x}/{y}.png",
                                          :options {:maxZoom 18,
                                                    :bounds  [[45 5] [48 11]]}},
                                 :France {:url     "https://{s}.tile.openstreetmap.fr/osmfr/{z}/{x}/{y}.png",
                                          :options {:maxZoom     20,
                                                    :attribution "&copy; Openstreetmap France | {attribution.OpenStreetMap}"}},
                                 :HOT    {:url     "https://{s}.tile.openstreetmap.fr/hot/{z}/{x}/{y}.png",
                                          :options {:attribution "{attribution.OpenStreetMap}, Tiles style by <a href=\"https://www.hotosm.org/\" target=\"_blank\">Humanitarian OpenStreetMap Team</a> hosted by <a href=\"https://openstreetmap.fr/\" target=\"_blank\">OpenStreetMap France</a>"}},
                                 :BZH    {:url     "https://tile.openstreetmap.bzh/br/{z}/{x}/{y}.png",
                                          :options {:attribution "{attribution.OpenStreetMap}, Tiles courtesy of <a href=\"http://www.openstreetmap.bzh/\" target=\"_blank\">Breton OpenStreetMap Team</a>",
                                                    :bounds      [[46.2 -5.5]
                                                             [50 0.7]]}}}},
   :OneMapSG         {:url      "https://maps-{s}.onemap.sg/v3/{variant}/{z}/{x}/{y}.png",
                      :options  {:variant     "Default",
                                 :minZoom     11,
                                 :maxZoom     18,
                                 :bounds      [[1.56073 104.11475] [1.16 103.502]],
                                 :attribution "<img src=\"https://docs.onemap.sg/maps/images/oneMap64-01.png\" style=\"height:20px;width:20px;\"/> New OneMap | Map data &copy; contributors, <a href=\"http://SLA.gov.sg\">Singapore Land Authority</a>"},
                      :variants {:Default  "Default",
                                 :Night    "Night",
                                 :Original "Original",
                                 :Grey     "Grey",
                                 :LandLot  "LandLot"}},
   :HERE             {:url      "https://{s}.{base}.maps.api.here.com/maptile/2.1/{type}/{mapID}/{variant}/{z}/{x}/{y}/{size}/{format}?app_id={app_id}&app_code={app_code}&lg={language}",
                      :options  {:format      "png8",
                                 :app_code    "<insert your app_code here>",
                                 :variant     "normal.day",
                                 :subdomains  "1234",
                                 :mapID       "newest",
                                 :app_id      "<insert your app_id here>",
                                 :type        "maptile",
                                 :size        "256",
                                 :maxZoom     20,
                                 :language    "eng",
                                 :attribution "Map &copy; 1987-2020 <a href=\"http://developer.here.com\">HERE</a>",
                                 :base        "base"},
                      :variants {:normalNightTransit       "normal.night.transit",
                                 :normalNightMobile        "normal.night.mobile",
                                 :trafficFlow              {:options {:base "traffic",
                                                                      :type "flowtile"}},
                                 :hybridDayTransit         {:options {:base    "aerial",
                                                                      :variant "hybrid.day.transit"}},
                                 :normalDayCustom          "normal.day.custom",
                                 :reducedDay               "reduced.day",
                                 :normalDayGreyMobile      "normal.day.grey.mobile",
                                 :normalDayTransitMobile   "normal.day.transit.mobile",
                                 :normalDayTransit         "normal.day.transit",
                                 :normalNightTransitMobile "normal.night.transit.mobile",
                                 :carnavDayGrey            "carnav.day.grey",
                                 :hybridDayTraffic         {:options {:variant "hybrid.traffic.day",
                                                                      :base    "traffic",
                                                                      :type    "traffictile"}},
                                 :normalDay                "normal.day",
                                 :terrainDayMobile         {:options {:base    "aerial",
                                                                      :variant "terrain.day.mobile"}},
                                 :normalDayGrey            "normal.day.grey",
                                 :hybridDayGrey            {:options {:base    "aerial",
                                                                      :variant "hybrid.grey.day"}},
                                 :satelliteDay             {:options {:base    "aerial",
                                                                      :variant "satellite.day"}},
                                 :pedestrianDay            "pedestrian.day",
                                 :terrainDay               {:options {:base    "aerial",
                                                                      :variant "terrain.day"}},
                                 :normalDayTraffic         {:options {:variant "normal.traffic.day",
                                                                      :base    "traffic",
                                                                      :type    "traffictile"}},
                                 :normalDayMobile          "normal.day.mobile",
                                 :hybridDay                {:options {:base    "aerial",
                                                                      :variant "hybrid.day"}},
                                 :normalNightGrey          "normal.night.grey",
                                 :normalNight              "normal.night",
                                 :reducedNight             "reduced.night",
                                 :basicMap                 {:options {:type "basetile"}},
                                 :pedestrianNight          "pedestrian.night",
                                 :normalNightGreyMobile    "normal.night.grey.mobile",
                                 :mapLabels                {:options {:type   "labeltile",
                                                                      :format "png"}},
                                 :hybridDayMobile          {:options {:base    "aerial",
                                                                      :variant "hybrid.day.mobile"}}}},
   :CyclOSM          {:url     "https://{s}.tile-cyclosm.openstreetmap.fr/cyclosm/{z}/{x}/{y}.png",
                      :options {:maxZoom     20,
                                :attribution "<a href=\"https://github.com/cyclosm/cyclosm-cartocss-style/releases\" title=\"CyclOSM - Open Bicycle render\">CyclOSM</a> | Map data: &copy; <a href=\"https://www.openstreetmap.org/copyright\">OpenStreetMap</a> contributors"}},
   :BasemapAT        {:url      "https://maps{s}.wien.gv.at/basemap/{variant}/{type}/google3857/{z}/{y}/{x}.{format}",
                      :options  {:maxZoom     19,
                                 :attribution "Datenquelle: <a href=\"https://www.basemap.at\">basemap.at</a>",
                                 :subdomains  ["" "1" "2" "3" "4"],
                                 :type        "normal",
                                 :format      "png",
                                 :bounds      [[46.35877 8.782379]
                                          [49.037872 17.189532]],
                                 :variant     "geolandbasemap"},
                      :variants {:basemap   {:options {:maxZoom 20,
                                                       :variant "geolandbasemap"}},
                                 :grau      "bmapgrau",
                                 :overlay   "bmapoverlay",
                                 :terrain   {:options {:variant "bmapgelaende",
                                                       :type    "grau",
                                                       :format  "jpeg"}},
                                 :surface   {:options {:variant "bmapoberflaeche",
                                                       :type    "grau",
                                                       :format  "jpeg"}},
                                 :highdpi   {:options {:variant "bmaphidpi",
                                                       :format  "jpeg"}},
                                 :orthofoto {:options {:maxZoom 20,
                                                       :variant "bmaporthofoto30cm",
                                                       :format  "jpeg"}}}},
   :NASAGIBS         {:url      "https://map1.vis.earthdata.nasa.gov/wmts-webmerc/{variant}/default/{time}/{tilematrixset}{maxZoom}/{z}/{y}/{x}.{format}",
                      :options  {:attribution   "Imagery provided by services from the Global Imagery Browse Services (GIBS), operated by the NASA/GSFC/Earth Science Data and Information System (<a href=\"https://earthdata.nasa.gov\">ESDIS</a>) with funding provided by NASA/HQ.",
                                 :bounds        [[-85.0511287776 -179.999999975]
                                          [85.0511287776 179.999999975]],
                                 :minZoom       1,
                                 :maxZoom       9,
                                 :format        "jpg",
                                 :time          "",
                                 :tilematrixset "GoogleMapsCompatible_Level"},
                      :variants {:ModisTerraTrueColorCR "MODIS_Terra_CorrectedReflectance_TrueColor",
                                 :ModisTerraBands367CR  "MODIS_Terra_CorrectedReflectance_Bands367",
                                 :ViirsEarthAtNight2012 {:options {:variant "VIIRS_CityLights_2012",
                                                                   :maxZoom 8}},
                                 :ModisTerraLSTDay      {:options {:variant "MODIS_Terra_Land_Surface_Temp_Day",
                                                                   :format  "png",
                                                                   :maxZoom 7,
                                                                   :opacity 0.75}},
                                 :ModisTerraSnowCover   {:options {:variant "MODIS_Terra_Snow_Cover",
                                                                   :format  "png",
                                                                   :maxZoom 8,
                                                                   :opacity 0.75}},
                                 :ModisTerraAOD         {:options {:variant "MODIS_Terra_Aerosol",
                                                                   :format  "png",
                                                                   :maxZoom 6,
                                                                   :opacity 0.75}},
                                 :ModisTerraChlorophyll {:options {:variant "MODIS_Terra_Chlorophyll_A",
                                                                   :format  "png",
                                                                   :maxZoom 7,
                                                                   :opacity 0.75}}}},
   :GeoportailFrance {:url      "https://wxs.ign.fr/{apikey}/geoportail/wmts?REQUEST=GetTile&SERVICE=WMTS&VERSION=1.0.0&STYLE={style}&TILEMATRIXSET=PM&FORMAT={format}&LAYER={variant}&TILEMATRIX={z}&TILEROW={y}&TILECOL={x}",
                      :options  {:attribution "<a target=\"_blank\" href=\"https://www.geoportail.gouv.fr/\">Geoportail France</a>",
                                 :bounds      [[-75 -180] [81 180]],
                                 :minZoom     2,
                                 :maxZoom     18,
                                 :apikey      "choisirgeoportail",
                                 :format      "image/jpeg",
                                 :style       "normal",
                                 :variant     "GEOGRAPHICALGRIDSYSTEMS.MAPS.SCAN-EXPRESS.STANDARD"},
                      :variants {:parcels {:options {:variant "CADASTRALPARCELS.PARCELS",
                                                     :maxZoom 20,
                                                     :style   "bdparcellaire",
                                                     :format  "image/png"}},
                                 :ignMaps "GEOGRAPHICALGRIDSYSTEMS.MAPS",
                                 :maps    "GEOGRAPHICALGRIDSYSTEMS.MAPS.SCAN-EXPRESS.STANDARD",
                                 :orthos  {:options {:maxZoom 19,
                                                     :variant "ORTHOIMAGERY.ORTHOPHOTOS"}}}},
   :MtbMap           {:url     "http://tile.mtbmap.cz/mtbmap_tiles/{z}/{x}/{y}.png",
                      :options {:attribution "&copy; <a href=\"https://www.openstreetmap.org/copyright\">OpenStreetMap</a> contributors &amp; USGS"}},
   :Wikimedia        {:url     "https://maps.wikimedia.org/osm-intl/{z}/{x}/{y}{r}.png",
                      :options {:attribution "<a href=\"https://wikimediafoundation.org/wiki/Maps_Terms_of_Use\">Wikimedia</a>",
                                :minZoom     1,
                                :maxZoom     19}},
   :SafeCast         {:url     "https://s3.amazonaws.com/te512.safecast.org/{z}/{x}/{y}.png",
                      :options {:maxZoom     16,
                                :attribution "Map data: &copy; <a href=\"https://www.openstreetmap.org/copyright\">OpenStreetMap</a> contributors | Map style: &copy; <a href=\"https://blog.safecast.org/about/\">SafeCast</a> (<a href=\"https://creativecommons.org/licenses/by-sa/3.0/\">CC-BY-SA</a>)"}},
   :OpenRailwayMap   {:url     "https://{s}.tiles.openrailwaymap.org/standard/{z}/{x}/{y}.png",
                      :options {:maxZoom     19,
                                :attribution "Map data: &copy; <a href=\"https://www.openstreetmap.org/copyright\">OpenStreetMap</a> contributors | Map style: &copy; <a href=\"https://www.OpenRailwayMap.org\">OpenRailwayMap</a> (<a href=\"https://creativecommons.org/licenses/by-sa/3.0/\">CC-BY-SA</a>)"}},
   :OpenFireMap      {:url     "http://openfiremap.org/hytiles/{z}/{x}/{y}.png",
                      :options {:maxZoom     19,
                                :attribution "Map data: &copy; <a href=\"https://www.openstreetmap.org/copyright\">OpenStreetMap</a> contributors | Map style: &copy; <a href=\"http://www.openfiremap.org\">OpenFireMap</a> (<a href=\"https://creativecommons.org/licenses/by-sa/3.0/\">CC-BY-SA</a>)"}},
   :HikeBike         {:url      "https://tiles.wmflabs.org/{variant}/{z}/{x}/{y}.png",
                      :options  {:maxZoom     19,
                                 :attribution "{attribution.OpenStreetMap}",
                                 :variant     "hikebike"},
                      :variants {:HikeBike {},
                                 :HillShading {:options {:maxZoom 15,
                                                         :variant "hillshading"}}}},
   :TomTom           {:url "https://{s}.api.tomtom.com/map/1/tile/{variant}/{style}/{z}/{x}/{y}.{ext}?key={apikey}",
            :options {:variant "basic",
                      :maxZoom 22,
                      :attribution "<a href=\"https://tomtom.com\" target=\"_blank\">&copy;  1992 - 2020 TomTom.</a> ",
                      :subdomains "abcd",
                      :style "main",
                      :ext "png",
                      :apikey "<insert your API key here>"},
            :variants {:Basic "basic",
                       :Hybrid "hybrid",
                       :Labels "labels"}}})
