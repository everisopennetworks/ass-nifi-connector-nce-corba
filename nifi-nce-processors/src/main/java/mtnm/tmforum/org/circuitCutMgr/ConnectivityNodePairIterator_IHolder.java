package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL interface "ConnectivityNodePairIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class ConnectivityNodePairIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public ConnectivityNodePairIterator_I value;
	public ConnectivityNodePairIterator_IHolder()
	{
	}
	public ConnectivityNodePairIterator_IHolder (final ConnectivityNodePairIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return ConnectivityNodePairIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConnectivityNodePairIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		ConnectivityNodePairIterator_IHelper.write (_out,value);
	}
}
