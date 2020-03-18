package com.syntax.class06;

import java.util.Scanner;

public class switchLiveEx2 {

	public static void main(String[] args) {
		/*
         * ask a user where he or she is from based on the country we will define
         * favorite food Your favorite food is ____
         */
        Scanner scan;
        String country;
        String favoriteFood;
        
        scan = new Scanner(System.in);
        System.out.println("Please enter your country");
        country = scan.nextLine();
        
        switch (country.toLowerCase()) {
        case "morocco":
            favoriteFood = "couscous";
            break;
        case "belarus":
            favoriteFood = "Potato";
            break;
        case "tajikistan":
            favoriteFood = "Osh";
            break;
        case "turkey":
            favoriteFood = "Baklava";
            break;
        case "afghanistan":
            favoriteFood = "Mantu";
            break;
        case "kazakhstan":
            favoriteFood = "Beshparmak";
            break;
        default:
            favoriteFood = "Unknown";
        }
        
        System.out.println("Your favorite food is "+favoriteFood);


	}

}
