package mtnm.tmforum.org.guiCutThrough;

/**
 * Generated from IDL interface "GuiCutThroughMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class GuiCutThroughMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public GuiCutThroughMgr_I value;
	public GuiCutThroughMgr_IHolder()
	{
	}
	public GuiCutThroughMgr_IHolder (final GuiCutThroughMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return GuiCutThroughMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GuiCutThroughMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		GuiCutThroughMgr_IHelper.write (_out,value);
	}
}
