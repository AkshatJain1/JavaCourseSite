/**
 * @(#)UserPreference.java
 *
 *
 * @author 
 * @version 1.00 2018/7/1
 */
import java.util.Scanner;

public class UserPreference {
        
   
    
   
    public static void main(String[] args) {
        
      /* System.out.println("Enter your name");
       Scanner scanString = new Scanner(System.in);
       String userName = scanString.nextLine();*/
       
       //System.out.println("Your name is " + userName);
        System.out.println("Enter your age");      
        Scanner scanInt = new Scanner(System.in);
       int age  = scanInt.nextInt();
       System.out.println("age: " + age);
       
       System.out.println("");
       
       System.out.println("Enter the artist");
       Scanner scanString = new Scanner(System.in);
       String artist = scanString.nextLine();
       System.out.println("Artist: " + artist);
       System.out.println("");
       
       System.out.println("Enter the album");
       Scanner scanAlbum = new Scanner(System.in);
       String album = scanAlbum.nextLine();
       System.out.println("Album: " + album);
       System.out.println("");
       
       System.out.println("Enter the album cost");
       Scanner scanfloat = new Scanner(System.in);
       float cost = scanfloat.nextFloat();
       System.out.println("Cost: " + cost);
       System.out.println("");
       
       System.out.println("is it your favorite album. Enter S for favorite or any other character for not favorite");
       Scanner scanchar = new Scanner(System.in);
       char  favorite = scanchar.next().charAt(0);
       
       if (favorite == 'S' || favorite == 's')
       {
       	System.out.println(album + " is your favorite album?");
       }else
       {
       	System.out.println(album + " is not your favorite album");
       }
       /*System.out.println("Enter download preference. Enter 1 for phone. Any number other than 1 will be dpwnloaded locally");
       Scanner scanpref = new Scanner(System.in);
       int favorite = scanbool.nextInt();*/
       
       
       //System.out.println("Favorite album: " + favorite);
       //System.out.println("");
       
       
       
       
       
       
       
        
    }
}
