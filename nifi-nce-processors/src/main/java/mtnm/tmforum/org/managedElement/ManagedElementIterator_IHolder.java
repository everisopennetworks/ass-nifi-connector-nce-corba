package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL interface "ManagedElementIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ManagedElementIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ManagedElementIterator_I value;
	public ManagedElementIterator_IHolder()
	{
	}
	public ManagedElementIterator_IHolder (final ManagedElementIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ManagedElementIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ManagedElementIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ManagedElementIterator_IHelper.write (_out,value);
	}
}
