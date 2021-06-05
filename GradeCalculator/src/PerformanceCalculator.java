import java.util.Scanner;

public class PerformanceCalculator {

    /******************************************************************************
     *  Compilation:  javac performanceCalculate.java
     *  Execution:    calculate()
     *
     *  Description:  A simple total that helps me Track my Weekly Grade @Degacon .
     ******************************************************************************/

    public static double calculate(){

        System.out.println("Enter Algorithm Score");
        Scanner inputScore1 = new Scanner(System.in);
        int inputedAlgorithmScore = inputScore1.nextInt();
        int algorithmGrading = inputedAlgorithmScore / 5;

        System.out.println("Enter Weekly Task Score");
        Scanner inputScore2 = new Scanner(System.in);
        int inputedWeeklyTaskScore = inputScore2.nextInt();
        double weeklyTaskGrading = inputedWeeklyTaskScore / 2.5;

        System.out.println("Enter Assessment Score");
        Scanner inputScore3 = new Scanner(System.in);
        int inputedAssessmentScore = inputScore3.nextInt();
        int assessmentTestGrading = inputedAssessmentScore / 5;

        System.out.println("Enter Agile Score");
        Scanner inputScore4 = new Scanner(System.in);
        int inputedAgileScore = inputScore4.nextInt();
        int agileTestGrading = inputedAgileScore / 5;

        final double totalScore = algorithmGrading + weeklyTaskGrading + assessmentTestGrading + agileTestGrading;

        if(totalScore > 0 && totalScore <= 60 ) {
            System.out.println("Poor Grade. Put in more effort");
        }
        else if(totalScore > 60 && totalScore <= 70 ) {
            System.out.println("Average Grade. You can do better");
        }
        else if(totalScore > 70 && totalScore <= 90) {
            System.out.println("Good. There is room for improvement");
        }
        else if(totalScore > 90 && totalScore <= 100){
            System.out.println("Excellent. Keep it up");
        }
        else {
            System.out.println("Invalid inputs");
        }

        return totalScore;

    }


    public static void main(String[] args) {

        System.out.println("Total Score : " + calculate());
    }
}
