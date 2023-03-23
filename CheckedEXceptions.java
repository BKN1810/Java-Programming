//CheckedEXceptions.java
import java.util.ArrayList;
import java.util.Arrays;

class CustomException extends Exception {
	public CustomException(){}
	public CustomException(String message) {
		super(message);	 }
}

class CheckedEXceptions {
	ArrayList<String> pls = new ArrayList<>(Arrays.asList("C-Prog","Java", "Python", "C#"));
    public void checkLanguage(String language) throws CustomException {
		if(pls.contains(language)) {
			throw new CustomException(language + " already exists in the PL List.");    			}
		else {
			pls.add(language);
			System.out.println(language + " is added to the Programming Language List."); }
	}

	public static void main(String[] args) {
		CheckedEXceptions chked = new CheckedEXceptions();
		try {
			chked.checkLanguage("GOLang");
			chked.checkLanguage("Python");
		}
		catch(CustomException e) {
				System.out.println("[" + e + "] Exception Occured.");
    }
  }
}