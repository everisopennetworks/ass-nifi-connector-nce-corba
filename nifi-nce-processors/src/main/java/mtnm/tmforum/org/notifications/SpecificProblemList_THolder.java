package mtnm.tmforum.org.notifications;

/**
 * Generated from IDL alias "SpecificProblemList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SpecificProblemList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public SpecificProblemList_THolder ()
	{
	}
	public SpecificProblemList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SpecificProblemList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SpecificProblemList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SpecificProblemList_THelper.write (out,value);
	}
}
