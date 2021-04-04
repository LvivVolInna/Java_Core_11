package hw11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AppHw11_2 {

	static void menu() {
		System.out.println("Введіть 1, щоб заповнити масив об`єктами авто, всі значення конструктора якого заповнюються рандомно");
		System.out.println("Введіть 2, щоб створити масив однакових об'єктів із випадково обраними характеристиками");
	}

	public static void main(String[] args) {
		
		System.out.println("Завдання 2.");

		Scanner scanner = new Scanner(System.in);
		MaterialOfHelm [] materialOfHelm = MaterialOfHelm.values();
		
		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {

				Car [][] cars = new Car[getRandomValueFromRange(1, 10)][getRandomValueFromRange(1, 10)];

				for (int i = 0; i < cars.length; i++) {
					for (int j = 0; j < cars[i].length; j++) {
						cars[i][j] = new Car(getRandomValueFromRange(80, 400),
								getRandomValueFromRange(2000, 2021),
								new Helm(getRandomValueFromRange(35, 50),
										materialOfHelm[getRandomValueFromRange(0, materialOfHelm.length - 1)].toString()),
								new Engine(getRandomValueFromRange(3, 8)));
					}
				}

				System.out.println(Arrays.deepToString(cars));
				
				break;
			}

			case 2: {

				Car car = new Car(getRandomValueFromRange(80, 400), getRandomValueFromRange(2000, 2021),
						new Helm(getRandomValueFromRange(35, 50),
								materialOfHelm[getRandomValueFromRange(0, materialOfHelm.length - 1)].toString()),
						new Engine(getRandomValueFromRange(3, 8)));

				Car [] cars = new Car[getRandomValueFromRange(1, 10)];

				Arrays.fill(cars, car);

				System.out.println(Arrays.deepToString(cars));
				
				break;
			}

			default: {
				System.out.println("Будьте уважні! Введіть цифру 1 або 2!");

				break;
			}

			}
		}
	}

	static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}

		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}
}