import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Questao3 {

    /*
3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:

• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
    */

    public String questao3() {

        // Simulando os dados de um arquivo JSON diretamente com uma lista em Java, para evitar dependências externas como o uso do pom.xml
        List<Double> faturamento = Arrays.asList(
                0.0, 22174.16, 24537.66, 26139.61, 0.0, 0.0, 26742.66,
                0.0, 42889.22, 46251.17, 11191.47, 0.0, 0.0, 3847.48,
                373.78, 2659.75, 48924.24, 18419.26, 0.0, 0.0, 35240.18,
                43829.16, 18235.68, 4355.06, 13327.10, 0.0, 0.0, 25681.83,
                1718.12, 13220.49
        );

        List<Double> diasValidos = new ArrayList<>();
        for (double valor : faturamento) {
            if (valor > 0) diasValidos.add(valor);
        }

        double soma = diasValidos.stream().mapToDouble(Double::doubleValue).sum();
        double media = soma / diasValidos.size();
        double menor = Collections.min(diasValidos);
        double maior = Collections.max(diasValidos);
        long acimaMedia = diasValidos.stream().filter(v -> v > media).count();

        return String.format("Menor: %.2f | Maior: %.2f | Dias acima da média: %d", menor, maior, acimaMedia);
    }
}
