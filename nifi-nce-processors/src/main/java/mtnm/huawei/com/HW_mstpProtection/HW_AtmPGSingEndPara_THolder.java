package mtnm.huawei.com.HW_mstpProtection;

/**
 * Generated from IDL struct "HW_AtmPGSingEndPara_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class HW_AtmPGSingEndPara_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_T value;

	public HW_AtmPGSingEndPara_THolder ()
	{
	}
	public HW_AtmPGSingEndPara_THolder(final mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.huawei.com.HW_mstpProtection.HW_AtmPGSingEndPara_THelper.write(_out, value);
	}
}
