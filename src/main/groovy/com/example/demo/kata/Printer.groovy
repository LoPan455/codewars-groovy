package com.example.demo.kata

import java.util.regex.*

class Printer {

//  In a factory a printer prints labels for boxes.
//  For one kind of boxes the printer has to use colors which, for the sake of simplicity, are named with letters from a to m.
//
//  The colors used by the printer are recorded in a control string. For example a "good" control string would be aaabbbbhaijjjm meaning
//  that the printer used three times color a, four times color b, one time color h then one time color a...
//
//  Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm.
//
//  You have to write a function printer_error which given a string will output the error rate of the printer as a string representing a rational
//  whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.
//
//  The string has a length greater or equal to one and contains only letters from ato z.


  static String printerError(String string) {

    // count the number of characters in the string (the denominator)
    String totalCharacters = string.length()

    // count of the error characters
    int invalidCharacterCount = 0

    // The RegEx pattern to match against
    def validCharacters = /([a-m])/

    // Loop to check each character in the string and see if it matches the valid characters.  For each mismatch, increment the mismatch count
    string.each {
      if(!(it =~ validCharacters)) {
        invalidCharacterCount++
      }
    }

    return "${invalidCharacterCount}/${totalCharacters}"
  }

}
