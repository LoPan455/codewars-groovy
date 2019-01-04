package com.example.demo

class Kata {

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

        if (((year % 4) == 0) || ((year % 400) == 0 )) {
            result = true
        }

        return result
    }
}
