import java.util.ArrayList;
import java.util.List;

public class Math {

    public static void main(String[] args) {

        List<String> str = new ArrayList<String>();
        str.add("2s");
        str.add("2s");
        str.add("2s");


        String s = str.toString();
        System.out.println(s);

        Math math = new Math();
        math.math();
    }

    public static void math(){
        int a = 2;
        int b = 5;
        int c = a * 2 + b;
        System.out.println(c);
    }


}
