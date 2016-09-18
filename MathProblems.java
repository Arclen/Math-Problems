/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.problems;
import java.util.Scanner;
/**
 *
 * @author Jacob Liou
 */
public class MathProblems {

    public static boolean isPrime(int num)
        {
        for(int i=2; i<=num/2; i++)
        {
            if(num%i == 0)
            {
            return false;
            }
        }
        return true;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println(isPrime(in.nextInt()));
    }
    
    
}
