
package javaprograms.sortingAlgorithms;

/**
 *
 * @author llauderes Account
 */

import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String arr[];
        int i,j,size;
        System.out.print("Enter the Size of Array: ");
        size=in.nextInt();
        arr=new String[size];
        for(i=0; i<size; i++){
            System.out.printf("Enter name %d: ", i+1);
            arr[i]=in.next();
        }
        System.out.println("\nSorting names in ascending order\n");
        for(i=0; i<size-1; i++){
            int min=i;
            for(j=i+1; j<size; j++){
                if(arr[j].compareTo(arr[min]) < 0){
                    min=j;
                }
                if(min != i){
                    String temp=arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;
                }
            }
            System.out.printf("Step %d:\n",i+1);
            PrintArray(arr);
        }
        System.out.println("\nNames Sorted in ascending order:");
        PrintArray(arr);
        in.close();
    }
    static void PrintArray(String num[]){
        for (String num1 : num) {
            System.out.print(num1 + " ");
        }
        System.out.println("\n");
    }
}


