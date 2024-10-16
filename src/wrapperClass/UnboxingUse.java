package wrapperClass;

public class UnboxingUse {

	// Static method to test unboxing
	static void test(Object obj) {
		if (obj instanceof Integer) {
			System.out.println(((Integer) obj).intValue());
		} else if (obj instanceof Double) {
			System.out.println(((Double) obj).doubleValue());
		} else {
			System.out.println("Unsupported type");
		}

	}

	public static void main(String[] args) {
		Double d1 = new Double(10.02);
		Integer i1 = new Integer(10);

		UnBoxing.test(d1); // Output: 10.02
		UnBoxing.test(i1); // Output: 10
	}
}
