package mtnm.tmforum.org.flowDomain;
/**
 * Generated from IDL enum "ConnectivityRequirement_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ConnectivityRequirement_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ConnectivityRequirement_T value;

	public ConnectivityRequirement_THolder ()
	{
	}
	public ConnectivityRequirement_THolder (final ConnectivityRequirement_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConnectivityRequirement_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConnectivityRequirement_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ConnectivityRequirement_THelper.write (out,value);
	}
}
