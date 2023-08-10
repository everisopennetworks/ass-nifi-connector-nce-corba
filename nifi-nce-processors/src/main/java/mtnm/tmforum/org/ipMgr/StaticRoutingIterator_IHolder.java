package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL interface "StaticRoutingIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class StaticRoutingIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public StaticRoutingIterator_I value;
	public StaticRoutingIterator_IHolder()
	{
	}
	public StaticRoutingIterator_IHolder (final StaticRoutingIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return StaticRoutingIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StaticRoutingIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		StaticRoutingIterator_IHelper.write (_out,value);
	}
}
