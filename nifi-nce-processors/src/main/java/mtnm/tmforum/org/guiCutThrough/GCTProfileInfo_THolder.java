package mtnm.tmforum.org.guiCutThrough;

/**
 * Generated from IDL struct "GCTProfileInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class GCTProfileInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.guiCutThrough.GCTProfileInfo_T value;

	public GCTProfileInfo_THolder ()
	{
	}
	public GCTProfileInfo_THolder(final mtnm.tmforum.org.guiCutThrough.GCTProfileInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.guiCutThrough.GCTProfileInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.guiCutThrough.GCTProfileInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.guiCutThrough.GCTProfileInfo_THelper.write(_out, value);
	}
}
