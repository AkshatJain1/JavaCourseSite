/**
 * Created by respe on 7/5/2017.
 */
public class Lawyer extends Employee {
    int vacDays = super.vacDays+5;
    String vacFormColor = "pink";

    @Override
    public String toString() {
        return "I'll see you in court.";
    }
}
