package mtnm.huawei.com.HW_mstpService;

/**
 * Generated from IDL alias "HW_EthServiceCreateDataList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_EthServiceCreateDataList_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, mtnm.huawei.com.HW_mstpService.HW_EthServiceCreateData_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static mtnm.huawei.com.HW_mstpService.HW_EthServiceCreateData_T[] extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(HW_EthServiceCreateDataList_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(mtnm.huawei.com.HW_mstpService.HW_EthServiceCreateDataList_THelper.id(), "HW_EthServiceCreateDataList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpService.HW_EthServiceCreateData_THelper.id(),"HW_EthServiceCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("serviceType", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.huawei.com.HW_mstpService.HW_EthServiceType_THelper.id(),"HW_EthServiceType_T",new String[]{"HW_EST_NA","HW_EST_EPL","HW_EST_EVPL","HW_EST_EPLAN","HW_EST_EVPLAN"}), null),new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.globaldefs.ConnectionDirection_THelper.id(),"ConnectionDirection_T",new String[]{"CD_UNI","CD_BI"}), null),new org.omg.CORBA.StructMember("aEndPoint", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpService.HW_EthServiceTP_THelper.id(),"HW_EthServiceTP_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("vlanID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("tunnel", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("vc", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null),new org.omg.CORBA.StructMember("zEndPoint", org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpService.HW_EthServiceTP_THelper.id(),"HW_EthServiceTP_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null),new org.omg.CORBA.StructMember("vlanID", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null),new org.omg.CORBA.StructMember("tunnel", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("vc", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)}), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpService/HW_EthServiceCreateDataList_T:1.0";
	}
	public static mtnm.huawei.com.HW_mstpService.HW_EthServiceCreateData_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		mtnm.huawei.com.HW_mstpService.HW_EthServiceCreateData_T[] _result;
		int _l_result80 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result80 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result80);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new mtnm.huawei.com.HW_mstpService.HW_EthServiceCreateData_T[_l_result80];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=mtnm.huawei.com.HW_mstpService.HW_EthServiceCreateData_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, mtnm.huawei.com.HW_mstpService.HW_EthServiceCreateData_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			mtnm.huawei.com.HW_mstpService.HW_EthServiceCreateData_THelper.write(_out,_s[i]);
		}

	}
}
