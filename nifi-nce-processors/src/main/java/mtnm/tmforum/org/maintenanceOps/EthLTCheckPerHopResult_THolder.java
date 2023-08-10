package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL struct "EthLTCheckPerHopResult_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EthLTCheckPerHopResult_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.maintenanceOps.EthLTCheckPerHopResult_T value;

	public EthLTCheckPerHopResult_THolder ()
	{
	}
	public EthLTCheckPerHopResult_THolder(final mtnm.tmforum.org.maintenanceOps.EthLTCheckPerHopResult_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.maintenanceOps.EthLTCheckPerHopResult_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.maintenanceOps.EthLTCheckPerHopResult_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.maintenanceOps.EthLTCheckPerHopResult_THelper.write(_out, value);
	}
}
