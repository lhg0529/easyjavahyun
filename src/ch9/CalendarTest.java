package ch9;

import java.util.Calendar;

public class CalendarTest {
  public static void main(String[] args) {
    String[] weekName = {"일", "월", "화", "수", "목", "금", "토"};
    String[] noonName = {"오전", "오후"};
    Calendar c = Calendar.getInstance();

    int year = c.get(c.YEAR);
    int month = c.get(c.MONTH) +1;
    int day = c.get(c.DATE);

    System.out.println(year + "년" + month + "월" + day + "일");
//    System.out.println(week + "요일" + noon);
//    System.out.println(hour + "시" + minute + "분" + second +"초");

  }
}

