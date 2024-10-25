import javax.swing.*;

import static java.lang.Float.NaN;

public class Main {
    public static void main(String[] args) {
        float num1;
        float num2;
        int operacao;
        int resultado;

        num1 = Float.parseFloat(JOptionPane.showInputDialog("CalcJava\nDigite o primeiro número:"));
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Qual operação deseja realizar?\n1.Soma\n2.Subtração\n3.multiplicação\n4.Divisão"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("CalcJava\nDigite o segundo número:"));

        switch (operacao){
            case 1:
                JOptionPane.showMessageDialog(null,"O resultado é: " + soma(num1, num2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"O resultado é: " + subtracao(num1, num2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"O resultado é: " + multiplicacao(num1, num2));
                break;
            case 4:
                float resultadoDivisao = divisao(num1, num2);
                if (Float.isNaN(resultadoDivisao)){
                    JOptionPane.showMessageDialog(null,"Impossível dividir por 0!");
                }else {
                    JOptionPane.showMessageDialog(null,"O resultado é: " + resultadoDivisao);
                    break;
                }

        }

    }

    public static float soma(float num1,float num2){
        float resultado = num1 + num2;
        return resultado;
    }

    public static float subtracao(float num1,float num2){
        float resultado = num1 - num2;
        return resultado;
    }

    public static float multiplicacao(float num1,float num2){
        float resultado = num1 * num2;
        return resultado;
    }

    public static float divisao(float num1,float num2){
        if (num2 == 0){
            return NaN;
        }else {
            float resultado = num1 / num2;
            return resultado;
        }

    }
}
