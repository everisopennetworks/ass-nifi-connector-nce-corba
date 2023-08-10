package mtnm.tmforum.org.terminationPoint;

/**
 * Generated from IDL alias "TerminationPointList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TerminationPointList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.terminationPoint.TerminationPoint_T[] value;

	public TerminationPointList_THolder ()
	{
	}
	public TerminationPointList_THolder (final mtnm.tmforum.org.terminationPoint.TerminationPoint_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TerminationPointList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TerminationPointList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TerminationPointList_THelper.write (out,value);
	}
}
