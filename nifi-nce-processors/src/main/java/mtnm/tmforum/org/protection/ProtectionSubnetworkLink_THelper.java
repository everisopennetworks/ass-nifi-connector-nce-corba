package mtnm.tmforum.org.protection;


/**
 * Generated from IDL struct "ProtectionSubnetworkLink_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ProtectionSubnetworkLink_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ProtectionSubnetworkLink_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.protection.ProtectionSubnetworkLink_THelper.id(),"ProtectionSubnetworkLink_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("srcTP", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("snkTP", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("vc4List", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.protection.TSSeq_THelper.id(), "TSSeq_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/protection/ProtectionSubnetworkLink_T:1.0";
	}
	public static mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T result = new mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T();
		result.srcTP = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.snkTP = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.vc4List = mtnm.tmforum.org.protection.TSSeq_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.srcTP);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.snkTP);
		mtnm.tmforum.org.protection.TSSeq_THelper.write(out,s.vc4List);
	}
}
