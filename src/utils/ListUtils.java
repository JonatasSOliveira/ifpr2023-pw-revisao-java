package utils;

public class ListUtils {

    public static <T>  T[] inverterLista(T[] lista) {
        T[] listaInversa = lista.clone();

        for (int i = 0; i < lista.length; i++) {
            listaInversa[i] = lista[lista.length - i - 1];
        }

        return listaInversa;
    }

    public static <T> String juntarLista(T[] lista) {
        StringBuilder listaConcatenada = new StringBuilder();
        for (T item: lista) {
            listaConcatenada.append(", ").append(item);
        }

        return listaConcatenada.toString().replaceFirst(", ", "");
    }
}
