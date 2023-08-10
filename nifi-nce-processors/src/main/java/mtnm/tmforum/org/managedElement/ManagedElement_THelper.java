package mtnm.tmforum.org.managedElement;


/**
 * Generated from IDL struct "ManagedElement_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ManagedElement_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ManagedElement_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.managedElement.ManagedElement_THelper.id(),"ManagedElement_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("location", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("version", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("productName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("communicationState", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.managedElement.CommunicationState_THelper.id(),"CommunicationState_T",new String[]{"CS_AVAILABLE","CS_UNAVAILABLE"}), null),new org.omg.CORBA.StructMember("emsInSyncState", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("supportedRates", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.id(), "LayerRateList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.type())), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.managedElement.ManagedElement_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.managedElement.ManagedElement_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/managedElement/ManagedElement_T:1.0";
	}
	public static mtnm.tmforum.org.managedElement.ManagedElement_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.managedElement.ManagedElement_T result = new mtnm.tmforum.org.managedElement.ManagedElement_T();
		result.name = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.location=in.read_string();
		result.version=in.read_string();
		result.productName=in.read_string();
		result.communicationState=mtnm.tmforum.org.managedElement.CommunicationState_THelper.read(in);
		result.emsInSyncState=in.read_boolean();
		result.supportedRates = mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.managedElement.ManagedElement_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.name);
		java.lang.String tmpResult484 = s.userLabel;
out.write_string( tmpResult484 );
		java.lang.String tmpResult485 = s.nativeEMSName;
out.write_string( tmpResult485 );
		java.lang.String tmpResult486 = s.owner;
out.write_string( tmpResult486 );
		java.lang.String tmpResult487 = s.location;
out.write_string( tmpResult487 );
		java.lang.String tmpResult488 = s.version;
out.write_string( tmpResult488 );
		java.lang.String tmpResult489 = s.productName;
out.write_string( tmpResult489 );
		mtnm.tmforum.org.managedElement.CommunicationState_THelper.write(out,s.communicationState);
		out.write_boolean(s.emsInSyncState);
		mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.write(out,s.supportedRates);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
