package student;

import java.io.*;
import java.util.*;
import java.nio.*;

public class Execution {
    Scanner sc = new Scanner(System.in);
    public void display()
    {
        System.out.println("----------Student Management System----------");
        System.out.println("           ------Features------");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Update Student");
        System.out.println("6. Save Progress");
        System.out.println("7. Exit");
        System.out.println("NOTE : Exiting without save progress doesnot save the changes did till now");
        System.out.println("--------------------------------------------------------------------------");
    }
    public int nextOpt()
    {
        display();
        System.out.print("Enter your choice : ");
        int opt = sc.nextInt();
        return opt;
    }
    public void display2()
    {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-----Select Entity-----");
        System.out.println("1. Name");
        System.out.println("2. Age");
        System.out.println("3. Gender");
        System.out.println("4. Branch");
        System.out.println("5. Current Semester");
        System.out.println("6. Email");
        System.out.println("7. Phone Number");
        System.out.println("8. Exit");
        System.out.println("--------------------------------------------------------------------------");
    }
    public int nextOpt2()
    {
        display2();
        System.out.print("Enter your choice : ");
        int opt = sc.nextInt();
        return opt;
    }
    public void addStudent(ArrayList<Student> students)
    {
        int age = -1;
        int csem = -1;
        String name = "NA";
        String gdr = "NA";
        String brh = "NA";
        String mail = "NA";
        String ph = "NA";
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.println();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        System.out.println();
        System.out.print("Enter Mail : ");
        mail = sc.nextLine();
        System.out.println();
        System.out.print("Enter Phone Number : ");
        ph = sc.nextLine();
        System.out.println();
        System.out.print("Enter Current Semester : ");
        csem = sc.nextInt();
        System.out.println();
        System.out.print("Enter Gender : ");
        gdr = sc.nextLine();
        System.out.println();
        System.out.print("Enter Branch : ");
        brh = sc.nextLine();
        System.out.println();
        int rno = 0;
        for(int i = 0; i < students.size(); i++) rno = Math.max(rno,students.get(i).getRollNo());
        Student s = new Student(rno + 1,name,age,gdr,brh,csem,mail,ph);
        students.add(s);
        System.out.println("New Student Added Successfullyyyy......");
    }
    public void viewStudents(ArrayList<Student> students)
    {
        System.out.println("Total Number of Students : " + students.size());
        for(Student st : students) st.viewStudent();
    }
    public void searchStudent(ArrayList<Student> students)
    {
        int n = students.size();
        if(n == 0)
        {
            System.out.println("No Students at Present");
            return;
        }
        int rno;
        System.out.print("Enter the roll number of the student to be searched : ");
        System.out.println();
        rno = sc.nextInt();
        while(rno == 0 || rno > n)
        {
            System.out.println("Enter valid roll number : ");
            rno = sc.nextInt();
        }
        int sea = -1;
        for(int i = 0; i < n; i++)
        {
            if(students.get(i).getRollNo() == rno)
            {
                sea = i;
                break;
            }
        }
        if(sea == -1) System.out.println("Student with roll number " + rno + " is not found!!!");
        else students.get(sea).viewStudent();
    }
    public void deleteStudent(ArrayList<Student> students)
    {
        int n = students.size();
        if(n == 0)
        {
            System.out.println("No Students to delete at Present");
            return;
        }
        System.out.print("Enter the roll number of student to be deleted : ");
        int rno = sc.nextInt();
        int rem = -1;
        for(int i = 0; i < n; i++)
        {
            if(students.get(i).getRollNo() == rno)
            {
                rem = i;
                break;
            }
        }
        if(rem == -1)
        {
            System.out.println("No student with this roll number is present...");
            return;
        }
        students.remove(rem);
        System.out.println("Student deleted successfully............");
    }
    public void updateStudent(ArrayList<Student> students)
    {
        int n = students.size();
        if(n == 0)
        {
            System.out.println("No Students to update at Present");
            return;
        }
        viewStudents(students);
        int rno;
        System.out.print("Enter the roll number of student to be updated : ");
        rno = sc.nextInt();
        int sel = -1;
        for(int i = 0; i < n; i++)
        {
            if(students.get(i).getRollNo() == rno)
            {
                sel = i;
                break;
            }
        }
        if(sel == -1)
        {
            System.out.println("Wrong roll number entered...");
            return;
        }
        int opt = nextOpt2();
        boolean update = true;
        while(update)
        {
            switch(opt)
            {
                case 1:
                    System.out.print("Enter the new name : ");
                    String name = sc.next();
                    sc.nextLine();
                    students.get(sel).setName(name);
                    opt = nextOpt2();
                    break;
                case 2:
                    System.out.print("Enter the new age : ");
                    int age = sc.nextInt();
                    students.get(sel).setAge(age);
                    opt = nextOpt2();
                    break;
                case 3:
                    System.out.print("Enter the correct gender : ");
                    String gdr = sc.next();
                    sc.nextLine();
                    students.get(sel).setGender(gdr);
                    opt = nextOpt2();
                    break;
                case 4:
                    System.out.print("Enter the new branch : ");
                    String brh = sc.next();
                    sc.nextLine();
                    students.get(sel).setBranch(brh);
                    opt = nextOpt2();
                    break;
                case 5:
                    System.out.print("Enter the Current Semester : ");
                    int csem = sc.nextInt();
                    students.get(sel).setCurrentSem(csem);
                    opt = nextOpt2();
                    break;
                case 6:
                    System.out.print("Enter the new email : ");
                    String mail = sc.next();
                    sc.nextLine();
                    students.get(sel).setEmail(mail);
                    opt = nextOpt2();
                    break;
                case 7:
                    System.out.print("Enter the new phone number : ");
                    String ph = sc.next();
                    sc.nextLine();
                    students.get(sel).setPhoneNumber(ph);
                    opt = nextOpt2();
                    break;
                case 8:
                    System.out.println("Changes are noted don't forget to select save progress after all the operations are done");
                    update = false;
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    opt = nextOpt2();
            }
        }
    }
    public void saveProgress(ArrayList<Student> students)
    {
        int n = students.size();
        ArrayList<String> strs = new ArrayList<>(n);
        for(int i = 0; i < n; i++)
        {
            String s = "";
            s+=students.get(i).getRollNo();
            s+=",";
            s+=students.get(i).getName();
            s+=",";
            s+=students.get(i).getAge();
            s+=",";
            s+=students.get(i).getGender();
            s+=",";
            s+=students.get(i).getBranch();
            s+=",";
            s+=students.get(i).getCurrentSem();
            s+=",";
            s+=students.get(i).getEmail();
            s+=",";
            s+=students.get(i).getPhoneNumber();
            strs.add(s);
        }
        File file = new File("D:/B.Tech/fullstack/springboot/projects/SMS/src/student/students.txt");
        try (FileWriter writer = new FileWriter(file, false)) {
            for(String str : strs) writer.write(str + "\n");
        }
        catch(IOException e)
        {
            System.out.println("Error : File not found");
        }
    }
}