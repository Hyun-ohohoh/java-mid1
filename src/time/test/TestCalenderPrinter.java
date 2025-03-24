package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalenderPrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();

        print(year, month);

    }

    public static void print(int year, int month){

        LocalDate firstDayofMonth = LocalDate.of(year,month,1);
        LocalDate firstDayofNextMonth = firstDayofMonth.plusMonths(1);

        //월요일=1(1%7=1)
        int offsetWeekDay = firstDayofMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa");
        for(int i = 0; i < offsetWeekDay; i++){
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayofMonth;
        while(dayIterator.isBefore(firstDayofNextMonth)){
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }


    }
}
