public class PigLatin {
    public static void main(String[] args){
        String[] words = {"the", "check", "skee","emu","grade"};
        String[] wordsLatin = { "ethay","eckchay","eeskay", "emuhay","adegray"};
        for(int i = 0; i < words.length;i++){
            System.out.println(pigLatin(words[i]));
        }
    }
    
    public static String pigLatinSimple(String s) {
        String sCopy = s;
        char[] vowels = {'a','e','i','o','u'};
        for(int i = 0;i<vowels.length;i++) {
            if(s.charAt(0) == vowels[i]) {
                sCopy += "hay";
                return sCopy;
            }
        }

        sCopy = sCopy.substring(1) + sCopy.charAt(0) + "ay";
        return sCopy;

    }

    public static String pigLatin(String s){
        String sCopy = s;

        if(s.length() > 2 && diagraphCheck(s)){
            sCopy = sCopy.substring(0,2) + sCopy.substring(2) + "ay";
        }
        else{
            sCopy = pigLatinSimple(sCopy);
        }
        
        return sCopy;
        
    }

    public static boolean diagraphCheck(String s){
        String[] diagraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", 
        "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", 
        "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};

        for(int i = 0; i < diagraphs.length;i++){
            if(s.substring(0,2).equals(diagraphs[i])){
                return true;
            }
        }
        return false;
    }
}
