package org.problems.strings;

public class ExcelSheetNumber {
    public static void main(String[] args) {

    }

    public int titleToNumber(String x) {

        int ans=1;
        int itr=0;
        for(int i=0;i<x.length();i++)
        {
            ans+= (itr*25) + (x.charAt(i)-'A');
            itr++;
        }
        return ans;
    }
}
}
