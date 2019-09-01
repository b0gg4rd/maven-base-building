package net.coatli.java;

import static java.time.LocalTime.now;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MvnJavaBuildingApplication {

  private static final Logger LOGGER = LoggerFactory.getLogger(MvnJavaBuildingApplication.class);

  public static void main(final String[] args) {
    LOGGER.info("The current local time is: {}", now());

    LOGGER.info(new Greeter().sayHello());
  }

}
