public class MovieTheater {
    private String name;
    private double price;
    private String releaseDate;
    private char review;

    public MovieTheater(String n ,  double p , String d , char r) {
        name = n;
        price = p;
        releaseDate = d;
        review = r;

    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public char getReview() {
        return review;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public void setReview(char review) {
        this.review = review;
    }
    public String toString() {
        return getName() + "/n" + getPrice() + "/n" + getReleaseDate() + "/n" + getReview();
    }


    public static void main(String[] args) {
        MovieTheater movieOne = new MovieTheater("Mission Impossible: Rouge Nation" , 10.00 , "July 31st , 2015" , 'B');
        MovieTheater movieTwo = new MovieTheater("Mission Impossible: Ghost Protocol" , 7.00 , "December 15th , 2011" , 'A');
        MovieTheater movieThree = new MovieTheater("Mission Impossible: Fallout" , 15.00 , "July 27th , 2018" , 'A');
        System.out.println(movieOne);
    }
}
