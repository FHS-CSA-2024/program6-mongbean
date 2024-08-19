//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6{
    public static double t3(double a){
        a = (double)((int)(a*1000+0.05))/1000;
        return a;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = scan.nextDouble();
        System.out.println("Radius: " + t3(r));
        System.out.println("Diameter: " + t3(r*2));
        System.out.println("Area: " + t3(r*r*Math.PI));
        System.out.println("Circumference: " + t3(r*2*Math.PI));
        
    }
}
//Paste console output below:
/*
Enter the radius: 
3.2
Radius: 3.2
Diameter: 6.4
Area: 32.169
Circumference: 20.106

*/
