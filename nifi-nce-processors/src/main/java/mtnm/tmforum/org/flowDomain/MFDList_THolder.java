package mtnm.tmforum.org.flowDomain;

/**
 * Generated from IDL alias "MFDList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MFDList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.flowDomain.MatrixFlowDomain_T[] value;

	public MFDList_THolder ()
	{
	}
	public MFDList_THolder (final mtnm.tmforum.org.flowDomain.MatrixFlowDomain_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MFDList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MFDList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MFDList_THelper.write (out,value);
	}
}
