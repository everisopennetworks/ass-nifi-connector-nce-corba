package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL alias "ShapingQueueList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ShapingQueueList_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue[] extract (final org.omg.CORBA.Any any)
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
			synchronized(ShapingQueueList_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueList_THelper.id(), "ShapingQueueList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueHelper.id(),"ShapingQueue",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("queueID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("bEnable", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("CIR", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("CBS", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("EIR", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("EBS", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpInventory/ShapingQueueList_T:1.0";
	}
	public static mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue[] _result;
		int _l_result71 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result71 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result71);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue[_l_result71];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueue[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			mtnm.huawei.com.HW_mstpInventoryMgr.ShapingQueueHelper.write(_out,_s[i]);
		}

	}
}
