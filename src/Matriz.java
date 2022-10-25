import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int [][] tabulator = new int [3][3];
        tabulator[0][0] = 1;
        tabulator[1][0] = 1;
        tabulator[2][0] = 1;
        tabulator[0][1] = 1;
        tabulator[0][2] = 1;
        tabulator[1][1] = 1;
        tabulator[1][2] = 1;
        tabulator[2][1] = 1;
        tabulator[2][2] = 1;

        System.out.println(Arrays.deepToString(tabulator));

        Scanner input = new Scanner(System.in);

        int number2 = null;

        try {
            System.out.println("Digite o valor desejado.");
            int number = input.nextInt();
        } catch (InputMismatchException e) {
            while (input instanceof String) {
                System.out.println("Digite o valor desejado.");
                int number = input.nextInt();
            }
        }
    }

}
