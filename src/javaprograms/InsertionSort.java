
package javaprograms.sortingAlgorithms;

/**
 *
 * @author llauderes Account
 */

import java.util.Scanner;
public class InsertionSort {
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
        System.out.println("\nUNSORTED:\n");
        for(i=0; i<size; i++){
            System.out.print(arr[i]+" ");
            
        }
        for(i=1; i<size; i++){
            String temp=arr[i];
            j=i-1;
            while(j>=0 && arr[j].compareTo(temp)>0){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
            System.out.printf("\nStep %d:\n",i);
            PrintArray(arr);
        }
        System.out.println("\nNumbers Sorted in ascending order:");
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

