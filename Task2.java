package javaProject;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String countries[] = new String[5];
        countries[0] = scanner.next();
        countries[1] = scanner.next();
        countries[2] = scanner.next();
        countries[3] = scanner.next();
        countries[4] = scanner.next();
        for (int i = 0; i < countries.length; i++) {
            switch (countries[i]) {
                case "Afghanistan":
                    System.out.println(countries[i]+" Kabul");
                    break;
                case " Norway":
                    System.out.println(countries[i]+" Oslo ");
                    break;
                case " Iran ":
                    System.out.println(countries[i]+" Tehran");
                    break;
                case "Somalia":
                    System.out.println(countries[i]+" Mogadishu");
                    break;
                case " Laos":
                    System.out.println(countries[i]+" Vientine");
                    break;
            }
        }

    }
}
