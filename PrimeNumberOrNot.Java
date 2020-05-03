
package collections;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String yesOrNo = new String();
    do{
        System.out.print("Enter a number : ");
    int number = scan.nextInt();
    int i;
    
    boolean isPrime = true;
    for(i=2;i<number;i++){
        if(number%i==0){
            isPrime = false;
        }
    }        
    if(isPrime){
        System.out.println(number+" is a prime number");
    }
    else{
        System.out.println(number+ " is not a prime number");
    }
    System.out.println("Do you want to check for another number, Answer with yes or no ");
    yesOrNo = scan.next();
}while("yes".equals(yesOrNo));
}
}
