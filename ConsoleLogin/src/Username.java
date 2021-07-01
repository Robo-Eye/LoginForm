import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {
    private String username;
    public Username() {
        username = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username)  {
        this.username = username;
    }

    public boolean regexChecker(String theStrBeingChecked){
        String regex = "^[A-Za-z]\\w{7,39}$";
        Pattern checkRegex = Pattern.compile(regex);

        if(theStrBeingChecked == null){
            return false;
        }
        Matcher regexMatcher = checkRegex.matcher(theStrBeingChecked);
        return regexMatcher.matches();
    }

}
