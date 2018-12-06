package com.example.demo

import spock.lang.Specification
import com.example.demo.kata.Printer

class PrinterSpec extends Specification {




  void "Basic Tests"() {
    assert "3/56" == Printer.printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")
    assert "6/60" == Printer.printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")
    assert "11/65" == Printer.printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyzuuuuu")
  }


  def "printerError returns the correct string"() {

    given:
    def string1 = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"
    def string2 = "kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"
    def string3 = "kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyzuuuuu"

    when:
    Printer.printerError(string1)

    then:
    "3/56" == Printer.printerError(string1)

    when:
    Printer.printerError(string2)

    then:
    "6/60" == Printer.printerError(string2)

    when:
    Printer.printerError(string3)

    then:
    "11/65" == Printer.printerError(string3)



  }
}