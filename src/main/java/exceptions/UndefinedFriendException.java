package main.java.exceptions;

public class UndefinedFriendException extends Exception {

    @Override
    public String getMessage() {
        return "User is not a friend";
    }
}