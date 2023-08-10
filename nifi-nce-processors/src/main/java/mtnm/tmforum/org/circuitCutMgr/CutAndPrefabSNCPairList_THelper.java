package mtnm.tmforum.org.circuitCutMgr;

/**
 * Generated from IDL alias "CutAndPrefabSNCPairList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class CutAndPrefabSNCPairList_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPair_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPair_T[] extract (final org.omg.CORBA.Any any)
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
			synchronized(CutAndPrefabSNCPairList_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPairList_THelper.id(), "CutAndPrefabSNCPairList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPair_THelper.id(),"CutAndPrefabSNCPair_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("cutSNC", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_THelper.id(),"SNCBasicInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("rate", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.circuitCutMgr.SNCRate_THelper.id(),"SNCRate_T",new String[]{"RATE_VC4_4C","RATE_VC4_8C","RATE_VC4_16C","RATE_VC4_64C","RATE_SERVERVC4","RATE_MS","RATE_VC12","RATE_VC3","RATE_VC4"}), null),new org.omg.CORBA.StructMember("aEnd", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TPInfo_THelper.id(),"TPInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("NEID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("portInfo", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.PortInfo_THelper.id(),"PortInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("portID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("slotID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null)}), null),new org.omg.CORBA.StructMember("tsInfo", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_THelper.id(),"TimeSlotInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("vc4No", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("timeslots", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotListHelper.id(), "TimeSlotList",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.id(), "ObjectIDList",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.type()))), null)}), null)}), null),new org.omg.CORBA.StructMember("zEnd", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TPInfo_THelper.id(),"TPInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("NEID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("portInfo", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.PortInfo_THelper.id(),"PortInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("portID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("slotID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null)}), null),new org.omg.CORBA.StructMember("tsInfo", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_THelper.id(),"TimeSlotInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("vc4No", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("timeslots", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotListHelper.id(), "TimeSlotList",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.id(), "ObjectIDList",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.type()))), null)}), null)}), null),new org.omg.CORBA.StructMember("SNCType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.circuitCutMgr.SNCTypeQualifier_THelper.id(),"SNCTypeQualifier_T",new String[]{"SNC","PREFAB_SNC"}), null),new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.circuitCutMgr.ConnectionDirection_THelper.id(),"ConnectionDirection_T",new String[]{"CD_UNI","CD_BI"}), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null),new org.omg.CORBA.StructMember("prefabSNC", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.SNCBasicInfo_THelper.id(),"SNCBasicInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("rate", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.circuitCutMgr.SNCRate_THelper.id(),"SNCRate_T",new String[]{"RATE_VC4_4C","RATE_VC4_8C","RATE_VC4_16C","RATE_VC4_64C","RATE_SERVERVC4","RATE_MS","RATE_VC12","RATE_VC3","RATE_VC4"}), null),new org.omg.CORBA.StructMember("aEnd", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TPInfo_THelper.id(),"TPInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("NEID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("portInfo", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.PortInfo_THelper.id(),"PortInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("portID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("slotID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null)}), null),new org.omg.CORBA.StructMember("tsInfo", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_THelper.id(),"TimeSlotInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("vc4No", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("timeslots", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotListHelper.id(), "TimeSlotList",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.id(), "ObjectIDList",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.type()))), null)}), null)}), null),new org.omg.CORBA.StructMember("zEnd", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TPInfo_THelper.id(),"TPInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("NEID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("portInfo", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.PortInfo_THelper.id(),"PortInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("portID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("slotID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null)}), null),new org.omg.CORBA.StructMember("tsInfo", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_THelper.id(),"TimeSlotInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("vc4No", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("timeslots", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotListHelper.id(), "TimeSlotList",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.id(), "ObjectIDList",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.type()))), null)}), null)}), null),new org.omg.CORBA.StructMember("SNCType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.circuitCutMgr.SNCTypeQualifier_THelper.id(),"SNCTypeQualifier_T",new String[]{"SNC","PREFAB_SNC"}), null),new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.circuitCutMgr.ConnectionDirection_THelper.id(),"ConnectionDirection_T",new String[]{"CD_UNI","CD_BI"}), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/circuitCutMgr/CutAndPrefabSNCPairList_T:1.0";
	}
	public static mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPair_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPair_T[] _result;
		int _l_result11 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result11 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result11);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPair_T[_l_result11];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPair_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPair_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			mtnm.tmforum.org.circuitCutMgr.CutAndPrefabSNCPair_THelper.write(_out,_s[i]);
		}

	}
}
