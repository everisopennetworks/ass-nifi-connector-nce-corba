package mtnm.tmforum.org.performance;

/**
 * Generated from IDL interface "PMPIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMPIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public PMPIterator_I value;
	public PMPIterator_IHolder()
	{
	}
	public PMPIterator_IHolder (final PMPIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PMPIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMPIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PMPIterator_IHelper.write (_out,value);
	}
}
