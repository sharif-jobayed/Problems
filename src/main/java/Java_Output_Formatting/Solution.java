package Java_Output_Formatting;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();

            //Complete this line
            StringBuilder s2 = new StringBuilder();
            for (int y = 0; y < 15; y++) {
                if (y < s1.length() && s1.length() <= 10) {
                    s2.append(s1.charAt(y));
                } else {
                    s2.append(" ");
                }
            }
            String n = "";
            if (x < 10) {
                n += "00" + x;
            } else if (x < 100) {
                n += "0" + x;
            } else {
                n += "" + x;
            }
            System.out.println(s2 + n);
        }
        System.out.println("================================");
    }
}
