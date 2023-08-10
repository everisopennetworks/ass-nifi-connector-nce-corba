package mtnm.tmforum.org.protection;

/**
 * Generated from IDL alias "IFSwitchDataList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class IFSwitchDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.protection.IFSwitchData_T[] value;

	public IFSwitchDataList_THolder ()
	{
	}
	public IFSwitchDataList_THolder (final mtnm.tmforum.org.protection.IFSwitchData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return IFSwitchDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IFSwitchDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		IFSwitchDataList_THelper.write (out,value);
	}
}
