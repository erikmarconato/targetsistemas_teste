public class Questao4 {
    /*
4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
• SP – R$67.836,43
• RJ – R$36.678,66
• MG – R$29.229,88
• ES – R$27.165,48
• Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que
cada estado teve dentro do valor total mensal da distribuidora.  
     */

    public String questao4 (){
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double totalFaturamento = sp + rj + mg + es + outros;

        double percentualSP = (sp / totalFaturamento) * 100;
        double percentualRJ = (rj / totalFaturamento) * 100;
        double percentualMG = (mg / totalFaturamento) * 100;
        double percentualES = (es / totalFaturamento) * 100;
        double percentualOutros = (outros / totalFaturamento) * 100;

        String resultado = "Percentual de representação de cada estado no faturamento mensal:\n";
        resultado += String.format("SP: %.2f%%\n", percentualSP);
        resultado += String.format("RJ: %.2f%%\n", percentualRJ);
        resultado += String.format("MG: %.2f%%\n", percentualMG);
        resultado += String.format("ES: %.2f%%\n", percentualES);
        resultado += String.format("Outros: %.2f%%\n", percentualOutros);

        return resultado;
    }
}
