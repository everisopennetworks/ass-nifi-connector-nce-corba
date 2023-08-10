package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL alias "ServiceLimitList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServiceLimitList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.circuitCutMgr.ServiceLimit_T[] value;

	public ServiceLimitList_THolder ()
	{
	}
	public ServiceLimitList_THolder (final mtnm.tmforum.org.circuitCutMgr.ServiceLimit_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServiceLimitList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServiceLimitList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServiceLimitList_THelper.write (out,value);
	}
}
