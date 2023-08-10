package mtnm.tmforum.org.emsMgr;
/**
 * Generated from IDL enum "InventoryType_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class InventoryType_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(InventoryType_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.emsMgr.InventoryType_THelper.id(),"InventoryType_T",new String[]{"TYPE_EMS","TYPE_MANAGEDELEMENT","TYPE_RACK","TYPE_SHELF","TYPE_SLOT","TYPE_EQUIPMENT","TYPE_PTP","TYPE_IPCROSSCONNECTION","TYPE_TOPOLOGICALLINK","TYPE_MFDFR","TYPE_TCPROFILE","TYPE_IPPROTECTIONGROUP","TYPE_EPROTECTION","TYPE_TOPOSUBNETWORKVIEW","TYPE_TRAFFICTRUNK","TYPE_SNC","TYPE_FDFR","TYPE_TRAILNETWORKPROTECTION","TYPE_VRRP","TYPE_FRR","TYPE_STATICROUTING","TYPE_BRIDGE","TYPE_VRF","TYPE_SNCROUTE","TYPE_FDFRROUTE"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.emsMgr.InventoryType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.emsMgr.InventoryType_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/emsMgr/InventoryType_T:1.0";
	}
	public static InventoryType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return InventoryType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final InventoryType_T s)
	{
		out.write_long(s.value());
	}
}
