package com.company;

public class Main {

    public static void main(String[] args) {

    	System.out.println("Witamy w programie liczącym pole prostokąta");
		int a = 1;
		int b = 2;
		String dlBoku = "Długość boku a: ";
		String sf1 = String.format (dlBoku + a);

		System.out.println(sf1);
		System.out.println("Długość boku b: " +b);

	int c = a * b;
	System.out.println("Wynik: " +c);

    }
}
