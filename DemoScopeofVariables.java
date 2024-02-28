class Hospital
{
	String patientName;
	int patientid;
	static String DocName="Dr Murthy";
	void sethospital(String pN,int PId)
	{
		patientName=pN;
		patientid=PId;
	}
	String getpatientName()
	{
		return patientName;
	}
	int getpatientid()
	{
		return patientid;
	}
}
public class DemoScopeofVariables
{
	public static void main(String args[])
	{
		String hospitalName="Apollo Hospital";
		Hospital patient1=new Hospital();
		patient1.sethospital("Anitha joseph", 100);
		System.out.println("the patient"+patient1.getpatientName()+"with the id"+patient1.getpatientid()+"is treated by"+patient1.DocName+"at"+hospitalName);
	}
}	
