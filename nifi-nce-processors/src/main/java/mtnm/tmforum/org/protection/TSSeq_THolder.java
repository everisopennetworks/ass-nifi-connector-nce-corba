package mtnm.tmforum.org.protection;

/**
 * Generated from IDL alias "TSSeq_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TSSeq_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public short[] value;

	public TSSeq_THolder ()
	{
	}
	public TSSeq_THolder (final short[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TSSeq_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TSSeq_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TSSeq_THelper.write (out,value);
	}
}
