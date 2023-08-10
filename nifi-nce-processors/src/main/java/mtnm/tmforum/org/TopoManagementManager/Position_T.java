package mtnm.tmforum.org.TopoManagementManager;

/**
 * Generated from IDL struct "Position_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class Position_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Position_T(){}
	public int xPos;
	public int yPos;
	public Position_T(int xPos, int yPos)
	{
		this.xPos = xPos;
		this.yPos = yPos;
	}
}
