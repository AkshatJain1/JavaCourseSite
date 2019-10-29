/**
 * Created by respe on 7/5/2017.
 */
public class LegalSecretary extends Secretary {
    int salary = super.salary+5000;

    @Override
    public String toString() {
        return "I could file all day";
    }
}
