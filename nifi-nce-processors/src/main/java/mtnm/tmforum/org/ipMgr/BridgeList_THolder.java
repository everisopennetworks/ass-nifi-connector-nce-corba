package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL alias "BridgeList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class BridgeList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.ipMgr.Bridge_T[] value;

	public BridgeList_THolder ()
	{
	}
	public BridgeList_THolder (final mtnm.tmforum.org.ipMgr.Bridge_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return BridgeList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = BridgeList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		BridgeList_THelper.write (out,value);
	}
}
