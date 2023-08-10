package mtnm.tmforum.org.protection;

/**
 * Generated from IDL interface "IPProtectionGroupIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class IPProtectionGroupIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public IPProtectionGroupIterator_I value;
	public IPProtectionGroupIterator_IHolder()
	{
	}
	public IPProtectionGroupIterator_IHolder (final IPProtectionGroupIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return IPProtectionGroupIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = IPProtectionGroupIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		IPProtectionGroupIterator_IHelper.write (_out,value);
	}
}
