package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL struct "HW_MSTPBindingPath_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_MSTPBindingPath_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_MSTPBindingPath_T(){}
	public mtnm.tmforum.org.terminationPoint.Directionality_T direction;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] allPathList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] usedPathList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_MSTPBindingPath_T(mtnm.tmforum.org.terminationPoint.Directionality_T direction, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] allPathList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] usedPathList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.direction = direction;
		this.allPathList = allPathList;
		this.usedPathList = usedPathList;
		this.additionalInfo = additionalInfo;
	}
}
