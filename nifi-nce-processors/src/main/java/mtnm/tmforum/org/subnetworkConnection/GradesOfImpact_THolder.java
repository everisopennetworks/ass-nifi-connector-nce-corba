package mtnm.tmforum.org.subnetworkConnection;
/**
 * Generated from IDL enum "GradesOfImpact_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class GradesOfImpact_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public GradesOfImpact_T value;

	public GradesOfImpact_THolder ()
	{
	}
	public GradesOfImpact_THolder (final GradesOfImpact_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return GradesOfImpact_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GradesOfImpact_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		GradesOfImpact_THelper.write (out,value);
	}
}
