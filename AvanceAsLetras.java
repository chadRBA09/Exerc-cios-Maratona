public class AvanceAsLetras {
    public static void main(String[] args) {
        int t = MyIO.readInt();
        for (int i = 0; i < t; i++)
        {
            int cont = 0;
            String primeira = MyIO.readString();
            String segunda =  MyIO.readString();
            for (int j = 0; j < primeira.length(); j++)
            {
                if (primeira.charAt(j) != segunda.charAt(j))
                {
                    if(primeira.charAt(j) < segunda.charAt(j))
                    {
                        cont += (int) segunda.charAt(j)  - (int) primeira.charAt(j);
                    }
                    else // caso a primeira seja maior que a segunda
                    {
                        cont += (int) 'z' - primeira.charAt(j) + segunda.charAt(j) - (int) 'a' + 1; // Ve a diferenca do caractere da primeira palavra para o z e depois soma com o que falta para chegar ate o 'a'
                    }
                }
            }
            MyIO.println(cont);
        }
    }
}
