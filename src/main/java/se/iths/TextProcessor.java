package se.iths;

public class TextProcessor {

    public String allCaps(String str) {
        return str.toUpperCase();
    }

    public String allLower(String str) {
        return str.toLowerCase();
    }

    public String reverse(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
