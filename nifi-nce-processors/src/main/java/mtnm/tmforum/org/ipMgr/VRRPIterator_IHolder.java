package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL interface "VRRPIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class VRRPIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public VRRPIterator_I value;
	public VRRPIterator_IHolder()
	{
	}
	public VRRPIterator_IHolder (final VRRPIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return VRRPIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = VRRPIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		VRRPIterator_IHelper.write (_out,value);
	}
}
