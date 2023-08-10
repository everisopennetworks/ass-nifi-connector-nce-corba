package mtnm.huawei.com.HW_mstpService;
/**
 * Generated from IDL enum "HW_EthServiceType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_EthServiceType_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(HW_EthServiceType_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpService.HW_EthServiceType_THelper.id(),"HW_EthServiceType_T",new String[]{"HW_EST_NA","HW_EST_EPL","HW_EST_EVPL","HW_EST_EPLAN","HW_EST_EVPLAN"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.huawei.com.HW_mstpService.HW_EthServiceType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.huawei.com.HW_mstpService.HW_EthServiceType_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.huawei.com/HW_mstpService/HW_EthServiceType_T:1.0";
	}
	public static HW_EthServiceType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return HW_EthServiceType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final HW_EthServiceType_T s)
	{
		out.write_long(s.value());
	}
}
