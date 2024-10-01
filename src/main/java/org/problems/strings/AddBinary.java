package org.problems.strings;

public class AddBinary {
    public static void main(String[] args) {

        System.out.println(addBinary("111", "10101"));
    }

    public static String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 1;
        int sum = 0;
        while (i >= 0 || j >= 0) {
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';
            carry = sum > 1 ? 1 : 0;
            sb.append(sum % 2);
            i--;
            j--;
        }
        if(carry!=0)
            sb.append(carry);

        return sb.reverse().toString();
    }
}
