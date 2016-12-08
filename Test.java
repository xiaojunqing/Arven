import java.text.SimpleDateFormat;

/**
 * Created by xiao.junqing on 2016/11/28.
 */
public class Test {

    public static void main(String args[]) {
//        1478432004919   2016-11-06 19:33:24:919
//        1480300234143   2016-11-28 10:30:34:143
//        1480300233052   2016-11-28 10:30:33:052
//        1480300233717   2016-11-28 10:30:33:717
//        1480300233716   2016-11-28 10:30:33:716
        long a = Long.valueOf("1478432004919").longValue();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

        String aa = formatter.format(a);

        System.out.println(aa);

    }
}
