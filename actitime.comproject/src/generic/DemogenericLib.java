package generic;

import java.io.IOException;

public class DemogenericLib {
	public static void main(String[]args) throws IOException
	{
		FileLib f=new FileLib();
		String url = f.getpropertydata("url");
		String un = f.getpropertydata("username");
		String pwd = f.getpropertydata("password");
		//String url = f.getpropertydata("url");
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(url);
		f.getpropertydata(url);
		String t = f.getexceldata("CreateCustomer", 1, 2);
		System.out.println(t);
	}
	

}
