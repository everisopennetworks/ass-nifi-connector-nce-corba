package mtnm.tmforum.org.performance;

/**
 * Generated from IDL struct "PMParameter_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class PMParameter_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public PMParameter_T(){}
	public java.lang.String pmParameterName = "";
	public java.lang.String pmLocation = "";
	public PMParameter_T(java.lang.String pmParameterName, java.lang.String pmLocation)
	{
		this.pmParameterName = pmParameterName;
		this.pmLocation = pmLocation;
	}
}
