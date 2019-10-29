package com.company;
import java.util.Scanner;
public class BattleshipGame {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int shipRow;
        int shipCol;
        int userRow;
        int userCol;
        int max = 4;
        int min = 1;
        int x=0;
        int h=0;
        int m=0;
        int z;
        int ctr=0;
        boolean found=false;
        boolean runMore=false;
        boolean valid;
        String name;
        int range = max - min + 1;
        int[] shipRowLocations=new int[]{-1,-1,-1,-1};
        int[] shipColLocations=new int[]{-1,-1,-1,-1};
        char[][] ocean = {{'x', 'x', 'x', 'x', 'x',}, {'x', 'x', 'x', 'x', 'x',}, {'x', 'x', 'x', 'x', 'x',}, {'x', 'x', 'x', 'x', 'x',}, {'x', 'x', 'x', 'x', 'x',}};
        System.out.print("Welcome to Battleship! What is your name? ");
        name=key.nextLine();
        System.out.print("Okay then, " + name + "! Press enter when you are ready to begin.");
        key.nextLine();
        do{
            shipRow = (int) (Math.random() * range) + min;
            shipCol = (int) (Math.random() * range) + min;
            for(int i =0;i<4;i++) {
                if(shipRow==shipRowLocations[i]&&shipCol==shipColLocations[i]){
                    runMore=true;
                    break;
                }
            }
            if(runMore==false){
                shipRowLocations[x]=shipRow;
                shipColLocations[x]=shipCol;
                x++;
            }
        }while(x<4);
        do{
            found=false;
            for(int r=0;r<5;r++) {
                for(int c=0;c<5;c++) {
                    System.out.print(ocean[r][c] + "\t");
                }
                System.out.print("\n");
            }
            do {
                System.out.print("Enter the row you want to target: ");
                userRow=key.nextInt();
                key.nextLine();
                System.out.print("Enter the column you want to target: ");
                userCol=key.nextInt();
                key.nextLine();
                if(userRow>5||userRow<0||userCol>5||userRow<0){
                    valid=false;
                }
                else
                    valid=true;
            }while(valid==false);
            for(z=0;z<4;z++) {
                if(userRow==shipRowLocations[z] && userCol==shipColLocations[z]) {
                    ocean[userRow][userCol]='H';
                    h++;
                    ctr++;
                    found=true;
                }
            }
            if(found==false){
                ocean[userRow][userCol]='M';
                m++;
                ctr++;
            }
            System.out.println("Misses: " +m + " and Hits: " + h);
        }while(h<4&&(m<24));
        for(int r=0;r<5;r++) {
            for(int c=0;c<5;c++) {
                System.out.print(ocean[r][c] + "\t");
            }
            System.out.print("\n");
        }
        if (h==4){
            System.out.print("It took you " + (ctr+1) + " turns! Good job," + name + "!");
        }
        else
            System.out.print("Better luck next time!");
    }
}