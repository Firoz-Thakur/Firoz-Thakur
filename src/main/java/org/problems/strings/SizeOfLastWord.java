package org.problems.strings;

import java.util.Arrays;
import java.util.List;

public class SizeOfLastWord {
    public static void main(String[] args) {


        lengthOfLastWord("ITEM KON HIEN");


    }

    public static int lengthOfLastWord(String s) {

        List<String> items = Arrays.asList(s.split(" "));
        int maxSize = Integer.MIN_VALUE;
        return items.get(items.size()-1).length();
    }
    }
