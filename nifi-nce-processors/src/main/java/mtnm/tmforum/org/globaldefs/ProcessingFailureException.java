package mtnm.tmforum.org.globaldefs;

/**
 * Generated from IDL exception "ProcessingFailureException".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProcessingFailureException
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ProcessingFailureException()
	{
		super(mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.id());
	}

	public mtnm.tmforum.org.globaldefs.ExceptionType_T exceptionType;
	public java.lang.String errorReason = "";
	public ProcessingFailureException(java.lang.String _reason,mtnm.tmforum.org.globaldefs.ExceptionType_T exceptionType, java.lang.String errorReason)
	{
		super(_reason);
		this.exceptionType = exceptionType;
		this.errorReason = errorReason;
	}
	public ProcessingFailureException(mtnm.tmforum.org.globaldefs.ExceptionType_T exceptionType, java.lang.String errorReason)
	{
		super(mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.id());
		this.exceptionType = exceptionType;
		this.errorReason = errorReason;
	}
}
