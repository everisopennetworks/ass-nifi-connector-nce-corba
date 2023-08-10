package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL alias "VRRPList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class VRRPList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.ipMgr.VRRPProtection_T[] value;

	public VRRPList_THolder ()
	{
	}
	public VRRPList_THolder (final mtnm.tmforum.org.ipMgr.VRRPProtection_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return VRRPList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = VRRPList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		VRRPList_THelper.write (out,value);
	}
}
