import java.util.*;
public class NumberGuessingGame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch='n';
        do{
            System.out.println("\n***Welcome to Number Guessing Game***");
            Random rand=new Random();
            int rn=rand.nextInt(100);
            int trying=0;
            while(true){
                System.out.print("Guess a Number Between 1-100: ");
                int n=sc.nextInt();
                if(n<1 || n>100)
                    System.out.println("Invalid Range!! Try Again...");
                else if(n==rn)
                    break;
                else if(n<rn)
                    System.out.println("Guess more!!");
                else if(n>rn)
                    System.out.println("Guess less!!");
                trying++;
            }
            if(trying<=3)
                System.out.println("Outstanding!!");
            else if(trying<=5)
                System.out.println("Excelent!!");
            else if(trying<=7)
                System.out.println("Very good!!");
            else if(trying<=10)
                System.out.println("Good!!");
            else
                System.out.println("Poor!!");            
            System.out.println();
            System.out.println("Congrats You guessed Nuber: "+rn+"\nYou Try: "+(trying+1)+" Times\n\n");
            System.out.print("Would You want to Continue(y/n): ");
            ch=sc.next().charAt(0);
            
        }while(ch=='y'||ch=='Y');
        System.out.print("Thanks for Playing Guessing Game!!\nThank You:)");
        sc.close();

    }
}