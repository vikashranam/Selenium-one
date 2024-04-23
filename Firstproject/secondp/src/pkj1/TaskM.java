package pkj1;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskM {
	 private static ArrayList<String> tasks = new ArrayList<>();
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("Task Manager");
	            System.out.println("1. Add a task");
	            System.out.println("2. View all tasks");
	            System.out.println("3. Mark a task as completed");
	            System.out.println("4. Remove a task");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character
	            
	            switch (choice) {
	                case 1:
	                    addTask();
	                    break;
	                case 2:
	                    viewTasks();
	                    break;
	                case 3:
	                    markTaskCompleted();
	                    break;
	                case 4:
	                    removeTask();
	                    break;
	                case 5:
	                    exit = true;
	                    System.out.println("Exiting Task Manager. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
	            }
	        }
	        
	        scanner.close();
	    }

	    private static void addTask() {
	        System.out.print("Enter task description: ");
	        String task = scanner.nextLine();
	        tasks.add(task);
	        System.out.println("Task added successfully.");
	    }

	    private static void viewTasks() {
	        System.out.println("Tasks:");
	        for (int i = 0; i < tasks.size(); i++) {
	            System.out.println((i + 1) + ". " + tasks.get(i));
	        }
	    }

	    private static void markTaskCompleted() {
	        viewTasks();
	        System.out.print("Enter the task number to mark as completed: ");
	        int taskNumber = scanner.nextInt();
	        scanner.nextLine(); // Consume newline character
	        
	        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
	            tasks.remove(taskNumber - 1);
	            System.out.println("Task marked as completed.");
	        } else {
	            System.out.println("Invalid task number.");
	        }
	    }

	    private static void removeTask() {
	        viewTasks();
	        System.out.print("Enter the task number to remove: ");
	        int taskNumber = scanner.nextInt();
	        scanner.nextLine(); // Consume newline character
	        
	        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
	            tasks.remove(taskNumber - 1);
	            System.out.println("Task removed successfully.");
	        } else {
	            System.out.println("Invalid task number.");
	        }
	    }
	}
