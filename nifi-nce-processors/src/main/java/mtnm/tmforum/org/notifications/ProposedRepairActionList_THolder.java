package mtnm.tmforum.org.notifications;

/**
 * Generated from IDL alias "ProposedRepairActionList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ProposedRepairActionList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public ProposedRepairActionList_THolder ()
	{
	}
	public ProposedRepairActionList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ProposedRepairActionList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ProposedRepairActionList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ProposedRepairActionList_THelper.write (out,value);
	}
}
