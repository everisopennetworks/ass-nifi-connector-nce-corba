package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PMState_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PMState_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName;
	public short layerRate;
	public java.lang.String granularity = "";
	public mtnm.tmforum.org.performance.PMEventState_T[] pmEventStateList;
	public PMState_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, mtnm.tmforum.org.performance.PMEventState_T[] pmEventStateList)
	{
		this.tpName = tpName;
		this.layerRate = layerRate;
		this.granularity = granularity;
		this.pmEventStateList = pmEventStateList;
	}
}
