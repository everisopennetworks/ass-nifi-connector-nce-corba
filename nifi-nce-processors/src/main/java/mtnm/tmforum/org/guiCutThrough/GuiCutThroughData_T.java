package mtnm.tmforum.org.guiCutThrough;

/**
 * Generated from IDL struct "GuiCutThroughData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class GuiCutThroughData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public GuiCutThroughData_T(){}
	public java.lang.String gctScope = "";
	public java.lang.String gctContext = "";
	public java.lang.String gctCommand = "";
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public GuiCutThroughData_T(java.lang.String gctScope, java.lang.String gctContext, java.lang.String gctCommand, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.gctScope = gctScope;
		this.gctContext = gctContext;
		this.gctCommand = gctCommand;
		this.additionalInfo = additionalInfo;
	}
}
