package mtnm.tmforum.org.trailNtwProtection;

/**
 * Generated from IDL interface "TrailNtwProtMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TrailNtwProtMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TrailNtwProtMgr_I value;
	public TrailNtwProtMgr_IHolder()
	{
	}
	public TrailNtwProtMgr_IHolder (final TrailNtwProtMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TrailNtwProtMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TrailNtwProtMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TrailNtwProtMgr_IHelper.write (_out,value);
	}
}
