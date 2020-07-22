package strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Solution {
    public static void main(String[] args) {
        String input = " 715K 2009-09-23 system.zip~\n 179K 2013-08-14 to-do-list.xml~\n 645K 2013-06-19 blockbuster.mpeg~\n  536 2010-12-12 notes.html\n 688M 1990-02-11 delete-this.zip~\n  23K 1987-05-24 setup.png~\n 616M 1965-06-06 important.html\n  14M 1992-05-31 crucial-module.java~\n 192K 1990-01-31 very-long-filename.dll~";
        Solution sol = new Solution();
        System.out.println(sol.solution(input));
    }

    public String solution(String S) {
        // write your code in Java SE 8

        String[] lines = S.split(Character.toString((char) 10));
        int count = Integer.MAX_VALUE;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date expectedDate = sdf.parse("1990-01-31");

            for (String line : lines) {
                String fileSize = line.substring(0, 6).trim();
                String fileName = line.substring(16).trim();
                Date mDate = sdf.parse(line.substring(6, 16).trim());
                if (fileName.charAt(fileName.length() - 1) == '~' && mDate.after(expectedDate)) {
                    if (fileSize.charAt(fileSize.length() - 1) == 'K') {
                        String fileNameNoExtension = fileName.substring(0, fileName.lastIndexOf('.'));
                        count = Math.min(count, fileNameNoExtension.length());
                    } else if (fileSize.charAt(fileSize.length() - 1) == 'M') {
                        Integer size = Integer.parseInt(fileSize.substring(0, fileSize.length() - 1));
                        if (size < 14) {
                            String fileNameNoExtension = fileName.substring(0, fileName.lastIndexOf('.'));
                            count = Math.min(count, fileNameNoExtension.length());
                        }
                    }
                }
            }
        } catch (ParseException e) {
            System.out.println("Unable to parse input date" + e);
        }

        return String.valueOf(count);

    }
}