import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class UserFileManager {

    public static void saveUser(User user) {

        try (
            BufferedWriter bw =
                new BufferedWriter(
                    new FileWriter("users.txt", true))
        ) {

            bw.write("Username: "
                    + user.getUsername());

            bw.newLine();

            bw.write("Email: "
                    + user.getEmail());

            bw.newLine();

            bw.write("Password Hash: "
                    + user.getPasswordHash());

            bw.newLine();

            bw.write("----------------------");

            bw.newLine();

            System.out.println(
                    "User saved successfully.");

        }
        catch (IOException e) {

            System.out.println(
                    "File Error: "
                    + e.getMessage());
        }
    }
}
