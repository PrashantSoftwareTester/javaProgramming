package wrapperClass;

public class UnBoxing {

	static void test (Object obj) {
		
	switch(obj.getClass().getName()) {
	
	case "Integer":System.out.println(((Integer)obj).intValue());break;
	
	case "Double":System.out.println(((Double)obj).doubleValue());break;
	
	}
}
	
public static void main(String[] args) {
	
	Double d1=new Double(10.02);
	
	Integer i1=new Integer(10);
		
	UnBoxing.test(d1);
	UnBoxing.test(i1);
		
		
		
		
		
		

	}

}
