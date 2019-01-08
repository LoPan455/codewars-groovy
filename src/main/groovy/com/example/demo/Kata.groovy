package com.example.demo

import java.util.regex.*

class Kata {

/** House Numbers Sum
 *
 *   A boy is walking a long way from school to his home. To make the walk more fun he decides to add up all the numbers
 *   of the houses that he passes by during his walk. Unfortunately, not all of the houses have numbers written on them,
 *   and on top of that the boy is regularly taking turns to change streets, so the numbers don't appear to him in any
 *   particular order.
 *
 *   At some point during the walk the boy encounters a house with number 0 written on it, which surprises him so much
 *   that he stops adding numbers to his total right after seeing that house.
 *   For the given sequence of houses determine the sum that the boy will get.
 *   It is guaranteed that there will always be at least one 0 house on the path.
 *
 *   Example
 *   For inputArray = [5, 1, 2, 3, 0, 1, 5, 0, 2], the output should be 11.
 *
 *   The answer was obtained as 5 + 1 + 2 + 3 = 11.
 *
 *   Input/Output
 *   [input] integer array inputArray
 *
 *   Constraints: 5 ≤ inputArray.length ≤ 50, 0 ≤ inputArray[i] ≤ 10.
 *
 *   [output] an integer
 *
 * @param inputArray
 */
  static int houseNumbersSum(List<Integer> inputArray) {

    def result = 0

    for (int i; i < inputArray.size(); i++) {
      if (inputArray[i] != 0) {
        result += inputArray[i]
      } else {
        break
      }
    }

    return result

  }

/** In Love
 *
 *   Timmy & Sarah think they are in love, but around where they live
 *   they will only know once they pick a flower each.
 *   If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
 *   Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
 *
 * @param flower1
 * @param flower2
 * @return
 */
  static def lovefunc(flower1, flower2) {
    return ((!(flower1 % 2 == 0)) == (flower2 % 2 == 0))
  }

/** Mumbling
 *
 *  This time no story, no theory. The examples below show
 *  you how to write function accum:
 *
 *  Examples:
 *  accum("abcd") -> "A-Bb-Ccc-Dddd"
 *  accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 *  accum("cwAt") -> "C-Ww-Aaa-Tttt"
 *
 *  The parameter of accum is a string which includes only letters from a..z and A..Z.
 * @param s
 * @return
 */
  static String accum(String s) {

    List lettersList = s.tr('A-Z', 'a-z').toList()
    List<String> outputList = []

    lettersList.eachWithIndex { String entry, int i ->
      outputList.add((entry * (i + 1)).replaceFirst(entry, entry.toUpperCase()))
    }

    def outputString = outputList.join("-")

    return outputString
  }

/**  Printer Error
 *
 *   In a factory a printer prints labels for boxes.
 *   For one kind of boxes the printer has to use colors which, for the sake of simplicity, are named with letters from a to m.
 *
 *   The colors used by the printer are recorded in a control string. For example a "good" control string would be aaabbbbhaijjjm meaning
 *   that the printer used three times color a, four times color b, one time color h then one time color a...
 *
 *   Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string
 *   is produced e.g. aaaxbbbbyyhwawiwjjjwwm.
 *   You have to write a function printer_error which given a string will output the error rate of
 *   the printer as a string representing a   rational
 *   whose numerator is the number of errors and the denominator the length of the control string.
 *   Don't reduce this fraction to a simpler expression.
 *
 *   The string has a length greater or equal to one and contains only letters from ato z.
 * @param string
 * @return
 */
  static String printerError(String string) {

    // count the number of characters in the string (the denominator)
    String totalCharacters = string.length()

    // count of the error characters
    int invalidCharacterCount = 0

    // The RegEx pattern to match against
    def validCharacters = /([a-m])/

    // Loop to check each character in the string and see if it matches the valid characters.  For each mismatch, increment the mismatch count
    string.each {
      if (!(it =~ validCharacters)) {
        invalidCharacterCount++
      }
    }

    return "${invalidCharacterCount}/${totalCharacters}"
  }

/** Odd or Even
 *
 * Create a function (or write a script in Shell) that takes an integer as an argument and returns "Even" for even numbers
 * or "Odd" for odd  numbers.
 *
 * @param number
 * @return
 */
  static String oddOrEven(int number) {

    String result = "Odd"

    if (number % 2 == 0) {
      result = "Even"
    }

    return result
  }

