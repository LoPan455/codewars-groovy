package com.example.demo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner)
@SpringBootTest
class DemoApplicationTests {

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