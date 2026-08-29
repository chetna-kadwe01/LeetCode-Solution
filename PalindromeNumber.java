import java.util.Scanner;
public class palindromeNumber {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rev = 0;
    int org = n;
    while(n>0){
      int digit = n%10;
      rev = rev *10 +digit;
      n = n/10;
    }
    if(org ==rev){
      System.out.println("palindrome number");
    }else{
      System.out.println("No palindrome number");
    }
  }
}
