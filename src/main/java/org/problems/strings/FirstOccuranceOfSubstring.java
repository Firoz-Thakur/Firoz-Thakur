package org.problems.strings;

public class FirstOccuranceOfSubstring {

    public static void main(String[] args) {


    }


    public int strStr(String haystack, String needle) {


        if (needle.length() > haystack.length())
            return -1;

        for (int i = 0; i <= (haystack.length() - needle.length()); i++) {

            if(haystack.substring(i,needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
