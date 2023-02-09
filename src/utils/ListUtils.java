package utils;

public class ListUtils {

    public static <T> String juntarLista(T[] lista) {
        StringBuilder listaConcatenada = new StringBuilder();
        for (T item: lista) {
            listaConcatenada.append(", ").append(item);
        }

        return listaConcatenada.toString().replaceFirst(", ", "");
    }

    public static Integer[] ordernarListaInteiros(Integer[] lista) {
        Integer valorComparacao = null;
        int posicaoValorComparacao = 0;
        int contadorPosicao = 0;
        int tamanhoLoop = lista.length - 1;

        while (contadorPosicao <= tamanhoLoop) {
            if (valorComparacao == null) {
                valorComparacao = lista[contadorPosicao];
                posicaoValorComparacao = lista[contadorPosicao];
            } else if (valorComparacao > lista[contadorPosicao]) {
                Integer valorMenor = lista[contadorPosicao];
                lista[contadorPosicao] = valorComparacao;
                lista[posicaoValorComparacao] = valorMenor;
                posicaoValorComparacao = contadorPosicao;
            } else {
                valorComparacao = lista[contadorPosicao];
                posicaoValorComparacao = contadorPosicao;
            }

            if (contadorPosicao == tamanhoLoop) {
                tamanhoLoop--;
                contadorPosicao = 0;
                continue;
            }

            contadorPosicao++;
        }

        return lista;
    }
}
