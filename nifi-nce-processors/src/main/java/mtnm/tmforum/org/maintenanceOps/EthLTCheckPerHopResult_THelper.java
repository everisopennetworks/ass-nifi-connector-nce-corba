package mtnm.tmforum.org.maintenanceOps;


/**
 * Generated from IDL struct "EthLTCheckPerHopResult_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EthLTCheckPerHopResult_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(EthLTCheckPerHopResult_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.maintenanceOps.EthLTCheckPerHopResult_THelper.id(),"EthLTCheckPerHopResult_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("result", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("reason", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("hops", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("replyAction", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forwarded", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("ingressPort", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("ingressMac", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("ingressAction", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("egressPort", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("egressMac", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("egressAction", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.maintenanceOps.EthLTCheckPerHopResult_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.maintenanceOps.EthLTCheckPerHopResult_T extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/maintenanceOps/EthLTCheckPerHopResult_T:1.0";
	}
	public static mtnm.tmforum.org.maintenanceOps.EthLTCheckPerHopResult_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.maintenanceOps.EthLTCheckPerHopResult_T result = new mtnm.tmforum.org.maintenanceOps.EthLTCheckPerHopResult_T();
		result.result=in.read_string();
		result.reason=in.read_string();
		result.hops=in.read_string();
		result.replyAction=in.read_string();
		result.forwarded=in.read_string();
		result.ingressPort = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.ingressMac=in.read_string();
		result.ingressAction=in.read_string();
		result.egressPort = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.egressMac=in.read_string();
		result.egressAction=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.maintenanceOps.EthLTCheckPerHopResult_T s)
	{
		java.lang.String tmpResult456 = s.result;
out.write_string( tmpResult456 );
		java.lang.String tmpResult457 = s.reason;
out.write_string( tmpResult457 );
		java.lang.String tmpResult458 = s.hops;
out.write_string( tmpResult458 );
		java.lang.String tmpResult459 = s.replyAction;
out.write_string( tmpResult459 );
		java.lang.String tmpResult460 = s.forwarded;
out.write_string( tmpResult460 );
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.ingressPort);
		java.lang.String tmpResult461 = s.ingressMac;
out.write_string( tmpResult461 );
		java.lang.String tmpResult462 = s.ingressAction;
out.write_string( tmpResult462 );
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.egressPort);
		java.lang.String tmpResult463 = s.egressMac;
out.write_string( tmpResult463 );
		java.lang.String tmpResult464 = s.egressAction;
out.write_string( tmpResult464 );
	}
}
