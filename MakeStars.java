import java.util.Scanner;

public class MakeStars {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        while(n.hasNextLine()) {
            String starsInCurrentLine = "";
            Scanner x = new Scanner(n.nextLine());
            while(x.hasNext()) {

                for(int i = 0; i < x.next().length(); i ++) {
                    starsInCurrentLine += "*";
                }
                starsInCurrentLine += " ";

            }
        }
    }
}