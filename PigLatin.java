import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args){
        /*
        String[] words = {"the", "check", "skee","emu","grade","*emu", "4chan", 
        "fish!", "fish", "the.", "cat!", "amazing?", "apple%"};

        String[] wordsLatin = { "ethay","eckchay","eeskay", "emuhay","adegray", 
        "*emu", "4chan", "ishfay!", "ishfay", "ethay.", "atcay!", "amazinghay?", "applehay%"};
        for(int i = 0; i < words.length;i++){
            System.out.println(pigLatinBest(words[i]).equals(wordsLatin[i]));
        }
        
        
        String[] characterTests = {"*","a","b","c","."};
        for(int i = 0; i <characterTests.length;i++){
            System.out.println(isChar(characterTests[i],0));
        }
        */
        Scanner n = new Scanner(System.in);
        pigLatinTextBlock(n);
    }
    
    public static String pigLatinSimple(String s) {
        String sCopy = s.toLowerCase();
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
        String sCopy = s.toLowerCase();

        if(sCopy.length() >= 2 && diagraphCheck(sCopy)){
            sCopy = sCopy.substring(2) +sCopy.substring(0,2)+ "ay";
        }
        else{
            sCopy = pigLatinSimple(sCopy);
        }
        
        return sCopy;
        
    }

    public static String pigLatinBest(String s) {
        String sCopy = s.toLowerCase();

        if(isChar(sCopy,0) ){
            return sCopy;
        }
        else if(isChar(sCopy, sCopy.length()-1)){
            char punc = sCopy.charAt(sCopy.length()-1);
            sCopy = sCopy.substring(0,sCopy.length()-1);
            sCopy = pigLatin(sCopy);
            sCopy += punc;
            return sCopy;

        }

        return pigLatin(sCopy);

    }

    //helper functions
    public static boolean diagraphCheck(String s) {
        String[] diagraphs = { "bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl",
                "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr" };

        for (int i = 0; i < diagraphs.length; i++) {
            if (s.substring(0, 2).equals(diagraphs[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean isChar(String s, int i) {
        char checkChar = s.charAt(i);
        return ((checkChar > 122 || checkChar < 65) || (checkChar > 90 && checkChar < 97));
    }

    public static void pigLatinTextBlock(Scanner n){
        while (n.hasNextLine()) {
            Scanner x = new Scanner(n.nextLine());
            String iterationSum = "";
            while (x.hasNext()) {
                String current = x.next();
                iterationSum += pigLatinBest(current);
                if(x.hasNext()){
                    iterationSum += " ";
                }
            }
            System.out.println(iterationSum);

        }
    }

    public static void test(Scanner n){
        while (n.hasNextLine()) {
            Scanner x = new Scanner(n.nextLine());
            String iterationSum = "";
            while (x.hasNext()) {
                String current = x.next();
                iterationSum += current;
                if (x.hasNext()) {
                    iterationSum += " ";
                }
            }
            System.out.println(iterationSum);

        }
    }

}
