package useMail;

import java.util.ArrayList;

public class UseMail 
{
	protected static String mailServer ;
	protected static String from ;
	protected static ArrayList<String> to ;
	protected static String subJect ;
	protected static ArrayList<String> mailText ;
	protected static ArrayList<String> cc ;
	protected static ArrayList<String> bcc ;
	protected UseMail_Interface use_SMTP ;
	
	public void setMailServer ( String mailServer )
	{
		this.mailServer = mailServer ;
	}
	
	public String getMailServer ()
	{
		return this.mailServer ;
	}
	
	public void setFrom ( String from )
	{
		this.from = from ;
	}
	
	public String getFrom ()
	{
		return this.from ;
	}
	
	public void setTo ( ArrayList<String> to )
	{
		this.to = to ;
	}
	
	public ArrayList<String> getTo ()
	{
		return this.to ;
	}
	
	public void setSubJect ( String subJect )
	{
		this.subJect = subJect ;
	}
	
	public String getSubJect ()
	{
		return this.subJect ;
	}
	
	public void setMailText ( ArrayList<String> mailText )
	{
		this.mailText = mailText ;
	}
	
	public ArrayList<String> getMailText ()
	{
		return this.mailText ;
	}
	
	public void setCC ( ArrayList<String> cc )
	{
		this.cc = cc ;
	}
	
	public ArrayList<String> getCC ()
	{
		return this.cc ;
	}
	
	public void setBCC ( ArrayList<String> bcc )
	{
		this.bcc = bcc ;
	}
	
	public ArrayList<String> getBCC ()
	{
		return this.bcc ;
	}
	
	public void sendMail_SMTP ()
	{
		use_SMTP.sendMail();
	}
}
