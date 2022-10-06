package com.file.bll;

import java.io.File;

public class TestCar {

	public static void main(String[] args) {
		try {
			Car c1 = new Car("Maruti AltoK10",2020,5700,150000);
			Car c2 = new Car("Hyundai Creta",2013,630000,700000);
			Car c3 = new Car("Hyundai Verna",2016,87372,900000);
			Car c4 = new Car("Hyundai I10",2022,0,700000);
			Car c5 = new Car("Renault Kwid",2022,0,55000);
			Car c6 = new Car("Maruti Alto800",2010,950000,90000);
			Car c7 = new Car("Hyundai GrandI10",2019,45000,500000);
			Car c8 = new Car("Hyundai I20",2022,0,800000);
			Car c9 = new Car("Hyundai I10",2022,0,700000);
			Car c10= new Car("Maruti Alto800s",2010,450000,50000);
			
		
		//Creating the array to store objects of car class
			Car [] cars1 = new Car[] {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
			
			
			File f = new File("car.txt");
			f.delete();
			
		//Creating the object of CarList
			CarList carList = new CarList("car.txt");
			
			for(Car c : cars1) {
				carList.addCar(c);
			}
			
		//printing no. of new car
			System.out.println("New Cars : " + carList.countNewCars());
			
		//print most expensive car.
			System.out.println("Most expensive Car : " +carList.mostExpensiveCar());
			
		/*carList.removeCar(c9);
			System.out.println("After removing new Cars: " +carList.countNewCars());
		*/
			}
			catch(Exception ex) { 
		// for any Exception
				System.out.println(ex.getMessage());
			}

	}

}
