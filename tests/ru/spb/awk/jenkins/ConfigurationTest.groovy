package ru.spb.awk.jenkins;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConfigurationTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Загрузка конфигурации 1С
     */
    @Test
    public void load() {
        def conf = new Configuration();
        def path = "/opt/1C/v8.3/x86_64/1cv8"
        def pathToConf = "/opt/1C/v8.3/x86_64/1cv8"
        conf.load([
                pathTo1C: path,
                pathToConf: pathToConf
        ])
    }

    @Test
    public void save() {
    }

    @Test
    public void merge() {
    }

    @Test
    public void imp() {
    }

    @Test
    public void exp() {
    }
}