package mtnm.tmforum.org.protection;


/**
 * Generated from IDL struct "IPSwitchData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class IPSwitchData_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(IPSwitchData_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.protection.IPSwitchData_THelper.id(),"IPSwitchData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("protectionType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("switchReason", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.SwitchReason_THelper.id(),"SwitchReason_T",new String[]{"SR_NA","SR_RESTORED","SR_SIGNAL_FAIL","SR_SIGNAL_MISMATCH","SR_SIGNAL_DEGRADE","SR_AUTOMATIC_SWITCH","SR_MANUAL"}), null),new org.omg.CORBA.StructMember("layerRate", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("groupName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("protectedList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("switchToList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.protection.IPSwitchData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.protection.IPSwitchData_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/protection/IPSwitchData_T:1.0";
	}
	public static mtnm.tmforum.org.protection.IPSwitchData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.protection.IPSwitchData_T result = new mtnm.tmforum.org.protection.IPSwitchData_T();
		result.protectionType=in.read_string();
		result.switchReason=mtnm.tmforum.org.protection.SwitchReason_THelper.read(in);
		result.layerRate=in.read_short();
		result.groupName = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.protectedList = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.switchToList = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.protection.IPSwitchData_T s)
	{
		java.lang.String tmpResult642 = s.protectionType;
out.write_string( tmpResult642 );
		mtnm.tmforum.org.protection.SwitchReason_THelper.write(out,s.switchReason);
		out.write_short(s.layerRate);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.groupName);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.protectedList);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.switchToList);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
