# Java Notes Manager

A simple **command-line application** written in Java that allows users to **add** and **view notes** stored in a local text file.  
Perfect for beginners learning file handling, exception management, and user input in Java.

---

## Features

- **Add Notes** — Write and save new notes to a file (`notes.txt`)
- **View Notes** — Display all existing notes from the file
- **Persistent Storage** — Notes are stored permanently in a local text file
- **Error Handling** — Graceful handling of invalid inputs and missing files
- **Menu Interface** — Simple numbered menu for easy navigation

---

## Technologies Used

- Java SE (Standard Edition)
- File I/O (`FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`)
- Exception Handling (`try-with-resources`)
- `Scanner` for user input

---

## Project Structure

NotesManager/
├── NotesManager.java # Main source file
├── notes.txt # Created automatically when you add your first note
└── README.md # Project documentation

yaml
Copy code

---

## ⚙️ How to Run

### 1. Clone or Download
Clone the repository or copy the `NotesManager.java` file into your local environment.

```bash
git clone https://github.com/yourusername/NotesManager.git
cd NotesManager
2. Compile the Program
Use the javac compiler to compile the Java file.

bash
Copy code
javac NotesManager.java
3. Run the Program
Run the compiled Java class.

bash
Copy code
java NotesManager
📖 Usage
Once the program starts, you’ll see a simple menu:

sql
Copy code
--- Java Notes Manager ---
1. Add a new note
2. View all notes
3. Exit
Enter your choice:
Example Interaction:
mathematica
Copy code
Enter your choice: 1
Enter your note: Remember to review Java I/O

Note added successfully!

Enter your choice: 2
--- Your Notes ---
Remember to review Java I/O
--- End of Notes ---
