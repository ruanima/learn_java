package org.sonatype.mavenbook.ch04;

import java.io.InputStream;

import org.apache.log4j.PropertyConfigurator;

public class Main {

    public static void main(String[] args) throws Exception {
        // Configure Log4J
        PropertyConfigurator.configure(Main.class.getClassLoader().getResource("log4j.properties"));

        // Read the Zip Code from the Command-line (if none supplied, use 60202)
        int woeid = 2502265;
        try {
            woeid = Integer.parseInt(args[0]);

        } catch (Exception e) {
        }
        // Start the program
        new Main(woeid).start();
    }

    private int zip;

    public Main(int zip) {
        this.zip = zip;
    }

    public void start() throws Exception {
        // Retrieve Data
        InputStream dataIn = new YahooRetriever().retrieve(zip);
        // Parse Data
        Weather weather = new YahooParser().parse(dataIn);
        // Format (Print) Data
        System.out.print(new WeatherFormatter().format(weather));
    }
}
