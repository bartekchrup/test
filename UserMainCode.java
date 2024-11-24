import java.io.*;
import java.util.*;
class UserMainCode {
    public static String userIdGeneration(String input1, String input2, int input3, int input4){
        String smallerName, longerName;
        if (input1.length() < input2.length()) {
            smallerName = input1;
            longerName = input2;
        } else if (input1.length() > input2.length()) {
            smallerName = input2;
            longerName = input1;
        } else {
            if (input1.compareTo(input2) < 0) {
                smallerName = input1;
                longerName = input2;
            } else {
                smallerName = input2;
                longerName = input1;
            }
        }

        String pinStr = String.valueOf(input3);
        char lastLetter = smallerName.charAt(smallerName.length() - 1);
        char digitFromLeft = pinStr.charAt(input4 - 1);
        char digitFromRight = pinStr.charAt(pinStr.length() - input4);

        String userId = lastLetter + longerName + digitFromLeft + digitFromRight;
        StringBuilder toggledUserId = new StringBuilder();
        for (char c : userId.toCharArray()) {
            if (Character.isLowerCase(c)) {
                toggledUserId.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                toggledUserId.append(Character.toLowerCase(c));
            } else {
                toggledUserId.append(c);
            }
        }

        return toggledUserId.toString();
    }

    public static void main(String[] args) {
        System.out.println(userIdGeneration("Rajiv", "Roy", 560037, 6));
        System.out.println(userIdGeneration("Kumud", "Kumar", 561327, 2));
    }
}