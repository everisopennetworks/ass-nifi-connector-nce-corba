package mtnm.tmforum.org.flowDomain_TI;

/**
 * Generated from IDL struct "FDModifyData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FDModifyData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.flowDomain_TI.FDModifyData_T value;

	public FDModifyData_THolder ()
	{
	}
	public FDModifyData_THolder(final mtnm.tmforum.org.flowDomain_TI.FDModifyData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.flowDomain_TI.FDModifyData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.flowDomain_TI.FDModifyData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.flowDomain_TI.FDModifyData_THelper.write(_out, value);
	}
}
