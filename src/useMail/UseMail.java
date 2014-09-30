package useMail;

import java.util.ArrayList;

public class UseMail 
{
	protected String mailServer ;
	protected String from ;
	protected ArrayList<String> to ;
	protected ArrayList<String> mailText ;
	protected ArrayList<String> cc ;
	protected ArrayList<String> bcc ;
	
	
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
	
	
	
	
	
	
	
	
	
	
}
