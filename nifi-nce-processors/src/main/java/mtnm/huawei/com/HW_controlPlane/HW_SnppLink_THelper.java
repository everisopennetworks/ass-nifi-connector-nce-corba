package mtnm.huawei.com.HW_controlPlane;


/**
 * Generated from IDL struct "HW_SnppLink_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_SnppLink_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(HW_SnppLink_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_controlPlane.HW_SnppLink_THelper.id(),"HW_SnppLink_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("aEndSnppName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("zEndSnppName", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.id(),"ConnectionDirection_T",new String[]{"CD_UNI","CD_BI"}), null),new org.omg.CORBA.StructMember("rateList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.id(), "LayerRateList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.type())), null),new org.omg.CORBA.StructMember("cost", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("protectType", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_controlPlane.HW_LinkProtectType_THelper.id(), "HW_LinkProtectType_T",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("linkCapacity", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_controlPlane.HW_LinkCapacity_THelper.id(), "HW_LinkCapacity_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_controlPlane.HW_Capacity_THelper.id(),"HW_Capacity_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.id(), "LayerRate_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2))), null),new org.omg.CORBA.StructMember("Bandwidth", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}))), null),new org.omg.CORBA.StructMember("linkState", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_controlPlane.HW_LinkStateHelper.id(), "HW_LinkState",org.omg.CORBA.ORB.init().create_string_tc(0)), null),new org.omg.CORBA.StructMember("srlgIDList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_controlPlane.HW_SRLGIDList_THelper.id(), "HW_SRLGIDList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.huawei.com.HW_controlPlane.HW_SRLGID_THelper.type())), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.huawei.com.HW_controlPlane.HW_SnppLink_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.huawei.com.HW_controlPlane.HW_SnppLink_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.huawei.com/HW_controlPlane/HW_SnppLink_T:1.0";
	}
	public static mtnm.huawei.com.HW_controlPlane.HW_SnppLink_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.huawei.com.HW_controlPlane.HW_SnppLink_T result = new mtnm.huawei.com.HW_controlPlane.HW_SnppLink_T();
		result.name = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.aEndSnppName = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.zEndSnppName = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		result.direction=mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.read(in);
		result.rateList = mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(in);
		result.cost=in.read_ushort();
		result.protectType=in.read_string();
		result.linkCapacity = mtnm.huawei.com.HW_controlPlane.HW_LinkCapacity_THelper.read(in);
		result.linkState=in.read_string();
		result.srlgIDList = mtnm.huawei.com.HW_controlPlane.HW_SRLGIDList_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.huawei.com.HW_controlPlane.HW_SnppLink_T s)
	{
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.name);
		java.lang.String tmpResult299 = s.userLabel;
out.write_string( tmpResult299 );
		java.lang.String tmpResult300 = s.nativeEMSName;
out.write_string( tmpResult300 );
		java.lang.String tmpResult301 = s.owner;
out.write_string( tmpResult301 );
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.aEndSnppName);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.zEndSnppName);
		mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.write(out,s.rateList);
		out.write_ushort(s.cost);
		java.lang.String tmpResult302 = s.protectType;
out.write_string( tmpResult302 );
		mtnm.huawei.com.HW_controlPlane.HW_LinkCapacity_THelper.write(out,s.linkCapacity);
		java.lang.String tmpResult303 = s.linkState;
out.write_string( tmpResult303 );
		mtnm.huawei.com.HW_controlPlane.HW_SRLGIDList_THelper.write(out,s.srlgIDList);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
