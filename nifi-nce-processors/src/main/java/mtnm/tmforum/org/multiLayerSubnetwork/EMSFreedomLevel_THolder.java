package mtnm.tmforum.org.multiLayerSubnetwork;
/**
 * Generated from IDL enum "EMSFreedomLevel_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EMSFreedomLevel_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public EMSFreedomLevel_T value;

	public EMSFreedomLevel_THolder ()
	{
	}
	public EMSFreedomLevel_THolder (final EMSFreedomLevel_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return EMSFreedomLevel_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EMSFreedomLevel_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		EMSFreedomLevel_THelper.write (out,value);
	}
}
