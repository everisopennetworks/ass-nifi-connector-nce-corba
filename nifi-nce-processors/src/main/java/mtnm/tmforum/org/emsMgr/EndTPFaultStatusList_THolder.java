package mtnm.tmforum.org.emsMgr;

/**
 * Generated from IDL alias "EndTPFaultStatusList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EndTPFaultStatusList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.emsMgr.EndTPFaultStatus_T[] value;

	public EndTPFaultStatusList_THolder ()
	{
	}
	public EndTPFaultStatusList_THolder (final mtnm.tmforum.org.emsMgr.EndTPFaultStatus_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EndTPFaultStatusList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EndTPFaultStatusList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EndTPFaultStatusList_THelper.write (out,value);
	}
}
