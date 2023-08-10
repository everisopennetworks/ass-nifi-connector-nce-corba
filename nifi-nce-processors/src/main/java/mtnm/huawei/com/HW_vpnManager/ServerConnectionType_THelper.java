package mtnm.huawei.com.HW_vpnManager;


/**
 * Generated from IDL struct "ServerConnectionType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ServerConnectionType_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ServerConnectionType_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_vpnManager.ServerConnectionType_THelper.id(),"ServerConnectionType_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("nameList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("channel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("usedAs", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_vpnManager.UsedAsType_THelper.id(),"UsedAsType_T",new String[]{"UA_WORKING","UA_PROTECTION","UA_DNI"}), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.huawei.com.HW_vpnManager.ServerConnectionType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.huawei.com.HW_vpnManager.ServerConnectionType_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.huawei.com/HW_vpnManager/ServerConnectionType_T:1.0";
	}
	public static mtnm.huawei.com.HW_vpnManager.ServerConnectionType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.huawei.com.HW_vpnManager.ServerConnectionType_T result = new mtnm.huawei.com.HW_vpnManager.ServerConnectionType_T();
		result.nameList = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.channel=in.read_string();
		result.usedAs=mtnm.huawei.com.HW_vpnManager.UsedAsType_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.huawei.com.HW_vpnManager.ServerConnectionType_T s)
	{
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.nameList);
		java.lang.String tmpResult377 = s.channel;
out.write_string( tmpResult377 );
		mtnm.huawei.com.HW_vpnManager.UsedAsType_THelper.write(out,s.usedAs);
	}
}
