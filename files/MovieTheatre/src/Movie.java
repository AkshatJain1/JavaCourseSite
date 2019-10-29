/**
 * Created by respe on 7/12/2017.
 */
public class Movie {
    private String rating;
    private int stars;
    private String title;
    private char[][] seatingChart;

    public Movie(String rating, int stars, String title) {
        this.rating = rating;
        this.stars = stars;
        this.title = title;
        seatingChart = new char[5][6];
        for(int x =0; x<seatingChart.length;x++)
        {
            for(int y =0;y<seatingChart[0].length;y++)
            {
                seatingChart[x][y] = '_';
            }
        }
    }

    public char[][] getSeatingChart() {
        return seatingChart;
    }

    public boolean occupySeat(int row,int col) {
        if (seatingChart[row][col] == '_') {
            seatingChart[row][col] = 'O';
            return true;
        } else {
            return false;
        }
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", stars='" + stars + '\'' +
                '}';
    }
}
