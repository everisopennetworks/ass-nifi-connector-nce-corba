package mtnm.tmforum.org.topologicalLink;

/**
 * Generated from IDL struct "TopologicalLink_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TopologicalLink_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.topologicalLink.TopologicalLink_T value;

	public TopologicalLink_THolder ()
	{
	}
	public TopologicalLink_THolder(final mtnm.tmforum.org.topologicalLink.TopologicalLink_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.topologicalLink.TopologicalLink_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.topologicalLink.TopologicalLink_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.topologicalLink.TopologicalLink_THelper.write(_out, value);
	}
}
