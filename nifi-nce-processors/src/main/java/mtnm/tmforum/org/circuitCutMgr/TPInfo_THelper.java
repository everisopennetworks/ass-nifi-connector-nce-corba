package mtnm.tmforum.org.circuitCutMgr;


/**
 * Generated from IDL struct "TPInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TPInfo_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TPInfo_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TPInfo_THelper.id(),"TPInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("NEID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("portInfo", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.PortInfo_THelper.id(),"PortInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("portID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null),new org.omg.CORBA.StructMember("slotID", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.id(), "ObjectID",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5))), null)}), null),new org.omg.CORBA.StructMember("tsInfo", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_THelper.id(),"TimeSlotInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("vc4No", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("timeslots", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotListHelper.id(), "TimeSlotList",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.id(), "ObjectIDList",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.type()))), null)}), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.circuitCutMgr.TPInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.circuitCutMgr.TPInfo_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/circuitCutMgr/TPInfo_T:1.0";
	}
	public static mtnm.tmforum.org.circuitCutMgr.TPInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.circuitCutMgr.TPInfo_T result = new mtnm.tmforum.org.circuitCutMgr.TPInfo_T();
		result.NEID=in.read_ulong();
		result.portInfo=mtnm.tmforum.org.circuitCutMgr.PortInfo_THelper.read(in);
		result.tsInfo=mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.circuitCutMgr.TPInfo_T s)
	{
		out.write_ulong(s.NEID);
		mtnm.tmforum.org.circuitCutMgr.PortInfo_THelper.write(out,s.portInfo);
		mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_THelper.write(out,s.tsInfo);
	}
}
