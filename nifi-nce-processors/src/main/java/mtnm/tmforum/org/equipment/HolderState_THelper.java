package mtnm.tmforum.org.equipment;
/**
 * Generated from IDL enum "HolderState_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HolderState_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(HolderState_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.equipment.HolderState_THelper.id(),"HolderState_T",new String[]{"EMPTY","INSTALLED_AND_EXPECTED","EXPECTED_AND_NOT_INSTALLED","INSTALLED_AND_NOT_EXPECTED","MISMATCH_OF_INSTALLED_AND_EXPECTED","UNAVAILABLE","UNKNOWN"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.equipment.HolderState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.equipment.HolderState_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/equipment/HolderState_T:1.0";
	}
	public static HolderState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return HolderState_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final HolderState_T s)
	{
		out.write_long(s.value());
	}
}
