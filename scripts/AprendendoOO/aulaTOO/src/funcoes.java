
import static javax.swing.JOptionPane.showMessageDialog; //in 
import static javax.swing.JOptionPane.showInputDialog; //out
import static java.lang.Integer.parseInt; //string to int
import static java.lang.Float.parseFloat; //string to float

public class funcoes 
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
//        int numFav01 = receberint("Digite seu primeiro número favorito: "),
//        int numFav02 = receberint("Digite seu segundo número favorito: "),
//        int numFav03 = receberint("Digite seu terceiro número favorito: "),
//        int numFav04 = receberint("Digite seu quarto número favorito: "),
//        int numFav05 = receberint("Digite seu quinto número favorito: "),
//        int numFav06 = receberint("Digite seu sexto número favorito: "),
//        int numFav07 = receberint("Digite seu sétimo, e último, número favorito: ");
//        
//        exibir (
//                "Número favorito 1: "+ numFav01 + "\n"+
//                "Número favorito 2: "+ numFav02 + "\n"+
//                "Número favorito 3: "+ numFav03 + "\n"+
//                "Número favorito 4: "+ numFav04 + "\n"+
//                "Número favorito 5: "+ numFav05 + "\n"+
//                "Número favorito 6: "+ numFav06 + "\n"+
//                "Número favorito 7: "+ numFav07 
//        );
                
    }
}

