package mtnm.tmforum.org.performance;

/**
 * Generated from IDL interface "PMStateIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMStateIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public PMStateIterator_I value;
	public PMStateIterator_IHolder()
	{
	}
	public PMStateIterator_IHolder (final PMStateIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PMStateIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMStateIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PMStateIterator_IHelper.write (_out,value);
	}
}
