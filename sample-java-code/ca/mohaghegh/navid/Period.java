package ca.mohaghegh.navid;

import java.util.Date;


public class Period
{
	private Date start;
	private Date end;
	
	
	/**
	   * @param start beginning of the period.
	   * @param end end of the period; must not precede start. 
	   * @throws IllegalArgumentException if start is after end. 
	   * @throws NullPointerException if start or end is null
	   */
	public Period(Date start, Date end)
	{
		if (!checkPeriod(start, end))
		{
			throw new IllegalArgumentException("start after end");
		}
		this.start = new Date(start.getTime());
	    this.end = new Date(end.getTime());
	}
	
	public Date getStart()
	{
		return new Date(start.getTime());
	}

	public Date getEnd()
	{
		return new Date(end.getTime());
	}

	public void setStart(Date start)
	{
		if (checkPeriod(start, this.end))
		{
			this.start.setTime(start.getTime());
		}
	}

	public void setEnd(Date end)
	{
		if (checkPeriod(this.start, end))
		{
			this.end.setTime(end.getTime());
		}
	}

	private boolean checkPeriod(Date start, Date end)
	{
		if (start.compareTo(end) > 0)
		{
		    return false;
		}
		else
		{
			return true;
		}
	}	
}
