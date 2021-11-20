package ca.thekillams.widgets.utilities;

/** 
 * Provides number-related functions.
 * 
 * <UL>
 * <LI>Version 1.0 - 09/30/2004 - the original class
 * <LI>Version 1.1 - 03/23/2005 - improved convertRoman () and renamed from utility_numbers to NumbersUtility
 * </UL>
 * 
 * @author	Andrew Killam
 * @version	1.1 - 03/23/2005
 */

public class NumbersUtility
{
	
/**		Converts an integer to a Roman-style one.
 * 
 * 		@param		number	the integer to conver
 * 
 * 		@return	the Roman-style representation or null if an error occurs
 * 
 * 		@since		1.0
 */

public static String convertRoman (int number)
{
	String rc = "";
	
	if (number >= 1000)
	{
		rc = "M" + convertRoman (number - 1000);
	}
	else if (number >= 500)
	{
		rc = "D" + convertRoman (number - 500);
	}
	else if (number >= 100)
	{
		rc = "C" + convertRoman (number - 100);
	}
	else if (number >= 50)
	{
		rc = "L" + convertRoman (number - 50);
	}
	else if (number >= 10)
	{
		rc = "X" + convertRoman (number - 10);
	}
	else if (number >= 5)
	{
		rc = "V" + convertRoman (number - 5);
	}
	else if (number >= 1)
	{
		rc = "I" + convertRoman (number - 1);
	}

	return rc;

	// TODO:  improve!
	/*
	 * 1 = 1
	 * 5 = V
	 * 10 = X
	 * 50 = L
	 * 100 = C
	 * 500 = D
	 * 1000 = M
	 * a horizontal line above a Roman number means multiply it by 1000
	
	// if necessary, append a version number to the name
	if (number == 1)				return "I";
	else if (number == 2)			return "II";
	else if (number == 3)			return "III";
	else if (number == 4)			return "IV";
	else if (number == 5)			return "V";
	else if (number == 6)			return "VI";
	else if (number == 7)			return "VII";
	else if (number == 8)			return "VIII";
	else if (number == 9)			return "IX";
	else if (number == 10)			return "X";
	
	// 11 through 20 is 1 through 10 with a leading X :)
	else if ((number > 10) && (number <= 20))
	return "X" + convertRoman (number - 10);
	
	else return null;
	
	*/
}

public static void main (String args[])
{
	int x[] = {1001, 751, 501, 251, 125, 99, 51, 26, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
	for (int i = 0; i < x.length; i++)
	{
		String a = String.valueOf (x[i]);
		String b = convertRoman (x[i]);
		System.out.println (a + " = " + b);
	}
}

}
