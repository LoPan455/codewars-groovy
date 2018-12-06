package com.example.demo.kata;

// This time no story, no theory. The examples below show
// you how to write function accum:
//
// Examples:
//
// accum("abcd") -> "A-Bb-Ccc-Dddd"
// accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
// accum("cwAt") -> "C-Ww-Aaa-Tttt"
//
// The parameter of accum is a string which includes only letters from a..z and A..Z.

class Mumbling {

  String accum(String inputString) {

    List lettersList = inputString.toList()
    List outputList = []

    lettersList.eachWithIndex { String entry, int i ->
      outputList.add(entry.multiply((i + 1)))
    }




    // This will be the last thing we want to do on the list to separate out each element
    def outputString = lettersList.join("-")



    return outputString
  }

}
