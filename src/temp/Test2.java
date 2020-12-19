package temp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
//        List<String> collections = new ArrayList<String>();
//        collections.add("DEL.DR1.R1");
//        collections.add("DEL.DR1.R2");
//        collections.add("DEL.DR2.R3");
//        collections.add("MUM.MR1.R4");
//        collections.add("MUM.MR1.R5");
//        Map<String, List<Map<String, List<String>>>> finalMap = new HashMap<String, List<Map<String,List<String>>>>();
//        String[] arr = null;
//        Map<String, List<String>> internal = new HashMap<>();
//        List<Map<String,List<String>>> child = new ArrayList<>();
//        for(String ele : collections) {
//            List<String> subChild = new ArrayList<String>();
//            arr = ele.split("\\.");
//            if (internal.containsKey(arr[1])) {
//                internal.get(arr[1]).add(arr[2]);
//            } else {
//                subChild.add(arr[2]);
//                internal.put(arr[1], subChild);
//            }
//            child.add(internal);
//            if (finalMap.containsKey(arr[0])) {
//                finalMap.get(arr[0]).add(internal);
//            }
//            finalMap.put(arr[0], child);
//        }
//        System.out.println(finalMap);
//        
//       for (Map.Entry<String, List<String>> x : internal.entrySet()) {
//       }
//       long l = Long.MAX_VALUE;
//       Long l1 = Long.MAX_VALUE;
        ClassB var = (ClassB)InterfaceA.getType();
        var.display();
        var.print();
        
    }

}
