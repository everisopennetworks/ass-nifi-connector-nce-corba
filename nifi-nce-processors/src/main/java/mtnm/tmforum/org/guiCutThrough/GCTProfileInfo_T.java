package mtnm.tmforum.org.guiCutThrough;

/**
 * Generated from IDL struct "GCTProfileInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class GCTProfileInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public GCTProfileInfo_T(){}
	public mtnm.tmforum.org.guiCutThrough.ServerLaunchCapability_T serverLaunchCapability;
	public java.lang.String gctHostname = "";
	public java.lang.String emsGctPlatform = "";
	public mtnm.tmforum.org.guiCutThrough.GuiCutThroughData_T[] guiCutThroughDataList;
	public GCTProfileInfo_T(mtnm.tmforum.org.guiCutThrough.ServerLaunchCapability_T serverLaunchCapability, java.lang.String gctHostname, java.lang.String emsGctPlatform, mtnm.tmforum.org.guiCutThrough.GuiCutThroughData_T[] guiCutThroughDataList)
	{
		this.serverLaunchCapability = serverLaunchCapability;
		this.gctHostname = gctHostname;
		this.emsGctPlatform = emsGctPlatform;
		this.guiCutThroughDataList = guiCutThroughDataList;
	}
}
