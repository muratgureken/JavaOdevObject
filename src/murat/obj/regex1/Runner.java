package murat.obj.regex1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern;
		Scanner scan;
		Matcher matcher;
		String ip;
		boolean durum=true;

		while(durum)
		{
			System.out.println("ip adresi girin");
			scan = new Scanner(System.in);
			ip = scan.nextLine();
			if(ip.equals("E"))
			{
				durum =false;
			}
			
			String ip_address = 
					"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
							"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
							"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
							"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

			pattern = Pattern.compile(ip_address);
			matcher = pattern.matcher(ip);

			if(matcher.matches())
			{
				System.out.println("valid");
			}
			else
			{
				System.out.println("invalid");
			}
		}
		//scan.close();
	}


}
