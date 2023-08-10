package mtnm.tmforum.org.equipment;


/**
 * Generated from IDL struct "EquipmentRoom_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EquipmentRoom_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(EquipmentRoom_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.equipment.EquipmentRoom_THelper.id(),"EquipmentRoom_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("containedCabinet", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("containedNMManager", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("country", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("province", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("city", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("site", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("location", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("cableArrange", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("defendStaticFloor", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("floorHeight", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("memo", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.equipment.EquipmentRoom_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.equipment.EquipmentRoom_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/equipment/EquipmentRoom_T:1.0";
	}
	public static mtnm.tmforum.org.equipment.EquipmentRoom_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.equipment.EquipmentRoom_T result = new mtnm.tmforum.org.equipment.EquipmentRoom_T();
		result.name=in.read_string();
		result.containedCabinet=in.read_string();
		result.containedNMManager=in.read_string();
		result.country=in.read_string();
		result.province=in.read_string();
		result.city=in.read_string();
		result.site=in.read_string();
		result.location=in.read_string();
		result.cableArrange=in.read_string();
		result.defendStaticFloor=in.read_string();
		result.floorHeight=in.read_ushort();
		result.memo=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.equipment.EquipmentRoom_T s)
	{
		java.lang.String tmpResult99 = s.name;
out.write_string( tmpResult99 );
		java.lang.String tmpResult100 = s.containedCabinet;
out.write_string( tmpResult100 );
		java.lang.String tmpResult101 = s.containedNMManager;
out.write_string( tmpResult101 );
		java.lang.String tmpResult102 = s.country;
out.write_string( tmpResult102 );
		java.lang.String tmpResult103 = s.province;
out.write_string( tmpResult103 );
		java.lang.String tmpResult104 = s.city;
out.write_string( tmpResult104 );
		java.lang.String tmpResult105 = s.site;
out.write_string( tmpResult105 );
		java.lang.String tmpResult106 = s.location;
out.write_string( tmpResult106 );
		java.lang.String tmpResult107 = s.cableArrange;
out.write_string( tmpResult107 );
		java.lang.String tmpResult108 = s.defendStaticFloor;
out.write_string( tmpResult108 );
		out.write_ushort(s.floorHeight);
		java.lang.String tmpResult109 = s.memo;
out.write_string( tmpResult109 );
	}
}
