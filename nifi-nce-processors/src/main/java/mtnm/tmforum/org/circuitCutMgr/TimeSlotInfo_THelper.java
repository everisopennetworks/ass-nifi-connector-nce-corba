package mtnm.tmforum.org.circuitCutMgr;


/**
 * Generated from IDL struct "TimeSlotInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TimeSlotInfo_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TimeSlotInfo_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_THelper.id(),"TimeSlotInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("vc4No", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("timeslots", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.TimeSlotListHelper.id(), "TimeSlotList",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.id(), "ObjectIDList",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.circuitCutMgr.ObjectIDHelper.type()))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/circuitCutMgr/TimeSlotInfo_T:1.0";
	}
	public static mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_T result = new mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_T();
		result.vc4No=in.read_ulong();
		result.timeslots = mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.circuitCutMgr.TimeSlotInfo_T s)
	{
		out.write_ulong(s.vc4No);
		mtnm.tmforum.org.circuitCutMgr.ObjectIDListHelper.write(out,s.timeslots);
	}
}
