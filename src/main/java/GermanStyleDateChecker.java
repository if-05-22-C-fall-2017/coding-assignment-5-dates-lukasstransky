import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        String regex = "^((3[01])|([12][0-9])|(0?[1-9]))([.-]|\\s)((1[0-2])|(0?[1-9]))([.-]|\\s)((19|20)?[0-9]{2})$";
        return Pattern.compile(regex).matcher(dateString);
    }
}
