package com.company;

public class ReverseString {
    public static void main(String[] args) {
        // write tests
        new Main().reverseString("I Love Lavigne");
    }

    void reverseString(String text){

        StringBuilder reversedText = new StringBuilder();

        for (int i=text.length()-1; i>0; i--) {
            char ch = text.charAt(i);
            reversedText.append(ch);

        }
        System.out.println(reversedText);

    }
}
