import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        String operacao;
        Double number1, number2, resultado = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite qual operação deseja realizar (opções: + - / *)");
        operacao = sc.nextLine();

        System.out.println("Agora digite os números");
        number1 = sc.nextDouble();
        number2 = sc.nextDouble();

        switch (operacao) {
            case "+":
                resultado = number1 + number2;
                break;
            case "-":
                resultado = number1 - number2;
                break;
            case "/":
                resultado = number1 / number2;
                break;
            case "*":
                resultado = number1 * number2;
                break;
        }


        System.out.printf("%f %s %f = %f", number1, operacao, number2, resultado);
    }
}
