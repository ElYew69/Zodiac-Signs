import java.util.Scanner;
public class Zodiac{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Objects obj = new Objects();
     
      String month="";
      int day;
      int year;
     
      System.out.println("To determine your zodiac sign, input the following: ");
     
      System.out.print("Input your birth month: ");
      month=obj.Month();
      
      System.out.print("Input your birth day: ");
      day=obj.Day();
      
      System.out.print("Input your birth year: ");
      year=sc.nextInt();
     
      System.out.println("The data you inputted is: ");
      System.out.println(month+ " " +day+ " " +year);
      
      obj.DetermineZodiac(year);
      
   }   
}
