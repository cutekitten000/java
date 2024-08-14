import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        TaskManager tm = new TaskManager();
        
        System.out.println("Task List:");
        System.out.println();
        
        for (int i = 0; i < 4; i++) {
            System.out.println();
            System.out.print("Title: ");
            String title = sc.nextLine();
            
            System.out.print("Description: ");
            String description = sc.nextLine();
            
            System.out.print("Status: ");
            String status = sc.nextLine();
            
            System.out.print("Do you want to add a priority? (y/n) ");
            char opt1 = sc.next().charAt(0);
            sc.nextLine();
            
            Task task = null;
            
            if (opt1 == 'y') {
                System.out.print("Priority level (1 for High, 2 for Medium, 3 for Low): ");
                int priorityLevel = sc.nextInt();
                sc.nextLine();
                task = new PriorityTask(title, description, status, priorityLevel);
            }
            
            if (task == null) { // No priority, check for recurrence
                System.out.print("Do you want to add a frequency? (y/n) ");
                char opt2 = sc.next().charAt(0);
                sc.nextLine();
                
                if (opt2 == 'y') {
                    System.out.print("Frequency: ");
                    String frequency = sc.nextLine();
                    task = new RecurringTask(title, description, status, frequency);
                } else {
                    // Default to a regular task
                    task = new Task(title, description, status);
                }
            }
            
            tm.addTask(task);
        }
        
        tm.listTasks();
    }
}
