package test;
public interface Transaction {
	public static final Balance b=new Balance();//NonPrimitive DataType value
	public abstract void process(int amt) throws Exception;
	}
