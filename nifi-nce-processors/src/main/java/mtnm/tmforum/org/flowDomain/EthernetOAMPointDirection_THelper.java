package mtnm.tmforum.org.flowDomain;
/**
 * Generated from IDL enum "EthernetOAMPointDirection_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EthernetOAMPointDirection_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(EthernetOAMPointDirection_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.flowDomain.EthernetOAMPointDirection_THelper.id(),"EthernetOAMPointDirection_T",new String[]{"EOPD_BI","EOPD_INGRESS","EOPD_EGRESS"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.flowDomain.EthernetOAMPointDirection_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.flowDomain.EthernetOAMPointDirection_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/flowDomain/EthernetOAMPointDirection_T:1.0";
	}
	public static EthernetOAMPointDirection_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return EthernetOAMPointDirection_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final EthernetOAMPointDirection_T s)
	{
		out.write_long(s.value());
	}
}
