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
        for (int i = 0; i < lista.length; i ++) {
            for (int j = 0; j < lista.length - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    Integer auxValor = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = auxValor;
                }
            }
        }

        return lista;
    }
}
