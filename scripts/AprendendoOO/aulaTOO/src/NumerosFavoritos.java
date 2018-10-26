import static javax.swing.JOptionPane.showMessageDialog; //in 
import static javax.swing.JOptionPane.showInputDialog; //out
import static java.lang.Integer.parseInt; //string to int
import static java.lang.Float.parseFloat; //string to float
import static java.lang.String.valueOf; // converter qualquer coisa para string

public class NumerosFavoritos 
{
    public static int receberint (String mensagemProUsuario)
    {
        try {
             return parseInt(showInputDialog(mensagemProUsuario)); //código normal
        } catch (Exception e) {
            //se deu errado: (tartamendo OU NÃO do erro)
        }
        
        return 0;
    }
     public static void exibir (String mensagemProUsuario)
    {
        showMessageDialog(null, mensagemProUsuario);
    }
    public static void main (String [] args)
    {
        int [] numFav = new int [7]; //criando um array de 1D
        
         // numFav[5]=2;  acessando um elemento do array, atribuindo um int a auma de suas posições
               
        for(int cont = 0; cont < numFav.length ; cont++)
        {
            numFav [cont] = receberint("digite o "+ (cont+1) + "º favorito");
        }

        //var auxiliar para mostrar tudo em uma tela só
        String mensagem = "";
        for(int cont = 0; cont < numFav.length ; cont++)
        {
           mensagem += ("Número Favorito " + (cont+1) + ": " + numFav[cont]+ "\n");
        }
        exibir (mensagem);
        
                
    }
}

