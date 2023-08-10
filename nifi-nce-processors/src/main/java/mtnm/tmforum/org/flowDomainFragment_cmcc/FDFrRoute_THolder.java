package mtnm.tmforum.org.flowDomainFragment_cmcc;

/**
 * Generated from IDL alias "FDFrRoute_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FDFrRoute_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragment_T[] value;

	public FDFrRoute_THolder ()
	{
	}
	public FDFrRoute_THolder (final mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragment_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FDFrRoute_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FDFrRoute_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FDFrRoute_THelper.write (out,value);
	}
}
