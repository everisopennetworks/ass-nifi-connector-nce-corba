package mtnm.tmforum.org.encapsulationLayerLink;

/**
 * Generated from IDL struct "ELLinkModifyData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ELLinkModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.encapsulationLayerLink.ELLinkModifyData_T value;

	public ELLinkModifyData_THolder ()
	{
	}
	public ELLinkModifyData_THolder(final mtnm.tmforum.org.encapsulationLayerLink.ELLinkModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.encapsulationLayerLink.ELLinkModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.encapsulationLayerLink.ELLinkModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.encapsulationLayerLink.ELLinkModifyData_THelper.write(_out, value);
	}
}
