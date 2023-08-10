package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL interface "VRFIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class VRFIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public VRFIterator_I value;
	public VRFIterator_IHolder()
	{
	}
	public VRFIterator_IHolder (final VRFIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return VRFIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = VRFIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		VRFIterator_IHelper.write (_out,value);
	}
}
