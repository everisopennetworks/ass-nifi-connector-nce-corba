package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL alias "VRFList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class VRFList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.ipMgr.VRF_T[] value;

	public VRFList_THolder ()
	{
	}
	public VRFList_THolder (final mtnm.tmforum.org.ipMgr.VRF_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return VRFList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = VRFList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		VRFList_THelper.write (out,value);
	}
}
