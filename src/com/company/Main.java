package com.company;
import java.util.Scanner;

public class Main {

    public static int findplace(int[] massive, int i) {

        if (massive[i] > massive[0]) {

            return 0;

        }

        for (int k = 0; k < i - 1; k++) {

            if (massive[k] > massive[i] && massive[i] >= massive[k + 1]) {

                return k + 1;

            }

        }

        return i;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] massive = new int[10];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < massive.length; i++) {

            massive[i] = scan.nextInt();

        }

        for (int i = 0; i < massive.length; i++) System.out.print(massive[i] + " ");

        for (int i = 1; i < massive.length; i++) {

            int peremenay = massive[i];

            int index = findplace(massive, i);

            for (int j = i - 1; j >= index; j--) massive[j + 1] = massive[j];

            massive[index] = peremenay;

        }

        System.out.println(" Отсортированный Массив:");

        for (int i = 0; i < massive.length; i++) System.out.print(massive[i] + " ");

    }
}
