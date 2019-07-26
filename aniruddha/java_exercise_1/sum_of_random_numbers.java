package practice;
import java.util.Random;
import java.util.Scanner;

public class test{

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        // create instance of Random class
        Random rand = new Random();
        System.out.println("Enter a number - ");
        int n = s.nextInt();
        int rand_int1[] = new int[n];
        int sum = 0;
        for(int i = 0; i<n; i++){
            rand_int1[i] = rand.nextInt(1000);
            System.out.println(rand_int1[i]);
            sum += rand_int1[i];
        }

        System.out.println("Sum of random numbers : " + sum);
    }
}