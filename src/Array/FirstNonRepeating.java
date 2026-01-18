//package Array;
//
//import java.util.HashMap;
//import java.util.Map;
//
////abbccd
//public class FirstNonRepeating {
//
//    public static Character FirstNonoRepeatingCharachter(String str){
//
//        Map<Character,Interger> charCounts = new HashMap<>();
//
//
//        for (int i = 0; i < str.length(); i++) {
//
//            char c = str.charAt(i);
//
//            charCounts.put(c, charCounts.getOrDefault(c, 0)+1);
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//
//            char c = str.charAt(i);
//
//            if (charCounts.get(c) == 1){
//                return c;
//            }
//
//        }
//        return null;
//    }
//
//
//}
