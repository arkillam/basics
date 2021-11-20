package ca.thekillams.widgets.panels;

import java.awt.GridLayout;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** This class provides a panel which allows the user to select a day, month and year.
 * 
 * <UL>
 * <LI>Version 1.0 - 04/11/2002 - the original instance
 * <LI>Version 1.1 - 01/05/2006 - added a no-parametre constructor, added setup () and getGC () and renmaed the class from panel_date to DatePanel
 * </UL>
 * 
 * @author	Andrew Killam
 * @version	1.1 - 01/05/2006
 */

public class DatePanel extends JPanel
{
	
/////////////////////////////////////////////////////////////
//  private constants
/////////////////////////////////////////////////////////////
	
private static final String MONTHS[] = {
	"January",
	"February",
	"March",
	"April",
	"May",
	"June",
	"July",
	"August",
	"September",
	"October",
	"November",
	"December"};

/////////////////////////////////////////////////////////////
//  private fields
/////////////////////////////////////////////////////////////
	
/** month field */
private JComboBox cb_month;

/** day field */private JTextField tf_day;

/** year field */
private JTextField tf_year;
	
/////////////////////////////////////////////////////////////
//  constructors
/////////////////////////////////////////////////////////////

/**		Creates the date panel without a titled border.
 * 
 *		@since		1.1
 */

public DatePanel ()
{
	setup ("");
}

/**		Creates the date panel with a titled border.
 * 
 *		@param		title		the border title
 * 
 *		@since		1.0
 */

public DatePanel (String title)
{
	setup (title);
}

/////////////////////////////////////////////////////////////
//  methods
/////////////////////////////////////////////////////////////

/**		Returns the specified day.
 * 
 *		@return 		the specified day
 * 
 *		@since		1.0
 */

public int getDay ()
{
	// get the integer value and set it again, to check bounds
	int day = Integer.valueOf (tf_day.getText ()).intValue ();
	setDay (day);
	
	return day;
}

/**		Returns the specified month.
 * 
 * 		@return 		the specified month
 * 
 * 		@since		1.0
 */

public int getMonth ()
{
	return cb_month.getSelectedIndex ();
}

/** 	 Returns the specified year
 * 
 * 		@return 		the specified year
 * 
 * 		@since		1.0
 */

public int getYear ()
{
	return Integer.valueOf (tf_year.getText ()).intValue ();
}

/**		Returns a GregorianCalendar for the selected date.
 * 
 * 		@return		a GregorianCalendar for the selected date
 * 
 * 		@since		1.1
 */

public GregorianCalendar getGC ()
{
	return new GregorianCalendar (getYear (), getMonth (), getDay ());
}

/**		Sets the display to a specified day, month and year.
 * 
 * 		@param		day			the day
 * 		@param		month		the month
 * 		@param		year		the year
 * 
 * 		@since		1.0
 */

public void set (int day, int month, int year)
{
	setYear (year);
	setMonth (month);
	setDay (day);
}

/**  	Sets the displayed day.
 * 
 * 		@param		value		the day
 * 
 * 		@since		1.0
 */

public void setDay (int value)
{
	// create a calendar with the selected year and month
	GregorianCalendar calendar = new GregorianCalendar (getYear (), getMonth () - 1, 1);	
	
	// bounds checking
	if (value < 1) value = 1;
	if (value > calendar.getActualMaximum (Calendar.DAY_OF_MONTH)) value = calendar.getActualMaximum (Calendar.DAY_OF_MONTH);

	// set the value
	tf_day.setText (String.valueOf (value));
}

/**  	Sets the displayed month.
 * 
 * 		@param		value		the month
 * 
 * 		@since		1.0
 */

public void setMonth (int value)
{
	// bounds checking
	if (value < 0) value = 0;
	if (value > 11) value = 11;
	
	cb_month.setSelectedIndex (value);
}

/**  	Sets the displayed year.
 * 
 * 		@param		value		the year
 * 
 * 		@since		1.0
 */

public void setYear (int value)
{
	tf_year.setText (String.valueOf (value));
}

/**		Completes the actual setup work.
 * 
 * 		@param		title		a title to display in the border area
 * 
 * 		@since		1.1
 */

private void setup (String title)
{
	setLayout (new GridLayout (1, 3));
	setBorder (BorderFactory.createTitledBorder (title));
	
	cb_month = new JComboBox (MONTHS);
	add (cb_month);
	
	tf_day = new JTextField ();
	add (tf_day);
	
	tf_year = new JTextField ();
	add (tf_year);
	
}

}