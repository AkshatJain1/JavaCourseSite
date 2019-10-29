package ArmanPack;
import java.util.Scanner;
	
		class Movie1 {
		private String name;
		private int price;
		private String releaseDate;
		private char review;
	
		public Movie1() {
			name = "The White Knight";
			price = 8;
			releaseDate = "July 20, 2018";
			review = 'B';
		}
		
		public Movie1 (String nam, int pric, String releaseDat, char revie) {
			name = nam;
			price = pric;
			releaseDate = releaseDat;
			review = revie;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getReleaseDate() {
			return releaseDate;
		}
		public void setReleaseDate(String releaseDate) {
			this.releaseDate = releaseDate;
		}
		public char getReview() {
			return review;
		}
		public void setReview(char review) {
			this.review = review;
		}


	}
		class Movie2 {
		private String name2;
		private int price2;
		private String releaseDate2;
		private char review2;
		
		public Movie2() {
			name2 = "The Search for the Tomb";
			price2 = 7;
			releaseDate2 = "September 9, 2018";
			review2 = 'B';
		}
		public Movie2(String nam, int pric, String releaseDat, char revie) {
			name2 = nam;
			price2 = pric;
			releaseDate2 = releaseDat;
			review2 = revie;
		}
		public String getName2() {
			return name2;
		}
		public void setName2(String name2) {
			this.name2 = name2;
		}
		public int getPrice2() {
			return price2;
		}
		public void setPrice2(int price2) {
			this.price2 = price2;
		}
		public String getReleaseDate2() {
			return releaseDate2;
		}
		public void setReleaseDate2(String releaseDate2) {
			this.releaseDate2 = releaseDate2;
		}
		public char getReview2() {
			return review2;
		}
		public void setReview2(char review2) {
			this.review2 = review2;
		}

		}
		class Movie3 {
		private String name3;
		private int price3;
		private String releaseDate3;
		private char review3;
		
		public Movie3() {
			name3 = "Oddballs Galore";
			price3 = 9;
			releaseDate3 = "February 29, 2018";
			review3 = 'C';
		}
		public Movie3(String nam, int pric, String releaseDat, char revie) {
			name3 = nam;
			price3 = pric;
			releaseDate3 = releaseDat;
			review3 = revie;
		}
		public String getName3() {
			return name3;
		}
		public void setName3(String name3) {
			this.name3 = name3;
		}
		public int getPrice3() {
			return price3;
		}
		public void setPrice3(int price3) {
			this.price3 = price3;
		}
		public String getReleaseDate3() {
			return releaseDate3;
		}
		public void setReleaseDate3(String releaseDate3) {
			this.releaseDate3 = releaseDate3;
		}
		public char getReview3() {
			return review3;
		}
		public void setReview3(char review3) {
			this.review3 = review3;
		}
		} //End of Movie3
	public class MovieTheater {
		public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int option, option2, option3;
		option = 0;
		String newName, newName2, newName3;
		String pricee;
		pricee = null;
		int newPrice, newPrice2, newPrice3;
		String newReleaseDate, newReleaseDate2, newReleaseDate3;
		char newReview, newReview2, newReview3;
		Movie1 m1 = new Movie1();
		Movie2 m2 = new Movie2();
		Movie3 m3 = new Movie3();
		System.out.println("Welcome to Cinephile Theatres");
		while (option != 3)
		{
		System.out.println("1. Print Movies");
		System.out.println("2. Edit Movies");
		System.out.println("3. Exit");
		System.out.print("Enter Option: ");
		option = keyboard.nextInt();
		keyboard.nextLine();
		if (option==1)
		{
			System.out.println("Name: "+m1.getName()+" - Price: $"+m1.getPrice()+" - Release Date: "+m1.getReleaseDate()+" - Review: "+m1.getReview()+"");
			System.out.println("Name: "+m2.getName2()+" - Price: $"+m2.getPrice2()+" - Release Date: "+m2.getReleaseDate2()+" - Review: "+m2.getReview2()+"");
			System.out.println("Name: "+m3.getName3()+" - Price: $"+m3.getPrice3()+" - Release Date: "+m3.getReleaseDate3()+" - Review: "+m3.getReview3()+"");
		}
		if (option==2) 
		{
			System.out.println("Choose movie to edit");
			System.out.println("1. "+m1.getName());
			System.out.println("2. "+m2.getName2());
			System.out.println("3. "+m3.getName3());
			System.out.println("Enter option");
			option2 = keyboard.nextInt();
			keyboard.nextLine();
			if (option2 == 1)
			{
				System.out.println("What do you want to edit");
				System.out.println("1. Name");
				System.out.println("2. Price");
				System.out.println("3. Release Date");
				System.out.println("4. Review");
				System.out.print("Enter option: ");
				option3 = keyboard.nextInt();
				keyboard.nextLine();
				if (option3 == 1)
				{	
					System.out.println("Enter a new name");
					newName = keyboard.nextLine();
					m1.setName(newName);
					System.out.println(m1.getName());
				}
				if (option3 == 2)
				{
					System.out.println("Enter a new price");
					newPrice = keyboard.nextInt();
					m1.setPrice(newPrice);
					//pricee.toString();
					pricee = toString(m1.getPrice());
					System.out.println(pricee);
				}
				if (option3 == 3)
				{	
					System.out.println("Enter a new release date");
					newReleaseDate = keyboard.nextLine();
					m1.setReleaseDate(newReleaseDate);
					System.out.println(m1.getReleaseDate());
				}
				if (option3 == 4)
				{	
					System.out.println("Enter a new review");
					newReview = keyboard.next().charAt(0);
					m1.setReview(newReview);
					System.out.println(m1.getReview());
				}
			}
			if (option2 == 2)
			{
				System.out.println("What do you want to edit");
				System.out.println("1. Name");
				System.out.println("2. Price");
				System.out.println("3. Release Date");
				System.out.println("4. Review");
				System.out.print("Enter option: ");
				option3 = keyboard.nextInt();
				keyboard.nextLine();
				if (option3 == 1)
				{	
					System.out.println("Enter a new name");
					newName2 = keyboard.nextLine();
					m2.setName2(newName2);
					System.out.println(m2.getName2());
				}
				if (option3 == 2)
				{
					System.out.println("Enter a new price");
					newPrice2 = keyboard.nextInt();
					m2.setPrice2(newPrice2);
					System.out.println(m2.getPrice2());
				}
				if (option3 == 3)
				{	
					System.out.println("Enter a new release date");
					newReleaseDate2 = keyboard.nextLine();
					m2.setReleaseDate2(newReleaseDate2);
					System.out.println(m2.getReleaseDate2());
				}
				if (option3 == 4)
				{	
					System.out.println("Enter a new review");
					newReview2 = keyboard.next().charAt(0);
					m2.setReview2(newReview2);
					System.out.println(m2.getReview2());
				}
			}
			if (option2 == 3)
			{
				System.out.println("What do you want to edit");
				System.out.println("1. Name");
				System.out.println("2. Price");
				System.out.println("3. Release Date");
				System.out.println("4. Review");
				System.out.print("Enter option: ");
				option3 = keyboard.nextInt();
				keyboard.nextLine();
				if (option3 == 1)
				{	
					System.out.println("Enter a new name");
					newName3 = keyboard.nextLine();
					m3.setName3(newName3);
					System.out.println(m3.getName3());
				}
				if (option3 == 2)
				{
					System.out.println("Enter a new price");
					newPrice3 = keyboard.nextInt();
					m3.setPrice3(newPrice3);
					System.out.println(m3.getPrice3());
				}
				if (option3 == 3)
				{	
					System.out.println("Enter a new release date");
					newReleaseDate3 = keyboard.nextLine();
					m3.setReleaseDate3(newReleaseDate3);
					System.out.println(m3.getReleaseDate3());
				}
				if (option3 == 4)
				{	
					System.out.println("Enter a new review");
					newReview3 = keyboard.next().charAt(0);
					m3.setReview3(newReview3);
					System.out.println(m3.getReview3());
				}
		}
		//MovieTheater Movie1 = new MovieTheater();
		//System.out.println(m1.getName());
	}
		
		
	
	}
		}
		public static String toString (int price) {
			return "$ "+price+" ";
		}
	}
	
		
	


