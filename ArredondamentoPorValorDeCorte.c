#include <stdio.h>

int arredondaNumeros (float num, float cutoff)
{
    if ( (num -  (int) num) > cutoff)
    {
        return (int) num + 1; //arredonda para cima
    }
    else
    {
        return (int) num; //arredonda para baixo
    }
}

int main()
{
    float num;
    float cutoff; 
    while (scanf("%f",&num) != EOF) // 3.640
    {
        scanf("%f",&cutoff); // 0.5
        printf("%d\n",arredondaNumeros(num,cutoff));
    }

    return 0;
}