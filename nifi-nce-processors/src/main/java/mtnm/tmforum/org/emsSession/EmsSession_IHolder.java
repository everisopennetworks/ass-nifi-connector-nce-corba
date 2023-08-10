package mtnm.tmforum.org.emsSession;

/**
 * Generated from IDL interface "EmsSession_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EmsSession_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public EmsSession_I value;
	public EmsSession_IHolder()
	{
	}
	public EmsSession_IHolder (final EmsSession_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EmsSession_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EmsSession_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EmsSession_IHelper.write (_out,value);
	}
}
