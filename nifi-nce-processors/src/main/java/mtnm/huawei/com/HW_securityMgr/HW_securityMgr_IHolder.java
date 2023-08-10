package mtnm.huawei.com.HW_securityMgr;

/**
 * Generated from IDL interface "HW_securityMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_securityMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_securityMgr_I value;
	public HW_securityMgr_IHolder()
	{
	}
	public HW_securityMgr_IHolder (final HW_securityMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_securityMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_securityMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_securityMgr_IHelper.write (_out,value);
	}
}
