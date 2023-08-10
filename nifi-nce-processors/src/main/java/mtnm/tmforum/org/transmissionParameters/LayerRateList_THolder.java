package mtnm.tmforum.org.transmissionParameters;

/**
 * Generated from IDL alias "LayerRateList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class LayerRateList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public short[] value;

	public LayerRateList_THolder ()
	{
	}
	public LayerRateList_THolder (final short[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LayerRateList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LayerRateList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LayerRateList_THelper.write (out,value);
	}
}
