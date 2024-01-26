import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menuInput:
        while (true) {
            System.out.println("Songify by Oscar Lilja");
            System.out.println("[A]dd data");
            System.out.println("[S]earch database");
            System.out.println("[Q]uit");

            switch (scanner.nextLine().toLowerCase()) {
                case "a": //Add data
                    addInput:
                    while (true) {
                        System.out.println("[S]ong, [A]rtist, [R]elease or [Q]uit?");
                        switch (scanner.nextLine().toLowerCase()) {
                            case "s":

                            case "a":
                                while (true) {
                                    System.out.print("Artist name: ");
                                    String name = scanner.nextLine();
                                    System.out.println(name);

                                    System.out.print("URL: ");
                                    String url = scanner.nextLine();

                                    System.out.println("[S]olo Artist or [G]roup?");
                                    switch (scanner.nextLine().toLowerCase()) {
                                        case "s":
                                            try {
                                                SoloArtist artist1 = new SoloArtist(name, url);
                                                break addInput;
                                            } catch (Exception e) {
                                                System.out.println(e.toString());
                                            }
                                    }
                                }
                            case "r":
                                break;
                            case "q":
                                break addInput;
                            default:
                                System.out.println("Incorrect, please try again...");
                                break;
                        }
                    }
                    break;
                case "s": //Search database
                    break;
                case "q": //Quit program
                    break menuInput;
                default:
                    System.out.println("Incorrect, please try again...");
                    break;
            }
        }
    }
}