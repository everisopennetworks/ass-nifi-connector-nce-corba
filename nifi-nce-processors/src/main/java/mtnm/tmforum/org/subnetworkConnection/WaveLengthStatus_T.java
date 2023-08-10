package mtnm.tmforum.org.subnetworkConnection;

/**
 * Generated from IDL struct "WaveLengthStatus_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class WaveLengthStatus_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public WaveLengthStatus_T(){}
	public java.lang.String frequency = "";
	public short used;
	public short unused;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] addtionalInfo;
	public WaveLengthStatus_T(java.lang.String frequency, short used, short unused, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] addtionalInfo)
	{
		this.frequency = frequency;
		this.used = used;
		this.unused = unused;
		this.addtionalInfo = addtionalInfo;
	}
}
