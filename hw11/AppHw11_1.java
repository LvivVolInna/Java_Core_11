package hw11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class AppHw11_1 {

	public static void main(String[] args) {
		System.out.println("Завдання 1. Створити масив Integer, заповнити його рандомними числовими значеннями. Відсортувати його в порядку спадання та в порядку зростання значень.");
		System.out.println("Введіть кількість елементів масиву");
		int s = inputVal('s');
		System.out.println("Введіть найбільше можливе значення елементу масиву");
		int t = inputVal('t');
		Integer[] v = new Integer[s];

		Random r = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = r.nextInt(t);
		}
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(v));
		System.out.println("After sorting");
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));
		System.out.println("After reversesorting");
		Arrays.sort(v, Collections.reverseOrder());
		System.out.println(Arrays.toString(v));
	}

	private static int inputVal(int c) {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

}
