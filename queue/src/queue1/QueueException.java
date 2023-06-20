package queue1;

public class QueueException extends RuntimeException{
	private String msg;
	public QueueException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage() 
	{
		return msg;
	}
}
