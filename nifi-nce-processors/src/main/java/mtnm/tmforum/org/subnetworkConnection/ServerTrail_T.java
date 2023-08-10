package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "ServerTrail_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ServerTrail_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ServerTrail_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName;
	public boolean isASON;
	public ServerTrail_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] sncName, boolean isASON)
	{
		this.sncName = sncName;
		this.isASON = isASON;
	}
}
