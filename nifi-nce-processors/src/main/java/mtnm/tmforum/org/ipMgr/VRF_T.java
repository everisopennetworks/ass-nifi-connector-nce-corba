package mtnm.tmforum.org.ipMgr;

/**
 * Generated from IDL struct "VRF_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class VRF_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public VRF_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String vrfType = "";
	public java.lang.String vrfLabel = "";
	public mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEnd;
	public mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEnd;
	public java.lang.String rdFormat = "";
	public java.lang.String rdAttr = "";
	public java.lang.String[] importRTList;
	public java.lang.String[] exportRTList;
	public mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public VRF_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String vrfType, java.lang.String vrfLabel, mtnm.tmforum.org.subnetworkConnection.TPData_T[] aEnd, mtnm.tmforum.org.subnetworkConnection.TPData_T[] zEnd, java.lang.String rdFormat, java.lang.String rdAttr, java.lang.String[] importRTList, java.lang.String[] exportRTList, mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] transmissionParams, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.vrfType = vrfType;
		this.vrfLabel = vrfLabel;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.rdFormat = rdFormat;
		this.rdAttr = rdAttr;
		this.importRTList = importRTList;
		this.exportRTList = exportRTList;
		this.transmissionParams = transmissionParams;
		this.additionalInfo = additionalInfo;
	}
}
