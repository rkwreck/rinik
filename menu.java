import java.util.Scanner; //java library for user input

public class Main {   
  static public void main(String[] args)  { 
    menu(); 
  } 

  public static void menu() {
    int selection;  //user selection variable of type Inteteger

    //Using a Class: AP CSA Unit 2 (Scanner class from Java)
    Scanner scan = new Scanner(System.in);  
 
    //The block of outputs below is used to present a menu to the user. 
    System.out.println("-------------------------\n");
    System.out.println("Choose from these choices");
    System.out.println("-------------------------\n");
    System.out.println("1 - Hello");
    System.out.println("2 - Printy");
    System.out.println("3 - Loopy");
    System.out.println("4 - Classy Print");
    System.out.println("5 - Classy Poem");
    System.out.println("6 - Binary");
    System.out.println("7 - Termy");
    System.out.println("0 - Quit");

    //Using Scanner Class to get integer as input
    selection = scan.nextInt();  //Use nextInt() method to get an integer value

    //Control Statements: AP CSA Unit 3
    //evaluate input and execute the case that matches the selection.
    switch (selection) {
      case 0:
        return;
        
      case 1:
        //Prints message to console/terminal
        System.out.println("Hello, World of Monkeys!");
        break;
        
      case 2:
        //Run Printy main method with null parameter
        Printy.main(null);
        break;
        
      case 3:
        new MonkeyLoop().printPoem();
        break;
        
      case 4:
        new MonkeyList().print();
        break;
        
      case 5:
        //Create object to run methods from Classy.java
        MonkeyList ml = new MonkeyList();
        ml.print();
        ml.printPoem();
        break;
        
      case 6:
        //Using a Class: AP CSA Unit 2
        //Run Biny main method with null parameter
        Biny.main(null);
        break;

      case 7:
        //Run Termy main method with null parameter
        Termy.main(null);
        break;
                
      default:
        //Prints error message from console
        System.out.println("Unexpected choice, try again.");
  }
    //Recursion: AP CSA requirement 10 
    menu();
  }

}