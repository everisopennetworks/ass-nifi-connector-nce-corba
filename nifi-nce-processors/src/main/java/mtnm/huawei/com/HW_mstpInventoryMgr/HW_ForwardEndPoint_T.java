package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL struct "HW_ForwardEndPoint_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_ForwardEndPoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public HW_ForwardEndPoint_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] logicTPName;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_ForwardEndPoint_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] logicTPName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] paraList, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.logicTPName = logicTPName;
		this.paraList = paraList;
		this.additionalInfo = additionalInfo;
	}
}
