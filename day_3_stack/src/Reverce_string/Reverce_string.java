package Reverce_string;

public class Reverce_string {
	public static void main(String[] args) {
		String a=new String("India");
		String aa="";
		Mystack_Reverce m=new Mystack_Reverce(a.length());
		for(int i=0;i<a.length();i++)
		{
			m.push(a.charAt(i));
		}
		for(int i=0;i<a.length();i++)
		{
			char ch=m.pop();
			aa=aa+ch;
		}
		System.out.println(aa);
	}
	
}
