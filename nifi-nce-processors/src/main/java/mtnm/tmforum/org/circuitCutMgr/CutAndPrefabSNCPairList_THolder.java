package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL alias "CutAndPrefabSNCPairList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CutAndPrefabSNCPairList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPair_T[] value;

	public CutAndPrefabSNCPairList_THolder ()
	{
	}
	public CutAndPrefabSNCPairList_THolder (final mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPair_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CutAndPrefabSNCPairList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CutAndPrefabSNCPairList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CutAndPrefabSNCPairList_THelper.write (out,value);
	}
}
