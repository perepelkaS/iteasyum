package lesson27;

public class UserPointException extends Exception {
    private final String userPoint;
    public UserPointException(String message, String userPoint) {
        super(message);
        this.userPoint = userPoint;
    }

    public String getUserPoint() {
        return userPoint;
    }
}
