public class Questao5 {
    /*
5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
     */
    public String questao5(String input) {
        String invertida = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            invertida += input.charAt(i);
        }
        return invertida;
    }
}
