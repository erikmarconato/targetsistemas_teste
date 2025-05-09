public class Main {
    public static void main(String[] args) {

        Questao1 questao1 = new Questao1();
        Questao2 questao2 = new Questao2();
        Questao3 questao3 = new Questao3();
        Questao4 questao4 = new Questao4();
        Questao5 questao5 = new Questao5();

        System.out.println("Questão 1: " + questao1.questao1());
        System.out.println("--------------------------------------------------");
        System.out.println("Questão 2: " + questao2.questao2(40));
        System.out.println("--------------------------------------------------");
        System.out.println("Questão 3: " + questao3.questao3());
        System.out.println("--------------------------------------------------");
        System.out.println("Questão 4: " + questao4.questao4());
        System.out.println("--------------------------------------------------");
        System.out.println("Questão 5: " + questao5.questao5("Uma string qualquer"));

    }
}