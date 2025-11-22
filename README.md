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

## Part 4 – Encapsulation and Attendance Recording

In this part, we:

- Ensured `Student` and `Course` fields are private and added getters.
- Introduced an `AttendanceRecord` class to link students and courses with an attendance status.
- Added validation for attendance status:
  - Accepts `"Present"` or `"Absent"` (case-insensitive).
  - Any other value is marked as `"Invalid"` and prints a warning.
- Used `ArrayList<AttendanceRecord>` in `Main` to store and display multiple attendance records.

## Part 5 – Inheritance Hierarchy (Person, Student, Teacher, Staff)

In this part, we:

- Introduced a `Person` base class with a `name` field and a `getDescription()` method.
- Made `Student`, `Teacher`, and `Staff` extend `Person`.
- Added auto-generated IDs:
  - `Student` → `studentId`
  - `Teacher` → `teacherId`
  - `Staff` → `staffId`
- Demonstrated inheritance and polymorphism in `Main` by:
  - Creating `Student`, `Teacher`, and `Staff` objects.
  - Storing them in a `Person[]` array and printing them using overridden `toString()` / `getDescription()`.
- Continued to use `Student` and `Course` IDs in the attendance system.

## Part 6 – Storable Interface and File Storage

In this part, we:

- Introduced a `Storable` interface with a `toStorageString()` method.
- Implemented `Storable` in:
  - `Student`
  - `Course`
  - `AttendanceRecord`
- Created a `FileStorageService` class that:
  - Accepts a list of `Storable` objects.
  - Writes each object as a line in a text file.
- Updated `Main` to:
  - Save students to `students.txt`
  - Save courses to `courses.txt`
  - Save attendance records to `Attendance_log.txt`

## Folder Structure

Attendance/
├─ src/
│ └─ com/
│ └─ school/
│ ├─ Main.java
│ ├─ Person.java
│ ├─ Student.java
│ ├─ Teacher.java
│ ├─ Staff.java
│ ├─ Course.java
│ ├─ AttendanceRecord.java
│ ├─ Storable.java
│ └─ FileStorageService.java
├─ students.txt
├─ courses.txt
├─ Attendance_log.txt
├─ README.md

## How to Compile
javac src/com/school/Main.java

## How to Run
javac src/com/school/*.java
java -cp src com.school.Main

## Expected output:
Welcome to the Attendance System!