package Client.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestTime {
    public static void main(String[] args) {
        Date day = new Date();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(df.format(day));
        int year, month, date, hour, minute, second;
        Calendar c = Calendar.getInstance();//���Զ�ÿ��ʱ���򵥶��޸� ??
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH) + 1;
        date = c.get(Calendar.DATE);
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);
        second = c.get(Calendar.SECOND);
        System.out.println(year + "/" + month + "/" + date + " " + hour + ":" + minute + ":" + second);
    }
}
