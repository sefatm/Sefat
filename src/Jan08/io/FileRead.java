
package Jan08.io;

import java.io.File;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        
        try {
            File file = new File("C:/Users/user/OneDrive/Desktop/Io.txt");
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNext()){
            String id = scanner.next();
            String name = scanner.next();
                System.out.println("Id: " + id + "  Name: " + name);
            }
            scanner.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
