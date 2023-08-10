package mtnm.tmforum.org.terminationPoint;
/**
 * Generated from IDL enum "Directionality_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class Directionality_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(Directionality_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.terminationPoint.Directionality_THelper.id(),"Directionality_T",new String[]{"D_NA","D_BIDIRECTIONAL","D_SOURCE","D_SINK"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.terminationPoint.Directionality_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.terminationPoint.Directionality_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/terminationPoint/Directionality_T:1.0";
	}
	public static Directionality_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return Directionality_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final Directionality_T s)
	{
		out.write_long(s.value());
	}
}
