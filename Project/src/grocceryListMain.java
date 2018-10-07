import java.util.Scanner;


public class grocceryListMain {
	private static Scanner scanner = new Scanner(System.in);
	private static grocceryList groccerylist = new grocceryList();

	public static void main(String[] args) {
  	boolean quit = false;
  	int choice=0;
  	printInstructions();
  	while(!quit) {
  		System.out.println("enter your choice ");
  		choice=scanner.nextInt();
  		scanner.nextLine();
  		
  		switch(choice) {
  		case 0:
  			printInstructions();
  			break;
  		case 1:
  			grocceryList.printGrocceryList();
  			break;
  		case 2:
  			addItem();
  			break;
  		case 3:
  			modifyItem();
  			break;
  			
  		case 4:
  			removeItem();
  			break;
  			
  		case 5:
  			searchForItem();
  			break;
  		case 6:
  			quit=true;
  			break;

  		}
  		}
  		}
	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0- To print choice options.");
		System.out.println("\t 1- To print the list of grocery items ");
		System.out.println("\t 2- To add an item to the list ");
		System.out.println("\t 3- to modify an item in the list");
		System.out.println("\t 4- To remove an item from the list ");
		System.out.println("\t 5- To to search for an item in the list ");
		System.out.println("\t 6- To quit the application");
			}
	
	public static void addItem() {
		System.out.println("please enter the grocery item ");
		grocceryList.addGrocceryItem(scanner.nextLine());
		
	}
	 public static void modifyItem() {
		 System.out.println("please enter current item name");
		 String currentitemname= scanner.nextLine();
		 scanner.nextLine();
		 System.out.println("please enter new item name");
		 String newitemname=scanner.nextLine();
		 grocceryList.modifyGrocceryItem(currentitemname, newitemname);

	 }
	 
	 public static void removeItem() {
		 System.out.println("please enter the name");
		 String itemname= scanner.nextLine();
		 grocceryList.removeGrocceryItem(itemname);
	 }
	 public static void searchForItem() {
		 System.out.println("please enter the item you are looking for");
		 String searchitem= scanner.nextLine();
		 if(grocceryList.onFile(searchitem)) {
			 System.out.println("the oitem"+searchitem+"is in our groccery list");
		 }
		 else {
			 System.out.println(searchitem+"is not in our list");
		 }
}
}
