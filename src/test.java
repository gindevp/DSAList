import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class test {
    public static void main(String[] args) {
        List<Double> a= new ArrayList<>();
        a.add(new Double(9));
        a.add(new Double(3));
        a.add(new Double(9));
        out.println(a.get(a.size()/2).toString());
        out.println(3/2);
    }
}
