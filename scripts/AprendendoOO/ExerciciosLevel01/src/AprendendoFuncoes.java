import static javax.swing.JOptionPane.showMessageDialog; //importando o programa para exibir mensagem
import static javax.swing.JOptionPane.showInputDialog; //importando programa para receber dados
import static java.lang.Integer.parseInt; // converter String para Int
import static java.lang.Float.parseFloat; //converter String para Float

public class AprendendoFuncoes {
    public static void main(String[] args) // criado apenas com "psvm" + tab :) 
    {
        
        int n1 = parseInt(showInputDialog("Digite um número: "));
        int n2 = parseInt(showInputDialog("Digite outro número: "));
        
        int resultado = calculaSoma(n1, n2);
        showMessageDialog(null, resultado);
    }
    
    public static int calculaSoma(int num1, int num2) //função para somar dois números do tipo inteiro e retornar nº inteiros
    {
        int soma = num1 + num2;
        return soma;
    }
}
