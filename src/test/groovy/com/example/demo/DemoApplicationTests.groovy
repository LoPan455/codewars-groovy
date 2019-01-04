package com.example.demo

import org.junit.After
import org.junit.Before
import org.junit.Test
import static org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(JUnit4)
@SpringBootTest
class DemoApplicationTests {

  private static final String[] numbers = [
          "zero", "one", "two", "three", "four",
          "five", "six", "seven", "eight", "nine", "ten",
          "eleven", "twelve", "thirteen", "fourteen", "fifteen",
          "sixteen", "seventeen", "eighteen", "nineteen", "twenty"
  ]

  @Test
  void contextLoads() {
  }



  private Kata kata

  @Before
  void setUp() {
    kata = new Kata()
  }

  @After
  void tearDown() {
    kata = null
  }

  @Test
  void basicTests() {
    assertEquals("ten", kata.wallpaper(4, 3.5, 3));
    assertEquals("sixteen", kata.wallpaper(6.3, 4.5, 3.29));
    assertEquals("sixteen", kata.wallpaper(7.8, 2.9, 3.29));
      assertEquals("zero", kata.wallpaper(0, 0, 0));
      assertEquals("zero", kata.wallpaper(0, 0, 1));
      assertEquals("zero", kata.wallpaper(0, 1, 0));
      assertEquals("zero", kata.wallpaper(1, 0, 0));
      assertEquals("zero", kata.wallpaper(0, 0,0.1));
      assertEquals("zero", kata.wallpaper(0, 0.1, 0));
      assertEquals("zero", kata.wallpaper(0, 0, 0));
  }

    @Test
    void "Should be true"() {
        assert Kata.isLeapYear(1984) == true : 'Year 1984 was a leap year!'
        assert Kata.isLeapYear(2000) == true : 'Year 2000 was a leap year!'
    }

    @Test
    void "Should be false"() {
        assert Kata.isLeapYear(1234) == false: 'Year 1234 was NOT a leap year!'
        assert Kata.isLeapYear(1100) == false: 'Year 1100 was NOT a leap year!'
    }

}
