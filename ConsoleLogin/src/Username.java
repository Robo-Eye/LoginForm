import java.util.Objects;

public class Username {
    private String username;
    public Username() {
        username = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws Exception {
        if(username.contains("'") || username.contains("\"") || username.contains(" ")){
            throw new Exception("Username cannot contain ', \", or Empty Spaces (use _ instead)");
        }else if(username.equals("")) {
            throw new Exception("Invalid Username");
        }else if(this.username.equals(username)){
            throw new Exception("Username Taken");
        }
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Username username1 = (Username) o;
        return Objects.equals(username, username1.username);
    }

}
