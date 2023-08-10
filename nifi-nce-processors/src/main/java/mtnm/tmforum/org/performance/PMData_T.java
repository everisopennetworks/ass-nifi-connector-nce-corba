package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PMData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PMData_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName;
	public short layerRate;
	public java.lang.String granularity = "";
	public java.lang.String retrievalTime = "";
	public mtnm.tmforum.org.performance.PMMeasurement_T[] pmMeasurementList;
	public PMData_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, java.lang.String retrievalTime, mtnm.tmforum.org.performance.PMMeasurement_T[] pmMeasurementList)
	{
		this.tpName = tpName;
		this.layerRate = layerRate;
		this.granularity = granularity;
		this.retrievalTime = retrievalTime;
		this.pmMeasurementList = pmMeasurementList;
	}
}
