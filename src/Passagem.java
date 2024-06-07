/*
Máquina que imprime tickets.
- Determinar um lugar, indicar a identidade do adulto, informar o número de tickets.
- Pegar o valor total da compra.
- Usar "enum" e "switch".
 */

public class Passagem {
    public static double cobranca(Local lugar, boolean eAdulto, int numPassagens) {
        double cobrancaBasica = 0.0, cobrancaTotal;
        switch (lugar) {
            case CURITIBA:
                cobrancaBasica = 35.9;
                break;
            case LONDRINA:
                cobrancaBasica = 57.8;
                break;
            case FOZ_DO_IGUACU:
                cobrancaBasica = 69.9;
                break;
        }
        if (!eAdulto) {
            //Se não for adulto, a cobrança básica será 80% da cobrança original.
            cobrancaBasica *= 0.8;
        }
        cobrancaTotal = cobrancaBasica * numPassagens;
        return cobrancaTotal;
    }
}
