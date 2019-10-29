import java.util.Scanner;

public class Problem4{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);

    System.out.print("Enter the number of rows: ");
    int r = kb.nextInt();

    System.out.print("Enter the number of columns: ");
    int c = kb.nextInt();

    int[][] arr = new int[r][c];

    for(int x =0; x < r;x++){
      for(int y=0;y < c;y++){
        System.out.print("Enter position ("+x+","+y+"):");
        int num = kb.nextInt();

        arr[x][y] = num;
      }
    }

    for(int x =0; x < r;x++){
      for(int y=0;y < c;y++){
        System.out.print(arr[x][y]+" ");
      }
      System.out.println();
    }

  }
}
