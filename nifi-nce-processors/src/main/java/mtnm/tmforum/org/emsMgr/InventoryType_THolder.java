package mtnm.tmforum.org.emsMgr;
/**
 * Generated from IDL enum "InventoryType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class InventoryType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public InventoryType_T value;

	public InventoryType_THolder ()
	{
	}
	public InventoryType_THolder (final InventoryType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return InventoryType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = InventoryType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		InventoryType_THelper.write (out,value);
	}
}
