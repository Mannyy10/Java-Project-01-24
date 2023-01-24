package javaProject;
import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        // Write a java program to find the second largest number in the array.

        int arr[]={2,6,20,45,67,4,9};
        Arrays.sort(arr);
        System.out.println("The second largest number in the array is "+arr[arr.length-2]);
    }
}
