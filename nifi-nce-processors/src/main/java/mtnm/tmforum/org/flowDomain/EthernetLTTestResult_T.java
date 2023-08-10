package mtnm.tmforum.org.flowDomain;

/**
 * Generated from IDL struct "EthernetLTTestResult_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class EthernetLTTestResult_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public EthernetLTTestResult_T(){}
	public java.lang.String oamPointName = "";
	public int hopNumber;
	public boolean result;
	public EthernetLTTestResult_T(java.lang.String oamPointName, int hopNumber, boolean result)
	{
		this.oamPointName = oamPointName;
		this.hopNumber = hopNumber;
		this.result = result;
	}
}
