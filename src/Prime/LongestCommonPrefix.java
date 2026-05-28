package Prime;

public class LongestCommonPrefix {
    public static String longestPrefix(String[]arr){
        if(arr.length == 0){
            return "";
        }
        String prefix = arr[0];
        for(int i = 0; i < arr.length; i++ ){
            while(!arr[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() -1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args){
        String[] words = {"dog","dogrun","doghouse","dograce"};
        String result = longestPrefix(words);
        System.out.println("Longest Common Prefix: " + result);
    }
}
