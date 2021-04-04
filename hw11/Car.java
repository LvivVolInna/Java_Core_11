package hw11;

import java.util.Arrays;

public class Car {
	private int numberOfHorsepower;
	//= { 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230,
			//240, 250, 260, 270, 280, 290, 300, 310, 320, 330, 340, 350, 360, 370, 380, 390, 400 };
	private int yearOfManufacture;
	//= { 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012,
			//2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020 };
	private Helm helm;
	private Engine engine;

	public Car(int i, int j, Helm helm, Engine engine) {
		super();
		this.numberOfHorsepower = i;
		this.yearOfManufacture = j;
		this.helm = helm;
		this.engine = engine;
	}

	public int getNumberOfHorsepower() {
		return numberOfHorsepower;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public Helm getHelm() {
		return helm;
	}

	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Car [numberOfHorsepower=" + numberOfHorsepower + ", yearOfManufacture=" + yearOfManufacture + ", helm="
				+ helm + ", engine=" + engine + "]";
	}

}
