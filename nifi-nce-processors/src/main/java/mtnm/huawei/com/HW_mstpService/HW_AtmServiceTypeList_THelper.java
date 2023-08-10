package mtnm.huawei.com.HW_mstpService;

/**
 * Generated from IDL alias "HW_AtmServiceTypeList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_AtmServiceTypeList_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_T[] extract (final org.omg.CORBA.Any any)
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
			synchronized(HW_AtmServiceTypeList_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_mstpService.HW_AtmServiceTypeList_THelper.id(), "HW_AtmServiceTypeList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_THelper.id(),"HW_AtmServiceType_T",new String[]{"HW_AST_NA","HW_AST_PVP","HW_AST_PVC"})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpService/HW_AtmServiceTypeList_T:1.0";
	}
	public static mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_T[] _result;
		int _l_result82 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result82 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result82);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_T[_l_result82];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_THelper.write(_out,_s[i]);
		}

	}
}
