package mtnm.tmforum.org.emsMgr;


/**
 * Generated from IDL interface "EMSMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class EMSMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.emsMgr.EMSMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "getObjectClockSourceStatus", Integer.valueOf(0));
		m_opsHash.put ( "getAllTopLevelSubnetworks", Integer.valueOf(1));
		m_opsHash.put ( "setAlarmReportingOn", Integer.valueOf(2));
		m_opsHash.put ( "getTPFaultStatus", Integer.valueOf(3));
		m_opsHash.put ( "getAllTopLevelTopologicalLinkNames", Integer.valueOf(4));
		m_opsHash.put ( "getAllHistoryAlarms", Integer.valueOf(5));
		m_opsHash.put ( "getAllSecondlyAlarms", Integer.valueOf(6));
		m_opsHash.put ( "getAllHistoryAlarmsByFTP", Integer.valueOf(7));
		m_opsHash.put ( "setOwner", Integer.valueOf(8));
		m_opsHash.put ( "clearAlarms", Integer.valueOf(9));
		m_opsHash.put ( "setAlarmReportingOff", Integer.valueOf(10));
		m_opsHash.put ( "getAllTopLevelSubnetworkNames", Integer.valueOf(11));
		m_opsHash.put ( "getAllActiveAlarms", Integer.valueOf(12));
		m_opsHash.put ( "getObjectRootAlarms", Integer.valueOf(13));
		m_opsHash.put ( "getTopLevelTopologicalLink", Integer.valueOf(14));
		m_opsHash.put ( "setEMSHeartbeatInterval", Integer.valueOf(15));
		m_opsHash.put ( "getAlarmAffectedServiceNames", Integer.valueOf(16));
		m_opsHash.put ( "getEMSTime", Integer.valueOf(17));
		m_opsHash.put ( "getEMS", Integer.valueOf(18));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(19));
		m_opsHash.put ( "getAllRedefineAlarmDatas", Integer.valueOf(20));
		m_opsHash.put ( "getAllTopLevelTopologicalLinks", Integer.valueOf(21));
		m_opsHash.put ( "getAllEMSSystemActiveAlarms", Integer.valueOf(22));
		m_opsHash.put ( "getAllAlarmStaticInfo", Integer.valueOf(23));
		m_opsHash.put ( "acknowledgeAlarms", Integer.valueOf(24));
		m_opsHash.put ( "getAlarmCount", Integer.valueOf(25));
		m_opsHash.put ( "getInventory", Integer.valueOf(26));
		m_opsHash.put ( "redefineAlarmData", Integer.valueOf(27));
		m_opsHash.put ( "unacknowledgeAlarms", Integer.valueOf(28));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(29));
		m_opsHash.put ( "getAllEMSAndMEActiveAlarms", Integer.valueOf(30));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(31));
		m_opsHash.put ( "setEMSTime", Integer.valueOf(32));
		m_opsHash.put ( "getEMSHeartbeatInterval", Integer.valueOf(33));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(34));
		m_opsHash.put ( "getHistoryAlarmDataByPull", Integer.valueOf(35));
		m_opsHash.put ( "setAlarmsRemarkInfo", Integer.valueOf(36));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/emsMgr/EMSMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.emsMgr.EMSMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.emsMgr.EMSMgr_I __r = mtnm.tmforum.org.emsMgr.EMSMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.emsMgr.EMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.emsMgr.EMSMgr_I __r = mtnm.tmforum.org.emsMgr.EMSMgr_IHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // getObjectClockSourceStatus
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.emsMgr.ClockSourceStatusList_THolder _arg1= new mtnm.tmforum.org.emsMgr.ClockSourceStatusList_THolder();
				_out = handler.createReply();
				getObjectClockSourceStatus(_arg0,_arg1);
				mtnm.tmforum.org.emsMgr.ClockSourceStatusList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllTopLevelSubnetworks
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.multiLayerSubnetwork.SubnetworkList_THolder _arg1= new mtnm.tmforum.org.multiLayerSubnetwork.SubnetworkList_THolder();
				mtnm.tmforum.org.multiLayerSubnetwork.SubnetworkIterator_IHolder _arg2= new mtnm.tmforum.org.multiLayerSubnetwork.SubnetworkIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelSubnetworks(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.multiLayerSubnetwork.SubnetworkList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.multiLayerSubnetwork.SubnetworkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setAlarmReportingOn
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setAlarmReportingOn(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getTPFaultStatus
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.emsMgr.EndTPFaultStatusList_THolder _arg1= new mtnm.tmforum.org.emsMgr.EndTPFaultStatusList_THolder();
				_out = handler.createReply();
				getTPFaultStatus(_arg0,_arg1);
				mtnm.tmforum.org.emsMgr.EndTPFaultStatusList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getAllTopLevelTopologicalLinkNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelTopologicalLinkNames(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getAllHistoryAlarms
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg1=mtnm.tmforum.org.emsMgr.ManagedElementTypeList_THelper.read(_input);
				java.lang.String[] _arg2=mtnm.tmforum.org.notifications.ProbableCauseList_THelper.read(_input);
				mtnm.tmforum.org.notifications.PerceivedSeverity_T[] _arg3=mtnm.tmforum.org.notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg4=_input.read_string();
				java.lang.String _arg5=_input.read_string();
				int _arg6=_input.read_ulong();
				mtnm.tmforum.org.notifications.EventList_THolder _arg7= new mtnm.tmforum.org.notifications.EventList_THolder();
				mtnm.tmforum.org.notifications.EventIterator_IHolder _arg8= new mtnm.tmforum.org.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllHistoryAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				mtnm.tmforum.org.notifications.EventList_THelper.write(_out,_arg7.value);
				mtnm.tmforum.org.notifications.EventIterator_IHelper.write(_out,_arg8.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getAllSecondlyAlarms
			{
			try
			{
				java.lang.String[] _arg0=mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THelper.read(_input);
				mtnm.tmforum.org.notifications.EventList_THolder _arg1= new mtnm.tmforum.org.notifications.EventList_THolder();
				_out = handler.createReply();
				getAllSecondlyAlarms(_arg0,_arg1);
				mtnm.tmforum.org.notifications.EventList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getAllHistoryAlarmsByFTP
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg3=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg4=mtnm.tmforum.org.emsMgr.ManagedElementTypeList_THelper.read(_input);
				java.lang.String[] _arg5=mtnm.tmforum.org.notifications.ProbableCauseList_THelper.read(_input);
				mtnm.tmforum.org.notifications.PerceivedSeverity_T[] _arg6=mtnm.tmforum.org.notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg7=_input.read_string();
				java.lang.String _arg8=_input.read_string();
				_out = handler.createReply();
				getAllHistoryAlarmsByFTP(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // setOwner
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setOwner(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // clearAlarms
			{
			try
			{
				java.lang.String[] _arg0=mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THelper.read(_input);
				mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder _arg1= new mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder();
				_out = handler.createReply();
				clearAlarms(_arg0,_arg1);
				mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // setAlarmReportingOff
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setAlarmReportingOff(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getAllTopLevelSubnetworkNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelSubnetworkNames(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllActiveAlarms
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg1=mtnm.tmforum.org.emsMgr.ManagedElementTypeList_THelper.read(_input);
				java.lang.String[] _arg2=mtnm.tmforum.org.notifications.ProbableCauseList_THelper.read(_input);
				mtnm.tmforum.org.notifications.PerceivedSeverity_T[] _arg3=mtnm.tmforum.org.notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg4=_input.read_string();
				java.lang.String _arg5=_input.read_string();
				int _arg6=_input.read_ulong();
				mtnm.tmforum.org.notifications.EventList_THolder _arg7= new mtnm.tmforum.org.notifications.EventList_THolder();
				mtnm.tmforum.org.notifications.EventIterator_IHolder _arg8= new mtnm.tmforum.org.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				mtnm.tmforum.org.notifications.EventList_THelper.write(_out,_arg7.value);
				mtnm.tmforum.org.notifications.EventIterator_IHelper.write(_out,_arg8.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getObjectRootAlarms
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				int _arg3=_input.read_ulong();
				mtnm.tmforum.org.notifications.EventList_THolder _arg4= new mtnm.tmforum.org.notifications.EventList_THolder();
				mtnm.tmforum.org.notifications.EventIterator_IHolder _arg5= new mtnm.tmforum.org.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getObjectRootAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				mtnm.tmforum.org.notifications.EventList_THelper.write(_out,_arg4.value);
				mtnm.tmforum.org.notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getTopLevelTopologicalLink
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.topologicalLink.TopologicalLink_THolder _arg1= new mtnm.tmforum.org.topologicalLink.TopologicalLink_THolder();
				_out = handler.createReply();
				getTopLevelTopologicalLink(_arg0,_arg1);
				mtnm.tmforum.org.topologicalLink.TopologicalLink_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // setEMSHeartbeatInterval
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				setEMSHeartbeatInterval(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getAlarmAffectedServiceNames
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				mtnm.tmforum.org.emsMgr.ServiceNameList_THolder _arg1= new mtnm.tmforum.org.emsMgr.ServiceNameList_THolder();
				_out = handler.createReply();
				getAlarmAffectedServiceNames(_arg0,_arg1);
				mtnm.tmforum.org.emsMgr.ServiceNameList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getEMSTime
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NVSList_THolder _arg0= new mtnm.tmforum.org.globaldefs.NVSList_THolder();
				org.omg.CORBA.StringHolder _arg1= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				getEMSTime(_arg0,_arg1);
				mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_out,_arg0.value);
				java.lang.String tmpResult57 = _arg1.value;
_out.write_string( tmpResult57 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getEMS
			{
			try
			{
				mtnm.tmforum.org.emsMgr.EMS_THolder _arg0= new mtnm.tmforum.org.emsMgr.EMS_THolder();
				_out = handler.createReply();
				getEMS(_arg0);
				mtnm.tmforum.org.emsMgr.EMS_THelper.write(_out,_arg0.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getCapabilities
			{
			try
			{
				mtnm.tmforum.org.common.CapabilityList_THolder _arg0= new mtnm.tmforum.org.common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				mtnm.tmforum.org.common.CapabilityList_THelper.write(_out,_arg0.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // getAllRedefineAlarmDatas
			{
			try
			{
				mtnm.tmforum.org.emsMgr.QueryRedefineAlarmData_T[] _arg0=mtnm.tmforum.org.emsMgr.QueryRedefineAlarmDataList_THelper.read(_input);
				mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THolder _arg1= new mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THolder();
				_out = handler.createReply();
				getAllRedefineAlarmDatas(_arg0,_arg1);
				mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getAllTopLevelTopologicalLinks
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder _arg1= new mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THolder();
				mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder _arg2= new mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelTopologicalLinks(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getAllEMSSystemActiveAlarms
			{
			try
			{
				mtnm.tmforum.org.notifications.PerceivedSeverity_T[] _arg0=mtnm.tmforum.org.notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.notifications.EventList_THolder _arg2= new mtnm.tmforum.org.notifications.EventList_THolder();
				mtnm.tmforum.org.notifications.EventIterator_IHolder _arg3= new mtnm.tmforum.org.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllEMSSystemActiveAlarms(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.notifications.EventList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.notifications.EventIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getAllAlarmStaticInfo
			{
			try
			{
				int _arg0=_input.read_ulong();
				mtnm.tmforum.org.emsMgr.AlarmStaticInfoList_THolder _arg1= new mtnm.tmforum.org.emsMgr.AlarmStaticInfoList_THolder();
				mtnm.tmforum.org.emsMgr.AlarmStaticInfoIterator_IHolder _arg2= new mtnm.tmforum.org.emsMgr.AlarmStaticInfoIterator_IHolder();
				_out = handler.createReply();
				getAllAlarmStaticInfo(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.emsMgr.AlarmStaticInfoList_THelper.write(_out,_arg1.value);
				mtnm.tmforum.org.emsMgr.AlarmStaticInfoIterator_IHelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // acknowledgeAlarms
			{
			try
			{
				java.lang.String[] _arg0=mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THelper.read(_input);
				mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder _arg1= new mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder();
				_out = handler.createReply();
				acknowledgeAlarms(_arg0,_arg1);
				mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getAlarmCount
			{
			try
			{
				mtnm.tmforum.org.notifications.PerceivedSeverity_T[] _arg0=mtnm.tmforum.org.notifications.PerceivedSeverityList_THelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				getAlarmCount(_arg0,_arg1);
				_out.write_ulong(_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getInventory
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				mtnm.tmforum.org.emsMgr.InventoryType_T[] _arg3=mtnm.tmforum.org.emsMgr.InventoryTypeList_THelper.read(_input);
				_out = handler.createReply();
				getInventory(_arg0,_arg1,_arg2,_arg3);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // redefineAlarmData
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				mtnm.tmforum.org.emsMgr.RedefineAlarmData_T[] _arg1=mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THelper.read(_input);
				mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THolder _arg2= new mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THolder();
				mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THolder _arg3= new mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				redefineAlarmData(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.emsMgr.RedefineAlarmDataList_THelper.write(_out,_arg3.value);
				java.lang.String tmpResult58 = _arg4.value;
_out.write_string( tmpResult58 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // unacknowledgeAlarms
			{
			try
			{
				java.lang.String[] _arg0=mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THelper.read(_input);
				mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder _arg1= new mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder();
				_out = handler.createReply();
				unacknowledgeAlarms(_arg0,_arg1);
				mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // setUserLabel
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getAllEMSAndMEActiveAlarms
			{
			try
			{
				java.lang.String[] _arg0=mtnm.tmforum.org.notifications.ProbableCauseList_THelper.read(_input);
				mtnm.tmforum.org.notifications.PerceivedSeverity_T[] _arg1=mtnm.tmforum.org.notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.notifications.EventList_THolder _arg3= new mtnm.tmforum.org.notifications.EventList_THolder();
				mtnm.tmforum.org.notifications.EventIterator_IHolder _arg4= new mtnm.tmforum.org.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllEMSAndMEActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.notifications.EventList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.notifications.EventIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // setAdditionalInfo
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NVSList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setAdditionalInfo(_arg0,_arg1);
				mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // setEMSTime
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setEMSTime(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getEMSHeartbeatInterval
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				getEMSHeartbeatInterval(_arg0,_arg1);
				_out.write_ulong(_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // setNativeEMSName
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // getHistoryAlarmDataByPull
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				java.lang.String[] _arg4=mtnm.tmforum.org.notifications.ProbableCauseList_THelper.read(_input);
				mtnm.tmforum.org.notifications.PerceivedSeverity_T[] _arg5=mtnm.tmforum.org.notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg6=_input.read_string();
				java.lang.String _arg7=_input.read_string();
				_out = handler.createReply();
				getHistoryAlarmDataByPull(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // setAlarmsRemarkInfo
			{
			try
			{
				mtnm.tmforum.org.emsMgr.AlarmRemarkInfo_T[] _arg0=mtnm.tmforum.org.emsMgr.AlarmRemarkInfoList_THelper.read(_input);
				mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder _arg1= new mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THolder();
				_out = handler.createReply();
				setAlarmsRemarkInfo(_arg0,_arg1);
				mtnm.tmforum.org.emsMgr.AlarmSerialNoList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
