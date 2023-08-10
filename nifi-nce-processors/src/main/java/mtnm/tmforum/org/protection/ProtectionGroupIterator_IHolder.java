package mtnm.tmforum.org.protection;

/**
 * Generated from IDL interface "ProtectionGroupIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProtectionGroupIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ProtectionGroupIterator_I value;
	public ProtectionGroupIterator_IHolder()
	{
	}
	public ProtectionGroupIterator_IHolder (final ProtectionGroupIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ProtectionGroupIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProtectionGroupIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ProtectionGroupIterator_IHelper.write (_out,value);
	}
}
