package paranthesis;

import Reverce_string.Mystack_Reverce;

public class Paranthesis_Demo {
	static char ch;
	static char ch1;
	static char ch2;
	private static boolean isCanPop(char ch2,char ch) {
		boolean flag=false;
		if(ch2=='(' && ch==')')
			flag=true;
		else if(ch2=='[' && ch==']')
			flag=true;
		else if(ch2=='{' && ch=='}')
			flag=true;
		return flag;
	}

	public static void main(String[] args) {
		String a=new String("}{}()[](})");
		boolean flag=true;
		MyStack_paranthesis m=new MyStack_paranthesis(a.length());
		for(int i=0;i<a.length();i++)
		{
			ch=a.charAt(i);
			if(ch=='(' || ch =='[' || ch == '{')
			{
				m.push(ch);
				//ch1=ch;
			}
			else if(ch==')' || ch ==']' || ch == '}')
			{
					ch2=m.pop();
				if(!isCanPop(ch2,ch))
				{
					flag=false;
					System.out.println("char "+ch2+" not match with char "+ch);
					break;
				}
			}
		}
		if(flag==true && m.isEmpty())
			System.out.println("String is balanced");
		else
		{
			System.out.println("String is NOT balanced ");
		}
			

	}

}
