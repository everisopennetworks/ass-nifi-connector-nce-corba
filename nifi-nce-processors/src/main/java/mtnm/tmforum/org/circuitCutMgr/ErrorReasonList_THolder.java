package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL alias "ErrorReasonList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ErrorReasonList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.circuitCutMgr.ErrorReason_T[] value;

	public ErrorReasonList_THolder ()
	{
	}
	public ErrorReasonList_THolder (final mtnm.tmforum.org.circuitCutMgr.ErrorReason_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ErrorReasonList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ErrorReasonList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ErrorReasonList_THelper.write (out,value);
	}
}
