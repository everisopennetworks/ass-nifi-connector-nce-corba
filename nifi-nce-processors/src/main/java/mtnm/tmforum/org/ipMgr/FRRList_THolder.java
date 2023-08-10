package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL alias "FRRList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FRRList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.ipMgr.FRRProtection_T[] value;

	public FRRList_THolder ()
	{
	}
	public FRRList_THolder (final mtnm.tmforum.org.ipMgr.FRRProtection_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FRRList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FRRList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FRRList_THelper.write (out,value);
	}
}
