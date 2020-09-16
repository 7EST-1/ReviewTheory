package part2;

import java.util.Scanner;


public class movieticket {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;
        String day;
        double price;
        
        //force user to enter m
        
        while(true){
            System.out.println("Enter day code: \"m\" -matince, \"t\"-tuesday, \"o\"-other: ");
            day=s.next();
            if(day.equals("o") || day.equals("m") || day.equals ("t") ) break;
            System.out.println("Error, must b o, t or m - ry again");
        }
        System.out.println("Thanks for now");
        if(day.equals("m")) price = 5; //matinee is 5$
        else if(day.equals("t")) price =4; //tues is 4$
        else{
            //must be o
            do{
                System.out.println("Enter age from 1 to 99 >");
                age=s.nextInt(); 
        }while(age < 2 || age > 99);
            price = age < 18? 8 : 10;
            
        }
                System.out.println("Price is:" + price);
     
    }
    
}
