import java.util.Scanner;

public class pattern3{
    public static void main(String[] args){
        int number=5;
        int starCount=1;
        for(int i=0 ;i<number;i++){
            for(int j=number-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<starCount;j++){
                System.out.print("*");
            }
            starCount=starCount+2;
            System.out.println();
        }

    }
}