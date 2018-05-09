package ru.spb.awk.jenkins

class Configuration implements Serializable {


    public static final String DESIGNER = "DESIGNER"

    /**
     * Загрузка конфигурации 1С
     * @param conf:
     *      pathTo1C   - Путь до 1cv8[.exe]
     *      pathToConf - Путь до конфигурационного файла
     * @return
     */
    static boolean load(Map conf) {
        [
            conf.pathTo1C,
            DESIGNER,
            '"/LoadCfg"',
            "\"${conf.pathToConf}\""
        ].execute().exitValue() == 0
    }

    /**
     * Выгрузка конфигурации 1С
     * @param conf:
     *      pathTo1C   - Путь до 1cv8[.exe]
     *      pathToConf - Путь до конфигурационного файла
     * @return
     */
    static boolean save(Map conf) {
        [
                conf.pathTo1C,
                DESIGNER,
                '"/DumpCfg"',
                "\"${conf.pathToConf}\""
        ].execute().exitValue() == 0
    }

    static boolean merge() {

    }

    static boolean imp() {

    }

    static boolean exp() {

    }
}
