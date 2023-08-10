package mtnm.tmforum.org.circuitCutMgr;


/**
 * Generated from IDL struct "PrefabSNCCreateData_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PrefabSNCCreateData_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PrefabSNCCreateData_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.PrefabSNCCreateData_THelper.id(),"PrefabSNCCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.circuitCutMgr.ConnectionDirection_THelper.id(),"ConnectionDirection_T",new String[]{"CD_UNI","CD_BI"}), null),new org.omg.CORBA.StructMember("rate", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.circuitCutMgr.SNCRate_THelper.id(),"SNCRate_T",new String[]{"RATE_VC4_4C","RATE_VC4_8C","RATE_VC4_16C","RATE_VC4_64C","RATE_SERVERVC4","RATE_MS","RATE_VC12","RATE_VC3","RATE_VC4"}), null),new org.omg.CORBA.StructMember("serviceTrailInclusions", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ServiceLimitList_THelper.id(), "ServiceLimitList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.ServiceLimit_THelper.id(),"ServiceLimit_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("speciSeriveTrailID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("speciTS", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotListHelper.id(), "TimeSlotList",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.id(), "ObjectIDList",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.type()))), null),new org.omg.CORBA.StructMember("aNe", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null)}))), null),new org.omg.CORBA.StructMember("neInclusions", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.id(), "ObjectIDList",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.type())), null),new org.omg.CORBA.StructMember("neExclusions", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.id(), "ObjectIDList",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.type())), null),new org.omg.CORBA.StructMember("aEndList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.TPInfoList_THelper.id(), "TPInfoList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TPInfo_THelper.id(),"TPInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("NEID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("portInfo", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.PortInfo_THelper.id(),"PortInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("portID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("slotID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null)}), null),new org.omg.CORBA.StructMember("tsInfo", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_THelper.id(),"TimeSlotInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("vc4No", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("timeslots", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotListHelper.id(), "TimeSlotList",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.id(), "ObjectIDList",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.type()))), null)}), null)}))), null),new org.omg.CORBA.StructMember("zEndList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.TPInfoList_THelper.id(), "TPInfoList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TPInfo_THelper.id(),"TPInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("NEID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("portInfo", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.PortInfo_THelper.id(),"PortInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("portID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("slotID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null)}), null),new org.omg.CORBA.StructMember("tsInfo", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_THelper.id(),"TimeSlotInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("vc4No", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("timeslots", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotListHelper.id(), "TimeSlotList",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.id(), "ObjectIDList",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.type()))), null)}), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.circuitCutMgr.PrefabSNCCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.circuitCutMgr.PrefabSNCCreateData_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/circuitCutMgr/PrefabSNCCreateData_T:1.0";
	}
	public static mtnm.tmforum.org.circuitCutMgr.PrefabSNCCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.circuitCutMgr.PrefabSNCCreateData_T result = new mtnm.tmforum.org.circuitCutMgr.PrefabSNCCreateData_T();
		result.direction=mtnm.tmforum.org.circuitCutMgr.ConnectionDirection_THelper.read(in);
		result.rate=mtnm.tmforum.org.circuitCutMgr.SNCRate_THelper.read(in);
		result.serviceTrailInclusions = mtnm.tmforum.org.circuitCutMgr.ServiceLimitList_THelper.read(in);
		result.neInclusions = mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.read(in);
		result.neExclusions = mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.read(in);
		result.aEndList = mtnm.tmforum.org.circuitCutMgr.TPInfoList_THelper.read(in);
		result.zEndList = mtnm.tmforum.org.circuitCutMgr.TPInfoList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.circuitCutMgr.PrefabSNCCreateData_T s)
	{
		mtnm.tmforum.org.circuitCutMgr.ConnectionDirection_THelper.write(out,s.direction);
		mtnm.tmforum.org.circuitCutMgr.SNCRate_THelper.write(out,s.rate);
		mtnm.tmforum.org.circuitCutMgr.ServiceLimitList_THelper.write(out,s.serviceTrailInclusions);
		mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.write(out,s.neInclusions);
		mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.write(out,s.neExclusions);
		mtnm.tmforum.org.circuitCutMgr.TPInfoList_THelper.write(out,s.aEndList);
		mtnm.tmforum.org.circuitCutMgr.TPInfoList_THelper.write(out,s.zEndList);
	}
}
