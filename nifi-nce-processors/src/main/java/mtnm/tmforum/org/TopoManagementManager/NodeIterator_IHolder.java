package mtnm.tmforum.org.TopoManagementManager;

/**
 * Generated from IDL interface "NodeIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class NodeIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public NodeIterator_I value;
	public NodeIterator_IHolder()
	{
	}
	public NodeIterator_IHolder (final NodeIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return NodeIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NodeIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		NodeIterator_IHelper.write (_out,value);
	}
}
