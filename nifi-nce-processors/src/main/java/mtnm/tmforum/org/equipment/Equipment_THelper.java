package mtnm.tmforum.org.equipment;


/**
 * Generated from IDL struct "Equipment_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class Equipment_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(Equipment_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.equipment.Equipment_THelper.id(),"Equipment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("alarmReportingIndicator", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("serviceState", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.equipment.ServiceState_THelper.id(),"ServiceState_T",new String[]{"IN_SERVICE","OUT_OF_SERVICE","OUT_OF_SERVICE_BY_MAINTENANCE","SERV_NA"}), null),new org.omg.CORBA.StructMember("expectedEquipmentObjectType", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.equipment.EquipmentObjectType_THelper.id(), "EquipmentObjectType_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("installedEquipmentObjectType", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.equipment.EquipmentObjectType_THelper.id(), "EquipmentObjectType_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("installedPartNumber", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("installedVersion", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("installedSerialNumber", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.equipment.Equipment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.equipment.Equipment_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/equipment/Equipment_T:1.0";
	}
	public static mtnm.tmforum.org.equipment.Equipment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.equipment.Equipment_T result = new mtnm.tmforum.org.equipment.Equipment_T();
		result.name = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.alarmReportingIndicator=in.read_boolean();
		result.serviceState=mtnm.tmforum.org.equipment.ServiceState_THelper.read(in);
		result.expectedEquipmentObjectType=in.read_string();
		result.installedEquipmentObjectType=in.read_string();
		result.installedPartNumber=in.read_string();
		result.installedVersion=in.read_string();
		result.installedSerialNumber=in.read_string();
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.equipment.Equipment_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.name);
		java.lang.String tmpResult84 = s.userLabel;
out.write_string( tmpResult84 );
		java.lang.String tmpResult85 = s.nativeEMSName;
out.write_string( tmpResult85 );
		java.lang.String tmpResult86 = s.owner;
out.write_string( tmpResult86 );
		out.write_boolean(s.alarmReportingIndicator);
		mtnm.tmforum.org.equipment.ServiceState_THelper.write(out,s.serviceState);
		java.lang.String tmpResult87 = s.expectedEquipmentObjectType;
out.write_string( tmpResult87 );
		java.lang.String tmpResult88 = s.installedEquipmentObjectType;
out.write_string( tmpResult88 );
		java.lang.String tmpResult89 = s.installedPartNumber;
out.write_string( tmpResult89 );
		java.lang.String tmpResult90 = s.installedVersion;
out.write_string( tmpResult90 );
		java.lang.String tmpResult91 = s.installedSerialNumber;
out.write_string( tmpResult91 );
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
