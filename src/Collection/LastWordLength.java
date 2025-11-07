package Collection;

public class LastWordLength {
        public static int lengthOfLastWord(String s) {

            if( s == null || s.isEmpty()){
                return 0;
            }
            String trimmed = s.trim();
            int lastSpaceIndex  = trimmed.lastIndexOf(' ');
            if(lastSpaceIndex == -1){
                return trimmed.length();
            }else{
                return trimmed.length() - lastSpaceIndex - 1;
            }
        }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println(lengthOfLastWord(input));
    }

}
