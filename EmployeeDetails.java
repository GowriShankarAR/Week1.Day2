package week2.Day2;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		
		EmployeeDetails edobject = new EmployeeDetails();
		edobject.printEmployeeName("ARGS", 160);
		edobject.getEmployeeAddress("CBE");
		edobject.printEmployeeSalary(298.00);
		edobject.printEmployeeMobileNumber(989090898);		
		
	}

	public void printEmployeeName(String empName,int empId) {
	System.out.println("empName,empId");
	
	}
	
	public void getEmployeeAddress(String empAddress) {
		System.out.println(empAddress);
		
	}
	
	public void printEmployeeSalary(Double empSalary) {
		System.out.println(empSalary);
	}
	
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println(mobNum);
	}
}
