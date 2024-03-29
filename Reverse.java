import java.util.Scanner;

public class Reverse {

 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
  String str = sc.next();
  str = new StringReverse().reverseString(str);
  System.out.println(str);
 }
 public String reverseString(String str) {
  char[] arr = str.toCharArray();
  for (int i = 0, j = str.length() - 1; i < j;) {
   if (alphaNumericCheck(arr[i]) && alphaNumericCheck(arr[j])) {
    char tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
    i++;
    j--;
   }
   else if (!alphaNumericCheck(arr[i])) {
    i++;
   }
   else if (!alphaNumericCheck(arr[j])) {
    j--;
   }

  }
  return String.valueOf(arr);
 }

 public boolean alphaNumericCheck(char ch) {
  if ((ch >= 48 && ch <= 57) // Numeric 0 to 9
    || (ch >= 65 && ch <= 90) // Alphabet A to Z (caps)
    || (ch >= 97 && ch <= 122)) // Alphabet a to z
   return true;
  else
   return false;

 }
}
