package mtnm.huawei.com.HW_mstpProtection;

/**
 * Generated from IDL struct "HW_RPRTopoInfo_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_RPRTopoInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_mstpProtection.HW_RPRTopoInfo_T value;

	public HW_RPRTopoInfo_THolder ()
	{
	}
	public HW_RPRTopoInfo_THolder(final mtnm.huawei.com.HW_mstpProtection.HW_RPRTopoInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.huawei.com.HW_mstpProtection.HW_RPRTopoInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.huawei.com.HW_mstpProtection.HW_RPRTopoInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.huawei.com.HW_mstpProtection.HW_RPRTopoInfo_THelper.write(_out, value);
	}
}
