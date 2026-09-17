package student;

import java.io.*;
import java.util.*;

public class SMS {
    Scanner sc = new Scanner(System.in);
    public void start()
    {
        System.out.println();
        ArrayList<Student> students = new ArrayList<>();
        try {
            File file = new File("D:/B.Tech/fullstack/springboot/projects/SMS/src/student/students.txt");
            Scanner scc = new Scanner(file);
            int age = -1;
            int csem = -1;
            int rno = -1;
            String name = "NA";
            String gdr = "NA";
            String brh = "NA";
            String mail = "NA";
            String ph = "NA";
            String line;
            while(scc.hasNextLine())
            {
                line = scc.nextLine();
                String vals[] = line.split(",");
                rno = Integer.parseInt(vals[0]);
                name = vals[1];
                age = Integer.parseInt(vals[2]);
                gdr = vals[3];
                brh = vals[4];
                csem = Integer.parseInt(vals[5]);
                mail = vals[6];
                ph = vals[7];
                Student s = new Student(rno,name,age,gdr,brh,csem,mail,ph);
                students.add(s);
            }
            if(file.exists()) System.out.println("Data loaded Successfully");
            else System.out.println("Error loading data");
        }
        catch(IOException e)
        {
            System.out.println("IO Exception occured");
        }
        System.out.println();
        Execution ex = new Execution();
        int opt = ex.nextOpt();
        boolean execute = true;
        while(execute)
        {
            switch(opt)
            {
                case 1:
                    ex.addStudent(students);
                    opt = ex.nextOpt();
                    break;
                case 2:
                    ex.viewStudents(students);
                    opt = ex.nextOpt();
                    break;
                case 3:
                    ex.searchStudent(students);
                    opt = ex.nextOpt();
                    break;
                case 4:
                    ex.deleteStudent(students);
                    opt = ex.nextOpt();
                    break;
                case 5:
                    ex.updateStudent(students);
                    opt = ex.nextOpt();
                    break;
                case 6:
                    ex.saveProgress(students);
                    opt = ex.nextOpt();
                    break;
                case 7: System.out.println("Thanks for your valuable time");
                    System.out.println("Hope you enjoyed SMS!!!");
                    execute = false;
                    break;
                default: System.out.println("Enter a valid option");
                    opt = ex.nextOpt();
            }
        }
    }
}