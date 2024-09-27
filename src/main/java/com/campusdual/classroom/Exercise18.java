package com.campusdual.classroom;

public class Exercise18 {

	public static int[] createAndInitializeArray(int num) {
		int[] intArray = new int[num];
		for (int i = 0; i < num; i++) {
			intArray[i] = i + 1;
		}
		return intArray;
	}

	public static void showInlineArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			if (i != intArray.length - 1) {
				System.out.print(intArray[i] + " ");
			} else
			System.out.print(intArray[i]);
		}
	}

	public static void main(String[] args) {

		createAndInitializeArray(5);
		showInlineArray(createAndInitializeArray(5));
	}
}
