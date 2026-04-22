import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO A1: Create a File object for "grades.txt"
        // TODO A2: Use try–catch to handle FileNotFoundException

        try {
            // TODO B1: Create a Scanner to read the file
            // TODO B2: Print "Student Grades:"
            // TODO B3: Read and print each line from the file

            File myFile = new File("grades.txt");
            Scanner input = new Scanner(myFile);

            System.out.println("Student Grades: ");
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
            input.close();

        } catch (Exception e) {
            // TODO C1: Print "File not found!" if grades.txt is missing

            System.out.println("File not found!");
        }
    }
}


