package test;
public class Customer {
	public String id,name,mailId,city;
	public long phNo;
	public Customer(String id,String name,String mailId,long phNo,String city) {
		this.id=id;
		this.name=name;
		this.mailId=mailId;
		this.phNo=phNo;
		this.city=city;
	}
	public String toString() {
		return id+"\t"+name+"\t"+mailId+"\t"+phNo+"\t"+city;
	}
	}
