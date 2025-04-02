import java.util.Scanner;

public class pattern2{
    public static void main(String[] args){
        int number=0;
        System.out.println("welcome");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        number=sc.nextInt();
        for(int i=0;i<number;i++){
            for(int j=0;j<number-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}