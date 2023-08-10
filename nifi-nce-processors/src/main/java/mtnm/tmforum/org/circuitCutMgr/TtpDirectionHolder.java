package mtnm.tmforum.org.circuitCutMgr;
/**
 * Generated from IDL enum "TtpDirection".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TtpDirectionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public TtpDirection value;

	public TtpDirectionHolder ()
	{
	}
	public TtpDirectionHolder (final TtpDirection initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TtpDirectionHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TtpDirectionHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TtpDirectionHelper.write (out,value);
	}
}
