package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL struct "CurrentMaintenanceOperation_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CurrentMaintenanceOperation_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public CurrentMaintenanceOperation_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName;
	public java.lang.String maintenanceOperation = "";
	public short layerRate;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public CurrentMaintenanceOperation_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, java.lang.String maintenanceOperation, short layerRate, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.tpName = tpName;
		this.maintenanceOperation = maintenanceOperation;
		this.layerRate = layerRate;
		this.additionalInfo = additionalInfo;
	}
}
