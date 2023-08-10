package mtnm.tmforum.org.terminationPoint;
/**
 * Generated from IDL enum "TPProtectionAssociation_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TPProtectionAssociation_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public TPProtectionAssociation_T value;

	public TPProtectionAssociation_THolder ()
	{
	}
	public TPProtectionAssociation_THolder (final TPProtectionAssociation_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TPProtectionAssociation_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TPProtectionAssociation_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TPProtectionAssociation_THelper.write (out,value);
	}
}
