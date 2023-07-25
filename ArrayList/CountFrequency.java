package ArrayList;

import java.util.*;
import java.util.Collection;

public class CountFrequency {
//    function to Inset the elements in the list
    static void InsertElements(ArrayList<Character> CharList, char c){
        CharList.add(c);
    }
//    function to check frequency of element
    static void FrequencyOfElements(ArrayList<Character> CharList, char c){
        if(CharList.contains(c)){
            System.out.println(Collections.frequency(CharList,c));
        }
        else{
            System.out.println("Not Present");
        }
    }

    }

