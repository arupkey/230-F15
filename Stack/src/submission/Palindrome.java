package submission;

public class Palindrome<T> {
	public char[] array;
	
	public static boolean isPalindrome(String s){
		char[] array=s.toCharArray();
		int last=array.length-1;
		for (int i=0; i<array.length; i++){
			if (array[i]==array[(last-i)]){
				return true;
			}
		}
		return false;
	}
public static void main(String[] args){
	Palindrome p =new Palindrome();
	System.out.println(p.isPalindrome("amanaplanacanalpanama"));
	System.out.println(p.isPalindrome("2002"));
	System.out.println(p.isPalindrome("racecar"));
	System.out.println(p.isPalindrome("1999"));
}
}