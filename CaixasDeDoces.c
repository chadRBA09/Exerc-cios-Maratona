#include <stdio.h>

int main ()
{

    int n;
    scanf("%d",&n);
    for (int i = 0; i < n; i++)
    {
        int n_caixas;
        scanf("%d",&n_caixas);
        int caixas[n_caixas];
        for (int i = 0; i < n; i++)
        {
            scanf("%d", caixas[i]);
        }
        int comeu = 0;
        int menor = 999;
        for(int i = 0; i < sizeof(caixas); i++)
        {
            if (caixas[i] < menor)
            {
                menor = caixas[i];
            }
        }

        for(int i = 0; i < sizeof(caixas); i++)
        {
            if (caixas[i] > menor)
            {
                comeu += caixas[i] - menor; 
            }
        }
        printf("%d",comeu);
        
    }


    return 0;
}