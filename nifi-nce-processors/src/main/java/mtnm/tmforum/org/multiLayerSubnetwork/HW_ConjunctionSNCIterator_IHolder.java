package mtnm.tmforum.org.multiLayerSubnetwork;

/**
 * Generated from IDL interface "HW_ConjunctionSNCIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_ConjunctionSNCIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_ConjunctionSNCIterator_I value;
	public HW_ConjunctionSNCIterator_IHolder()
	{
	}
	public HW_ConjunctionSNCIterator_IHolder (final HW_ConjunctionSNCIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_ConjunctionSNCIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_ConjunctionSNCIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_ConjunctionSNCIterator_IHelper.write (_out,value);
	}
}
