/*Take complete date from the user in the form of (DD,MM,YYYY) and 
 * Display the date in the form given below: DD/Month-Name/YYYY*/

package com.shariful.nov5.extra_assignment;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Ques06 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format2=new SimpleDateFormat("dd-MMM-yyyy");
		Date date= format1.parse("28/05/1993");
		System.out.println("Date:"+format2.format(date));

	}

}
