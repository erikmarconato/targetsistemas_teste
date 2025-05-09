public class Questao2 {
        /*
    2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1
    e o próximo valor sempre será a soma dos 2 valores anteriores
    (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa
    na linguagem que desejar onde, informado um número, ele calcule a
    sequência de Fibonacci e retorne uma mensagem avisando se o número
    informado pertence ou não a sequência.
        */

    public String questao2 (int numero){
        int a = 0;
        int b = 1;

        while (a < numero){
            int soma = a + b;
            a = b;
            b = soma;
        }

        if (a == numero){
            return"O número " + numero + " pertence a sequência";
        }

            return "O número " + numero + " NÃO pertence a sequência";

    }
}
