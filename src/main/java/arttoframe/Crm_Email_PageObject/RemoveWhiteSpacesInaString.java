package arttoframe.Crm_Email_PageObject;

public class RemoveWhiteSpacesInaString {

	public static void main(String[] args) {
		{ 
			  { 
			   String str = "  Core Java selenium automation       oops     programming  "; 
			 
			   String strWithoutSpace = str.replaceAll("\\s", ""); 
			 
			   System.out.println(strWithoutSpace); 
			  } 
			 
			 }

	}

}
