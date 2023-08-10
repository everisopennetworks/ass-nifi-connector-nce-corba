package mtnm.tmforum.org.nmsSession;

/**
 * Generated from IDL interface "NmsSession_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NmsSession_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public NmsSession_I value;
	public NmsSession_IHolder()
	{
	}
	public NmsSession_IHolder (final NmsSession_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return NmsSession_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NmsSession_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		NmsSession_IHelper.write (_out,value);
	}
}
