package mtnm.tmforum.org.flowDomain_cmcc;

/**
 * Generated from IDL interface "MFDIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MFDIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public MFDIterator_I value;
	public MFDIterator_IHolder()
	{
	}
	public MFDIterator_IHolder (final MFDIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return MFDIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MFDIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		MFDIterator_IHelper.write (_out,value);
	}
}
