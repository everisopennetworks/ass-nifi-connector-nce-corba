package mtnm.tmforum.org.TopoManagementManager;

/**
 * Generated from IDL interface "TopoMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TopoMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TopoMgr_I value;
	public TopoMgr_IHolder()
	{
	}
	public TopoMgr_IHolder (final TopoMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TopoMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TopoMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TopoMgr_IHelper.write (_out,value);
	}
}
