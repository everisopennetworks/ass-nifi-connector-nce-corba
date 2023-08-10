package mtnm.tmforum.org.equipment;


/**
 * Generated from IDL struct "EquipmentHolder_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EquipmentHolder_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(EquipmentHolder_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.equipment.EquipmentHolder_THelper.id(),"EquipmentHolder_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("alarmReportingIndicator", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("holderType", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.equipment.EquipmentHolderType_THelper.id(), "EquipmentHolderType_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("expectedOrInstalledEquipment", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("acceptableEquipmentTypeList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.equipment.EquipmentObjectTypeList_THelper.id(), "EquipmentObjectTypeList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.equipment.EquipmentObjectType_THelper.type())), null),new org.omg.CORBA.StructMember("holderState", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.equipment.HolderState_THelper.id(),"HolderState_T",new String[]{"EMPTY","INSTALLED_AND_EXPECTED","EXPECTED_AND_NOT_INSTALLED","INSTALLED_AND_NOT_EXPECTED","MISMATCH_OF_INSTALLED_AND_EXPECTED","UNAVAILABLE","UNKNOWN"}), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.equipment.EquipmentHolder_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.equipment.EquipmentHolder_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/equipment/EquipmentHolder_T:1.0";
	}
	public static mtnm.tmforum.org.equipment.EquipmentHolder_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.equipment.EquipmentHolder_T result = new mtnm.tmforum.org.equipment.EquipmentHolder_T();
		result.name = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.alarmReportingIndicator=in.read_boolean();
		result.holderType=in.read_string();
		result.expectedOrInstalledEquipment = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.acceptableEquipmentTypeList = mtnm.tmforum.org.equipment.EquipmentObjectTypeList_THelper.read(in);
		result.holderState=mtnm.tmforum.org.equipment.HolderState_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.equipment.EquipmentHolder_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.name);
		java.lang.String tmpResult95 = s.userLabel;
out.write_string( tmpResult95 );
		java.lang.String tmpResult96 = s.nativeEMSName;
out.write_string( tmpResult96 );
		java.lang.String tmpResult97 = s.owner;
out.write_string( tmpResult97 );
		out.write_boolean(s.alarmReportingIndicator);
		java.lang.String tmpResult98 = s.holderType;
out.write_string( tmpResult98 );
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.expectedOrInstalledEquipment);
		mtnm.tmforum.org.equipment.EquipmentObjectTypeList_THelper.write(out,s.acceptableEquipmentTypeList);
		mtnm.tmforum.org.equipment.HolderState_THelper.write(out,s.holderState);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
