public class PigLatin {
    public static void main(String[] args){

    }
    
    public static String pigLatinSimple(String s) {
        String sCopy = s;
        char[] vowels = {'a','e','i','o','u'};
        for(int i = 0;i<vowels.length;i++) {
            if(s.charAt(0) == vowels[i]) {
                s += "hay";
                return sCopy;
            }
        }

        sCopy = sCopy.substring(1) + sCopy.charAt(0) + "ay";
        return sCopy;

    }
}
