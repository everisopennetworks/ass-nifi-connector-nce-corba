package mtnm.tmforum.org.transmissionDescriptor;
/**
 * Generated from IDL enum "TPorMFDorFDFrQualifier_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TPorMFDorFDFrQualifier_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(TPorMFDorFDFrQualifier_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_THelper.id(),"TPorMFDorFDFrQualifier_T",new String[]{"aTP","aMFD","aFDFr"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.transmissionDescriptor.TPorMFDorFDFrQualifier_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/transmissionDescriptor/TPorMFDorFDFrQualifier_T:1.0";
	}
	public static TPorMFDorFDFrQualifier_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return TPorMFDorFDFrQualifier_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final TPorMFDorFDFrQualifier_T s)
	{
		out.write_long(s.value());
	}
}
