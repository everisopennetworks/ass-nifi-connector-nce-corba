package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PMTPSelect_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMTPSelect_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PMTPSelect_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public short[] layerRateList;
	public java.lang.String[] pMLocationList;
	public java.lang.String[] granularityList;
	public PMTPSelect_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, short[] layerRateList, java.lang.String[] pMLocationList, java.lang.String[] granularityList)
	{
		this.name = name;
		this.layerRateList = layerRateList;
		this.pMLocationList = pMLocationList;
		this.granularityList = granularityList;
	}
}
