import cs1.Keyboard;

//You are traveling to King's Island for the day.
//Everyone in the group has agreed to split the cost evenly.
//Write a program to determine the total cost of the trip and the cost per person.
//Assume that each ticket is $32.99

import java.util.Scanner;

public class KingsIsland
{
	public static void main(String[] args)
	{
		//Declare variables for the number of people, parking cost, food cost, total cost, cost per person
		int numOfPeople;
		float parkingCost, foodCost, totalCost, costPerPerson;

		//Prompt for and read in the number of people in the group
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number of people: ");
		numOfPeople = reader.nextInt();


		//Prompt for and read in the cost of parking
		System.out.println("Enter the cost of parking: ");
		parkingCost = reader.nextFloat();


		//Prompt for and read in the amount spent on food
		System.out.println("Enter the cost of food: ");
		foodCost = reader.nextFloat();
		reader.close();

		//Calculate the total expenses
		totalCost = parkingCost + foodCost;

		//Calculate the average per person
		costPerPerson = totalCost / numOfPeople;

		//Display results
		System.out.println("The total cost was $" + totalCost + " which means each person should pay $" + costPerPerson + ".");

	}
}