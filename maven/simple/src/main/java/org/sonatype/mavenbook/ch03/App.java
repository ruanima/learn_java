package org.sonatype.mavenbook.ch03;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String name = args.length > 0 ? args[0] : "World" ;
        System.out.println( String.format("Hello %s!", name));
    }
}
