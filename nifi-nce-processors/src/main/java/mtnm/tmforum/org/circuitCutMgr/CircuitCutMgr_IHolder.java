package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL interface "CircuitCutMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CircuitCutMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public CircuitCutMgr_I value;
	public CircuitCutMgr_IHolder()
	{
	}
	public CircuitCutMgr_IHolder (final CircuitCutMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CircuitCutMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CircuitCutMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CircuitCutMgr_IHelper.write (_out,value);
	}
}
