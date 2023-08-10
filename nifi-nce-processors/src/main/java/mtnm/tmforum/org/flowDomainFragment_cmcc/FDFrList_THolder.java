package mtnm.tmforum.org.flowDomainFragment_cmcc;

/**
 * Generated from IDL alias "FDFrList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FDFrList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_T[] value;

	public FDFrList_THolder ()
	{
	}
	public FDFrList_THolder (final mtnm.tmforum.org.flowDomainFragment_cmcc.FlowDomainFragment_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FDFrList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FDFrList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FDFrList_THelper.write (out,value);
	}
}
