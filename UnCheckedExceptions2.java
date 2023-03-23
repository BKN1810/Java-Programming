//UnCheckedExceptions2.java
import java.util.ArrayList;
import java.util.Arrays;

class CustomException extends RuntimeException {
	public CustomException(String message) {
			super(message);
	}
}

class UnCheckedExceptions2 {
	ArrayList<String> pls = new ArrayList<>(Arrays.asList("C-Prog","Java", "Python", "C#"));
    public void checkLanguage(String language) {
		if(pls.contains(language)) {
			throw new CustomException(language + " already exists in the PL List.");    			}
		else {
			pls.add(language);
			System.out.println(language + " is added to the Programming Language List."); }
    }

  public static void main(String[] args) {
		UnCheckedExceptions2 uchked = new UnCheckedExceptions2();

        uchked.checkLanguage("Lang");
		uchked.checkLanguage("Dthon");
	}
}