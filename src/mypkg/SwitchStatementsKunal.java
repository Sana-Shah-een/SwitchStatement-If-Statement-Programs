package mypkg;
import java.util.*;
public class SwitchStatementsKunal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String fruit = in.next();
		
		switch(fruit) {
		case "Mango":
			System.out.println("King of fruits");
			break;
		case "Red":
			System.out.println("Sweet red fruit");
			break;
		case "Orange":
			System.out.println("Round fruit");
			break;
		case "PineApple":
			System.out.println("Green fruit");
			break;
		default:
			System.out.println("Enter a valid fruit");
		}
	}

}
