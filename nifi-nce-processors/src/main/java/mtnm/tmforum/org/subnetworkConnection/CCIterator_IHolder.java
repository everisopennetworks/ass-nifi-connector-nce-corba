package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL interface "CCIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CCIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public CCIterator_I value;
	public CCIterator_IHolder()
	{
	}
	public CCIterator_IHolder (final CCIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CCIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CCIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CCIterator_IHelper.write (_out,value);
	}
}
