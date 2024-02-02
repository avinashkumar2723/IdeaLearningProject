package com.avi.hakerRank;

public class ExcelColumnHeader {

    public static void main(String[] args) {
        ExcelColumnHeader excel = new ExcelColumnHeader();


        //System.out.println(excel.getHeader(45));
        System.out.println(excel.titleToNumber("A"));
    }

    public String getHeader(int columnNumber){

        StringBuilder title = new StringBuilder();

        int rem = 0;
        while(columnNumber > 0){
            columnNumber--;
            rem = columnNumber % 26;
            title.append((char)rem);
            columnNumber =+ columnNumber/26;

            System.out.println("HI");
        }

        System.out.println(title);
        return title.reverse().toString();
    }


    public int titleToNumber(String columnTitle) {

        String no = "";

        for(int i=columnTitle.length()-1;i>=0;i--){

            int char1 = (int) columnTitle.charAt(i) - 64;
            no = no + String.valueOf(char1);

        }
        System.out.println(no);
        return Integer.parseInt(no);
    }
}
