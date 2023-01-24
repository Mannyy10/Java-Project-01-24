package javaProject;

public class Task9 {
    public static void main(String[] args) {

        int arr[]={16,89,22,3,67,88,34,25,63,77,14,17};
        int min=arr[0];
        int max=arr[0];

        for (int i = 0; i < 11; i++) {
            if(arr[i]<min) min=arr[i];
            if(arr[i]>max) max=arr[i];

        }
        System.out.println("The Minimum number is "+min);
        System.out.println("The Maximum number is "+max);


    }
}
