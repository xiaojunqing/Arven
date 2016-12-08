import java.math.BigInteger;
import java.util.*;

/**
 * Created by xiao.junqing on 2016/11/29.
 */
public class TestCaseSpec {
    public static void main(String args[]) {
        // 构造hashmap
        HashMap<Long, String> newmap = new HashMap();

        // 给hashmap赋值
        newmap.put(1L, "tutorials");
        newmap.put(2L, "point");
        newmap.put(3L, "is best");

//        System.out.println("Values before remove: "+ newmap);

        // 移除key为2的value
//        newmap.remove(2);

//        System.out.println("Values after remove: "+ newmap);

//        Map<Long, List<BigInteger>> splitBySpecIdMap = splitBySpecId(resourceMap);

//        for (String spec : codeList) {
//            System.out.println("222"+ spec);
//            for (Map.Entry<Long, String> entry : newmap.entrySet()) {
//                System.out.println("1111111111"+ entry.getKey());
//                if (entry.getKey().toString().equals(spec)) {
//                    System.out.println("进来了吗");
//                    newmap.remove(entry.getKey());
//                    System.out.println("Values before remove: "+ newmap);
//                }
//            }
//        }
        String parseCode = "1,3";
        String[] code = parseCode.split(",");
        List<String> codeList = Arrays.asList(code);
        System.out.println("codeList:" + codeList);
        System.out.println("Values before remove: " + newmap);
        Iterator<Map.Entry<Long, String>> iter = newmap.entrySet().iterator();

        while (iter.hasNext()) {

                Long key = iter.next().getKey();
            for (String spec : codeList) {
                System.out.println("key:" + key);
                if (key.toString().equals(spec)) {
                    System.out.println("equals:" + spec);
                    iter.remove();
                    break;
                }
            }
        }
        System.out.println("Values before remove: " + newmap);
    }
}
