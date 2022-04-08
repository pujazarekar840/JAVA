package p4;

public class Test4 {

	public static void main(String[] args) {
		/*Employee e=new Salesperson();
		Salesperson s=(Salesperson) e;//Down Cast
		s.calComm();
		
		Employee e2=new Manager();
		Manager m=(Manager)e2;//Down Cast
		m.calIncentive();
	}
}*/
		
		Employee e=new Manager();
		//RTTI-Run Time Type Identification
		if(e instanceof Salesperson)//Identify type of object
		{
			Salesperson s=(Salesperson) e;//Down Cast
			s.calComm();
		}
		if(e instanceof Manager)
		{
			Manager m=(Manager)e;//Down Cast
			m.calIncentive();
		}
      
	}
}


