package mtnm.tmforum.org.flowDomainFragment_cmcc;

/**
 * Generated from IDL alias "MatrixFlowDomainFragmentList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MatrixFlowDomainFragmentList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragment_T[] value;

	public MatrixFlowDomainFragmentList_THolder ()
	{
	}
	public MatrixFlowDomainFragmentList_THolder (final mtnm.tmforum.org.flowDomainFragment_cmcc.MatrixFlowDomainFragment_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MatrixFlowDomainFragmentList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MatrixFlowDomainFragmentList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MatrixFlowDomainFragmentList_THelper.write (out,value);
	}
}
