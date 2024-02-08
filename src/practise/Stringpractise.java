package practise;

public class Stringpractise {
	public static String clientinfo(String name,int age) {
		System.out.println(name + " is " + age +" years old");
		return name;
	}
	public static void main(String []args) {
		clientinfo("vishal",22);
		clientinfo("harsh",25);
	}
}
