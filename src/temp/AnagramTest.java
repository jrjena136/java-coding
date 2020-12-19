package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AnagramTest {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no of Strings for input");
        int count = br.read();
        System.out.println("Enter values below:");
        for (int i = 1; i <= count; i++) {
            list.add(br.readLine());
        }
        System.out.println(list);
        br.close();
    }

}
