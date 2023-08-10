package mtnm.tmforum.org.flowDomain;


/**
 * Generated from IDL struct "EthernetOAMParamer_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EthernetOAMParamer_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(EthernetOAMParamer_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.flowDomain.EthernetOAMParamer_THelper.id(),"EthernetOAMParamer_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("oamPointName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("period", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.flowDomain.EthernetOAMParamer_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.flowDomain.EthernetOAMParamer_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/flowDomain/EthernetOAMParamer_T:1.0";
	}
	public static mtnm.tmforum.org.flowDomain.EthernetOAMParamer_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.flowDomain.EthernetOAMParamer_T result = new mtnm.tmforum.org.flowDomain.EthernetOAMParamer_T();
		result.oamPointName=in.read_string();
		result.period=in.read_ulong();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.flowDomain.EthernetOAMParamer_T s)
	{
		java.lang.String tmpResult154 = s.oamPointName;
out.write_string( tmpResult154 );
		out.write_ulong(s.period);
	}
}
