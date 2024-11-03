package org.example;
import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        int result = 0;
        int position = 1;

        while (num > 0) {
            int digit = num % 10; // 获取当前最低位的数字
            num /= 10; // 去掉当前最低位的数字

            // 判断数字的奇偶性与数位的奇偶性是否相同
            if ((digit % 2) == (position % 2)) {
                result += Math.pow(2, position - 1);
            }

            position++;
        }

        System.out.println(result);
    }
}