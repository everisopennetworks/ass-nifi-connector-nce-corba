package mtnm.huawei.com.HW_mstpInventoryMgr;


/**
 * Generated from IDL struct "HW_MSTPBindingPath_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_MSTPBindingPath_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(HW_MSTPBindingPath_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPath_THelper.id(),"HW_MSTPBindingPath_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("direction", org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.terminationPoint.Directionality_THelper.id(),"Directionality_T",new String[]{"D_NA","D_BIDIRECTIONAL","D_SOURCE","D_SINK"}), null),new org.omg.CORBA.StructMember("allPathList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("usedPathList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPath_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPath_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.huawei.com/HW_mstpInventory/HW_MSTPBindingPath_T:1.0";
	}
	public static mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPath_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPath_T result = new mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPath_T();
		result.direction=mtnm.tmforum.org.terminationPoint.Directionality_THelper.read(in);
		result.allPathList = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.usedPathList = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPBindingPath_T s)
	{
		mtnm.tmforum.org.terminationPoint.Directionality_THelper.write(out,s.direction);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.allPathList);
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.usedPathList);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
