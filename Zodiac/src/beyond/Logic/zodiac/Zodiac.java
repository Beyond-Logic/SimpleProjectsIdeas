package beyond.Logic.zodiac;

/******************************************************************************
 *  Compilation:  javac Zodiac.java
 *  Execution:    java Zodiac month day
 *
 *  Description:  Determine the zodiac sign from month and day.
 ******************************************************************************/

public class Zodiac {
    static String name;
    static String monthOfBirth;
    static int dayOfBirth;
    static  String zodiacSign;
    static String message;

    public Zodiac(String name, String monthOfBirth, int dayOfBirth, String zodiacSign, String message) {
        Zodiac.name = name;
        Zodiac.monthOfBirth = monthOfBirth;
        Zodiac.dayOfBirth = dayOfBirth;
        Zodiac.zodiacSign = zodiacSign;
        Zodiac.message = message;
    }

    public static String getName() {
        return name;
    }

    public static String setName(String name) {
        Zodiac.name = name;
        return name;
    }

    public static String getMonthOfBirth() {
        return monthOfBirth;
    }

    public static String setMonthOfBirth(String monthOfBirth) {
        Zodiac.monthOfBirth = monthOfBirth;
        return monthOfBirth;
    }

    public static int getDayOfBirth() {
        return dayOfBirth;
    }

    public static int setDayOfBirth(int dayOfBirth) {
        Zodiac.dayOfBirth = dayOfBirth;
        return dayOfBirth;
    }

    public static String getZodiacSign() {
        return zodiacSign;
    }

    public static String setZodiacSign(String zodiacSign) {
        Zodiac.zodiacSign = zodiacSign;
        return zodiacSign;
    }

    public static String getMessage() {
        return message;
    }

    public static String setMessage(String message) {
        Zodiac.message = message;
        return message;
    }

    @Override
    public String toString() {
        return "Zodiac{" +
                "name='" + name + '\'' +
                ", monthOfBirth='" + monthOfBirth + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", zodiacSign='" + zodiacSign + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

