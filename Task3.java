package javaProject;

public class Task3 {
    public static void main(String[] args) {
        //Create a 2D array of integer values. Print the sum of all numbers.
        int arr[][]={{88,90,48,67},
                {34,67,98,11,60},
        };
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum=sum+ arr [i][j];

            }

        }
        System.out.println(sum);

    }
}
