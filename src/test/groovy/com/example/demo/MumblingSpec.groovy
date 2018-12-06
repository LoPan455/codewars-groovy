package com.example.demo

import com.example.demo.kata.Mumbling
import spock.lang.Specification

class MumblingSpec extends Specification {

  def mumbling = new Mumbling()

  def 'accom() returns the expected value'() {

    given:
    def string1 = "abcd"
    def string2 = "RqaEzty"
    def string3 = "cwAt"

    when:
    def result = mumbling.accum(string1)

    then:
    "A-Bb-Ccc-Dddd" == result

  }
}