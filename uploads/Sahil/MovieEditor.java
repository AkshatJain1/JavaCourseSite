import java.util.Scanner;
public class MovieEditor {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int userInput = 0;
        boolean valid = false;
        int editMovie;
        int editAttribute;
        String newString;
        int newInt;
        char newChar;
        while (userInput == 0 || userInput == 1 || userInput == 2) {
            System.out.print("1. Print movies.\n2. Edit movies.\n3. Exit.");
            do{
                System.out.print("\nEnter option: ");
                userInput = key.nextInt();
                key.nextLine();
                if (userInput == 0) {
                    valid = false;
                    continue;
                }
                else if (userInput == 1) {
                    Movie1 d = new Movie1();
                    System.out.print("Name: " +d.getName() + " - ");
                    System.out.print("Price: $" +d.getPrice() + " - ");
                    System.out.print("Release Date: " +d.getReleaseDate() + " - ");
                    System.out.print("Review: "+d.getReview());
                    valid=true;
                    Movie2 e = new Movie2();
                    System.out.print("\nName: " +e.getName() + " - ");
                    System.out.print("Price: $" +e.getPrice() + " - ");
                    System.out.print("Release Date: " +e.getReleaseDate() + " - ");
                    System.out.print("Review: "+e.getReview());
                    valid=true;
                    Movie3 f = new Movie3();
                    System.out.print("\nName: " +f.getName() + " - ");
                    System.out.print("Price: $" +f.getPrice() + " - ");
                    System.out.print("Release Date: " +f.getReleaseDate() + " - ");
                    System.out.print("Review: "+f.getReview() + "\n");
                    valid=true;
                    continue;
                }
                else if(userInput==2){
                    System.out.println("1. Karate Buffalo\n2. Pigs can Fly\n3. Porklet");
                    System.out.print("Choose movie to edit: ");
                    editMovie=key.nextInt();
                    key.nextLine();
                    if(editMovie==1){
                        System.out.print("1. Name\n2. Price\n3. Release Date\n4. Review\nWhat do you want to edit? ");
                        editAttribute=key.nextInt();
                        key.nextLine();
                        if(editAttribute==1){
                            Movie1 d = new Movie1();
                            System.out.print("Enter the new value: ");
                            newString=key.nextLine();
                            d.setName(newString);
                        }
                        else if(editAttribute==2){
                            Movie1 d = new Movie1();
                            System.out.print("Enter the new value: ");
                            newInt=key.nextInt();
                            key.nextLine();
                            d.setPrice(newInt);
                        }
                        else if(editAttribute==3){
                            Movie1 d = new Movie1();
                            System.out.print("Enter the new value: ");
                            newString=key.nextLine();
                            d.setReleaseDate(newString);
                        }
                        else if(editAttribute==4){
                            Movie1 d = new Movie1();
                            System.out.print("Enter the new value: ");
                            newChar=key.next().charAt(0);
                            d.setReview(newChar);
                        }
                    }
                    if (editMovie == 2) {
                        System.out.print("1. Name\n2. Price\n3. Release Date\n4. Review\nWhat do you want to edit? ");
                        editAttribute=key.nextInt();
                        key.nextLine();
                        if(editAttribute==1){
                            Movie2 d = new Movie2();
                            System.out.print("Enter the new value: ");
                            newString=key.nextLine();
                            d.setName(newString);
                        }
                        else if(editAttribute==2){
                            Movie2 d = new Movie2();
                            System.out.print("Enter the new value: ");
                            newInt=key.nextInt();
                            key.nextLine();
                            d.setPrice(newInt);
                        }
                        else if(editAttribute==3){
                            Movie2 d = new Movie2();
                            System.out.print("Enter the new value: ");
                            newString=key.nextLine();
                            d.setReleaseDate(newString);
                        }
                        else if(editAttribute==4){
                            Movie2 d = new Movie2();
                            System.out.print("Enter the new value: ");
                            newChar=key.next().charAt(0);
                            d.setReview(newChar);
                        }
                    }
                    if (editMovie ==3){
                        System.out.print("1. Name\n2. Price\n3. Release Date\n4. Review\nWhat do you want to edit? ");
                        editAttribute=key.nextInt();
                        key.nextLine();
                        if(editAttribute==1){
                            Movie3 d = new Movie3();
                            System.out.print("Enter the new value: ");
                            newString=key.nextLine();
                            d.setName(newString);
                        }
                        else if(editAttribute==2){
                            Movie3 d = new Movie3();
                            System.out.print("Enter the new value: ");
                            newInt=key.nextInt();
                            key.nextLine();
                            d.setPrice(newInt);
                        }
                        else if(editAttribute==3){
                            Movie3 d = new Movie3();
                            System.out.print("Enter the new value: ");
                            newString=key.nextLine();
                            d.setReleaseDate(newString);
                        }
                        else if(editAttribute==4){
                            Movie3 d = new Movie3();
                            System.out.print("Enter the new value: ");
                            newChar=key.next().charAt(0);
                            d.setReview(newChar);
                        }
                    }
                    valid=true;
                    continue;
                }
            }while (valid = false);
        }
        System.out.print("Bye!");
    }
    class Movie1 {
        String name;
        private int price;
        private String releaseDate;
        private char review;
        public Movie1() {
            name = "Karate Buffalo";
            price = 5;
            releaseDate = "June 5th, 2020";
            review = 'B';
        }
        public Movie1(String n, int p, String r, char re){
            name=n;
            price=p;
            releaseDate=r;
            review=re;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public int getPrice(){
            return price;
        }
        public void setPrice(int price){
            price=price;
        }
        public String getReleaseDate(){
            return releaseDate;
        }
        public void setReleaseDate(String releaseDate){
            this.releaseDate=releaseDate;
        }
        public char getReview(){
            return review;
        }
        public void setReview(char review){
            review=review;
        }
    }
    public class Movie2 {
        private String name;
        private int price;
        private String releaseDate;
        private char review;
        public Movie2() {
            name = "Pigs Can Fly";
            price = 7;
            releaseDate = "September 17th, 2025";
            review = 'A';
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public int getPrice(){
            return price;
        }
        public void setPrice(int price){
            price=price;
        }
        public String getReleaseDate(){
            return releaseDate;
        }
        public void setReleaseDate(String releaseDate){
            this.releaseDate=releaseDate;
        }
        public char getReview(){
            return review;
        }
        public void setReview(char review){
            review=review;
        }
    }
    public class Movie3 {
        private String name;
        private int price;
        private String releaseDate;
        private char review;
        public Movie3() {
            name = "Porklet";
            price = 10;
            releaseDate = "February 13th, 2028";
            review = 'C';
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public int getPrice(){
            return price;
        }
        public void setPrice(int price){
            price=price;
        }
        public String getReleaseDate(){
            return releaseDate;
        }
        public void setReleaseDate(String releaseDate){
            this.releaseDate=releaseDate;
        }
        public char getReview(){
            return review;
        }
        public void setReview(char review){
            review=review;
        }
    }
}
