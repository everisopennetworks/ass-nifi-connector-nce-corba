package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL alias "IdlePortAndTSList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class IdlePortAndTSList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.circuitCutMgr.IdlePortAndTS_T[] value;

	public IdlePortAndTSList_THolder ()
	{
	}
	public IdlePortAndTSList_THolder (final mtnm.tmforum.org.circuitCutMgr.IdlePortAndTS_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IdlePortAndTSList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IdlePortAndTSList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IdlePortAndTSList_THelper.write (out,value);
	}
}
