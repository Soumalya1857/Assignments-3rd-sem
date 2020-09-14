import java.util.*;

class Department
{
	String dcode;
	String dname;
	String location;
	LinkedList<Employee> em;
	
	Department(String dcode, String dname,String location)
	{
		this.dcode = new String(dcode);
		this.dname = new String(dname);
		this.location = new String(location);
		em = new LinkedList<Employee>();
	}
	
	Department()
	{
		this.dcode = new String();
		this.dname = new String();
		this.location = new String();
		em = new LinkedList<Employee>();
	}
	
	void addEmployee()
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the employee name: ");
		String name = ip.nextLine();
		System.out.println("Enter the employee code: ");
		String code = ip.nextLine();
		System.out.println("Enter the employee basic: ");
		int m = ip.nextInt();
		
		Employee e = new Employee(name,code,m,this.dcode);
		em.add(e);
		System.out.println("Employee sucessfully added!!!!");
	}	
}

class Employee
{
	String ecode;
	String ename;
	int basic;
	String dcode;
	
	Employee(String ec, String en, int b, String dc)
	{
		this.ecode = new String(ec);
		this.ename = new String(en);
		basic = b;
		this.dcode = new String(dc);
	}
	
	void getData()
	{
		System.out.println("Employee details:......................................");
		System.out.println("name: " + ecode);
		System.out.println("code: " + ename);
		System.out.println("basic pay: " + basic);
		System.out.println("department code: " + dcode);
	}
}

class Institute
{	
	LinkedList<Department> dpt = new LinkedList<Department>();
	void addDepartment()
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the department name: ");
		String name = ip.nextLine();
		System.out.println("Enter the department code: ");
		String code = ip.nextLine();
		System.out.println("Enter the department location: ");
		String m = ip.nextLine();
		
		Department d = new Department(code,name,m);
		dpt.add(d);
		System.out.println("Department successfully added!!!");
	}
	
	void searchDepartment(String code)
	{
		int flag = 0;
		for(Department d : dpt)
		{
			if(d.ecode.equals(code))
			{
				d.addEmployee();
				flag = 1;
				break;	 
			}
			if(flag == 0) System.out.println("Invalid Department code!! \n You can add department otherwise!!");
		}
	}	
	void start()
	{
		
		
	}
	
}

class s3q1
{
	public static void main(String args[])
	{
				
	}
}











