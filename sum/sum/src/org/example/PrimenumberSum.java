package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimenumberSum {
    public static void main(String[] args) {
        // 生成前 200 个素数
        List<Integer> primes = generatePrimes(200);

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 第 n 个素数
        int m = in.nextInt(); // 第 m 个素数

        // 计算第 n 个到第 m 个素数的和
        int sum = 0;
        for (int i = n - 1; i < m; i++) { // 素数列表索引从 0 开始
            sum += primes.get(i);
        }

        System.out.println(sum);
    }

    // 生成前 limit 个素数
    public static List<Integer> generatePrimes(int limit) {
        List<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[limit * 10]; // 预估范围，适当扩大

        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true; // 假设所有数都是素数
        }

        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false; // 标记合数
                }
            }
        }

        // 收集素数
        for (int i = 2; primes.size() < limit && i < isPrime.length; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}
