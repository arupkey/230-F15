package submission;

public class Palindrome<T> {
	public char[] array;
	public T[] reversearray;
	
	public boolean isPalindrome(String s) {
		array=s.toCharArray();
		for (int i=0; i<array.length; i++){
			if (array[i]==array[array.length-1-i]){
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
}
}