import java.util.Scanner;

public class MakeStars {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        while(n.hasNextLine()) {
            Scanner x = new Scanner(n.nextLine());
            String iterationSum = "";
            while(x.hasNext()){
                String current = x.next();
                for(int i = 0; i < current.length();i++){
                    iterationSum += "*";
                }
                if(x.hasNext()){
                    iterationSum += " ";
                }
            }
            System.out.println(iterationSum);
            
        }
    }
}