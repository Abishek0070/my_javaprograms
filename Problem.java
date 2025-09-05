import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] arr = new char[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scanner.next().charAt(0);
        }
        for(char f : arr){
            System.out.println(f + " ");
        }
        scanner.close();


}
}
