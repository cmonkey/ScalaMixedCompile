package org.excavator.boot.test

import org.excavator.boot.pojo.Example
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.{DisplayName, Test}


class ExampleTest {

  @Test
  @DisplayName("test Example ")
  def testExample():Unit = {
    val example = new Example(1, 23.8d)
    assertEquals(23.8d, example.amount())
  }
}
