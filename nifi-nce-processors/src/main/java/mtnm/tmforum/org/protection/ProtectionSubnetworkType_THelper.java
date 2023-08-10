package mtnm.tmforum.org.protection;
/**
 * Generated from IDL enum "ProtectionSubnetworkType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ProtectionSubnetworkType_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ProtectionSubnetworkType_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.protection.ProtectionSubnetworkType_THelper.id(),"ProtectionSubnetworkType_T",new String[]{"PSNT_MSP_1_PLUS_1","PSNT_MSP_M_FOR_N","PSNT_2_FIBER_ULSR","PSNT_2_FIBER_BLSR","PSNT_4_FIBER_BLSR","PSNT_USNCP","PSNT_BSNCP","PSNT_UPP","PSNT_BPP","PSNT_NP","PSNT_SNC_NODE","PSNT_NPL","PSNT_NPR"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.protection.ProtectionSubnetworkType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.protection.ProtectionSubnetworkType_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/protection/ProtectionSubnetworkType_T:1.0";
	}
	public static ProtectionSubnetworkType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ProtectionSubnetworkType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ProtectionSubnetworkType_T s)
	{
		out.write_long(s.value());
	}
}
