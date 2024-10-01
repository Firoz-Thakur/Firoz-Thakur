package org.problems.strings;

public class ColumnsNames {
    public static void main(String[] args) {

        System.out.println(convertToTitle(701));

    }
    // 701
    // zy
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int remain = columnNumber % 26;
        System.out.println(remain);
        sb.append((char)('A' + remain-1));
        sb.append((char)('A' + (columnNumber / 26)-1));
        return sb.reverse().toString();
    }
}
