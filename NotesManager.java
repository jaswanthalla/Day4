import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotesManager {

    private static final String FILENAME = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            printMenu();
            int choice = -1;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue; 
            }

            switch (choice) {
                case 1:
                    addNote(scanner);
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    isRunning = false;
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }

        scanner.close(); 
    }

    private static void printMenu() {
        System.out.println("\n--- Java Notes Manager ---");
        System.out.println("1. Add a new note");
        System.out.println("2. View all notes");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addNote(Scanner scanner) {
        System.out.print("Enter your note: ");
        String note = scanner.nextLine();

        try (
            FileWriter fw = new FileWriter(FILENAME, true); 
            BufferedWriter bw = new BufferedWriter(fw)
        ) {
            bw.write(note); 
            bw.newLine(); 
            System.out.println("Note added successfully!");
        } catch (IOException e) { 
            System.err.println("Error: Could not write to file.");
            e.printStackTrace(); 
        }
    }

    private static void viewNotes() {
        System.out.println("\n--- Your Notes ---");

        try (
            FileReader fr = new FileReader(FILENAME); 
            BufferedReader br = new BufferedReader(fr) 
        ) {
            String line;
            boolean notesFound = false;
            
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                notesFound = true;
            }

            if (!notesFound) {
                System.out.println("(No notes found.)");
            }
        } catch (FileNotFoundException e) {
            System.out.println("(No notes file found. Add a note to create it!)");
        } catch (IOException e) { 
            System.err.println("Error: Could not read from file.");
            e.printStackTrace(); 
        }
        System.out.println("--- End of Notes ---\n");
    }
}