package emp_sort;

public class Emo_sort_demo {
	static Emp a[]=new Emp[3];
	public static void display() {
		System.out.println("--------------------------------------------");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		System.out.println("--------------------------------------------");
	}
	public static void main(String[] args) {
		
		a[0]=new Emp(1, "a1", 25000);
		a[1]=new Emp(1, "a2", 65000.0045);
		a[2]=new Emp(1, "a3", 65000);
		
		display();
		
		for(int i=0;i<a.length;i++)
		{
			double min=a[i].getSalary();
			int index=i;
			for(int j=i;j<a.length;i++)
			{
				if(min>a[j].getSalary())
				{
					min=a[j].getSalary();
					index=j;
				}
			}
			Emp temp=a[index];
			a[index]=a[i];
			a[i]=temp;
		}
		display();
	}

}
