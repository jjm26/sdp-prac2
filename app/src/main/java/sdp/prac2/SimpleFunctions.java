package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    public List<String> Task2(List<String> arrayList){
        List<String> finalList = new ArrayList<String>();
        for(int i =0; i<arrayList.size();i++){
            
           String _currentString = arrayList.get(i);
           if(!_currentString.isEmpty()){
                finalList.add(_currentString.substring(1));
           }

        }
        return finalList;
    }

    public int Task1(List<Integer> a, List<Integer> b) {
        int index = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if (b.get(index) < a.size() - 1 && b.get(index)>-1) {
                sum += a.get(b.get(index));
            }
            index++;
        }
        return sum;
    }
}
