package mtnm.tmforum.org.circuitCutMgr;
/**
 * Generated from IDL enum "SNCRate_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class SNCRate_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SNCRate_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.circuitCutMgr.SNCRate_THelper.id(),"SNCRate_T",new String[]{"RATE_VC4_4C","RATE_VC4_8C","RATE_VC4_16C","RATE_VC4_64C","RATE_SERVERVC4","RATE_MS","RATE_VC12","RATE_VC3","RATE_VC4"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.circuitCutMgr.SNCRate_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.circuitCutMgr.SNCRate_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/circuitCutMgr/SNCRate_T:1.0";
	}
	public static SNCRate_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return SNCRate_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final SNCRate_T s)
	{
		out.write_long(s.value());
	}
}
