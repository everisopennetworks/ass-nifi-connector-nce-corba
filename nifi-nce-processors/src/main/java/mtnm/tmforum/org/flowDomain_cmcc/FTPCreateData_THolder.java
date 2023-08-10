package mtnm.tmforum.org.flowDomain_cmcc;

/**
 * Generated from IDL struct "FTPCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FTPCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.flowDomain_cmcc.FTPCreateData_T value;

	public FTPCreateData_THolder ()
	{
	}
	public FTPCreateData_THolder(final mtnm.tmforum.org.flowDomain_cmcc.FTPCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.flowDomain_cmcc.FTPCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.flowDomain_cmcc.FTPCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.flowDomain_cmcc.FTPCreateData_THelper.write(_out, value);
	}
}
