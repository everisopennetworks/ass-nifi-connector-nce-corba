package mtnm.tmforum.org.managedElement;

/**
 * Generated from IDL struct "ManagedElement_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ManagedElement_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ManagedElement_T(){}
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public java.lang.String location = "";
	public java.lang.String version = "";
	public java.lang.String productName = "";
	public mtnm.tmforum.org.managedElement.CommunicationState_T communicationState;
	public boolean emsInSyncState;
	public short[] supportedRates;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo;
	public ManagedElement_T(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, java.lang.String location, java.lang.String version, java.lang.String productName, mtnm.tmforum.org.managedElement.CommunicationState_T communicationState, boolean emsInSyncState, short[] supportedRates, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.location = location;
		this.version = version;
		this.productName = productName;
		this.communicationState = communicationState;
		this.emsInSyncState = emsInSyncState;
		this.supportedRates = supportedRates;
		this.additionalInfo = additionalInfo;
	}
}
