package mtnm.tmforum.org.emsSessionFactory;

/**
 * Generated from IDL interface "EmsSessionFactory_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EmsSessionFactory_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public EmsSessionFactory_I value;
	public EmsSessionFactory_IHolder()
	{
	}
	public EmsSessionFactory_IHolder (final EmsSessionFactory_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EmsSessionFactory_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EmsSessionFactory_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EmsSessionFactory_IHelper.write (_out,value);
	}
}
