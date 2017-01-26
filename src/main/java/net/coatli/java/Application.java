package net.coatli.java;

import org.joda.time.LocalTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

  private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

  public static void main(final String[] args) {
	LOGGER.info("The current local time is: {}", new LocalTime());

    LOGGER.info(new Greeter().sayHello());
  }
}
