package javaProject;

public class Task7 {
    public static void main(String[] args) {

        //Write a java program to check whether a given number is prime or not?
        // 7.

        int number=7;
        int count=0;
        for (int i = 1; i <= number; i++) {
            if(number%i==0){
                count++;

            }
        }
        if(count==2){
            System.out.println(" it's a Prime");
        }else{
            System.out.println("Not a prime number");
        }

    }
}
