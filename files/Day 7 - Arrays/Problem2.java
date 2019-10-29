import java.util.Scanner;

public class Problem2{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);

    System.out.print("First Word?:");
    String first = kb.next();

    System.out.print("Second Word?:");
    String sec = kb.next();

    String inCommon="";

    char[] f = first.toCharArray();
    char[] s = sec.toCharArray();

    int num_common=0;
    for(int x=0; x<f.length;x++){
      for(int y=0; y<s.length;y++){
        if(f[x]==s[y] && inCommon.indexOf(f[x]) < 0){
          inCommon+= f[x]+",";
          num_common++;
        }
      }
    }

    System.out.println("There are "+num_common+" letter(s) in common: " + inCommon);




  }
}
