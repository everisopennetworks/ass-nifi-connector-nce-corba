package mtnm.tmforum.org.emsMgr;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "AlarmStaticInfoIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class AlarmStaticInfoIterator_IPOATie
	extends AlarmStaticInfoIterator_IPOA
{
	private AlarmStaticInfoIterator_IOperations _delegate;

	private POA _poa;
	public AlarmStaticInfoIterator_IPOATie(AlarmStaticInfoIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public AlarmStaticInfoIterator_IPOATie(AlarmStaticInfoIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public mtnm.tmforum.org.emsMgr.AlarmStaticInfoIterator_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.emsMgr.AlarmStaticInfoIterator_I __r = mtnm.tmforum.org.emsMgr.AlarmStaticInfoIterator_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.emsMgr.AlarmStaticInfoIterator_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.emsMgr.AlarmStaticInfoIterator_I __r = mtnm.tmforum.org.emsMgr.AlarmStaticInfoIterator_IHelper.narrow(__o);
		return __r;
	}
	public AlarmStaticInfoIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AlarmStaticInfoIterator_IOperations delegate)
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
	public int getLength() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, mtnm.tmforum.org.emsMgr.AlarmStaticInfoList_THolder alarmStaticInfoList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,alarmStaticInfoList);
	}

	public void destroy() throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
