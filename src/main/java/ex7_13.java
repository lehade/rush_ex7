import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ex7_13 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list_junk = new ArrayList<Integer>();
        ArrayList<Integer> list_2 = new ArrayList<Integer>();
        ArrayList<Integer> list_3 = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 3 == 0)
                list_3.add(x);

            if (x % 2 == 0)
                list_2.add(x);

            if (x % 3 != 0 && x % 2 != 0)
                list_junk.add(x);
        }

        printList(list_3);
        printList(list_2);
        printList(list_junk);
    }


    public static void printList(List<Integer> list) {

        for (Integer x : list) {
            System.out.println(x);
        }

    }
}