package com.example.demo.kata

// This time no story, no theory. The examples below show
// you how to write function accum:
//
// Examples:
// accum("abcd") -> "A-Bb-Ccc-Dddd"
// accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
// accum("cwAt") -> "C-Ww-Aaa-Tttt"
//
// The parameter of accum is a string which includes only letters from a..z and A..Z.

class Mumbling {

  String accum(String s) {

    List lettersList = s.tr('A-Z', 'a-z').toList()
    List<String> outputList = []

    lettersList.eachWithIndex { String entry, int i ->
      outputList.add((entry * (i + 1)).replaceFirst(entry, entry.toUpperCase()))
    }

    def outputString = outputList.join("-")

    return outputString
  }

}
