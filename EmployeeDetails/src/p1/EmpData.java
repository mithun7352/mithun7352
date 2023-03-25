package p1;
public class EmpData{
	public  String eId,name,desg;
	public int sal;
	public EmpData(String id,String nm,String dg,int sl)
	{
		eId=id;
		name=nm;
		desg=dg;
		sal=sl;
	}
	public String getEmpData()
	{
		return "EId:"+eId+"\nName:"+name+"\nDesg:"+desg+"\nSal:"+sal;
	}
}
