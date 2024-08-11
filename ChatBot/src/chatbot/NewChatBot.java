/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatbot;

import java.util.*;
import java.io.*;

public class NewChatBot {

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ask Me Anything ! :-");
            String User = sc.nextLine();

            if (User.equals("Hi") || User.equals("hi") || User.equals("Hello") || User.equals("hello") || User.equals("hi jony")) {
                System.out.println("You :- " + User);
                System.out.println("Jony :-" + "Hello Pranay");
            } else if (User.equals("Who are you?") || User.equals("who are you?") || User.equals("Are you robot or human?") || User.equals("Are you chat bot")) {
                System.out.println("You :- " + User);
                System.out.println("Jony :-" + "I am Bot");
            } else if (User.equals("How are you?") || User.equals("how are you?")) {
                System.out.println("You :- " + User);
                System.out.println("Jony :-" + "I am fine thank you for asking");
            } else if (User.equals("Wanna be friends?") || User.equals("wanna be riends?")) {
                System.out.println("You :- " + User);
                System.out.println("Jony :-" + "We are already friends");
            } else if (User.equals("Tell me a joke?") || User.equals("Tell me any funny joke?")) {
                System.out.println("You :- " + User);
                System.out.println("Jony :-" + "What is the best about Switherland?" + "I don't know , but the flag is big plus");
            } else if (User.equals("Add two numbers") || User.equals("do addition of two numbers")) {
                System.out.println("You :- " + User);
                System.out.println("First Number:- ");
                int num1 = sc.nextInt();
                System.out.println("Second Number:- ");
                int num2 = sc.nextInt();
                System.out.println("Jony :-" + "Addition of two numbers : " + (num1 + num2));
            } else if (User.equals("Table")) {
                System.out.println("Enter the Number:-");
                int num = sc.nextInt();
                System.out.println("Jony:- ");
                for (int i = 1; i < 10; i++) {
                    System.out.println(num * i);
                }
            } else if (User.equals("Open Notpad") || User.equals("open notepad")) {
                Runtime rs = Runtime.getRuntime();
                try {
                    rs.exec("notepad");
                } catch (IOException e) {
                    System.out.println(e);
                }
            } else if (User.equals("Open crome") || User.equals("open crome")) {
                try {
                    Process p = Runtime.getRuntime().exec("\"C:/Program Files/Google/Chrome/Application/chrome.exe\"");
                    p.waitFor();
                    System.out.println("Google Chrome launched!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (User.equals("Open cmd") || User.equals("open cmd")) {
                try {
                    Runtime rt = Runtime.getRuntime();
                    rt.exec(new String[]{"cmd.exe", "/c", "start"});
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (User.equals("Exit") || User.equals("exit") || User.equals("Bye jony")) {
                System.exit(0);
            } else {
                System.out.println("I didn't understand !!");
            }

        }

    }

}
