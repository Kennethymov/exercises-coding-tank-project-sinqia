public class CalulatorViaArgs {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int soma = a + b;
        System.out.printf(a  + " + " + b + " = " + soma);
    }
}
