package utils;

public class DinheiroUtils {
    public static String formatarParaReal(Double valor) {
        return "R$ " + NumbericUtils.formatarDoubleParaDecimal(valor);
    }
}
