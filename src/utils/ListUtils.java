package utils;

public class ListUtils {

    public static <T> String juntarLista(T[] lista) {
        StringBuilder listaConcatenada = new StringBuilder();
        for (T item: lista) {
            listaConcatenada.append(", ").append(item);
        }

        return listaConcatenada.toString().replaceFirst(", ", "");
    }

    public static
}
