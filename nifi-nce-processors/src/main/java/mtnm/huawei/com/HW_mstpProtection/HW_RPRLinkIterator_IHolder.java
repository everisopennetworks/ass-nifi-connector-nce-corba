package mtnm.huawei.com.HW_mstpProtection;

/**
 * Generated from IDL interface "HW_RPRLinkIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_RPRLinkIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public HW_RPRLinkIterator_I value;
	public HW_RPRLinkIterator_IHolder()
	{
	}
	public HW_RPRLinkIterator_IHolder (final HW_RPRLinkIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return HW_RPRLinkIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = HW_RPRLinkIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		HW_RPRLinkIterator_IHelper.write (_out,value);
	}
}
