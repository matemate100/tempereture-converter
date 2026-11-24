import java.util.Scanner;
public class menu{
    private Scanner mate =new  Scanner(System.in);
    public int GetChoice(){
        System.out.println("1.Celsius to Fahrenheiet \n2.Fahrenheiet to Celsius  \n3.Kelvin to Celsius ");
        System.out.print("Enter your choice: ");
        int choice = mate.nextInt();
        return choice;
    }
    public double GetTemperature(){
        System.out.print("Enter your temperature : ");
        double value = mate.nextDouble();
        return value;
    }
}