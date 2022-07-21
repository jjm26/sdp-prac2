package sdp.prac2;

import java.util.*;

public class SimpleFunctions {

    public boolean SimpleFunctions(String newStr ) {

        LinkedList<Character> check = new LinkedList<Character>();

        for(int i = 0; i < newStr.length() ; i++){ // Traverse through the whole given string

            char unit = newStr.charAt(i);

            if( unit == '[' || unit == '(' || unit == '{'  ){ // Identifying brackets and storing them into a list

                check.add(unit); // add item 

            }

            if(check.size() == 0){
                return false;
            }

            char brack; // used to make sure that they are nested properly 
            switch(unit){ // Implement this code is an assumption that the link is not empty and that there's already an oposite version of that bracket
                case ']':
                    brack = check.pop();
                    if(brack == '(' || brack == '{'){
                        return false; // =or else return true which indicates that we have found a matching bracket
                    }
                    break;

                case ')':
                    brack = check.pop();
                    if(brack == '[' || brack == '{'){
                        return false; // =or else return true which indicates that we have found a matching bracket
                    }
                    break;

                case '}':
                    brack = check.pop();
                    if(brack == '(' || brack == '['){
                        return false; // =or else return true which indicates that we have found a matching bracket
                    }
                    break;


                

            }// If the string does not contain any of the above brackets then none of the open brackets that were added will be poped out, thus to indicate that  brackets are not those brackets are
             //nested correctly and do not have their opposite counter part 

        }


            return check.isEmpty(); // if the check is empty it is an indication that all the brackets haved been checked and do have they opposite counter part

    
    }
}
