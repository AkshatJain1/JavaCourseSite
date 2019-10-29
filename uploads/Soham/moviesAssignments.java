import java.util.Scanner;

public class moviesAssignments {

    public static void main(String[] args) {


        LifeIsGood movieObject1 = new LifeIsGood("Life is good", 10, "June 12, 2018", 'D');
        Avengers2 movieObject2 = new Avengers2("Avengers 2", 15, "March 4, 2017", 'B');
        RobotFries movieObject3 = new RobotFries("Robot Fries", 6, "December 22, 2012", 'A');


        Scanner keyboard = new Scanner(System.in);

        int menuOption;

        System.out.print(" 1. Print Movies \n 2. Edit Movies \n 3. Exit \n Enter Option:");

        menuOption = keyboard.nextInt();


            if (menuOption < 1 || menuOption > 3) {
                while (menuOption < 1 || menuOption > 3) {
                System.out.println("Error please enter an integer 1 through 3");
                menuOption = keyboard.nextInt();
            }
        }
        if (menuOption == 3) {
            System.out.println("Goodbye ✋");
        }


        if (menuOption == 1) {

            System.out.println(" These are the movies:");
            System.out.println(" \n 1." + movieObject1.getName() + " - Price: $" + movieObject1.getPrice() + " - Release Date: " + movieObject1.getReleaseDate() + " - Review: " + movieObject1.getReview());
            System.out.println(" \n 2." + movieObject2.getName() + " - Price: $" + movieObject2.getPrice() + " - Release Date: " + movieObject2.getReleaseDate() + " - Review: " + movieObject2.getReview());
            System.out.println(" \n 3." + movieObject3.getName() + " - Price: $" + movieObject3.getPrice() + " - Release Date: " + movieObject3.getReleaseDate() + " - Review: " + movieObject3.getReview());


        }


        if (menuOption == 2) {

            System.out.println(" You have chosen to edit. Which movie would you like to edit?");
            System.out.println(" 1. Life is good \n 2. Avengers 2 \n 3. Robot Fries \n Enter an option:");
            int movieOption = keyboard.nextInt();



                if (movieOption < 1 || movieOption > 4) {
                    while (movieOption < 1 || movieOption > 4) {
                    System.out.println("Error! Please enter an integer in between 1 and 4");
                    movieOption = keyboard.nextInt();
                }
            }
            if (movieOption == 1) {

                System.out.println(" What would you like to edit? \n 1. Name \n 2. Price \n 3. Release Date \n 4. Review");
                int editOption = keyboard.nextInt();


                    if (editOption < 1 || editOption > 4) {
                        while (editOption < 1 || editOption > 4) {
                        System.out.println("Error! Please enter a integer in between 1 and 4");
                        editOption = keyboard.nextInt();
                    }
                }
                if (editOption == 1) {
                    String newName;
                    System.out.println("What is your new name for Life is good? Enter here:");
                    newName = keyboard.next();

                    movieObject1.setName(newName);

                    System.out.println(" Here are the movies after your change:");
                    System.out.println(" \n 1." + movieObject1.getName() + " - Price: $" + movieObject1.getPrice() + " - Release Date: " + movieObject1.getReleaseDate() + " - Review: " + movieObject1.getReview());
                    System.out.println(" \n 2." + movieObject2.getName() + " - Price: $" + movieObject2.getPrice() + " - Release Date: " + movieObject2.getReleaseDate() + " - Review: " + movieObject2.getReview());
                    System.out.println(" \n 3." + movieObject3.getName() + " - Price: $" + movieObject3.getPrice() + " - Release Date: " + movieObject3.getReleaseDate() + " - Review: " + movieObject3.getReview());


                }


                if (editOption == 2) {
                    int newPrice;
                    System.out.println("What is your new price for Life is good? Enter here:");
                    newPrice = keyboard.nextInt();

                    if (newPrice <= 0) {
                        System.out.println("Error! Please enter an positive number");
                        newPrice = keyboard.nextInt();
                    }


                    movieObject1.setPrice(newPrice);


                    System.out.println(" Here are the movies after your change:");
                    System.out.println(" \n 1." + movieObject1.getName() + " - Price: $" + movieObject1.getPrice() + " - Release Date: " + movieObject1.getReleaseDate() + " - Review: " + movieObject1.getReview());
                    System.out.println(" \n 2." + movieObject2.getName() + " - Price: $" + movieObject2.getPrice() + " - Release Date: " + movieObject2.getReleaseDate() + " - Review: " + movieObject2.getReview());
                    System.out.println(" \n 3." + movieObject3.getName() + " - Price: $" + movieObject3.getPrice() + " - Release Date: " + movieObject3.getReleaseDate() + " - Review: " + movieObject3.getReview());


                }


                if (editOption == 3) {
                    String newReleaseDate;
                    System.out.println("What is your new release date for Life is good? Enter here:");
                    newReleaseDate = keyboard.next();
                    movieObject1.setReleaseDate(newReleaseDate);

                    System.out.println(" Here are the movies after your change:");
                    System.out.println(" \n 1." + movieObject1.getName() + " - Price: $" + movieObject1.getPrice() + " - Release Date: " + movieObject1.getReleaseDate() + " - Review: " + movieObject1.getReview());
                    System.out.println(" \n 2." + movieObject2.getName() + " - Price: $" + movieObject2.getPrice() + " - Release Date: " + movieObject2.getReleaseDate() + " - Review: " + movieObject2.getReview());
                    System.out.println(" \n 3." + movieObject3.getName() + " - Price: $" + movieObject3.getPrice() + " - Release Date: " + movieObject3.getReleaseDate() + " - Review: " + movieObject3.getReview());


                }

                if (editOption == 4) {
                    char newReview;
                    System.out.println("What is your new review for Life is good? Enter here:");
                    newReview = keyboard.next().charAt(0);

                    movieObject1.setReview(newReview);
                    System.out.println(" Here are the movies after your change:");
                    System.out.println(" \n 1." + movieObject1.getName() + " - Price: $" + movieObject1.getPrice() + " - Release Date: " + movieObject1.getReleaseDate() + " - Review: " + movieObject1.getReview());
                    System.out.println(" \n 2." + movieObject2.getName() + " - Price: $" + movieObject2.getPrice() + " - Release Date: " + movieObject2.getReleaseDate() + " - Review: " + movieObject2.getReview());
                    System.out.println(" \n 3." + movieObject3.getName() + " - Price: $" + movieObject3.getPrice() + " - Release Date: " + movieObject3.getReleaseDate() + " - Review: " + movieObject3.getReview());


                }


            }


            if (movieOption == 2) {

                System.out.println(" What would you like to edit? \n 1. Name \n 2. Price \n 3. Release Date \n 4. Review");
                int editOption = keyboard.nextInt();

                if (editOption < 1 || editOption > 4) {

                    System.out.println("Error! Please enter a integer in between 1 and 4");
                    editOption = keyboard.nextInt();
                }

                if (editOption == 1) {
                    String newName;
                    System.out.println("What is your new name for Avengers 2? Enter here:");
                    newName = keyboard.next();

                    movieObject2.setName(newName);

                    System.out.println(" Here are the movies after your change:");
                    System.out.println(" \n 1." + movieObject1.getName() + " - Price: $" + movieObject1.getPrice() + " - Release Date: " + movieObject1.getReleaseDate() + " - Review: " + movieObject1.getReview());
                    System.out.println(" \n 2." + movieObject2.getName() + " - Price: $" + movieObject2.getPrice() + " - Release Date: " + movieObject2.getReleaseDate() + " - Review: " + movieObject2.getReview());
                    System.out.println(" \n 3." + movieObject3.getName() + " - Price: $" + movieObject3.getPrice() + " - Release Date: " + movieObject3.getReleaseDate() + " - Review: " + movieObject3.getReview());


                }


                if (editOption == 2) {
                    int newPrice;
                    System.out.println("What is your new price for Avengers 2? Enter here:");
                    newPrice = keyboard.nextInt();

                    if (newPrice <= 0) {
                        System.out.println("Error! Please enter an positive number");
                        newPrice = keyboard.nextInt();
                    }


                    movieObject2.setPrice(newPrice);


                    System.out.println(" Here are the movies after your change:");
                    System.out.println(" \n 1." + movieObject1.getName() + " - Price: $" + movieObject1.getPrice() + " - Release Date: " + movieObject1.getReleaseDate() + " - Review: " + movieObject1.getReview());
                    System.out.println(" \n 2." + movieObject2.getName() + " - Price: $" + movieObject2.getPrice() + " - Release Date: " + movieObject2.getReleaseDate() + " - Review: " + movieObject2.getReview());
                    System.out.println(" \n 3." + movieObject3.getName() + " - Price: $" + movieObject3.getPrice() + " - Release Date: " + movieObject3.getReleaseDate() + " - Review: " + movieObject3.getReview());


                }


                if (editOption == 3) {
                    String newReleaseDate;
                    System.out.println("What is your new release date for Avengers 2? Enter here:");
                    newReleaseDate = keyboard.next();
                    movieObject2.setReleaseDate(newReleaseDate);

                    System.out.println(" Here are the movies after your change:");
                    System.out.println(" \n 1." + movieObject1.getName() + " - Price: $" + movieObject1.getPrice() + " - Release Date: " + movieObject1.getReleaseDate() + " - Review: " + movieObject1.getReview());
                    System.out.println(" \n 2." + movieObject2.getName() + " - Price: $" + movieObject2.getPrice() + " - Release Date: " + movieObject2.getReleaseDate() + " - Review: " + movieObject2.getReview());
                    System.out.println(" \n 3." + movieObject3.getName() + " - Price: $" + movieObject3.getPrice() + " - Release Date: " + movieObject3.getReleaseDate() + " - Review: " + movieObject3.getReview());


                }

                if (editOption == 4) {
                    char newReview;
                    System.out.println("What is your new review for Avengers 2? Enter here:");
                    newReview = keyboard.next().charAt(0);

                    movieObject2.setReview(newReview);
                    System.out.println(" Here are the movies after your change:");
                    System.out.println(" \n 1." + movieObject1.getName() + " - Price: $" + movieObject1.getPrice() + " - Release Date: " + movieObject1.getReleaseDate() + " - Review: " + movieObject1.getReview());
                    System.out.println(" \n 2." + movieObject2.getName() + " - Price: $" + movieObject2.getPrice() + " - Release Date: " + movieObject2.getReleaseDate() + " - Review: " + movieObject2.getReview());
                    System.out.println(" \n 3." + movieObject3.getName() + " - Price: $" + movieObject3.getPrice() + " - Release Date: " + movieObject3.getReleaseDate() + " - Review: " + movieObject3.getReview());


                }

            }

                if (movieOption == 3) {
                    System.out.println(" What would you like to edit? \n 1. Name \n 2. Price \n 3. Release Date \n 4. Review");
                     int editOption = keyboard.nextInt();

                    if (editOption < 1 || editOption > 4) {

                        System.out.println("Error! Please enter a integer in between 1 and 4");
                        editOption = keyboard.nextInt();
                    }

                    if (editOption == 1) {
                        String newName;
                        System.out.println("What is your new name for Robot Fries? Enter here:");
                        newName = keyboard.next();

                        movieObject3.setName(newName);

                        System.out.println(" Here are the movies after your change:");
                        System.out.println(" \n 1." + movieObject1.getName() + " - Price: $" + movieObject1.getPrice() + " - Release Date: " + movieObject1.getReleaseDate() + " - Review: " + movieObject1.getReview());
                        System.out.println(" \n 2." + movieObject2.getName() + " - Price: $" + movieObject2.getPrice() + " - Release Date: " + movieObject2.getReleaseDate() + " - Review: " + movieObject2.getReview());
                        System.out.println(" \n 3." + movieObject3.getName() + " - Price: $" + movieObject3.getPrice() + " - Release Date: " + movieObject3.getReleaseDate() + " - Review: " + movieObject3.getReview());


                    }


                    if (editOption == 2) {
                        int newPrice;
                        System.out.println("What is your new price for Robot Fries? Enter here:");
                        newPrice = keyboard.nextInt();

                        if (newPrice <= 0) {
                            System.out.println("Error! Please enter an positive number");
                            newPrice = keyboard.nextInt();
                        }


                        movieObject2.setPrice(newPrice);


                        System.out.println(" Here are the movies after your change:");
                        System.out.println(" \n 1." + movieObject1.getName() + " - Price: $" + movieObject1.getPrice() + " - Release Date: " + movieObject1.getReleaseDate() + " - Review: " + movieObject1.getReview());
                        System.out.println(" \n 2." + movieObject2.getName() + " - Price: $" + movieObject2.getPrice() + " - Release Date: " + movieObject2.getReleaseDate() + " - Review: " + movieObject2.getReview());
                        System.out.println(" \n 3." + movieObject3.getName() + " - Price: $" + movieObject3.getPrice() + " - Release Date: " + movieObject3.getReleaseDate() + " - Review: " + movieObject3.getReview());


                    }


                    if (editOption == 3) {
                        String newReleaseDate;
                        System.out.println("What is your new release date for Robot Fries? Enter here:");
                        newReleaseDate = keyboard.next();
                        movieObject2.setReleaseDate(newReleaseDate);

                        System.out.println(" Here are the movies after your change:");
                        System.out.println(" \n 1." + movieObject1.getName() + " - Price: $" + movieObject1.getPrice() + " - Release Date: " + movieObject1.getReleaseDate() + " - Review: " + movieObject1.getReview());
                        System.out.println(" \n 2." + movieObject2.getName() + " - Price: $" + movieObject2.getPrice() + " - Release Date: " + movieObject2.getReleaseDate() + " - Review: " + movieObject2.getReview());
                        System.out.println(" \n 3." + movieObject3.getName() + " - Price: $" + movieObject3.getPrice() + " - Release Date: " + movieObject3.getReleaseDate() + " - Review: " + movieObject3.getReview());


                    }

                    if (editOption == 4) {
                        char newReview;
                        System.out.println("What is your new review for Robot Fries? Enter here:");
                        newReview = keyboard.next().charAt(0);

                        movieObject2.setReview(newReview);
                        System.out.println(" Here are the movies after your change:");
                        System.out.println(" \n 1." + movieObject1.getName() + " - Price: $" + movieObject1.getPrice() + " - Release Date: " + movieObject1.getReleaseDate() + " - Review: " + movieObject1.getReview());
                        System.out.println(" \n 2." + movieObject2.getName() + " - Price: $" + movieObject2.getPrice() + " - Release Date: " + movieObject2.getReleaseDate() + " - Review: " + movieObject2.getReview());
                        System.out.println(" \n 3." + movieObject3.getName() + " - Price: $" + movieObject3.getPrice() + " - Release Date: " + movieObject3.getReleaseDate() + " - Review: " + movieObject3.getReview());


                    }


                }


            }


        }
    }
