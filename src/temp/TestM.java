package temp;

import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class TestM {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //String data = "<html><body>Hello \uD83D\uDE04\uD83D\uDE01<br></body></html>";
        //String data = "<html><body>\uD83D\uDE21\uD83D\uDE01\uD83D\uDE0E<br>Thanks &amp; Regards<br>NG</body></html>";
        //System.out.println(data);
//        System.out.println(System.currentTimeMillis() / 1000);
//        java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
//        System.out.println(today.toString());
        int[] A = {1, 2, 3};
        System.out.println(A.length);
        String s = "From my desktop";
        if (s.startsWith("From ")) {
            System.out.println(">From ".concat(s.substring(5, s.length())).concat(System.lineSeparator() + "Hello"));
        } else {
            System.out.println(s);
        }

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list.size());
        list.remove("b");
        System.out.println(list.size());
        
        
        Instant instant = Instant.now();
        Date date = new Date(instant.toEpochMilli());
        System.out.println(date);
        System.out.println(Long.valueOf(instant.toEpochMilli()));
        System.out.println(Long.valueOf(instant.getEpochSecond()));
        System.out.println(Long.valueOf(instant.toEpochMilli()/1000).intValue());
        System.out.println(Long.valueOf(instant.getEpochSecond()).intValue());
        System.out.println(getFormattedLocalDateTime((int)instant.toEpochMilli(), TimeZone.getTimeZone("GMT"), true) + "Z");
        System.out.println(getFormattedLocalDateTime(Long.valueOf(instant.getEpochSecond()), TimeZone.getTimeZone("GMT"), true) + "Z");
        System.out.println(new Date(instant.getEpochSecond() * 1000L));
        System.out.println(Instant.ofEpochMilli(instant.toEpochMilli()));
        System.out.println(Instant.EPOCH);
    }

    public static String getFormattedLocalDateTime(long time, TimeZone tz, boolean useDelim) {
        Calendar cal = new GregorianCalendar(tz, Locale.US);
        cal.setTime(new Date(time));

        DecimalFormat fourDigitFormat = new DecimalFormat("0000");
        DecimalFormat threeDigitFormat = new DecimalFormat("000");
        DecimalFormat twoDigitFormat = new DecimalFormat("00");

        StringBuilder buf = new StringBuilder();

        buf.append(fourDigitFormat.format(cal.get(Calendar.YEAR)));
        if (useDelim) {
            buf.append('-');
        }
        buf.append(twoDigitFormat.format(cal.get(Calendar.MONTH) + 1));
        if (useDelim) {
            buf.append('-');
        }
        buf.append(twoDigitFormat.format(cal.get(Calendar.DATE)));

        buf.append("T");

        buf.append(twoDigitFormat.format(cal.get(Calendar.HOUR_OF_DAY)));
        if (useDelim) {
            buf.append(':');
        }
        buf.append(twoDigitFormat.format(cal.get(Calendar.MINUTE)));
        if (useDelim) {
            buf.append(':');
        }
        buf.append(twoDigitFormat.format(cal.get(Calendar.SECOND)));
        if (useDelim) {
            buf.append('.');
            buf.append(threeDigitFormat.format(cal.get(Calendar.MILLISECOND)));
        }

        return buf.toString();
    }
}
