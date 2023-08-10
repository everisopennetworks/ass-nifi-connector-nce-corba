package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL interface "IPMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class IPMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public IPMgr_I value;
	public IPMgr_IHolder()
	{
	}
	public IPMgr_IHolder (final IPMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return IPMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IPMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		IPMgr_IHelper.write (_out,value);
	}
}
