import java.util.Scanner;

public class SomaDeNumeros {
    public static void main(String[] args) {
        Integer number1 = null, number2 = null, soma;
        Scanner sc = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("Digite dois numeros");
            number1 = sc.nextInt();
            number2 = sc.nextInt();
        } else if (args.length == 1) {
            number1 = Integer.parseInt(args[0]);
            System.out.println("Digite mais um numero");
            number2 = sc.nextInt();
        } else if (args.length == 2) {
            number1 = Integer.parseInt(args[0]);
            number2 = Integer.parseInt(args[1]);
        } else {
            System.out.println("Quantidade de números informados inválida!!");
        }

        soma = number1 + number2;

        System.out.printf("%d + %d = %d", number1, number2, soma);
    }
}
