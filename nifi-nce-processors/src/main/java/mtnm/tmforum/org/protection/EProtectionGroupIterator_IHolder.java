package mtnm.tmforum.org.protection;

/**
 * Generated from IDL interface "EProtectionGroupIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EProtectionGroupIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public EProtectionGroupIterator_I value;
	public EProtectionGroupIterator_IHolder()
	{
	}
	public EProtectionGroupIterator_IHolder (final EProtectionGroupIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EProtectionGroupIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EProtectionGroupIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EProtectionGroupIterator_IHelper.write (_out,value);
	}
}
