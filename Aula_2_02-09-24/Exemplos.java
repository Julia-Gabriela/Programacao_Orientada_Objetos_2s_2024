import java.util.Scanner;
//import java.lang.Math:



public class Exemplos
{
	public static void main(String[] args)
	{

	int num1, num2;

	Scanner input = new Scanner(System.in);
    
	System.out.println("Entre com um numero:");
	num1 = input.nextInt();
	

	System.out.println("Entre com outro numero:");
	num2 = input.nextInt();

	System.out.printf("%d+%d=%d \n", num1, num2, num1+num2);
	System.out.printf("Raiz quadra de %d = %.1f\n", num1, Math.sqrt(num1));
	System.out.printf("%d ao quadrado e %.1f\n", num2, Math.pow(num2, 2));
	  
        if(num1%2==0){
            System.out.printf("%d e par\n", num1);
        }
        else{
            System.out.printf("%d e impar\n", num1);
        }
        if(num2%2==0){
            System.out.printf("%d e par\n", num2);
        }
        else{
            System.out.printf("%d e impar\n", num2);
        }


	}
}