package mtnm.tmforum.org.equipment;


/**
 * Generated from IDL struct "Cabinet_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class Cabinet_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(Cabinet_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.equipment.Cabinet_THelper.id(),"Cabinet_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("equipmentRoomName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("containedShelfList", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("height", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("width", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("depth", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("voltage", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("powerBoxType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("memo", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.equipment.Cabinet_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.equipment.Cabinet_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/equipment/Cabinet_T:1.0";
	}
	public static mtnm.tmforum.org.equipment.Cabinet_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.equipment.Cabinet_T result = new mtnm.tmforum.org.equipment.Cabinet_T();
		result.name=in.read_string();
		result.equipmentRoomName=in.read_string();
		result.containedShelfList=in.read_string();
		result.type=in.read_string();
		result.height=in.read_ushort();
		result.width=in.read_ushort();
		result.depth=in.read_ushort();
		result.voltage=in.read_long();
		result.powerBoxType=in.read_string();
		result.memo=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.equipment.Cabinet_T s)
	{
		java.lang.String tmpResult110 = s.name;
out.write_string( tmpResult110 );
		java.lang.String tmpResult111 = s.equipmentRoomName;
out.write_string( tmpResult111 );
		java.lang.String tmpResult112 = s.containedShelfList;
out.write_string( tmpResult112 );
		java.lang.String tmpResult113 = s.type;
out.write_string( tmpResult113 );
		out.write_ushort(s.height);
		out.write_ushort(s.width);
		out.write_ushort(s.depth);
		out.write_long(s.voltage);
		java.lang.String tmpResult114 = s.powerBoxType;
out.write_string( tmpResult114 );
		java.lang.String tmpResult115 = s.memo;
out.write_string( tmpResult115 );
	}
}
