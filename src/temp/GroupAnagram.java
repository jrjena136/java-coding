package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class GroupAnagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ic = s.nextInt();

        for (int index = 0; index < ic; index++) {
            int numStrings = s.nextInt();
            String[] inputs = new String[numStrings];
            for (int index2 = 0; index2 < numStrings; index2++) {
                inputs[index2] = s.next();
            }
            List<HashSet<String>> anagrams = new ArrayList<HashSet<String>>();
            List<String> covered = new ArrayList<String>();
            for (int i = 0; i < inputs.length; i++) {
                HashSet<String> pqr = new HashSet<String>();
                if (covered.contains(inputs[i])) {
                    continue;
                }
                for (int j = 1; j < inputs.length; j++) {

                    boolean flag = false;
                    if (isAnagram(inputs[i], inputs[j])) {
                        pqr.add(inputs[j]);
                        flag = true;
                    }
                    if (flag) {
                        pqr.add(inputs[i]);
                        covered.add(inputs[i]);
                        covered.add(inputs[j]);
                    }

                }
                if (pqr.size() > 0) {
                    anagrams.add(pqr);
                }

            }
            for (HashSet<String> current : anagrams) {
                System.out.println(current.size());
            }
        }
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] ac = a.toCharArray();
        Arrays.sort(ac);
        char[] bc = b.toCharArray();
        Arrays.sort(bc);
        int pos = 0;
        for (char current : ac) {
            if (current != bc[pos]) {
                return false;
            }
            pos += 1;
        }
        return true;
    }

}
