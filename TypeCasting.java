package assistedproject;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="987654321";
		int b= Integer.parseInt(a);
		System.out.println("Conversion of string to int"+b);
		float c= Float.parseFloat(a);
		System.out.println("Conversion of string to float"+c);
		double d=Double.parseDouble(a);
		System.out.println("Conversion of string to double"+d);
		long e=Long.parseLong(a);
		System.out.println("Conversion of string to long"+e);
		boolean f=Boolean.parseBoolean(a);
		System.out.println("Conversion of string to boolean"+f);
	}

}
