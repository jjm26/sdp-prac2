package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    public List<String> tylerfunction(List<String> arrayList){
        List<String> finalList = new ArrayList<String>();
        for(int i =0; i<arrayList.size();i++){
            
           String _currentString = arrayList.get(i);
           if(!_currentString.isEmpty()){
                finalList.add(_currentString.substring(1));
           }

        }
        return finalList;
    }
}
