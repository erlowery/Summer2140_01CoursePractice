package StudentForLoop;
import java.util.Scanner;
public class NumberBetweenEthan {
      public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("please input a number between 1 and 100 inclusive: ");
        int number1 = input.nextInt();
        if(number1>100){
            System.out.println("please input a smaller number");

        }
        if(number1<1){
            System.out.println("please input a larger number");

        }
        if((number1 <= 100) && (number1 >= 1)){
            for(int count = 1; count<=number1;count++){
                System.out.println(count);
            }

        }
    }
}
