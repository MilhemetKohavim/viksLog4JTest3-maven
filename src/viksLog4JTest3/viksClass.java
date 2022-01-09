package viksLog4JTest3;


import org.apache.log4j.Logger;
import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class viksClass {
	 
	
	 static Logger log = Logger.getLogger(viksClass.class.getName());
	
  public static void main(String[] args) 
  {
		  
		  String password="123";
	      log.info("this is a LOG4J info dynamic message!!! ");     
		  System.out.println ("---------------this is a regular out.println static message-----------");
	  }
  
}
 

///https://www.javatpoint.com/log4j-example
/*
 5) Add the log4j.properties file to the Classpath

Now, we need to add the location of our log4j.properties file to the Classpath in Eclipse. Follow the below steps to do the configuration:

Right-click on your project name and select Run As -> Run Configurations /*
	   *
C:\Users\VictoriaKoveshnikov>jar tf "C:\Users\VictoriaKoveshnikov\eclipse-workspace2_java\JAR\viksLOG4JTest extract libs1.jar" grep log4j
log4j2.properties

C:\Users\VictoriaKoveshnikov>jar tf "C:\Users\VictoriaKoveshnikov\eclipse-workspace2_java\JAR\viksLOG4JTest  package libs1.jar" grep log4j
log4j2.properties
log4j-core-2.17.1.jar
log4j-api-2.17.1.jar


veracode SCA
Scan: 5 Jan 2022 Static packaged libs
log4j-core-2.17.1.jar
Scan: 5 Jan 2022 Static extracted libs1
You do not have any components in your application at this time.


	   * */
 
 /*ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();

 builder.setStatusLevel(Level.INFO);
 // naming the logger configuration
 builder.setConfigurationName("DefaultLoggerVik");

 // create a console appender
 AppenderComponentBuilder appenderBuilder = builder.newAppender("Console", "CONSOLE")
                 .addAttribute("target", ConsoleAppender.Target.SYSTEM_OUT);
 // add a layout like pattern, json etc
 appenderBuilder.add(builder.newLayout("PatternLayout")
                 .addAttribute("pattern", "%d %p %c [%t] %m%n"));
 RootLoggerComponentBuilder rootLogger = builder.newRootLogger(Level.INFO);
 rootLogger.add(builder.newAppenderRef("Console"));

 builder.add(appenderBuilder);
 builder.add(rootLogger);
 Configurator.reconfigure(builder.build());*/

//log.debug("Hello viks this is a debug message");
