package practise;

public class ReturnType {

	public static int add(int a,int b) {
		return (a+b);
	}
	public static String shout(String a) {
		return a.toUpperCase();
	}
	public static void main(String args[]) {
		System.out.println("the sum is :"+add(5,5));
		String shouting=shout("yeah i won the match");
		System.out.println(shouting);
		System.out.println(shout("congratulation's vishal"));
		
	}
}
