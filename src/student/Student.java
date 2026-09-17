package student;

public class Student {
    private int roll_no = -1;
    private String name = "NA";
    private int age = -1;
    private String gender = "NA";
    private String branch = "NA";
    private int curr_sem = -1;
    private String email = "NA@java.com";
    private String phno = "1234567890";
    Student(int roll_no,String name,int age,String gender,String branch,int curr_sem,String email,String phno)
    {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.branch = branch;
        this.curr_sem = curr_sem;
        this.email = email;
        this.phno = phno;
    }
    void viewStudent()
    {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Roll Number : " + this.roll_no);
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Gender : " + this.gender);
        System.out.println("Branch : " + this.branch);
        System.out.println("Current Semester : " + this.curr_sem);
        System.out.println("Email : " + this.email);
        System.out.println("Phone Number : " + this.phno);
        System.out.println("--------------------------------------------------------------------------");
    }
    int getRollNo(){ return this.roll_no; }
    String getName(){ return this.name; }
    int getAge(){ return this.age; }
    String getGender(){ return this.gender; }
    String getBranch(){ return this.branch; }
    int getCurrentSem(){ return this.curr_sem; }
    String getEmail(){ return this.email; }
    String getPhoneNumber(){ return this.phno; }
    void setRollNo(int roll_no){ this.roll_no = roll_no; }
    void setName(String name){ this.name = name; }
    void setAge(int age){ this.age = age; }
    void setGender(String gender){ this.gender = gender; }
    void setBranch(String branch){ this.branch = branch; }
    void setCurrentSem(int curr_sem){ this.curr_sem = curr_sem; }
    void setEmail(String email){ this.email = email; }
    void setPhoneNumber(String phno){ this.phno = phno; }
}