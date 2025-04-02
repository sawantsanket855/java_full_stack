import java.util.Scanner;

public class pattern5{
    public static void main(String[] args){
        System.out.println("welcome");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int number=sc.nextInt();
        
        int stars=1;
        int spaces=number-1;

        for(int i=0;i<(number*2)-1;i++){
            for(int j=0;j<spaces;j++){
                System.out.print("-");
            }
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }

            if(i<number-1){
                spaces=spaces-1;
                stars=stars+2;
            }
            else{
                spaces=spaces+1;
                stars=stars-2;
            }
            System.out.println();
        }

    }
}