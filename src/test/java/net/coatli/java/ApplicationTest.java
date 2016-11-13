package net.coatli.java;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class ApplicationTest {
  private Greeter greeter = new Greeter();

  @Test
  public void thatSayHelloWorks() {
    assertThat(greeter.sayHello(), containsString("Hello"));
  }
}

