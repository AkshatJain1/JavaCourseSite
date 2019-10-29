import java.util.Scanner;

public class Problem1{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);

    System.out.print("Enter word: ");
    String w = kb.nextLine();
    int sum=0;
    for(int x=0;x<w.length();x++){
      sum+=(int)(w.charAt(x));
    }
    System.out.println();
    for(int x=0;x<w.length();x++){
      // System.out.print((int)(word[x]) + "("+word[x]+") +");
      if(x==w.length()-1){
          System.out.print((int)(w.charAt(x)) + "("+w.charAt(x)+") = "+sum+" (" + w + ") ");
      }
      else{
              System.out.print((int)(w.charAt(x)) + "("+w.charAt(x)+") +");
      }
    }



  }
}
