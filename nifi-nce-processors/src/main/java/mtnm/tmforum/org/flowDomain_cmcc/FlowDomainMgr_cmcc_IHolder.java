package mtnm.tmforum.org.flowDomain_cmcc;

/**
 * Generated from IDL interface "FlowDomainMgr_cmcc_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FlowDomainMgr_cmcc_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public FlowDomainMgr_cmcc_I value;
	public FlowDomainMgr_cmcc_IHolder()
	{
	}
	public FlowDomainMgr_cmcc_IHolder (final FlowDomainMgr_cmcc_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FlowDomainMgr_cmcc_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FlowDomainMgr_cmcc_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FlowDomainMgr_cmcc_IHelper.write (_out,value);
	}
}
