package mtnm.tmforum.org.guiCutThrough;

/**
 * Generated from IDL alias "GuiCutThroughDataList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class GuiCutThroughDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.guiCutThrough.GuiCutThroughData_T[] value;

	public GuiCutThroughDataList_THolder ()
	{
	}
	public GuiCutThroughDataList_THolder (final mtnm.tmforum.org.guiCutThrough.GuiCutThroughData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return GuiCutThroughDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GuiCutThroughDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		GuiCutThroughDataList_THelper.write (out,value);
	}
}
