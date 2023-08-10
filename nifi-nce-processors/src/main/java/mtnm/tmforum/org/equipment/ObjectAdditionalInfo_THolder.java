package mtnm.tmforum.org.equipment;

/**
 * Generated from IDL struct "ObjectAdditionalInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ObjectAdditionalInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.equipment.ObjectAdditionalInfo_T value;

	public ObjectAdditionalInfo_THolder ()
	{
	}
	public ObjectAdditionalInfo_THolder(final mtnm.tmforum.org.equipment.ObjectAdditionalInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.equipment.ObjectAdditionalInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.equipment.ObjectAdditionalInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.equipment.ObjectAdditionalInfo_THelper.write(_out, value);
	}
}
