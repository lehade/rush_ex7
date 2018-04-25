import java.util.ArrayList;
import java.util.Collections;

public class ex7_15 {

    public static void main(String[] args) throws Exception {

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");

        String z = "именно";

        strings.add(1, z);
        strings.add(3, z);
        strings.add(5, z);


        for (String x : strings)
        {
            System.out.println(x);
        }

    }

}