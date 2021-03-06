import java.io.Console;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App{
  public static void main(String[] args){

    List<CD> cdList = new ArrayList<CD>();

    System.out.println("Welcome to Alex's CD store!");

    loop: while(true){
      System.out.println("Enter numeric options for: \n 1. Add \n 2. Display \n 3. Search by year \n 4. Search by price \n 5. Search by artist \n 6. Add coupon \n 7. Exit \n");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      switch (input) {
        case "1":
        CD cd = new CD();
        System.out.println("Enter the artist name: ");
        cd.mName = scanner.nextLine();

        System.out.println("Enter the album name: ");
        cd.mAlbum = scanner.nextLine();

        System.out.println("Enter the album year: ");
        cd.mYear = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the cd price: ");
        cd.mPrice = Integer.parseInt(scanner.nextLine());

        cdList.add(cd);

        System.out.println("---------------------------");
        System.out.println("The CD you just added: ");
        System.out.println(cd);
        System.out.println("---------------------------");

        continue;

        case "2":
          System.out.println("---------------------------");
          System.out.println("CD's currently in the store");
          for (CD i : cdList){
            System.out.println(i);
          }
          System.out.println("---------------------------");
          continue;

        case "3":
          System.out.println("---------------------------");

          System.out.println("Enter the year to search for: ");

          int year = Integer.parseInt(scanner.nextLine());
          for (CD i : cdList){
            if (year == i.getYear()){
              System.out.println(i);
              break;
            }
          }

          System.out.println("---------------------------");
          continue;

        case "4":
          System.out.println("---------------------------");
          System.out.println("Enter the minimum price to search for: ");

          int price = Integer.parseInt(scanner.nextLine());
          for (CD i : cdList){
            if (price > i.getPrice()){
              System.out.println(i);
              break;
            }
          }

          System.out.println("---------------------------");
          continue;

        case "5":
          System.out.println("---------------------------");
          System.out.println("Enter the name of the artist to search for: ");

          String name = scanner.nextLine();
          for (CD i : cdList){
            if (name == i.getName()){
              System.out.println(i);
              break;
            }
          }

          System.out.println("---------------------------");
          continue;

        case "6":
          System.out.println("---------------------------");
          System.out.println("Coupon options are: \n 1. 10% off\n 2. 20% off \n 3. 30% off");

          int choice = Integer.parseInt(scanner.nextLine());
          if (choice == 1){
            for (CD i:cdList){
              i.setPrice(i.getPrice() - (i.getPrice()* 0.1));
              System.out.println(i);
            }
          }else if(choice == 2){
            for (CD i:cdList){
              i.setPrice(i.getPrice() - (i.getPrice()* 0.2));
              System.out.println(i);
            }

          }else if (choice == 3){
            for (CD i:cdList){
              i.setPrice(i.getPrice() - (i.getPrice()* 0.3));
              System.out.println(i);
            }
          }
          continue;

        case "7":
          break loop;


        default:
          System.out.println("Invalid choice");
      }
    }
  }
}
