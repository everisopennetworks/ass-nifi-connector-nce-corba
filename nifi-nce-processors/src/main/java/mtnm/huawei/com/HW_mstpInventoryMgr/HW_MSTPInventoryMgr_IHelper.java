package mtnm.huawei.com.HW_mstpInventoryMgr;


/**
 * Generated from IDL interface "HW_MSTPInventoryMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class HW_MSTPInventoryMgr_IHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(HW_MSTPInventoryMgr_IHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.huawei.com/HW_mstpInventory/HW_MSTPInventoryMgr_I:1.0", "HW_MSTPInventoryMgr_I");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_I s)
	{
			any.insert_Object(s);
	}
	public static mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_mstpInventory/HW_MSTPInventoryMgr_I:1.0";
	}
	public static HW_MSTPInventoryMgr_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(mtnm.huawei.com.HW_mstpInventoryMgr._HW_MSTPInventoryMgr_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_I s)
	{
		_out.write_Object(s);
	}
	public static mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_I)
		{
			return (mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.huawei.com/HW_mstpInventory/HW_MSTPInventoryMgr_I:1.0"))
		{
			mtnm.huawei.com.HW_mstpInventoryMgr._HW_MSTPInventoryMgr_IStub stub;
			stub = new mtnm.huawei.com.HW_mstpInventoryMgr._HW_MSTPInventoryMgr_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_I)
		{
			return (mtnm.huawei.com.HW_mstpInventoryMgr.HW_MSTPInventoryMgr_I)obj;
		}
		else
		{
			mtnm.huawei.com.HW_mstpInventoryMgr._HW_MSTPInventoryMgr_IStub stub;
			stub = new mtnm.huawei.com.HW_mstpInventoryMgr._HW_MSTPInventoryMgr_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
