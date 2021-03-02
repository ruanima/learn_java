package org.sonatype.mavenbook.ch04;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.log4j.Logger;

public class YahooRetriever {
    private static Logger log = Logger.getLogger(YahooRetriever.class);

    public InputStream retrieve(int zipcode) throws Exception {
        log.info("Retrieving Weather Data");
        InputStream f = getClass().getClassLoader().getResourceAsStream("weather.xml");
        return f;
    }

}