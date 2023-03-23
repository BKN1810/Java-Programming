// "ParameterizedConstructor.java"
class ParameterizedConstructor {
	String languages;
	int year;
	ParameterizedConstructor(String lang,int yr) {
		languages = lang;  
		year=yr;
		System.out.println(languages + " Programming Language "+ "started in "+ year);
	}
	public static void main(String[] args) {
        ParameterizedConstructor obj1 = new ParameterizedConstructor("Java",1995);
		ParameterizedConstructor obj2 = new ParameterizedConstructor("Python",1991);
		ParameterizedConstructor obj3 = new ParameterizedConstructor("C",1972);
   }
}
