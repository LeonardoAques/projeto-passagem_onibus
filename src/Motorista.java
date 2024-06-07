/*
Máquina que imprime passagens de ônibus.
- Determinar um lugar, indicar a identidade do adulto, informar o número de passagens.
- Pegar o valor total da compra.
- Usar "enum" e "switch".
 */

public class Motorista {
    public static void main(String[] args) {
        double cobranca = Passagem.cobranca(Local.CURITIBA, true, 3);
        System.out.printf("%.2f%n", cobranca);
        cobranca = Passagem.cobranca(Local.LONDRINA, true, 4);
        System.out.printf("%.2f%n", cobranca);
        cobranca = Passagem.cobranca(Local.FOZ_DO_IGUACU, false, 2);
        System.out.printf("%.2f%n", cobranca);
        // Foi inserido o "System.out.printf("%.2f%n", ...)" para impedir que o JAVA imprima mais de duas casas decimais após a vírgula.
    }
}
