package utils;

public class NumbericUtils {
    public static String formatarDoubleParaDecimal(Double valor) {
        return String.format("%.2f", valor).replace(".", ",");
    }
}
