package mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage;

/**
 * Generated from IDL struct "CommonObjSturct_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class CommonObjSturct_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T value;

	public CommonObjSturct_THolder ()
	{
	}
	public CommonObjSturct_THolder(final mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		mtnm.tmforum.org.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.write(_out, value);
	}
}
