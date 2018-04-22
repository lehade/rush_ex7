import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex7_07 {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();

        list.add("sss");
        list.add("aaa");
        list.add("vvv");
        list.add("bbb");
        list.add("ggg");

        System.out.println(list.size());
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }
}