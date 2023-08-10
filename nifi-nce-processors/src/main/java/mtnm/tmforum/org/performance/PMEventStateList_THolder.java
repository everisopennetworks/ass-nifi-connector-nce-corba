package mtnm.tmforum.org.performance;

/**
 * Generated from IDL alias "PMEventStateList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMEventStateList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.performance.PMEventState_T[] value;

	public PMEventStateList_THolder ()
	{
	}
	public PMEventStateList_THolder (final mtnm.tmforum.org.performance.PMEventState_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMEventStateList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMEventStateList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMEventStateList_THelper.write (out,value);
	}
}
