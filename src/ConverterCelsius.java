public class ConverterCelsius {
    private static double fahrenheit(double celsius) {
        final double fator1 = 9d/5;
        final double fator2 = 32;

        return (celsius * fator1) + fator2;
    }

    public static void main(String[] args) {
        double celsius = 20;
        System.out.println(celsius + " graus celsius é igual a " + fahrenheit(celsius) + " fahrenheit.");

        celsius = 30;
        System.out.println(celsius + " graus celsius é igual a " + fahrenheit(celsius) + " fahrenheit.");
    }
}
