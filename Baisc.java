import java.util.Scanner;

public class Baisc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int sum = 0;
        
        for (char ch:str.toCharArray()){
            sum += 1; 
        }
        System.out.println(sum);
        

}
}