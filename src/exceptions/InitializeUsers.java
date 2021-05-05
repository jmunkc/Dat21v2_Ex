package exceptions;

import files_exceptions.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InitializeUsers {

    public ArrayList<User> loadUsers() throws FileNotFoundException {
        Scanner fileScan = new Scanner(new File("resources/users.csv"));

        ArrayList<User> users = new ArrayList<>();

        while (fileScan.hasNext()) {

            String currentLine = fileScan.nextLine();

            String[] userArray = currentLine.split(";");

            String cpr = userArray[0];
            String password = userArray[1];

            User tempUser = new User(cpr, password);

            users.add(tempUser);
        }

        return users;
    }
}
