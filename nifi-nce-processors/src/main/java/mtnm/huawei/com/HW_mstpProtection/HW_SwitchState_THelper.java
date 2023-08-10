package mtnm.huawei.com.HW_mstpProtection;
/**
 * Generated from IDL enum "HW_SwitchState_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_SwitchState_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(HW_SwitchState_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpProtection.HW_SwitchState_THelper.id(),"HW_SwitchState_T",new String[]{"HW_SS_NA","HW_SS_IDLE","HW_SS_SWITCH","HW_SS_PASS_THROUGH"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.huawei.com.HW_mstpProtection.HW_SwitchState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.huawei.com.HW_mstpProtection.HW_SwitchState_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.huawei.com/HW_mstpProtection/HW_SwitchState_T:1.0";
	}
	public static HW_SwitchState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return HW_SwitchState_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_SwitchState_T s)
	{
		out.write_long(s.value());
	}
}
