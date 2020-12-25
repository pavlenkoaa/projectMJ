import com.company.RomanNumeral;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1, n2;
        boolean isArabian = true;

        System.out.println("Введите первое число: ");
        String f = reader.readLine();
        try {
            n1 = Integer.parseInt(f);
        } catch (Exception e) {
            n1 = RomanNumeral.convertRomanToInt(f);
            isArabian = false;
        }

        System.out.println("Введите тип операции");
        String act = reader.readLine();

        System.out.println("Введите второе число: ");
        String s = reader.readLine();
        try {
            n2 = Integer.parseInt(s);
        } catch (Exception e) {
            n2 = RomanNumeral.convertRomanToInt(s);
        }


        int res = 0;

        if (act.equals("+")) {

            res = n1 + n2;
        }
        if (act.equals("-")) {
            res = n1 - n2;
        }
        if (act.equals("*")) {
            res = n1 * n2;
        }
        if (act.equals("/")) {
            res = n1 / n2;
        }

        if (!isArabian) {
            System.out.println("Результат: " + RomanNumeral.convertIntegerToRoman(res));
        } else {
            System.out.println("Результат: " + res);
        }

    }
}

