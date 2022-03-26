package programmers.level1;

import java.time.*;

/**
 * TODO 프로그래머스 1LEVEL - 2016년
 */
public class Q_2016년 {
    public String solution(int a, int b) {

        LocalDate date = LocalDate.of(2016, a, b);

        DayOfWeek tmp = date.getDayOfWeek();

        return tmp.toString().substring(0, 3);
    }
}
