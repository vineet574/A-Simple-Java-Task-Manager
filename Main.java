import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager tm = new TaskManager();
        int choice;

        while (true) {
            System.out.println("\n==== TaskMate ====");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task Complete");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    tm.addTask(title);
                    break;
                case 2:
                    tm.listTasks();
                    break;
                case 3:
                    System.out.print("Enter task number to mark complete: ");
                    int completeIdx = scanner.nextInt() - 1;
                    tm.markTaskComplete(completeIdx);
                    break;
                case 4:
                    System.out.print("Enter task number to delete: ");
                    int deleteIdx = scanner.nextInt() - 1;
                    tm.deleteTask(deleteIdx);
                    break;
                case 5:
                    System.out.println("Exiting TaskMate. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

