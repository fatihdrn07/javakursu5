package gun31._02_Enum;

public class user {
    String username;
     Role role;
    Statu statu;

    public user(String username,Role role, Statu statu) {
        this.username = username;
        this.role=role;
        this.statu=statu;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }
}
