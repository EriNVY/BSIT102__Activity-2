/**
 * @(#)Intro_Short.java
 *
 * Intro_Short application
 *
 * @author 
 * @version 1.00 2019/8/13
 */
 
 import java.util.Scanner;
public class Intro_Short {
    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    
    	String name;
    	String course;
    	String section;
    	String address;
    	String cn;
    	
    	System.out.println("What is your name?");
    	name = scanner.nextLine();
    	
    	System.out.println("What is your course?");
    	course = scanner.nextLine();
    	
    	System.out.println("What is your section?");
    	section = scanner.nextLine();
    	
    	System.out.println("What is your address?");
    	address = scanner.nextLine();
    	
    	System.out.println("What is your contact number?");
    	cn = scanner.nextLine();
    	
    	System.out.println("My Short Introduction");
    	System.out.println();
     	System.out.println();
     	System.out.println(" Hi my name is " + name + " and I'm a college freshman in STI. My course is " + course + " and my section is " + section + ". Now you know where to find me. Hehe;P");
     	System.out.println(" If you ever want to visit me, you can go to " + address + " but I don't do well with unexpected guests so call me first on my phone number which is " + cn + ".");
    	System.out.println("It's really nice to meet you");
    }
}
