package mtnm.tmforum.org.performance;

/**
 * Generated from IDL alias "PMParameterNameList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMParameterNameList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public PMParameterNameList_THolder ()
	{
	}
	public PMParameterNameList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMParameterNameList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMParameterNameList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMParameterNameList_THelper.write (out,value);
	}
}
