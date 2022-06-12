package ex1;

import java.util.ArrayList;
import java.util.List;

public class Utils {


    public int getBinarySum(Integer number) {
        String numberInBytes = Integer.toBinaryString(number);

        List<Character> chars = new ArrayList<>();

        for (char ch: numberInBytes.toCharArray()) {
               if(ch == '1') {
                   chars.add(ch);
               }
        }

        return chars.size();





    }
}
