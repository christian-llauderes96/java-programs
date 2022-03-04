
package javaprograms;

/**
 *
 * @author Llauderes Account
 */

import java.util.Scanner;
public class seatReservation {
    static String arr[][];
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        arr = new String[10][4];
        int row, col;
        
        seatReservation sr = new seatReservation();
        //creating * value for array
        sr.initializeArray();
        while(true){
            sr.displaySeat();
            System.out.print("Enter row and column number to reserve separated by space (Enter a negative number to exit): ");
            row=in.nextInt();
            col=in.nextInt();
            if(row < 0 || col <0){
                break;
            }
            if(sr.seatsFull()){
                System.out.println("-----SEATS RESERVATION ARE FULL!-----");
            }
            sr.reserveSeat(row,col);
        }
        System.out.println("Program Exit!");
        
    }
    public void reserveSeat(int a, int b){
        //for max number exception to prevent out of bounds row=10 col=4
        final int maxCol=4,maxRow=10;
        if(a > maxRow || a < 0){
            System.out.println("------Row must be 1-10------");
            return;
        }
        if(b > maxCol || b < 0){
            System.out.println("------Column must be 1-4------");
            return;
        }
        //reserving seat
        if(arr[a-1][b-1].equalsIgnoreCase("x")){
            System.out.println("------Seat is Already taken------");
        } else{
            arr[a-1][b-1] = "X";
            System.out.println("------Successfully Saved!------");
        }
    }
    public void initializeArray(){
        for(int i=0; i<10; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = "*";
            }
        }
    }
    public void displaySeat(){
        System.out.println("\tCol 1\tCol 2\tCol 3\tCol4");
        for(int i=0; i<10; i++){
            System.out.print("Row "+(i+1)+"\t|");
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+"\t");
            }
           
            System.out.println("");
        }
    }
    public boolean seatsFull(){
        boolean status=false;
        int count = 0;
        for(int i=0; i<10; i++){
            for(int j=0; j<4; j++){
                if(arr[i][j].equalsIgnoreCase("x")){
                    count++;
                }
            }
        }
        if(count == 40){
            status = true;
        }
        return status;
    }
    
}
