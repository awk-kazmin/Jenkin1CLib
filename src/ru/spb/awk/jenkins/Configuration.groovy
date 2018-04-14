package ru.spb.awk.jenkins

class Configuration implements Serializable {

    /**
     * Загрузка конфигурации 1С
     * @return
     */
    def boolean load(Map conf) {
        def app = [conf.pathTo1C, "DESIGNER"]
        app << '"/LoadCfg"' << "\"${conf.pathToConf}\""
        app.execute()
    }

    def boolean save() {

    }

    def boolean merge() {

    }

    def boolean imp() {

    }

    def boolean exp() {

    }
}
