package mtnm.tmforum.org.mtnmVersion;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Version_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class Version_IPOATie
	extends Version_IPOA
{
	private Version_IOperations _delegate;

	private POA _poa;
	public Version_IPOATie(Version_IOperations delegate)
	{
		_delegate = delegate;
	}
	public Version_IPOATie(Version_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.mtnmVersion.Version_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.mtnmVersion.Version_I __r = mtnm.tmforum.org.mtnmVersion.Version_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.mtnmVersion.Version_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.mtnmVersion.Version_I __r = mtnm.tmforum.org.mtnmVersion.Version_IHelper.narrow(__o);
		return __r;
	}
	public Version_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(Version_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public java.lang.String getVersion()
	{
		return _delegate.getVersion();
	}

}