  /**
   * Remove String Spaces
   *
   * @param x
   * @return
   */
  static String noSpace(String x) {

    return x.replaceAll(" ", "")

  }

  /**
   * Seats in Theater
   * Your friend advised you to see a new performance in the most popular theater in the city. He knows a lot about art and his advice is usually good, but not this time: the performance turned out to be awfully dull. It's so bad you want to sneak out, which is quite simple, especially since the exit is located right behind your row to the left. All you need to do is climb over your seat and make your way to the exit.
   *
   * The main problem is your shyness: you're afraid that you'll end up blocking the view (even if only for a couple of seconds) of all the people who sit behind you and in your column or the columns to your left. To gain some courage, you decide to calculate the number of such people and see if you can possibly make it to the exit without disturbing too many people.
   *
   * Given the total number of rows and columns in the theater (nRows and nCols, respectively), and the row and column you're sitting in, return the number of people who sit strictly behind you and in your column or to the left, assuming all seats are occupied.
   */
  static def seatsInTheater(totCols, totRows, col, row) {

    (totRows - row) * (totCols - (col - 1))

  }

  /**
   * Timed Reading is an educational tool used in many schools to improve and advance reading skills. A young elementary student has just finished his very first timed reading exercise. Unfortunately he's not a very good reader yet, so whenever he encountered a word longer than maxLength, he simply skipped it and read on.
   *
   * Help the teacher figure out how many words the boy has read by calculating the number of words in the text he has read, no longer than maxLength.
   *
   * Formally, a word is a substring consisting of English letters, such that characters to the left of the leftmost letter and to the right of the rightmost letter are not letters.
   */
  static def timedReading(maxLength, String text) {

    def pattern = /\b([A-Za-z]{1,$maxLength})\b/
    def matches = (text =~/$pattern/)

    return matches.size()

  }

    /**
     *
     * @param l
     * @param w
     * @param h
     * @return
     */
    static String wallpaper(double l, double w, double h) {

        // Constants
        List<String> numbers = [
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen", "twenty"
        ]

        double wallpaperRollWidth = 0.52
        double wallpaperRollLength = 10
        double totalAreaOfaRoll = wallpaperRollWidth * wallpaperRollLength
        double fudgeFactor = 0.15

        // Wall calculations
        double areaOfTwoWalls = 2 * (l * h)
        double areaOfTwoOtherWalls = 2 * (w * h)
        double areaOfAllWalls = areaOfTwoWalls + areaOfTwoOtherWalls

        // Needed wallpaper
        double numberOfRollsToCover = areaOfAllWalls / totalAreaOfaRoll
        double totalLengthNeeded = (numberOfRollsToCover + (numberOfRollsToCover * fudgeFactor))

        int roundedValue = Math.ceil(totalLengthNeeded)

        return numbers[roundedValue]
    }

    /**
     * In this kata you should simply determine, whether a given year is a leap year or not. In case you don't know the rules, here they are:
     *
     * years divisible by 4 are leap years
     * but years divisible by 100 are no leap years
     * but years divisible by 400 are leap years
     * Additional Notes:
     *
     * Only valid years (positive integers) will be tested, so you don't have to validate them
     * @param year
     */
    static def isLeapYear(year) {

        boolean result = false

        if ((((year % 4) == 0) && ((year % 100) != 0)) || (((year % 400) == 0 ))) {
            result = true
        }

        return result
    }

    /**
     *
     * @param w
     * @return
     */
    static def dative(String w) {

        List<String> frontVowels = ["e", "é", "i", "í", "ö", "ő", "ü", "ű"]
        List<String> backVowels = ["a", "á", "o", "ó", "u", "ú"]
        String frontVowelSuffix = "nek"
        String backVowelSuffix = "nak"

        // TODO: need a better way to find the last instance of one of these vowels
        def lastVowel = w.findLastIndexOf { frontVowels }

        return w


    }

}



