package mtnm.tmforum.org.flowDomain_TI;

/**
 * Generated from IDL alias "FDList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FDList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.flowDomain_TI.FlowDomain_T[] value;

	public FDList_THolder ()
	{
	}
	public FDList_THolder (final mtnm.tmforum.org.flowDomain_TI.FlowDomain_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FDList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FDList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FDList_THelper.write (out,value);
	}
}
