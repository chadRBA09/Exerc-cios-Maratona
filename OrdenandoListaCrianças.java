public class OrdenandoListaCrianças {
    
    public static void swap (String[] array, int a, int b)
    {
        String temp = array[a];
        array[a] = array [b];
        array[b] = temp;
    }
    
    public static void main (String[] args)
    {
        int n = MyIO.readInt();
        String[] lista = new String[n]; //lista de nomes
        int comportaram = 0;
        int N_comportaram = 0;
        for (int i = 0; i < n; i++)
        {
            String aux = "";
            String nomes = MyIO.readLine();
                if(nomes.charAt(0) == '+')
                {
                    comportaram++;
                }
                else if (nomes.charAt(0) == '-')
                {
                    N_comportaram++;
                }
            for(int j = 2; j < nomes.length(); j++) //começa depois do espaço
            {
                    aux += nomes.charAt(j);
            }
            lista[i] = aux; //preenchendo lista com os nomes formados
        }

        for (int i = 0; i < lista.length - 1 ; i++)
            {
                int menor = i;
                for (int j = i + 1; j < lista.length; j++)
                {
                    if (lista[j].compareTo(lista[menor]) < 0) //compara string na posição j com string de posição menor, se o resultado < 0 , a primeira string é menor (alfabeticamente), se não a outra é maior
                    {
                        menor = j; //salva o menor como a palavra de posição j
                    }
                }
            swap(lista, i, menor); //troca a palavra da posição k pela palavra da posição menor, em cada iteração 
            }
        for (int i = 0; i < lista.length; i++)
        {
            MyIO.println(lista[i]);
        }    
        MyIO.println("Se comportaram : " + comportaram + " | Não se comportaram : " + N_comportaram);
    } 
}
