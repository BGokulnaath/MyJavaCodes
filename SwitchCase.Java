package switchcase;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
       int choice;
       System.out.print("Enter your choice : 1. Hai\t2. Hey\t3. Hello\t");
       Scanner scan = new Scanner(System.in);
       choice = scan.nextInt();
       switch(choice){
           case 1: System.out.println("You said Hai");
                   break;
           case 2: System.out.println("You said Hey");
                   break;
           case 3: System.out.println("You said Hello");
                   break;
           default: System.out.println("Invalid choice");
                   break;
       }
          
    }
    
}
