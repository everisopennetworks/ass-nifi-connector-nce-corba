package mtnm.tmforum.org.managedElement;
/**
 * Generated from IDL enum "MulticastMode_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class MulticastMode_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(MulticastMode_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.managedElement.MulticastMode_THelper.id(),"MulticastMode_T",new String[]{"NEAREST_NA","NEAREST_BRIDGE","NEAREST_NON_TPMR_BRIDGE","NEAREST_CUSTOMER_BRIDGE"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.managedElement.MulticastMode_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.managedElement.MulticastMode_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/managedElement/MulticastMode_T:1.0";
	}
	public static MulticastMode_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return MulticastMode_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final MulticastMode_T s)
	{
		out.write_long(s.value());
	}
}
