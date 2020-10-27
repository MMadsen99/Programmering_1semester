package kapitel7.opgave7_1;


import java.util.Scanner;

public class GradesWithArray {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of students: ");
        char[] gradesInLetters = new char[input.nextInt()];
        int[] score = new int[gradesInLetters.length];

        System.out.println("Enter " + score.length + " Scores: ");
        for (int i = 0; i < gradesInLetters.length; i++) {
            score[i] = input.nextInt();
        }

        getScore(gradesInLetters, score);

        for (int i = 0; i < gradesInLetters.length; i++) {
            System.out.println("Student " + i + " score is " + score[i] + " and grade is " + gradesInLetters[i]);
        }


    }
                  public static int maxScore(int[] grades){
                 int maxScore = grades[0];

                      for (int i = 0; i < grades.length; i++) {
                         if (grades[i] > maxScore)
                              maxScore = grades[i];

                      }

                  return maxScore;

                  }
                 
       public static void getScore(char[] score, int[] grades){
            int bestScore = maxScore(grades);
           for (int i = 0; i < grades.length; i++) {

            if (grades[i] >= bestScore - 10)
                score[i] = 'A';
            else if (grades[i] >= bestScore - 20)
                score[i] = 'B';
            else if (grades[i] >= bestScore - 30)
              score[i] = 'C';
            else if (grades[i] >= bestScore - 40)
              score[i] = 'D';
            else score[i] = 'F';
           }
       }
}





