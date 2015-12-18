package submission;

import java.util.Arrays;

public class Palindrome<T> {
	public char[] array;
	
	public static boolean isPalindrome(String s){
		char[] forwards=s.toCharArray();
		int size=forwards.length;
		char[] backwards=Arrays.copyOfRange(forwards, 0, size);
		for (int i=0; i<size; i++){
			if (forwards[i]==backwards[(size-1-i)]){
				return true;
			}
			return false;
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