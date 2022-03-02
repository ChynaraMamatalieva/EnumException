package com.company;

public class InvalidIssueYear extends RuntimeException {
    public InvalidIssueYear() {
    }

    public InvalidIssueYear(String e) {
    }

    public static void message(String message) {
        System.out.println(message);
    }


}
