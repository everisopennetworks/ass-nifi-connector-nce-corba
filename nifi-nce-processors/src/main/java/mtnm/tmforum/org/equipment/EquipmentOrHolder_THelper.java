package mtnm.tmforum.org.equipment;

/**
 * Generated from IDL union "EquipmentOrHolder_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EquipmentOrHolder_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(EquipmentOrHolder_THelper.class)
			{
				if (_type == null)
				{
			org.omg.CORBA.UnionMember[] members = new org.omg.CORBA.UnionMember[2];
			org.omg.CORBA.Any label_any;
			label_any = org.omg.CORBA.ORB.init().create_any ();
			mtnm.tmforum.org.equipment.EquipmentTypeQualifier_THelper.insert(label_any, mtnm.tmforum.org.equipment.EquipmentTypeQualifier_T.EQT);
			members[0] = new org.omg.CORBA.UnionMember ("equip", label_any, mtnm.tmforum.org.equipment.Equipment_THelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			mtnm.tmforum.org.equipment.EquipmentTypeQualifier_THelper.insert(label_any, mtnm.tmforum.org.equipment.EquipmentTypeQualifier_T.EQT_HOLDER);
			members[1] = new org.omg.CORBA.UnionMember ("holder", label_any, mtnm.tmforum.org.equipment.EquipmentHolder_THelper.type(),null);
			 _type = org.omg.CORBA.ORB.init().create_union_tc(id(),"EquipmentOrHolder_T",org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.equipment.EquipmentTypeQualifier_THelper.id(),"EquipmentTypeQualifier_T",new String[]{"EQT","EQT_HOLDER"}), members);
				}
			}
		}
			return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.equipment.EquipmentOrHolder_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.equipment.EquipmentOrHolder_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/equipment/EquipmentOrHolder_T:1.0";
	}
	public static EquipmentOrHolder_T read (org.omg.CORBA.portable.InputStream in)
	{
		EquipmentOrHolder_T result = new EquipmentOrHolder_T();
		mtnm.tmforum.org.equipment.EquipmentTypeQualifier_T disc;
		disc = mtnm.tmforum.org.equipment.EquipmentTypeQualifier_T.from_int(in.read_long());
		switch (disc.value ())
		{
			case mtnm.tmforum.org.equipment.EquipmentTypeQualifier_T._EQT:
			{
				mtnm.tmforum.org.equipment.Equipment_T _var;
				_var=mtnm.tmforum.org.equipment.Equipment_THelper.read(in);
				result.equip (_var);
				break;
			}
			case mtnm.tmforum.org.equipment.EquipmentTypeQualifier_T._EQT_HOLDER:
			{
				mtnm.tmforum.org.equipment.EquipmentHolder_T _var;
				_var=mtnm.tmforum.org.equipment.EquipmentHolder_THelper.read(in);
				result.holder (_var);
				break;
			}
		}
		return result;
	}
	public static void write (org.omg.CORBA.portable.OutputStream out, EquipmentOrHolder_T s)
	{
		out.write_long (s.discriminator().value ());
		switch (s.discriminator().value ())
		{
			case mtnm.tmforum.org.equipment.EquipmentTypeQualifier_T._EQT:
			{
				mtnm.tmforum.org.equipment.Equipment_THelper.write(out,s.equip ());
				break;
			}
			case mtnm.tmforum.org.equipment.EquipmentTypeQualifier_T._EQT_HOLDER:
			{
				mtnm.tmforum.org.equipment.EquipmentHolder_THelper.write(out,s.holder ());
				break;
			}
		}
	}
}
