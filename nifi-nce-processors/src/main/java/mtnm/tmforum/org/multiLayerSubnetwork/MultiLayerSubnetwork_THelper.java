package mtnm.tmforum.org.multiLayerSubnetwork;


/**
 * Generated from IDL struct "MultiLayerSubnetwork_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class MultiLayerSubnetwork_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(MultiLayerSubnetwork_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_THelper.id(),"MultiLayerSubnetwork_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("subnetworkType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.multiLayerSubnetwork.Topology_THelper.id(),"Topology_T",new String[]{"TOPO_SINGLETON","TOPO_CHAIN","TOPO_PSR","TOPO_OPEN_PSR","TOPO_SPRING","TOPO_OPEN_SPRING","TOPO_MESH"}), null),new org.omg.CORBA.StructMember("supportedRates", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.id(), "LayerRateList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.type())), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetwork_T:1.0";
	}
	public static mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_T result = new mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_T();
		result.name = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.subnetworkType=mtnm.tmforum.org.multiLayerSubnetwork.Topology_THelper.read(in);
		result.supportedRates = mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.multiLayerSubnetwork.MultiLayerSubnetwork_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.name);
		java.lang.String tmpResult507 = s.userLabel;
out.write_string( tmpResult507 );
		java.lang.String tmpResult508 = s.nativeEMSName;
out.write_string( tmpResult508 );
		java.lang.String tmpResult509 = s.owner;
out.write_string( tmpResult509 );
		mtnm.tmforum.org.multiLayerSubnetwork.Topology_THelper.write(out,s.subnetworkType);
		mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.write(out,s.supportedRates);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
