package mtnm.tmforum.org.flowDomain;


/**
 * Generated from IDL struct "EthernetOAMOperation_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EthernetOAMOperation_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(EthernetOAMOperation_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.flowDomain.EthernetOAMOperation_THelper.id(),"EthernetOAMOperation_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("command", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.flowDomain.EthernetOAMCommandType_THelper.id(),"EthernetOAMCommandType_T",new String[]{"EOCT_CC","EOCT_LB","EOCT_LT"}), null),new org.omg.CORBA.StructMember("srcPoint", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.flowDomain.EthernetOAMParamer_THelper.id(),"EthernetOAMParamer_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("oamPointName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("period", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)}), null),new org.omg.CORBA.StructMember("snkPoint", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.flowDomain.EthernetOAMParamer_THelper.id(),"EthernetOAMParamer_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("oamPointName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("period", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)}), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.flowDomain.EthernetOAMOperation_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.flowDomain.EthernetOAMOperation_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/flowDomain/EthernetOAMOperation_T:1.0";
	}
	public static mtnm.tmforum.org.flowDomain.EthernetOAMOperation_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.flowDomain.EthernetOAMOperation_T result = new mtnm.tmforum.org.flowDomain.EthernetOAMOperation_T();
		result.command=mtnm.tmforum.org.flowDomain.EthernetOAMCommandType_THelper.read(in);
		result.srcPoint=mtnm.tmforum.org.flowDomain.EthernetOAMParamer_THelper.read(in);
		result.snkPoint=mtnm.tmforum.org.flowDomain.EthernetOAMParamer_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.flowDomain.EthernetOAMOperation_T s)
	{
		mtnm.tmforum.org.flowDomain.EthernetOAMCommandType_THelper.write(out,s.command);
		mtnm.tmforum.org.flowDomain.EthernetOAMParamer_THelper.write(out,s.srcPoint);
		mtnm.tmforum.org.flowDomain.EthernetOAMParamer_THelper.write(out,s.snkPoint);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
