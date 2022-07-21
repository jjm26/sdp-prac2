package sdp.prac2;

import java.util.*;

public class SimpleFunctions {

    public static boolean mySort(List<Integer> ListOfIntegers){
        for (int i = 0; i < ListOfIntegers.size() -1; i ++){
            if (ListOfIntegers.indexOf(i) > ListOfIntegers.indexOf(i +1)){
                return false;
            }
        }

        return true;
    }
}
