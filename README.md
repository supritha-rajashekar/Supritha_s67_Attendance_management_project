# Attendance Management Project – Part 01

This is the initial setup for the Attendance Management project.  
It contains a simple Java program to verify the environment and folder structure.

## Part 2 – Student and Course Classes

In this part, we:

- Added `Student` and `Course` classes in `src/com/school/`.
- Used arrays of `Student` and `Course` objects in `Main.java`.
- Displayed the list of students and courses in the console.

## Part 3 – Constructors and Auto-generated IDs

In this part, we:

- Added static ID counters for `Student` and `Course`.
- Implemented constructors:
  - `Student(String name)` – automatically assigns a unique `studentId`.
  - `Course(String courseName)` – automatically assigns a unique `courseId` starting from 101.
- Updated `Main.java` to create multiple `Student` and `Course` objects and print their details to verify auto-ID generation.

## Folder Structure

Attendance/
├─ src/
│  └─ com/
│     └─ school/
│        ├─ Main.java
│        ├─ Student.java
│        └─ Course.java
├─ README.md

## How to Compile
javac src/com/school/Main.java

## How to Run
javac src/com/school/*.java
java -cp src com.school.Main

## Expected output:
Welcome to the Attendance System!