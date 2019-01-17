/* Name: Tanvi Biyani
 * Net ID: txb160430
 * Class: ITSS 3311.002
 * Hwk 4
 */

import java.util.Scanner;

public class evites {

public static void main(String args[] ) {
	Scanner sc = new Scanner(System.in);
	
	int families = 5;
	int kidsTotal = 0;
	int adultsTotal = 0;
	int headcount = 0;
	
	for (int i = 1; i <= families; i++) {
		
		System.out.println("Enter # of adults for family " + i + ":");
		int tempNumAdults = sc.nextInt(); // gets adults in each family
		adultsTotal += tempNumAdults; // adds to total # of adults
		
		System.out.println("Enter # of kids for family " + i + ":");
		int tempNumKids = sc.nextInt(); // gets kids in each family
		kidsTotal += tempNumKids; //adds to total # of kids
		headcount = adultsTotal + kidsTotal; 
		}
	
	System.out.println("Total # of adults: " + adultsTotal);
	System.out.println("Total # of kids: " + kidsTotal);
	System.out.println("Overall headcount: " + headcount);
	}

}
