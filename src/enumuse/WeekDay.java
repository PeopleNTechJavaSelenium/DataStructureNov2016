package enumuse;

import enumuse.Week;

/**
 * Created by PIIT_NYA on 12/11/2016.
 */
public class WeekDay {
    Week day ;
    public WeekDay(){

    }
    public WeekDay(Week day){
       this.day = day;
     }

     public void whatAmIDoing(){
         switch(day){

             case MONDAY:
                 System.out.println("Start reading Data Structure book, Topics ArrayList");
                 break;
             case TUESDAY:
                 System.out.println("Start reading Data Structure book, Topics LinkedList");
                 break;
             case WEDNESDAY:
                 System.out.println("Start reading Data Structure book, Topics Stack and Queue");
                 break;
             case THURSDAY:
                 System.out.println("Start reading Data Structure book, Topics HashMap");
                 break;
             case FRIDAY:
                 System.out.println("Start reading Data Structure book, Topics HashTable");
                 break;
             case SATURDAY:
                 System.out.println("Start reading Data Structure book, Topics Sorting Algorithm");
                 break;
             case SUNDAY:
                 System.out.println("Start reading Data Structure book, Topics Graph and Tree");
                 break;
             default:
                 System.out.println("Not a valid day. you can sleep");
                 break;
         }
     }
}
