package mtnm.huawei.com.HW_vpnManager;


/**
 * Generated from IDL interface "SelfLearningMACAddressTableIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class SelfLearningMACAddressTableIterator_IHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(SelfLearningMACAddressTableIterator_IHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.huawei.com/HW_vpnManager/SelfLearningMACAddressTableIterator_I:1.0", "SelfLearningMACAddressTableIterator_I");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableIterator_I s)
	{
			any.insert_Object(s);
	}
	public static mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableIterator_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:mtnm.huawei.com/HW_vpnManager/SelfLearningMACAddressTableIterator_I:1.0";
	}
	public static SelfLearningMACAddressTableIterator_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(mtnm.huawei.com.HW_vpnManager._SelfLearningMACAddressTableIterator_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableIterator_I s)
	{
		_out.write_Object(s);
	}
	public static mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableIterator_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableIterator_I)
		{
			return (mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableIterator_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.huawei.com/HW_vpnManager/SelfLearningMACAddressTableIterator_I:1.0"))
		{
			mtnm.huawei.com.HW_vpnManager._SelfLearningMACAddressTableIterator_IStub stub;
			stub = new mtnm.huawei.com.HW_vpnManager._SelfLearningMACAddressTableIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableIterator_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableIterator_I)
		{
			return (mtnm.huawei.com.HW_vpnManager.SelfLearningMACAddressTableIterator_I)obj;
		}
		else
		{
			mtnm.huawei.com.HW_vpnManager._SelfLearningMACAddressTableIterator_IStub stub;
			stub = new mtnm.huawei.com.HW_vpnManager._SelfLearningMACAddressTableIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
