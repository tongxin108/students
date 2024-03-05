import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter student ID: ");
            String studentID = scanner.nextLine();

            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();

            System.out.print("Enter the total number of extra activities: ");
            int numExtraActivities = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            Student student = new Student(studentID, studentName, numExtraActivities);
            student.addExtraActivity(numExtraActivities);

           

            System.out.print("\nDo you want to add another student? (yes/no): ");
            String choice = scanner.nextLine();

            if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("\nStudent Details:");
                System.out.println(student);
                break;
            } 
            
        }

        System.out.println("Exiting program.");
        scanner.close();
    }
    
}