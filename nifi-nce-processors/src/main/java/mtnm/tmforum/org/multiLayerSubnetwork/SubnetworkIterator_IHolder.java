package mtnm.tmforum.org.multiLayerSubnetwork;

/**
 * Generated from IDL interface "SubnetworkIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class SubnetworkIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public SubnetworkIterator_I value;
	public SubnetworkIterator_IHolder()
	{
	}
	public SubnetworkIterator_IHolder (final SubnetworkIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SubnetworkIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SubnetworkIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SubnetworkIterator_IHelper.write (_out,value);
	}
}
