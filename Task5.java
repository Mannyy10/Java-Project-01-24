package javaProject;

public class Task5 {
    public static void main(String[] args) {

        /*
        5)Create a 2D array of integers.
        Develop a program which will calculate the sum of  even and odd numbers for that array.
         */
        int arr[][]={{88,90,48,67,55},
                {34,67,98,11,60},};
        int even=0;
        int odd=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]%2!=0){
                    odd=odd+arr[i][j];
                }else{
                    even=even+arr[i][j];
                }

            }
        }
        System.out.println(even);
        System.out.println(odd);

    }
}
