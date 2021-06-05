package beyond.Logic.zodiac;

import java.util.Scanner;

public class Main {

    /******************************************************************************
     *  Compilation:  javac Main.java
     *  Execution:    java Zodiac month day
     *
     *  Description:  Determine the zodiac sign from month and day.
     *  Resources: https://www.horoscope.com/zodiac-signs
     ******************************************************************************/

    public static void main(String[] args) {

        System.out.println("Zodiac Sign App");
        System.out.println("What's your name?");
        Scanner inputName = new Scanner(System.in);
        String inputedName = inputName.next();
        System.out.println("Month of Birth");
        Scanner inputMonth = new Scanner(System.in);
        String inputedMonth = inputMonth.next();
        System.out.println("Date of Birth");
        Scanner inputDay = new Scanner(System.in);
        int inputedDay = inputDay.nextInt();

        if((inputedMonth.equalsIgnoreCase("December") && inputedDay >= 22 && inputedDay <= 31) || (inputedMonth.equalsIgnoreCase("January") && inputedDay >= 1 && inputedDay <= 19)){
            System.out.println("Name: " + Zodiac.setName(inputedName));
            System.out.println("Birthday: " + Zodiac.setMonthOfBirth(inputedMonth) + " " + Zodiac.setDayOfBirth(inputedDay));
            System.out.println("Zodiac Sign: " + Zodiac.setZodiacSign("Capricorn"));
            System.out.println("Traits: " + Zodiac.setMessage("Serious, independent, disciplined and tenacious"));
        }

        else if ((inputedMonth.equalsIgnoreCase("January") && inputedDay >= 20 && inputedDay <= 31) || (inputedMonth.equalsIgnoreCase("February") && inputedDay >= 1 && inputedDay <= 17)){
            System.out.println("Name: " + Zodiac.setName(inputedName));
            System.out.println("Birthday: " + Zodiac.setMonthOfBirth(inputedMonth) + " " + Zodiac.setDayOfBirth(inputedDay));
            System.out.println("Zodiac Sign: " + Zodiac.setZodiacSign("Aquarius"));
            System.out.println("Traits: " + Zodiac.setMessage("Deep, imaginative, original and uncompromising"));
        }

        else if ((inputedMonth.equalsIgnoreCase("February") && inputedDay >= 18 && inputedDay <= 29) || (inputedMonth.equalsIgnoreCase("Match") && inputedDay >= 1 && inputedDay <= 19)){
            System.out.println("Name: " + Zodiac.setName(inputedName));
            System.out.println("Birthday: " + Zodiac.setMonthOfBirth(inputedMonth) + " " + Zodiac.setDayOfBirth(inputedDay));
            System.out.println("Zodiac Sign: " + Zodiac.setZodiacSign("Pisces"));
            System.out.println("Traits: " + Zodiac.setMessage("Affectionate, empathetic, wise and artistic"));
        }

        else if ((inputedMonth.equalsIgnoreCase("Match") && inputedDay >= 20 && inputedDay <= 31) || (inputedMonth.equalsIgnoreCase("April") && inputedDay >= 1 && inputedDay <= 19)){
            System.out.println("Name: " + Zodiac.setName(inputedName));
            System.out.println("Birthday: " + Zodiac.setMonthOfBirth(inputedMonth) + " " + Zodiac.setDayOfBirth(inputedDay));
            System.out.println("Zodiac Sign: " + Zodiac.setZodiacSign("Aries"));
            System.out.println("Traits: " + Zodiac.setMessage("Eager, dynamic, quick and competitive"));
        }

        else if ((inputedMonth.equalsIgnoreCase("April") && inputedDay >= 20 && inputedDay <= 30) || (inputedMonth.equalsIgnoreCase("May") && inputedDay >= 1 && inputedDay <= 20)){
            System.out.println("Name: " + Zodiac.setName(inputedName));
            System.out.println("Birthday: " + Zodiac.setMonthOfBirth(inputedMonth) + " " + Zodiac.setDayOfBirth(inputedDay));
            System.out.println("Zodiac Sign: " + Zodiac.setZodiacSign("Taurus"));
            System.out.println("Traits: " + Zodiac.setMessage("Strong, dependable, sensual and creative"));
        }

        else if ((inputedMonth.equalsIgnoreCase("May") && inputedDay >= 21 && inputedDay <= 31) || (inputedMonth.equalsIgnoreCase("June") && inputedDay >= 1 && inputedDay <= 20)){
            System.out.println("Name: " + Zodiac.setName(inputedName));
            System.out.println("Birthday: " + Zodiac.setMonthOfBirth(inputedMonth) + " " + Zodiac.setDayOfBirth(inputedDay));
            System.out.println("Zodiac Sign: " + Zodiac.setZodiacSign("Gemini"));
            System.out.println("Traits: " + Zodiac.setMessage("Versatile, expressive, curious and kind"));
        }

        else if ((inputedMonth.equalsIgnoreCase("June") && inputedDay >= 21 && inputedDay <= 30) || (inputedMonth.equalsIgnoreCase("July") && inputedDay >= 1 && inputedDay <= 22)){
            System.out.println("Name: " + Zodiac.setName(inputedName));
            System.out.println("Birthday: " + Zodiac.setMonthOfBirth(inputedMonth) + " " + Zodiac.setDayOfBirth(inputedDay));
            System.out.println("Zodiac Sign: " + Zodiac.setZodiacSign("Cancer"));
            System.out.println("Traits: " + Zodiac.setMessage("Intuitive, sentimental, compassionate and protective"));
        }

        else if ((inputedMonth.equalsIgnoreCase("July") && inputedDay >= 23 && inputedDay <= 31) || (inputedMonth.equalsIgnoreCase("August") && inputedDay >= 1 && inputedDay <= 22)){
            System.out.println("Name: " + Zodiac.setName(inputedName));
            System.out.println("Birthday: " + Zodiac.setMonthOfBirth(inputedMonth) + " " + Zodiac.setDayOfBirth(inputedDay));
            System.out.println("Zodiac Sign: " + Zodiac.setZodiacSign("Leo"));
            System.out.println("Traits: " + Zodiac.setMessage("Dramatic, outgoing, fiery and self-assured"));
        }

        else if ((inputedMonth.equalsIgnoreCase("August") && inputedDay >= 23 && inputedDay <= 31) || (inputedMonth.equalsIgnoreCase("September") && inputedDay >= 1 && inputedDay <= 22)){
            System.out.println("Name: " + Zodiac.setName(inputedName));
            System.out.println("Birthday: " + Zodiac.setMonthOfBirth(inputedMonth) + " " + Zodiac.setDayOfBirth(inputedDay));
            System.out.println("Zodiac Sign: " + Zodiac.setZodiacSign("Virgo"));
            System.out.println("Traits: " + Zodiac.setMessage("Practical, loyal, gentle and analytical"));
        }

        else if ((inputedMonth.equalsIgnoreCase("September") && inputedDay >= 23 && inputedDay <= 30) || (inputedMonth.equalsIgnoreCase("October") && inputedDay >= 1 && inputedDay <= 22)){
            System.out.println("Name: " + Zodiac.setName(inputedName));
            System.out.println("Birthday: " + Zodiac.setMonthOfBirth(inputedMonth) + " " + Zodiac.setDayOfBirth(inputedDay));
            System.out.println("Zodiac Sign: " + Zodiac.setZodiacSign("Libra"));
            System.out.println("Traits: " + Zodiac.setMessage("Social, fair-minded, diplomatic and gracious"));
        }


        else if ((inputedMonth.equalsIgnoreCase("October") && inputedDay >= 23 && inputedDay <= 31) || (inputedMonth.equalsIgnoreCase("November") && inputedDay >= 1 && inputedDay <= 21)){
            System.out.println("Name: " + Zodiac.setName(inputedName));
            System.out.println("Birthday: " + Zodiac.setMonthOfBirth(inputedMonth) + " " + Zodiac.setDayOfBirth(inputedDay));
            System.out.println("Zodiac Sign: " + Zodiac.setZodiacSign("Scorpio"));
            System.out.println("Traits: " + Zodiac.setMessage("Passionate, stubborn, resourceful and brave"));
        }

        else if ((inputedMonth.equalsIgnoreCase("November") && inputedDay >= 22 && inputedDay <= 30) || (inputedMonth.equalsIgnoreCase("December") && inputedDay >= 1 && inputedDay <= 21)){
            System.out.println("Name: " + Zodiac.setName(inputedName));
            System.out.println("Birthday: " + Zodiac.setMonthOfBirth(inputedMonth) + " " + Zodiac.setDayOfBirth(inputedDay));
            System.out.println("Zodiac Sign: " + Zodiac.setZodiacSign("Sagittarius"));
            System.out.println("Traits: " + Zodiac.setMessage("Extroverted, optimistic, funny and generous"));
        }




        else {
            System.out.println("Can't figure out your Zodiac Sign. Check that you entered a valid Information");
        }

    }



}
