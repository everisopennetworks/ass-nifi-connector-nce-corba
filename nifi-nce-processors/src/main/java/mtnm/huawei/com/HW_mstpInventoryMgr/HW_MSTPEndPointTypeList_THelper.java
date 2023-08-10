package mtnm.huawei.com.HW_mstpInventoryMgr;

/**
 * Generated from IDL alias "HW_MSTPEndPointTypeList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_MSTPEndPointTypeList_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointType_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointType_T[] extract (final org.omg.CORBA.Any any)
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
			synchronized(HW_MSTPEndPointTypeList_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointTypeList_THelper.id(), "HW_MSTPEndPointTypeList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointType_THelper.id(),"HW_MSTPEndPointType_T",new String[]{"HW_MEPT_NA","HW_MEPT_ATM","HW_MEPT_ATMTRUNK","HW_MEPT_ETH","HW_MEPT_ETHTRUNK","HW_MEPT_LP","HW_MEPT_RPR"})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpInventory/HW_MSTPEndPointTypeList_T:1.0";
	}
	public static mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointType_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointType_T[] _result;
		int _l_result59 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result59 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result59);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointType_T[_l_result59];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointType_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointType_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPEndPointType_THelper.write(_out,_s[i]);
		}

	}
}
