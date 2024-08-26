#include <stdio.h>

int fibo(int pos)
{

    if(pos<=2){
        return 1;
    }
    else
    {
        return fibo(pos-1)+fibo(pos-2);
    }

}

int main()
{

    long num1, num2, aux;
    int pos;

    printf("Qual posicao do termo de Fibonacci:\n ");
    scanf("%d", &pos);

    num1 = 1;
    num2 = 1;

   /* for(int i = 2; i < pos; i++)
    {
        aux = num1;
        num2 = num2 + num1;
        num1 = aux;
    }
*/

    num2 = fibo(pos);
    printf("%d na sequencia de Fibonacci e %ld", pos, num2);

}