package mtnm.tmforum.org.protection;

/**
 * Generated from IDL alias "HW_IFProtectionGroupList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_IFProtectionGroupList_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, mtnm.tmforum.org.protection.HW_IFProtectionGroup_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static mtnm.tmforum.org.protection.HW_IFProtectionGroup_T[] extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(HW_IFProtectionGroupList_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.protection.HW_IFProtectionGroupList_THelper.id(), "HW_IFProtectionGroupList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.protection.HW_IFProtectionGroup_THelper.id(),"HW_IFProtectionGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("protectionGroupType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.ProtectionGroupType_THelper.id(),"ProtectionGroupType_T",new String[]{"PGT_MSP_1_PLUS_1","PGT_MSP_1_FOR_N","PGT_2_FIBER_BLSR","PGT_4_FIBER_BLSR"}), null),new org.omg.CORBA.StructMember("protectionSchemeState", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.ProtectionSchemeState_THelper.id(),"ProtectionSchemeState_T",new String[]{"PSS_UNKNOWN","PSS_AUTOMATIC","PSS_FORCED_OR_LOCKED_OUT"}), null),new org.omg.CORBA.StructMember("reversionMode", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.ReversionMode_THelper.id(),"ReversionMode_T",new String[]{"RM_UNKNOWN","RM_NON_REVERTIVE","RM_REVERTIVE"}), null),new org.omg.CORBA.StructMember("rate", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("pgpTPList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("pgpParameters", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/HW_IFProtectionGroupList_T:1.0";
	}
	public static mtnm.tmforum.org.protection.HW_IFProtectionGroup_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		mtnm.tmforum.org.protection.HW_IFProtectionGroup_T[] _result;
		int _l_result167 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result167 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result167);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new mtnm.tmforum.org.protection.HW_IFProtectionGroup_T[_l_result167];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=mtnm.tmforum.org.protection.HW_IFProtectionGroup_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, mtnm.tmforum.org.protection.HW_IFProtectionGroup_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			mtnm.tmforum.org.protection.HW_IFProtectionGroup_THelper.write(_out,_s[i]);
		}

	}
}
