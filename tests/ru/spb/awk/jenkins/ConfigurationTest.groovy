package ru.spb.awk.jenkins;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class ConfigurationTest {

    @Before
    void setUp() throws Exception {
    }

    @After
    void tearDown() throws Exception {
    }

    /**
     * Загрузка конфигурации 1С
     */
    @Test
    void load() {
        def conf = new Configuration();
        def path = "/opt/1C/v8.3/x86_64/1cv8"
        def pathToConf = "/opt/1C/v8.3/x86_64/1cv8"
        assert  conf.load([
                pathTo1C: path,
                pathToConf: pathToConf
        ])
    }

    @Test
    void save() {
        def conf = new Configuration();
        def path = "/opt/1C/v8.3/x86_64/1cv8"
        def pathToConf = "/opt/1C/v8.3/x86_64/1cv8"
        assert  conf.save([
                pathTo1C: path,
                pathToConf: pathToConf
        ])
    }

    @Test
    void merge() {
    }

    @Test
    void imp() {
    }

    @Test
    void exp() {
    }
}