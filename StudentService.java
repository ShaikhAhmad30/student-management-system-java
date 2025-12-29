import java.util.ArrayList;

public class StudentService {
    

    ArrayList <Student> students = new ArrayList<>();

    public void addStudent(Student s){
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void showStudents(){
        for(Student s: students){
            System.out.println(s);
        }
    }

    public void deleteStudent(int id){
        boolean found = false;

        for(int i = 0; i < students.size();i++){
            if(students.get(i).getId() == id){
                students.remove(i);
                found = true;
                System.out.println("Student deleted successfully!");
                break;
            }
        }
        if(!found){
            System.out.println("Student not found!");
        }
    }

    public void searchStudent(int id){
        boolean found = false;

        for(Student s : students){
            if(s.getId() == id){
                System.out.println("Student Found: "+ s);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Student not found!");
        }
    }


    public void updateStudent(int id, String newName, int newAge){
        boolean found = false;

        for(Student s : students){
            if(s.getId() == id){
                s.setName(newName);
                s.setAge(newAge);
                System.out.println("Student uodated successfully!");
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("student not found!");
        }
    }
}
