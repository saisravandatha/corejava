package com.capg.corejava.bank;
import com.capg.corejava.bank.StudentBank;
public class StudentInformation extends StudentAccountDetails implements StudentInterface {


		int stuno;double sal;String address;String city;
		//EmployeeInterface methods
		public void studentInfo(int stuno,double sal) throws Exception 
		{
			this.stuno=stuno;
			this.sal=sal;
		}
		public void studentAddress(String address) throws Exception 
		{
			this.address=address;
		}
		public void studentDetails() throws Exception
		{
			System.out.println("Student no :"+stuno);
			System.out.println("Student address :"+address);
			System.out.println("Student sal :"+sal);
			System.out.println("Student city:"+city);
		}
		
			// abstract class method
		public void accountDetails() throws Exception
		{
			System.out.println("My Account:9876");
			System.out.println("Branch:Anna Nagar");
		}
		
		// local method
		public void show() throws Exception 
		{
			System.out.println("Sub class  method");
		}

		public static void main(String[] args)
		{
			try {
	       
				StudentInformation stu=new StudentInformation();
			// abstract class 
			stu.accountDetails();
			stu.BankDetails();
			//interface methods
			stu.studentInfo(100,55000);
			stu.studentAddress("Anna nagar");
			stu.studentDetails();
			//sub class method
			stu.show(); 
			StudentBank sb = new StudentBank();
			StudentBank sb1 = new StudentBank(2,2);
			StudentBank.getBankDetails();
			
			//getBankDetails();
			
			} //try close
			catch(Exception e)
			{
				System.out.println("Exception is handled :"+e);
			}
		}
}

			
			
		

	



