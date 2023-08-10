package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL alias "ConnectivityNodePairList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ConnectivityNodePairList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePair_T[] value;

	public ConnectivityNodePairList_THolder ()
	{
	}
	public ConnectivityNodePairList_THolder (final mtnm.tmforum.org.circuitCutMgr.ConnectivityNodePair_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConnectivityNodePairList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConnectivityNodePairList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ConnectivityNodePairList_THelper.write (out,value);
	}
}
