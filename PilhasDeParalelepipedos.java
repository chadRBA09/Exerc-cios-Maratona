import java.util.Scanner;

public class PilhasDeParalelepipedos {
    public static void main(String args[]) 
    {
        int[] P1 = new int [3];
        int[] P2 = new int [3];
        int maior = 0;
        boolean umEhBase = false;
        boolean doisEhBase = false;
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < P1.length; index++)
        {
            P1[index] = sc.nextInt();
        }

        for (int index2 = 0; index2 < P2.length; index2++)
        {
            P2[index2] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3;j++)
            {
                if(P1[i] > P2[j])
                {
                    maior++;
                }
            }
        }  

        if (maior >= 2)
        {
            umEhBase = true;
        }
        maior = 0; //resetando


        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3;j++)
            {
                if(P2[j] > P1[i])
                {
                    maior++;
                }
            }
        }  
        
        if (maior >= 2)
        {
            doisEhBase = true;
        }

        if(umEhBase && doisEhBase == false)
        {
            MyIO.println(1);
        }    
        else if(doisEhBase && umEhBase == false)
        {
            MyIO.println(2);
        } 
        else if(umEhBase && doisEhBase)
        {
            MyIO.println(3);
        } 
        else 
        {
            MyIO.println(0);
        }
    }
}
