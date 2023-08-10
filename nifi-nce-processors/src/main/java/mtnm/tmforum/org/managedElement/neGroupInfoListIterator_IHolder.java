package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL interface "neGroupInfoListIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class neGroupInfoListIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public neGroupInfoListIterator_I value;
	public neGroupInfoListIterator_IHolder()
	{
	}
	public neGroupInfoListIterator_IHolder (final neGroupInfoListIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return neGroupInfoListIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = neGroupInfoListIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		neGroupInfoListIterator_IHelper.write (_out,value);
	}
}
