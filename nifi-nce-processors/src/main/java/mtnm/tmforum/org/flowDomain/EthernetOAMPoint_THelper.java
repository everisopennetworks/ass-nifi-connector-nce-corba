package mtnm.tmforum.org.flowDomain;


/**
 * Generated from IDL struct "EthernetOAMPoint_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EthernetOAMPoint_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(EthernetOAMPoint_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.flowDomain.EthernetOAMPoint_THelper.id(),"EthernetOAMPoint_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("Name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.flowDomain.EthernetOAMPointType_THelper.id(),"EthernetOAMPointType_T",new String[]{"EOT_MEP","EOP_MIP"}), null),new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.flowDomain.EthernetOAMPointDirection_THelper.id(),"EthernetOAMPointDirection_T",new String[]{"EOPD_BI","EOPD_INGRESS","EOPD_EGRESS"}), null),new org.omg.CORBA.StructMember("level", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.flowDomain.EthernetOAMPoint_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.flowDomain.EthernetOAMPoint_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/flowDomain/EthernetOAMPoint_T:1.0";
	}
	public static mtnm.tmforum.org.flowDomain.EthernetOAMPoint_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.flowDomain.EthernetOAMPoint_T result = new mtnm.tmforum.org.flowDomain.EthernetOAMPoint_T();
		result.Name=in.read_string();
		result.type=mtnm.tmforum.org.flowDomain.EthernetOAMPointType_THelper.read(in);
		result.direction=mtnm.tmforum.org.flowDomain.EthernetOAMPointDirection_THelper.read(in);
		result.level=in.read_ulong();
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.flowDomain.EthernetOAMPoint_T s)
	{
		java.lang.String tmpResult153 = s.Name;
out.write_string( tmpResult153 );
		mtnm.tmforum.org.flowDomain.EthernetOAMPointType_THelper.write(out,s.type);
		mtnm.tmforum.org.flowDomain.EthernetOAMPointDirection_THelper.write(out,s.direction);
		out.write_ulong(s.level);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
