import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while(true){
            System.out.println("\n1.Add Student\n2.Show Students\n3.Delete Student\n4.Search Student\n5.Update Student\n6.Exit");
            int choice = sc.nextInt();


            
            if(choice == 1){
                System.out.println("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.println("Enter Student Age: ");
                int age = sc.nextInt();

                service.addStudent(new Student(id, name, age));
            }

            else if(choice == 2){
                service.showStudents();
            }

            else if(choice == 3){
                System.out.println("Enter the ID of Student you want to delete: ");
                int id = sc.nextInt();

                service.deleteStudent(id);
            }
            
            else if(choice == 4){
                System.out.println("Enter student ID for Search: ");
                int id = sc.nextInt();
                service.searchStudent(id);

            }
            
            else if(choice == 5){
                System.out.println("Enter student ID to upadte: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter new name: ");
                String name = sc.nextLine();

                System.out.println("Enter new Age: ");
                int age = sc.nextInt();

                service.updateStudent(id, name, age);
            }
            else{
                break;
            }
        }
    }
}
