package mtnm.tmforum.org.flowDomainFragment_TI;

/**
 * Generated from IDL struct "MatrixFlowDomainFragment_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class MatrixFlowDomainFragment_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.flowDomainFragment_TI.MatrixFlowDomainFragment_T value;

	public MatrixFlowDomainFragment_THolder ()
	{
	}
	public MatrixFlowDomainFragment_THolder(final mtnm.tmforum.org.flowDomainFragment_TI.MatrixFlowDomainFragment_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.flowDomainFragment_TI.MatrixFlowDomainFragment_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.flowDomainFragment_TI.MatrixFlowDomainFragment_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.flowDomainFragment_TI.MatrixFlowDomainFragment_THelper.write(_out, value);
	}
}
