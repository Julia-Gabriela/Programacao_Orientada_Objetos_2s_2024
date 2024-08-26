#include <stdio.h>

int ehPrimo(int num)
{
    int bool = 1;
    for(int i = 2; i<num; i++)
    {
        if(num % i == 0)
        {
            bool = 0;
            break;
        }
    }
    return bool;
}

int main()
{
    int num, contador = 0, n = 2;

    printf("Digite um numero\n");
    scanf("%d", &num);

    while(contador<num)
    {
        if(ehPrimo(n) == 1){
            contador++;
        }
        n++;
    }
    printf("%d numero primo e %d\n", num, n-1);

    if(ehPrimo(num) == 1){
        printf("%d e primo\n", num);
    }
    else
    {
        printf("%d nao e primo\n", num);
    }

}