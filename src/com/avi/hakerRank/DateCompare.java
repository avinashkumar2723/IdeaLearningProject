package com.avi.hakerRank;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCompare {

    public static void main(String[] args) {
        String event1[] = new String[]{"10:00","11:00"};
        String event2[] = new String[]{"14:00","15:00"};
        DateCompare dateCompare = new DateCompare();

        System.out.println(dateCompare.haveConflict(event1,event2));
    }

    public boolean haveConflict(String[] event1, String[] event2) {

        try{
            if(convertStringToDate(event1[1]).equals(convertStringToDate(event2[1]))){
                return true;
            }else if(convertStringToDate(event1[1]).before(convertStringToDate(event2[1]))){
                return true;
            }
            return false;
        }catch(Exception e){

        }
        return false;
    }

    public Date convertStringToDate(String s) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("HH:MM");
        return sdf.parse(s);
    }
}
