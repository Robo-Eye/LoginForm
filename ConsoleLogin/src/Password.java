import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private String password;

    public Password() {
        this.password = "";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean regexChecker(String theStrBeingChecked){
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,40}$";
        Pattern checkRegex = Pattern.compile(regex);

        if(theStrBeingChecked == null){
            return false;
        }
        Matcher regexMatcher = checkRegex.matcher(theStrBeingChecked);
        return regexMatcher.matches();
    }

}
