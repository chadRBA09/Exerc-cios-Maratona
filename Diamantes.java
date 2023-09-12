class Diamantes{
    public static void main (String[] args)
    {
        
        int n = MyIO.readInt(); //quantidade de casos testes
        
        for (int i = 0; i < n; i++) 
        {
           int contAbre = 0; // contador de .
           int contDima= 0;
           String texto = MyIO.readLine();
           String aux = "";
           for (int j = 0; j < texto.length(); j++)
           {
                if(texto.charAt(j) != '.')
                {
                    aux += texto.charAt(j); // faz uma string só com o < e >
                }
            
           }
           MyIO.println(aux);       
             for (int k = 0; k < aux.length(); k++)
           {
                if(aux.charAt(k) == '<')
                {
                    contAbre++;
                }
                if (aux.charAt(k) == '>' && contAbre > 0) //se tiver contAbre > 0 significa que está esperando apra ser fechado por >
                {
                    contDima++; // Diamante completo
                    contAbre--; //toda vez que fechar o diamante vai diminuir o contAbre porque não vai estar mais esperando por um >
                }
           }

           MyIO.println(contDima);
        }
        

    }
}