package in.gagan.beans;

import gagan.it.Security.PasswordService;

public class CustomerService {
	public void saveCustomer(String uname,String pwd,Long phn) {
		
		PasswordService service=new PasswordService();
		String encodePwd=service.encodePwd(pwd);
		System.out.println("Encoded pwd::"+encodePwd);	
	}
	public static void main(String[] args) {
		CustomerService cts=new CustomerService();
		cts.saveCustomer("Gagan","gmuduli145@gmail.com", 36597l);
	}

}
