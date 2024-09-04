import java.util.Scanner;
public class Objects{
   
   public static String Month(){ 
      String month=""; 
      
      Scanner sc = new Scanner(System.in); 
      boolean again=true;
      int monthNum;
      
      do{ 
         if(!sc.hasNextInt()){    
            while(!sc.hasNextInt()) {
               System.out.println("Invalid Input.");               
               System.out.print("Please enter an integer from 1-12: ");
               sc.nextLine();
            }
         }
         monthNum=sc.nextInt();
      
              
         if(monthNum==1){
            month= "January";
         }
         else if(monthNum==2){
            month= "February";
         }
         else if(monthNum==3){
            month= "March";
         }
         else if(monthNum==4){
            month= "April";
         }
         else if(monthNum==5){
            month= "May";
         }
         else if(monthNum==6){
            month= "June";
         }
         else if(monthNum==7){
            month= "July";
         }
         else if(monthNum==8){
            month= "August";
         }
         else if(monthNum==9){
            month= "September";
         }
         else if(monthNum==10){
            month= "October";
         }
         else if(monthNum==11){
            month= "November";
         }
         else if(monthNum==12){
            month= "December";
         }      
         return month;
      }while(again==true); 
   }
   
   public static int Day(){
      Scanner sc = new Scanner(System.in);
      int day;
      boolean again=true;
      
         do{
         day=sc.nextInt();
            if(day>=1 && day<=31){
               again=false;
            }
            else{
               System.out.print("Please input again: ");
               again=true;
            }
         }while(again==true);
      return day;
   }
   
   public static void DetermineZodiac(int year){
      Meaning means = new Meaning();
      String animal="";
      switch(year%2){
         case 0:
            animal="Monkey";
            means.monkey();
         break;
         
         case 1:
            animal="Rooster";
            means.rooster();
         break;
         
         case 2:
            animal="Dog";
            means.dog();
         break;
         
         case 3:
            animal="Pig";
            means.pig();
         break;
         
         case 4:
            animal="Rat";
            means.rat();
         break;
         
         case 5:
            animal="Ox";
            means.ox();
         break;
         
         case 6:
            animal="Tiger";
            means.tiger();
         break;
         
         case 7:
            animal="Rabbit";
            means.rabbit();
         break;
         
         case 8:
            animal="Dragon";
            means.dragon();
         break;
         
         case 9:
            animal="Snake";
            means.snake();
         break;
         
         case 10:
            animal="Horse";
            means.horse();
         break;
         
         case 11:
            animal="Goat";
            means.goat();
         break;
      }
   }  
}