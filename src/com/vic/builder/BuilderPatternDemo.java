package com.vic.builder;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder  mb = new  MealBuilder();
		Meal vm = mb.prepareNonVegMeal();
		vm.showItems();
		System.out.println(vm.getCost());
		//=====================================
		System.out.println("============================================");
		
		Meal vmb = mb.prepareVegMeal();
		vmb.showItems();
		System.out.println(vmb.getCost());
	}
}
