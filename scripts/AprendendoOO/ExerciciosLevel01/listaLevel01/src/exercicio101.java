
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Float.*;

public class exercicio101// nome do programa, sempre começando com letra maiúscula
{


    public static void main(String[] args) {
        //variáveis numéricas
            int x = 10;
            float xx = 10.0f;//é preferivel usar float do que double
            double xxx= 10.0;
            
            
         // variaveis logica
         boolean y = true;

         // variavel de texto
         char z = '1';
         String zz = "100";
         
         
         //como exibir dados
        showMessageDialog(null, z);
         
        
        //como ler valores para variáveis
        zz = showInputDialog("Digite um número: ");
        showMessageDialog(null, zz);
        
        
        // como converter numeros 
        String texto = "10";
        int num1 = parseInt(texto);
        float num2 = parseFloat(texto);
        
        
        
         //resolvendo o exercicio
         String codpeca;
         float valorpeca;
         int quantpeca;
         float preco;
         
         codpeca = showInputDialog(null, "Digite o código da peça: ");

         valorpeca = parseFloat(showInputDialog(null, "Digite o valor unitário da peça: "));
         quantpeca = parseInt(showInputDialog(null, "Digite a quantidade da peça: "));
         valorpeca = valorpeca * quantpeca;
         showMessageDialog(null, "O valor a pagar é: " + valorpeca);
         
                 
         
         
    }//main 
}//class
