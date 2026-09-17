# 🎓 Student Management System (SMS)

A console-based **Student Management System** built in pure Java, without any external frameworks or libraries. This project allows users to manage student records — including adding, viewing, updating, deleting, and searching — with data persisted locally using file handling. 📁

---

## ✨ Features

- ➕ **Add Student** — Create a new student record
- 📋 **View Students** — Display all stored student records
- ✏️ **Update Student** — Modify existing student details
- 🗑️ **Delete Student** — Remove a student record
- 🔍 **Search Student** — Look up a specific student
- 💾 **Save to File** — Persist student data to `students.txt`
- 🔄 **Load Data on Startup** — Automatically retrieves previously saved records, so data is not lost when the program is closed and reopened

---

## 🛠️ Technologies Used

| Category | Details |
|---|---|
| 💻 Language | Java (Core Java only — no external libraries) |
| 🧩 IDE | IntelliJ IDEA |
| 🗄️ Data Storage | Plain text file (`students.txt`) |
| ⚙️ Build Tool | None (compiled and run directly via IntelliJ / `javac`) |

---

## 📚 Java Concepts Demonstrated

This project was built to strengthen and demonstrate core Java fundamentals:

- 🧱 Classes and Objects
- 🔒 Encapsulation
- 🧮 Methods
- 📦 Collections
- 🔁 CRUD Operations (Create, Read, Update, Delete)
- 📄 File Handling / File I/O
- ⚠️ Exception Handling
- 🔎 Searching Algorithms
- 💽 Data Persistence

---

## 📂 Project Structure

```
SMS/
├── src/
│   ├── Main.java
│   └── student/
│       ├── Execution.java
│       ├── SMS.java
│       ├── Student.java
│       └── students.txt
└── .gitignore
```

- **`Main.java`** — Entry point of the application
- **`Execution.java`** — Handles the console menu and user interaction flow
- **`SMS.java`** — Contains the core logic for managing student records (add, update, delete, search, save, load)
- **`Student.java`** — Represents the Student model/entity with encapsulated fields
- **`students.txt`** — Text file used to store student data persistently

---

## ⚙️ How the Application Works

1. 🚀 On startup, the application loads any existing student records from `students.txt` into memory.
2. 📺 The user is presented with a console-based menu to choose an operation (Add, View, Update, Delete, Search, or Exit).
3. 🎯 Based on the selected option, the corresponding method in `SMS.java` is executed.
4. 💾 Any changes made (add, update, delete) are written back to `students.txt` to keep the file in sync with the in-memory data.
5. ✅ When the program exits, all data remains saved in the file and is available the next time the application runs.

---

## ▶️ How to Run the Project in IntelliJ IDEA

1. Clone or download this repository.
2. Open **IntelliJ IDEA** and select **Open**, then choose the `SMS` project folder.
3. Ensure the `src` folder is marked as the **Sources Root** (right-click `src` → *Mark Directory as* → *Sources Root*).
4. Locate `Main.java` inside the `src` folder.
5. Right-click `Main.java` and select **Run 'Main.main()'**.
6. The console menu will appear, allowing you to interact with the Student Management System.

> 💡 **Note:** No additional setup, dependencies, or build tools are required — this is a plain Java project.

---

## 💽 File-Based Data Persistence

Since this project does not use a database, all student data is stored in a plain text file, `students.txt`, located in the `student` package.

- **💾 Saving:** Whenever a student record is added, updated, or deleted, the updated list of students is written to `students.txt`.
- **📥 Loading:** When the application starts, it reads `students.txt` line by line and reconstructs the list of `Student` objects in memory.
- **📝 Format:** Each line in the file typically represents one student record, with fields separated by a delimiter (e.g., comma), which is parsed back into a `Student` object using Java's file I/O and string handling.

This approach demonstrates fundamental file handling and data persistence concepts without relying on external storage solutions.

---

## 🖥️ Example Console Output

```
Data loaded Successfully

----------Student Management System----------
           ------Features------
1. Add Student
2. View Students
3. Search Student
4. Delete Student
5. Update Student
6. Save Progress
7. Exit
NOTE : Exiting without save progress doesnot save the changes did till now
--------------------------------------------------------------------------
Enter your choice : 3
Enter the roll number of the student to be searched : 
1
--------------------------------------------------------------------------
Roll Number : 1
Name : Vivek
Age : 19
Gender : Male
Branch : CSE
Current Semester : 5
Email : vivek@java.com
Phone Number : 9123456781
--------------------------------------------------------------------------
----------Student Management System----------
           ------Features------
1. Add Student
2. View Students
3. Search Student
4. Delete Student
5. Update Student
6. Save Progress
7. Exit
NOTE : Exiting without save progress doesnot save the changes did till now
--------------------------------------------------------------------------
Enter your choice : 7
Thanks for your valuable time
Hope you enjoyed SMS!!!
```

---

## 🚧 Future Improvements

- ✅ Add input validation to handle invalid or malformed user input more robustly
- 🗄️ Replace text file storage with a database (e.g., MySQL) for more scalable persistence
- 🖼️ Introduce a graphical user interface (GUI) using JavaFX or Swing
- 🔃 Add sorting options (by name, ID, or grade)
- 🧪 Implement unit tests for core CRUD operations
- ⚠️ Improve exception handling with custom exception classes

---

## 👨‍💻 Author

**Vivek Boyina**<br>
Computer Science Engineering Undergraduate
Built as a project to strengthen core Java concepts including OOP, file handling, and CRUD operations.

⭐ If you found this project useful, consider giving it a star!
