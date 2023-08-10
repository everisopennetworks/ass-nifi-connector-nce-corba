package mtnm.tmforum.org.maintenanceOps;

/**
 * Generated from IDL struct "TestDuration_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class TestDuration_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public TestDuration_T(){}
	public int value;
	public java.lang.String unit = "";
	public TestDuration_T(int value, java.lang.String unit)
	{
		this.value = value;
		this.unit = unit;
	}
}
