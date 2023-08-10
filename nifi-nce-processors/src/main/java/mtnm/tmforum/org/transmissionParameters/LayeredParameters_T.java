package mtnm.tmforum.org.transmissionParameters;

/**
 * Generated from IDL struct "LayeredParameters_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class LayeredParameters_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public LayeredParameters_T(){}
	public short layer;
	public mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] transmissionParams;
	public LayeredParameters_T(short layer, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] transmissionParams)
	{
		this.layer = layer;
		this.transmissionParams = transmissionParams;
	}
}
