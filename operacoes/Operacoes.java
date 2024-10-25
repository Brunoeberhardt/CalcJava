package operacoes;

import static java.lang.Float.NaN;

public class Operacoes {
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
