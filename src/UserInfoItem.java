public class UserInfoItem {

    private String userName;

    private int userType;

    public UserInfoItem(String userName, int userType) {
        this.userName = userName;
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserType() {
        return userType;
    }

    public void getUserType(int userType) {
        this.userType = userType;
    }
}
