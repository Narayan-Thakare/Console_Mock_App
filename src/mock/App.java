package mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {
//	System.out.println(i++ + ":-\u001B[32m " + que.getKey()+"\u001B[0m");

	public static void questions(List<Map.Entry<String, String>> list, char ch, int limit) {

	    int i = 1;
	    Scanner sc = new Scanner(System.in);

	    System.out.println("+------------------------------------------+");
	    System.out.println("|            QUESTIONS LIST                |");
	    System.out.println("+------------------------------------------+");

	    for (Map.Entry<String, String> que : list) {

	        if (que.getKey().charAt(0) == ch) {

	            String color = "";

	            switch (ch) {
	                case 'E': color = "\u001B[32m"; break; // Green
	                case 'M': color = "\u001B[33m"; break; // Yellow
	                case 'H': color = "\u001B[31m"; break; // Red
	            }

	            System.out.println("| " + i++ + " | " + color + que.getKey() + "\u001B[0m");

	            System.out.println("|------------------------------------------|");
	            System.out.println("| Press ENTER to view answer               |");
	            System.out.println("|------------------------------------------|");

	            sc.nextLine();

	            System.out.println("| Answer: ");
	            System.out.println("| " + que.getValue());
	            System.out.println("+------------------------------------------+");

	        }

	        if (i == limit + 1)
	            break;
	    }
	}

	public static void questions(List<Map.Entry<String, String>> list, char ch1, char ch2, int limit) {

	    int i = 1;
	    Scanner sc = new Scanner(System.in);

	    System.out.println("+------------------------------------------+");
	    System.out.println("|            QUESTIONS LIST                |");
	    System.out.println("+------------------------------------------+");

	    for (Map.Entry<String, String> que : list) {

	        char level = que.getKey().charAt(0);

	        // check both conditions in ONE place
	        if (level == ch1 || level == ch2) {

	            String color = "";
	            String label = "";

	            switch (level) {
	                case 'E':
	                    color = "\u001B[32m"; label = "EASY"; break;
	                case 'M':
	                    color = "\u001B[33m"; label = "MEDIUM"; break;
	                case 'H':
	                    color = "\u001B[31m"; label = "HARD"; break;
	            }

	            System.out.println("| " + i + " | " + color + que.getKey() + "\u001B[0m");
	            System.out.println("|------------------------------------------|");
	            System.out.println("| Level : " + label);
	            System.out.println("| Press ENTER to view answer               |");
	            System.out.println("+------------------------------------------+");

	            i++;

	            sc.nextLine(); // wait for user

	            System.out.println("| Answer: ");
	            System.out.println("| " + que.getValue());
	            System.out.println("+------------------------------------------+");
	        }

	        if (i > limit)
	            break;
	    }
	}
	
	public static void hardQuestions(List<Map.Entry<String, String>> list, char ch1, char ch2, int limit) {
	    int i = 1;

	    Scanner sc = new Scanner(System.in);

	    System.out.println("+------------------------------------------+");
	    System.out.println("|        MEDIUM + HARD QUESTIONS           |");
	    System.out.println("+------------------------------------------+");

	    for (Map.Entry<String, String> que : list) {

	        if (que.getKey().charAt(0) == ch1) {

	            System.out.println("| " + i++ + " | \u001B[33m" + que.getKey() + "\u001B[0m");
	            System.out.println("|------------------------------------------|");
	            System.out.println("| Press ENTER to view answer               |");
	            System.out.println("+------------------------------------------+");

	            sc.nextLine();

	            System.out.println("| Answer:");
	            System.out.println("| " + que.getValue());
	            System.out.println("+------------------------------------------+");
	        }

	        if (que.getKey().charAt(0) == ch2) {

	            System.out.println("| " + i++ + " | \u001B[31m" + que.getKey() + "\u001B[0m");
	            System.out.println("|------------------------------------------|");
	            System.out.println("| Press ENTER to view answer               |");
	            System.out.println("+------------------------------------------+");

	            sc.nextLine();

	            System.out.println("| Answer:");
	            System.out.println("| " + que.getValue());
	            System.out.println("+------------------------------------------+");
	        }

	        if (i == limit + 1)
	            break;
	    }

	    System.out.println("|-------------- END OF LIST ---------------|");
	    System.out.println("+------------------------------------------+");
	}
	public static void questions(List<Map.Entry<String, String>> list, int limit) {
	    int i = 1;

	    Scanner sc = new Scanner(System.in);

	    System.out.println("+------------------------------------------+");
	    System.out.println("|            QUESTIONS LIST                |");
	    System.out.println("+------------------------------------------+");

	    for (Map.Entry<String, String> que : list) {

	        char level = que.getKey().charAt(0);

	        if (level == 'E')
	            System.out.println("| " + i + " | \u001B[32m" + que.getKey() + "\u001B[0m");

	        if (level == 'M')
	            System.out.println("| " + i + " | \u001B[33m" + que.getKey() + "\u001B[0m");

	        if (level == 'H')
	            System.out.println("| " + i + " | \u001B[31m" + que.getKey() + "\u001B[0m");

	        System.out.println("|------------------------------------------|");
	        System.out.println("| Press ENTER to view answer               |");
	        System.out.println("+------------------------------------------+");

	        i++; // increment after printing

	        sc.nextLine();

	        System.out.println("| Answer:");
	        System.out.println("| " + que.getValue());
	        System.out.println("+------------------------------------------+");

	        if (i > limit)
	            break;
	    }

	    System.out.println("|-------------- END OF LIST ---------------|");
	    System.out.println("+------------------------------------------+");
	}
	
	public static void printAll(LinkedHashMap<String, String> list) {
	    int i = 1;

	    System.out.println("+------------------------------------------+");
	    System.out.println("|             ALL QUESTIONS                |");
	    System.out.println("+------------------------------------------+");

	    for (Map.Entry<String, String> que : list.entrySet()) {

	        char level = que.getKey().charAt(0);

	        if (level == 'E')
	            System.out.println("| " + i++ + " | \u001B[32m" + que.getKey() + "\u001B[0m");

	        if (level == 'M')
	            System.out.println("| " + i++ + " | \u001B[33m" + que.getKey() + "\u001B[0m");

	        if (level == 'H')
	            System.out.println("| " + i++ + " | \u001B[31m" + que.getKey() + "\u001B[0m");

	        System.out.println("|------------------------------------------|");
	        System.out.println("| Answer:");
	        System.out.println("| " + que.getValue());
	        System.out.println("+------------------------------------------+");
	    }

	    System.out.println("|-------------- END OF LIST ---------------|");
	    System.out.println("+------------------------------------------+");
	}


	public static void main(String[] args) {

		LinkedHashMap<String, String> question = new LinkedHashMap<String, String>();

		// Main Method
		question.put("Easy:-   What is a Aava", """
				                       Java is a lang
				""");
		question.put("Medium:-  A", "Java is a lang");
		question.put("Easy:-  B", "Java is a lang");
		question.put("Hard:- C", "Java is a lang");
		question.put("Easy :-D", "Java is a lang");
		question.put("Easy :-F", "Java is a lang");

		// printing Statment
		question.put("Hard  G", "Java is a lang");
		question.put("Medium:- java ?", "Java is a lang");
		question.put("Easy :-I", "Java is a lang");
		question.put("Easy :-J", "Java is a lang");

		// Token
		question.put("Medium:- K", "Java is a lang");
		question.put("Hard L", "Java is a lang");
		question.put("Easy :-M", "Java is a lang");
		question.put("Hard N", "Java is a lang");
		question.put("Hard  O", "Java is a lang");
		question.put("Easy :-P", "Java is a lang");
		question.put("Medium:-  Q", "Java is a lang");
		question.put("Hard R", "Java is a lang");
		question.put("Easy :-S", "Java is a lang");
		question.put("Easy :-T", "Java is a lang");
		question.put("Hard :-U", "Java is a lang");
		question.put("Easy :-T1", "Java is a lang");
		question.put("Medium :-T2", "Java is a lang");
		question.put("Easy :-T3", "Java is a lang");
		question.put("Easy :-T4", "Java is a lang");
		question.put("Medium :-T5", "Java is a lang");
		question.put("Easy :-T6", "Java is a lang");
		question.put("Easy :-T7", "Java is a lang");
		question.put("Easy :-T8", "Java is a lang");
		question.put("Easy :-T9", "Java is a lang");
		question.put("Medium :-T0", "Java is a lang");
		question.put("Easy :-T11", "Java is a lang");
		question.put("Easy :-T12", "Java is a lang");
		question.put("Easy :-T13", "Java is a lang");
		question.put("Easy :-T44", "Java is a lang");
		question.put("Easy :-T55", "Java is a lang");
		question.put("Medium :-T66", "Java is a lang");
		question.put("Easy :-T77", "Java is a lang");
		question.put("Easy :-T777", "Java is a lang");
		question.put("Easy :-T88", "Java is a lang");
		question.put("Easy :-T99", "Java is a lang");
		question.put("Medium :-T10", "Java is a lang");
		question.put("Easy :-T12", "Java is a lang");
		question.put("Easy :-T123", "Java is a lang");
		question.put("Easy :-T2544", "Java is a lang");

		List<Map.Entry<String, String>> list = new ArrayList<>(question.entrySet());

		Collections.shuffle(list);

		Scanner sc = new Scanner(System.in);

		int limit = 15;

		System.out.println("+------------------------------------------+");
		System.out.println("|---------- QUESTION SELECTION ------------|");
		System.out.println("|------------------------------------------|");
		System.out.println("|  1 | Easy                                |");
		System.out.println("|  2 | Medium                              |");
		System.out.println("|  3 | Hard                                |");
		System.out.println("|  4 | Easy + Medium                       |");
		System.out.println("|  5 | Medium + Hard                       |");
		System.out.println("|  6 | Mix (Easy, Medium, Hard)            |");
		System.out.println("|  7 | Print All Questions                 |");
		System.out.println("|------------------------------------------|");
		System.out.println("|        PLEASE ENTER YOUR CHOICE          |");
		System.out.println("+------------------------------------------+");
		System.out.print("            > ");

		int choice = sc.nextInt();
		sc.nextLine(); 

		if (choice < 1 || choice > 7) {
		    System.out.println("Invalid choice!");
		    return;
		}

		if (choice != 7) {
		    System.out.print("Enter total questions: ");
		    limit = sc.nextInt();
		    sc.nextLine(); 
		}

		switch (choice) {
		    case 1 -> questions(list, 'E', limit);
		    case 2 -> questions(list, 'M', limit);
		    case 3 -> questions(list, 'H', limit);
		    case 4 -> questions(list, 'E', 'M', limit);
		    case 5 -> hardQuestions(list, 'M', 'H', limit);
		    case 6 -> questions(list, limit);
		    case 7 -> printAll(question);
		    default -> System.out.println("Invalid choice");
		}


	}

}
