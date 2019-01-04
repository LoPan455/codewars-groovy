package com.example.demo

import org.junit.After
import org.junit.Before
import org.junit.Test
import static org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.springframework.boot.test.context.SpringBootTest


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


  @Test
  void "House Number Sum Examples"() {
    assert Kata.houseNumbersSum([5, 1, 2, 3, 0, 1, 5, 0, 2]) == 11
    assert Kata.houseNumbersSum([4, 2, 1, 6, 0]) == 13
    assert Kata.houseNumbersSum([4, 1, 2, 3, 0, 10, 2]) == 10
    assert Kata.houseNumbersSum([0, 1, 2, 3, 4, 5]) == 0
  }

  @Test
  void "Basic tests for Remove String Spaces"() {
    assert "8j8mBliB8gimjB8B8jlB" == Kata.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B")
    assert "88Bifk8hB8BB8BBBB888chl8BhBfd" == Kata.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd")
    assert "8aaaaaddddr" == Kata.noSpace("8aaaaa dddd r     ")
    assert "jfBmgklf8hg88lbe8" == Kata.noSpace("jfBm  gk lf8hg  88lbe8 ")
    assert "8jaam" == Kata.noSpace("8j aam")

  }

  @Test
  void "Seats in Theater Tests"() {
    assert Kata.seatsInTheater(16,11,5,3) == 96
    assert Kata.seatsInTheater(1,1,1,1) == 0
    assert Kata.seatsInTheater(13,6,8,3) == 18
    assert Kata.seatsInTheater(60,100,60,1) == 99
    assert Kata.seatsInTheater(1000,1000,1000,1000) == 0
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

    @Test
    void "Timed Reading Tests"() {
        assert Kata.timedReading(4, "The Fox asked the stork, 'How is the soup?'") == 7
        assert Kata.timedReading(1, "...") == 0
        assert Kata.timedReading(3, "This play was good for us.") == 3
        assert Kata.timedReading(3, "Suddenly he stopped, and glanced up at the houses") == 5
        assert Kata.timedReading(6, "Zebras evolved among the Old World horses within the last four million years.") == 11
        assert Kata.timedReading(5, "Although zebra species may have overlapping ranges, they do not interbreed.") == 6
        assert Kata.timedReading(1, "Oh!") == 0
        assert Kata.timedReading(5, "Now and then, however, he is horribly thoughtless, and seems to take a real delight in giving me pain.") == 14
    }

}


