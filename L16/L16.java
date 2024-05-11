package DSAJAVA.L16;

import java.util.Scanner;

/**
 * L16
 */
public class L16 {
    public static void main(String[] args) {
        L16 obj = new L16();
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // obj.printarray(arr);
        // obj.InsertElement(arr, 2, 45);
        // obj.printarray(arr);
        // obj.UpdateArray(arr, 3, 457);
        // System.out.println();
        // obj.printarray(arr);

        //2d array
        int arr1[][]=new int[5][4];
        for (int index = 0; index < arr1.length; index++) {
           for (int j = 0; j <arr1[index].length; j++) {
             arr1[index][j]=sc.nextInt();
           }
        }
        obj.print2dArray(arr1);
        // obj.insert2dArray(arr1, 2, 3, 1000);
        obj.update2dArray(arr1, 3, 2, 5555);
        obj.print2dArray(arr1);
    }

    void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void InsertElement(int arr[], int pos, int element) {

        if (pos < 0 || pos > arr.length - 1) {
            System.out.println("Wrong position");
            return;
        }
        for (int i = arr.length - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = element;
    }

    void UpdateArray(int arr[], int pos, int element) {
        arr[pos] = element;
    }

    void print2dArray(int arr[][]){
        for (int index = 0; index < arr.length; index++) {
            for (int j = 0; j < arr[index].length; j++) {
                System.out.print(arr[index][j]+" ");
            }
            System.out.println();
        }
    }
    void insert2dArray(int arr[][],int pos1,int pos2,int element){
        InsertElement(arr[pos1], pos2, element);
    }
    void update2dArray(int arr[][],int pos1,int pos2,int element){
        UpdateArray(arr[pos1], pos2, element);
    }
}