package day25ArraysListSocrative;

import java.util.Arrays;

public class C03Array {
    public static void main(String[] args) {

        int arr[] = {2, 11, 0, 23, 7};

        Arrays.sort(arr);

        for(int i=4; i>=0; i--) {

            System.out.print(arr[i] + " ");

        }

    }
}
