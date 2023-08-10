package mtnm.tmforum.org.equipment;


/**
 * Generated from IDL struct "Shelf_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class Shelf_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(Shelf_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.equipment.Shelf_THelper.id(),"Shelf_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("equipmentRoomName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("cabinetName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("numbering", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("locationOfCabinet", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("memo", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.equipment.Shelf_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.equipment.Shelf_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/equipment/Shelf_T:1.0";
	}
	public static mtnm.tmforum.org.equipment.Shelf_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.equipment.Shelf_T result = new mtnm.tmforum.org.equipment.Shelf_T();
		result.name=in.read_string();
		result.equipmentRoomName=in.read_string();
		result.cabinetName=in.read_string();
		result.numbering=in.read_string();
		result.locationOfCabinet=in.read_string();
		result.memo=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.equipment.Shelf_T s)
	{
		java.lang.String tmpResult116 = s.name;
out.write_string( tmpResult116 );
		java.lang.String tmpResult117 = s.equipmentRoomName;
out.write_string( tmpResult117 );
		java.lang.String tmpResult118 = s.cabinetName;
out.write_string( tmpResult118 );
		java.lang.String tmpResult119 = s.numbering;
out.write_string( tmpResult119 );
		java.lang.String tmpResult120 = s.locationOfCabinet;
out.write_string( tmpResult120 );
		java.lang.String tmpResult121 = s.memo;
out.write_string( tmpResult121 );
	}
}
