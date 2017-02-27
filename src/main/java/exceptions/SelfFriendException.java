package main.java.exceptions;

public class SelfFriendException extends Exception {

    @Override
    public String getMessage() {
        return "You can't befriend yourself";
    }
}