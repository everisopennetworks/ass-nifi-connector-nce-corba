package mtnm.tmforum.org.equipment;

/**
 * Generated from IDL union "PhysicalLocationInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PhysicalLocationInfo_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PhysicalLocationInfo_THelper.class)
			{
				if (_type == null)
				{
			org.omg.CORBA.UnionMember[] members = new org.omg.CORBA.UnionMember[3];
			org.omg.CORBA.Any label_any;
			label_any = org.omg.CORBA.ORB.init().create_any ();
			mtnm.tmforum.org.equipment.ResourceTypeQualifier_THelper.insert(label_any, mtnm.tmforum.org.equipment.ResourceTypeQualifier_T.EQTROOM);
			members[0] = new org.omg.CORBA.UnionMember ("equipRoom", label_any, mtnm.tmforum.org.equipment.EquipmentRoom_THelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			mtnm.tmforum.org.equipment.ResourceTypeQualifier_THelper.insert(label_any, mtnm.tmforum.org.equipment.ResourceTypeQualifier_T.CABINET);
			members[1] = new org.omg.CORBA.UnionMember ("cabinet_", label_any, mtnm.tmforum.org.equipment.Cabinet_THelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			mtnm.tmforum.org.equipment.ResourceTypeQualifier_THelper.insert(label_any, mtnm.tmforum.org.equipment.ResourceTypeQualifier_T.SHELF);
			members[2] = new org.omg.CORBA.UnionMember ("shelf_", label_any, mtnm.tmforum.org.equipment.Shelf_THelper.type(),null);
			 _type = org.omg.CORBA.ORB.init().create_union_tc(id(),"PhysicalLocationInfo_T",org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.equipment.ResourceTypeQualifier_THelper.id(),"ResourceTypeQualifier_T",new String[]{"EQTROOM","CABINET","SHELF"}), members);
				}
			}
		}
			return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.equipment.PhysicalLocationInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.equipment.PhysicalLocationInfo_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/equipment/PhysicalLocationInfo_T:1.0";
	}
	public static PhysicalLocationInfo_T read (org.omg.CORBA.portable.InputStream in)
	{
		PhysicalLocationInfo_T result = new PhysicalLocationInfo_T();
		mtnm.tmforum.org.equipment.ResourceTypeQualifier_T disc;
		disc = mtnm.tmforum.org.equipment.ResourceTypeQualifier_T.from_int(in.read_long());
		switch (disc.value ())
		{
			case mtnm.tmforum.org.equipment.ResourceTypeQualifier_T._EQTROOM:
			{
				mtnm.tmforum.org.equipment.EquipmentRoom_T _var;
				_var=mtnm.tmforum.org.equipment.EquipmentRoom_THelper.read(in);
				result.equipRoom (_var);
				break;
			}
			case mtnm.tmforum.org.equipment.ResourceTypeQualifier_T._CABINET:
			{
				mtnm.tmforum.org.equipment.Cabinet_T _var;
				_var=mtnm.tmforum.org.equipment.Cabinet_THelper.read(in);
				result.cabinet_ (_var);
				break;
			}
			case mtnm.tmforum.org.equipment.ResourceTypeQualifier_T._SHELF:
			{
				mtnm.tmforum.org.equipment.Shelf_T _var;
				_var=mtnm.tmforum.org.equipment.Shelf_THelper.read(in);
				result.shelf_ (_var);
				break;
			}
		}
		return result;
	}
	public static void write (org.omg.CORBA.portable.OutputStream out, PhysicalLocationInfo_T s)
	{
		out.write_long (s.discriminator().value ());
		switch (s.discriminator().value ())
		{
			case mtnm.tmforum.org.equipment.ResourceTypeQualifier_T._EQTROOM:
			{
				mtnm.tmforum.org.equipment.EquipmentRoom_THelper.write(out,s.equipRoom ());
				break;
			}
			case mtnm.tmforum.org.equipment.ResourceTypeQualifier_T._CABINET:
			{
				mtnm.tmforum.org.equipment.Cabinet_THelper.write(out,s.cabinet_ ());
				break;
			}
			case mtnm.tmforum.org.equipment.ResourceTypeQualifier_T._SHELF:
			{
				mtnm.tmforum.org.equipment.Shelf_THelper.write(out,s.shelf_ ());
				break;
			}
		}
	}
}
