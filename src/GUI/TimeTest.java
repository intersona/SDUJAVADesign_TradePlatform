package GUI;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * java��ʾ����ʱ
 *
 */
public class TimeTest {
    public static int time = 60 * 60 * 60;
    public static Calendar c;
    public static long endTime;
    public static Date date;
    public static long startTime;
    public static long midTime;

    public static void main(String[] args) {
        c = Calendar.getInstance();
        c.set(2020, 4, 26, 0, 0, 0);// ע���·ݵ����ã�0-11��ʾ1-12��
        // c.set(Calendar.YEAR, 2017);
        // c.set(Calendar.MONTH, 4);
        // c.set(Calendar.DAY_OF_MONTH, 17);
        // c.set(Calendar.HOUR_OF_DAY, 0);
        // c.set(Calendar.MINUTE, 0);
        // c.set(Calendar.SECOND, 0);
        endTime = c.getTimeInMillis();
        date = new Date();
        startTime = date.getTime();
        midTime = (endTime - startTime) / 1000;

//         time1();//��ʽһ
//        time2();// ��ʽ��
         System.out.println(time3());;//��ʽ��
    }

    /**
     * ��ʽ���� ʹ��java.util.Timer����е���ʱ
     */
    private static String time3() {
        Timer timer = new Timer();
        String s = null;
        timer.schedule(new TimerTask() {
            public void run() {
                midTime--;
                long hh = midTime / 60 / 60 % 60;
                long mm = midTime / 60 % 60;
                long ss = midTime % 60;
                String s0="��ʣ" + hh + "Сʱ" + mm + "����" + ss + "��";
                System.out.println("��ʣ" + hh + "Сʱ" + mm + "����" + ss + "��");
            }
        }, 0, 1000);
        
        return s;
    }

    /**
     * ��ʽ���� �趨ʱ���������ʱ
     */
    private static String time2() {

        while (midTime > 0) {
            midTime--;
            long hh = midTime / 60 / 60 % 60;
            long mm = midTime / 60 % 60;
            long ss = midTime % 60;
            System.out.println("��ʣ" + hh + "Сʱ" + mm + "����" + ss + "��");
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		return null;
    }

    /**
     * ��ʽһ�� ����ʱ������ʱ
     */
    private static void time1() {
        while (time > 0) {
            time--;
            try {
                Thread.sleep(1000);
                int hh = time / 60 / 60 % 60;
                int mm = time / 60 % 60;
                int ss = time % 60;
                System.out.println("��ʣ" + hh + "Сʱ" + mm + "����" + ss + "��");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
