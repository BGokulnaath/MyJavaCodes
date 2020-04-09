/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
package Gradecalculator;

/**
 *
 * @author Welcome
 */
public class GradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        short x=scan.nextShort();
        short[] marks=new short[5];
        short i,j,sum=0;
        for(i=0;i<x;i++)
        {
          marks[i]=scan.nextShort(); 
        }
        for(j=0;j<x;j++)
        {
            sum+=marks[j];
        }
        if(sum>450)
            System.out.println("Grade=A");
        else if((sum>400)&&(sum<=450))
            System.out.println("Grade=B");
        else if((sum>350)&&(sum<=400))
            System.out.println("Grade=C");
        else if ((sum>300)&&(sum<=350))
            System.out.println("Grade=D");
        else 
            System.out.println("Fail...Don't not worry...All the best for your next attempt");
    }
    
}
