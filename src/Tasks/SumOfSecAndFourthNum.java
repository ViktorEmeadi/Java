package Tasks;

import java.util.Scanner;

public class SumOfSecAndFourthNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score;
        int sum = 0;
        int sec = 0;
        int fourth = 0;
        int summed = 0;
        int numOfScores = 5;
        for (int count = 0; count < numOfScores; count++){
            System.out.println("Enter a score:");
            score = input.nextInt();
            if (score > -1 && score < 101){
                if (count == 1)sec = score;
                if (count == 3)fourth = score;
                summed = sec + fourth;
            }
        }

        System.out.printf("Total score is: %d", summed);
    }
}
