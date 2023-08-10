package mtnm.tmforum.org.performance;

/**
 * Generated from IDL alias "PMPList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMPList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.performance.PMP_T[] value;

	public PMPList_THolder ()
	{
	}
	public PMPList_THolder (final mtnm.tmforum.org.performance.PMP_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMPList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMPList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMPList_THelper.write (out,value);
	}
}
