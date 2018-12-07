package com.example.demo

import com.example.demo.kata.Mumbling
import spock.lang.Specification

class MumblingSpec extends Specification {

  def mumbling = new Mumbling()

  def 'accom() returns the expected value'() {

    given:
    def string = "abcd"
    def string2 = "RqaEzty"
    def string3 = "cwAt"

    expect:
    "A-Bb-Ccc-Dddd" == mumbling.accum(string)
    "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy" == mumbling.accum(string2)
    "C-Ww-Aaa-Tttt" == mumbling.accum(string3)

  }
}