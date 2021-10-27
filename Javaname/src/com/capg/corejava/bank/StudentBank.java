package com.capg.corejava.bank;

public class StudentBank {
	
	static {
		System.out.println("Welcome ");
     	}
    StudentBank()
    {
    	System.out.println("Student Loan ");
    }
    
    StudentBank(int p,int r)
    {
    	System.out.println(p*r/100);
    }
    
    public final static void getBankDetails() throws Exception 
    {
    	System.out.println("Student Loan in 8%");
    	
    }

}
