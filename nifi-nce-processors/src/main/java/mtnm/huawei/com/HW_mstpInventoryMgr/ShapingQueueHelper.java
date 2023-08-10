package mtnm.huawei.com.HW_mstpInventoryMgr;


/**
 * Generated from IDL struct "ShapingQueue".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ShapingQueueHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ShapingQueueHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueHelper.id(),"ShapingQueue",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("queueID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("bEnable", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("CIR", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("CBS", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("EIR", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("EBS", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.huawei.com/HW_mstpInventory/ShapingQueue:1.0";
	}
	public static mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue result = new mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue();
		result.queueID=in.read_ulong();
		result.bEnable=in.read_boolean();
		result.CIR=in.read_long();
		result.CBS=in.read_long();
		result.EIR=in.read_long();
		result.EBS=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue s)
	{
		out.write_ulong(s.queueID);
		out.write_boolean(s.bEnable);
		out.write_long(s.CIR);
		out.write_long(s.CBS);
		out.write_long(s.EIR);
		out.write_long(s.EBS);
	}
}
