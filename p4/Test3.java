package p4;
//calculate commissions
public class Test3 {
	public static void main(String[] args) {
		
		Salesperson s1=new Salesperson();
		System.out.println(s1);
		System.out.println("Total salary of sp= "+s1.calSalary());
		s1.calComm();
		
		Manager m1=new Manager();
		System.out.println(m1);
		System.out.println("Total salary of Mgr= "+m1.calSalary());
		m1.calIncentive();
	}

}
