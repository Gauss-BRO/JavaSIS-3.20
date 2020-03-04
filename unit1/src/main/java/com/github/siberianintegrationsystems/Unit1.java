package com.github.siberianintegrationsystems;

public class Unit1 {

    private static final String INPUT_STRING = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
        + "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";


    public static void main(String[] args) {

        String result = revertString();
        checkResult(result);
    }

    /**
     * При реализации метода нельзя использовать метод reverse() из класса StringBuilder
     */
    private static String revertString() {
        int wordCount=INPUT_STRING.length();
        char[]charArray=INPUT_STRING.toCharArray();
        char[]reverseArray=new char[wordCount];
        for(int i=0;i<wordCount;i++){
            reverseArray[i]=charArray[wordCount-1-i];
        }
        String reverse="";
        for(int i=0;i<reverseArray.length;i++){
            reverse+=reverseArray[i];
        }
        System.out.println(reverse);
        return reverse;
    }

    private static void checkResult(String result) {
        if (INPUT_STRING.equals(new StringBuilder(result).reverse().toString())) {
            System.out.println("Строка изменена корректно");
        } else {
            throw new RuntimeException("Ошибка, строка изменена неверно");
        }
    }
}
