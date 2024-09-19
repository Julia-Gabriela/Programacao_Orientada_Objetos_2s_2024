import java.util.Scanner;
//import java.lang.Math:



public class Ex_1 {
	public static void main(String[] args) {

        int num1, num2;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com um numero:");
        num1 = input.nextInt();
        

        System.out.println("Entre com outro numero:");
        num2 = input.nextInt();

        System.out.printf("%d+%d=%d \n", num1, num2, num1+num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
        System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);

        input.close();
    }
}