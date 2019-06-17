public class StringManipulator{
    public String trimAndConcat(String str1, String str2){
        String newStr = str1.trim() + str2.trim();
        return newStr;
    }

    public Integer getIndexOrNull(String str1, char letter){
        int index = str1.indexOf(letter);
        if (index == -1)
            return null;
        else 
            return index;
    } 

    public Integer getIndexOrNull(String str1, String str2){
        int index = str1.indexOf(str2);
        if (index == -1)
            return null;
        else 
            return index;
    }
    public String concatSubstring(String str1, int x, int y, String str2){
            String subst = str1.substring(x, y);
            String concat = subst + str2;
            return concat;
    }
}