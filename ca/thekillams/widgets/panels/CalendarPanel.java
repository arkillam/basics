package ca.thekillams.widgets.panels;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class CalendarPanel extends JPanel
{
	
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

/** the constraints object for the gridbag layout */
private GridBagConstraints gbc;

/** layout manager */
private GridBagLayout gridbag;

private JComboBox cb_month;

private JSpinner js_year;
	
public CalendarPanel ()
{
	setup (new GregorianCalendar ());
}
	
public CalendarPanel (GregorianCalendar cal)
{
	setup (cal);
}

private void setup (GregorianCalendar cal)
{
	gridbag = new GridBagLayout ();
	setLayout (gridbag);
	
	gbc = new GridBagConstraints ();
	gbc.weightx = 0.75;
	gbc.weighty = 0.75;
	gbc.anchor = GridBagConstraints.CENTER;

	setBorder (BorderFactory.createTitledBorder ("Date"));
	
	cb_month = new JComboBox (MONTHS);
	cb_month.setSelectedIndex (cal.get (GregorianCalendar.MONTH));
	gbc.gridx = 0;
	gbc.gridy = 0;
	gbc.gridwidth = 1;
	gbc.gridheight = 1;
	gridbag.setConstraints (cb_month, gbc);
	add (cb_month);
	
	Dimension d = cb_month.getPreferredSize ();
	
	SpinnerNumberModel model = new SpinnerNumberModel (cal.get (GregorianCalendar.YEAR), 0, 9999, 1);
	js_year = new JSpinner (model);
	d.width = js_year.getPreferredSize ().width;
	js_year.setPreferredSize (d);
	gbc.gridx = 1;
	gbc.gridy = 0;
	gbc.gridwidth = 1;
	gbc.gridheight = 1;
	gridbag.setConstraints (js_year, gbc);
	add (js_year);

}

public static void main (String[] args)
{
	JFrame app = new JFrame (CalendarPanel.class.getName () + " Demo");
	app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	app.add (new CalendarPanel ());
	app.pack ();
	app.setVisible (true);
}

}
