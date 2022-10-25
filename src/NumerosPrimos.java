import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        int number1, number2;
        Scanner getNumber = new Scanner(System.in);

        System.out.println("Digite dois números!");
        number1 = getNumber.nextInt();
        number2= getNumber.nextInt();

        List<Integer> arrayNumbers = calculaPrimos(number1, number2);

        System.out.println("Os números primos no intervalode " + number1 + " e " + number2 + " são " + arrayNumbers);

    }

    private static List<Integer> calculaPrimos(int number1, int number2){
        int numberMin = number1;
        int numberMax = number2;
        List<Integer> arrayNumbers = new ArrayList<Integer>();

        if  (number1 > number2){
            numberMin = number2;
            numberMax = number1;
        }

        while (numberMin <= numberMax){
            int divisor = 2;

             while(numberMin != 1 && numberMin != -1 && numberMin%divisor != 0) {
                divisor += 1;
            }
            if (divisor == numberMin){
                arrayNumbers.add(numberMin);
            }
            numberMin +=1;
        }
        return arrayNumbers;
    }
}
