package mtnm.tmforum.org.performance;


/**
 * Generated from IDL interface "PerformanceManagementMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PerformanceManagementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.performance.PerformanceManagementMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "getHistoryPMDataByPull", Integer.valueOf(0));
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(1));
		m_opsHash.put ( "getPMState", Integer.valueOf(2));
		m_opsHash.put ( "setTCATPParameter", Integer.valueOf(3));
		m_opsHash.put ( "createPerformanceMonitoringData", Integer.valueOf(4));
		m_opsHash.put ( "getTCATPParameter", Integer.valueOf(5));
		m_opsHash.put ( "enableTCA", Integer.valueOf(6));
		m_opsHash.put ( "ModifyPMCollectionTask", Integer.valueOf(7));
		m_opsHash.put ( "clearPMData", Integer.valueOf(8));
		m_opsHash.put ( "disablePMData", Integer.valueOf(9));
		m_opsHash.put ( "disableTCA", Integer.valueOf(10));
		m_opsHash.put ( "getAllPMPNames", Integer.valueOf(11));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(12));
		m_opsHash.put ( "deletePerformanceMonitoringData", Integer.valueOf(13));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(14));
		m_opsHash.put ( "selectPMCollectionTask", Integer.valueOf(15));
		m_opsHash.put ( "getPfmInstanceByResource", Integer.valueOf(16));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(17));
		m_opsHash.put ( "getAllCurrentPMData", Integer.valueOf(18));
		m_opsHash.put ( "setOwner", Integer.valueOf(19));
		m_opsHash.put ( "createPMCollectionTask", Integer.valueOf(20));
		m_opsHash.put ( "setTCANotifySwitch", Integer.valueOf(21));
		m_opsHash.put ( "SuspendPMCollectionTask", Integer.valueOf(22));
		m_opsHash.put ( "getTPHistoryPMData", Integer.valueOf(23));
		m_opsHash.put ( "ResumePMCollectionTask", Integer.valueOf(24));
		m_opsHash.put ( "getHoldingTime", Integer.valueOf(25));
		m_opsHash.put ( "getMEPMcapabilities", Integer.valueOf(26));
		m_opsHash.put ( "getAllPMPs", Integer.valueOf(27));
		m_opsHash.put ( "enablePMData", Integer.valueOf(28));
		m_opsHash.put ( "getHistoryPMData", Integer.valueOf(29));
		m_opsHash.put ( "deletePMCollectionTask", Integer.valueOf(30));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/performance/PerformanceManagementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.performance.PerformanceManagementMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.performance.PerformanceManagementMgr_I __r = mtnm.tmforum.org.performance.PerformanceManagementMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.performance.PerformanceManagementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.performance.PerformanceManagementMgr_I __r = mtnm.tmforum.org.performance.PerformanceManagementMgr_IHelper.narrow(__o);
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
			case 0: // getHistoryPMDataByPull
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				mtnm.tmforum.org.performance.PMTPSelect_T[] _arg3=mtnm.tmforum.org.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg4=mtnm.tmforum.org.performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg5=_input.read_string();
				java.lang.String _arg6=_input.read_string();
				_out = handler.createReply();
				getHistoryPMDataByPull(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // setNativeEMSName
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
			case 2: // getPMState
			{
			try
			{
				mtnm.tmforum.org.performance.PMTPSelect_T[] _arg0=mtnm.tmforum.org.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=mtnm.tmforum.org.performance.PMParameterNameList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.performance.PMStateList_THolder _arg3= new mtnm.tmforum.org.performance.PMStateList_THolder();
				mtnm.tmforum.org.performance.PMStateIterator_IHolder _arg4= new mtnm.tmforum.org.performance.PMStateIterator_IHolder();
				_out = handler.createReply();
				getPMState(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.performance.PMStateList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.performance.PMStateIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setTCATPParameter
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.performance.TCAParameters_THolder _arg1= new mtnm.tmforum.org.performance.TCAParameters_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setTCATPParameter(_arg0,_arg1);
				mtnm.tmforum.org.performance.TCAParameters_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // createPerformanceMonitoringData
			{
			try
			{
				mtnm.tmforum.org.performance.PerformanceCreateInstance_T _arg0=mtnm.tmforum.org.performance.PerformanceCreateInstance_THelper.read(_input);
				mtnm.tmforum.org.performance.PerformanceCreateInstanceList_THolder _arg1= new mtnm.tmforum.org.performance.PerformanceCreateInstanceList_THolder();
				_out = handler.createReply();
				createPerformanceMonitoringData(_arg0,_arg1);
				mtnm.tmforum.org.performance.PerformanceCreateInstanceList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getTCATPParameter
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				java.lang.String _arg2=_input.read_string();
				mtnm.tmforum.org.performance.TCAParameters_THolder _arg3= new mtnm.tmforum.org.performance.TCAParameters_THolder();
				_out = handler.createReply();
				getTCATPParameter(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.performance.TCAParameters_THelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // enableTCA
			{
			try
			{
				mtnm.tmforum.org.performance.PMTPSelect_T[] _arg0=mtnm.tmforum.org.performance.PMTPSelectList_THelper.read(_input);
				mtnm.tmforum.org.performance.PMTPSelectList_THolder _arg1= new mtnm.tmforum.org.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				enableTCA(_arg0,_arg1);
				mtnm.tmforum.org.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // ModifyPMCollectionTask
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				ModifyPMCollectionTask(_arg0,_arg1,_arg2);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // clearPMData
			{
			try
			{
				mtnm.tmforum.org.performance.PMTPSelect_T[] _arg0=mtnm.tmforum.org.performance.PMTPSelectList_THelper.read(_input);
				mtnm.tmforum.org.performance.PMTPSelectList_THolder _arg1= new mtnm.tmforum.org.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				clearPMData(_arg0,_arg1);
				mtnm.tmforum.org.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // disablePMData
			{
			try
			{
				mtnm.tmforum.org.performance.PMTPSelect_T[] _arg0=mtnm.tmforum.org.performance.PMTPSelectList_THelper.read(_input);
				mtnm.tmforum.org.performance.PMTPSelectList_THolder _arg1= new mtnm.tmforum.org.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				disablePMData(_arg0,_arg1);
				mtnm.tmforum.org.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // disableTCA
			{
			try
			{
				mtnm.tmforum.org.performance.PMTPSelect_T[] _arg0=mtnm.tmforum.org.performance.PMTPSelectList_THelper.read(_input);
				mtnm.tmforum.org.performance.PMTPSelectList_THolder _arg1= new mtnm.tmforum.org.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				disableTCA(_arg0,_arg1);
				mtnm.tmforum.org.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getAllPMPNames
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder _arg3= new mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllPMPNames(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // setUserLabel
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
			case 13: // deletePerformanceMonitoringData
			{
			try
			{
				mtnm.tmforum.org.performance.PMTPSelect_T[] _arg0=mtnm.tmforum.org.performance.PMTPSelectList_THelper.read(_input);
				mtnm.tmforum.org.performance.PMTPSelectList_THolder _arg1= new mtnm.tmforum.org.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				deletePerformanceMonitoringData(_arg0,_arg1);
				mtnm.tmforum.org.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getCapabilities
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
			case 15: // selectPMCollectionTask
			{
			try
			{
				java.lang.String[] _arg0=mtnm.tmforum.org.performance.CollectTaskNameList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				mtnm.tmforum.org.performance.CollectTaskInfoList_THolder _arg2= new mtnm.tmforum.org.performance.CollectTaskInfoList_THolder();
				_out = handler.createReply();
				selectPMCollectionTask(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.performance.CollectTaskInfoList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getPfmInstanceByResource
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg2=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.performance.PerformanceMonitoringInstanceList_THolder _arg3= new mtnm.tmforum.org.performance.PerformanceMonitoringInstanceList_THolder();
				_out = handler.createReply();
				getPfmInstanceByResource(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.performance.PerformanceMonitoringInstanceList_THelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // setAdditionalInfo
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
			case 18: // getAllCurrentPMData
			{
			try
			{
				mtnm.tmforum.org.performance.PMTPSelect_T[] _arg0=mtnm.tmforum.org.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=mtnm.tmforum.org.performance.PMParameterNameList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				mtnm.tmforum.org.performance.PMDataList_THolder _arg3= new mtnm.tmforum.org.performance.PMDataList_THolder();
				mtnm.tmforum.org.performance.PMDataIterator_IHolder _arg4= new mtnm.tmforum.org.performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getAllCurrentPMData(_arg0,_arg1,_arg2,_arg3,_arg4);
				mtnm.tmforum.org.performance.PMDataList_THelper.write(_out,_arg3.value);
				mtnm.tmforum.org.performance.PMDataIterator_IHelper.write(_out,_arg4.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // setOwner
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
			case 20: // createPMCollectionTask
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				java.lang.String _arg4=_input.read_string();
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg5=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String _arg6=_input.read_string();
				java.lang.String _arg7=_input.read_string();
				java.lang.String _arg8=_input.read_string();
				boolean _arg9=_input.read_boolean();
				_out = handler.createReply();
				createPMCollectionTask(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8,_arg9);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // setTCANotifySwitch
			{
			try
			{
				boolean _arg0=_input.read_boolean();
				_out = handler.createReply();
				setTCANotifySwitch(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // SuspendPMCollectionTask
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				SuspendPMCollectionTask(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getTPHistoryPMData
			{
			try
			{
				mtnm.tmforum.org.performance.PMTPSelect_T[] _arg0=mtnm.tmforum.org.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=mtnm.tmforum.org.performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				int _arg4=_input.read_ulong();
				mtnm.tmforum.org.performance.PMDataList_THolder _arg5= new mtnm.tmforum.org.performance.PMDataList_THolder();
				mtnm.tmforum.org.performance.PMDataIterator_IHolder _arg6= new mtnm.tmforum.org.performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getTPHistoryPMData(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				mtnm.tmforum.org.performance.PMDataList_THelper.write(_out,_arg5.value);
				mtnm.tmforum.org.performance.PMDataIterator_IHelper.write(_out,_arg6.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // ResumePMCollectionTask
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				ResumePMCollectionTask(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getHoldingTime
			{
			try
			{
				mtnm.tmforum.org.performance.HoldingTime_THolder _arg0= new mtnm.tmforum.org.performance.HoldingTime_THolder();
				_out = handler.createReply();
				getHoldingTime(_arg0);
				mtnm.tmforum.org.performance.HoldingTime_THelper.write(_out,_arg0.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // getMEPMcapabilities
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				mtnm.tmforum.org.performance.PMParameterList_THolder _arg2= new mtnm.tmforum.org.performance.PMParameterList_THolder();
				_out = handler.createReply();
				getMEPMcapabilities(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.performance.PMParameterList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getAllPMPs
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.performance.PMPList_THolder _arg2= new mtnm.tmforum.org.performance.PMPList_THolder();
				mtnm.tmforum.org.performance.PMPIterator_IHolder _arg3= new mtnm.tmforum.org.performance.PMPIterator_IHolder();
				_out = handler.createReply();
				getAllPMPs(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.performance.PMPList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.performance.PMPIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // enablePMData
			{
			try
			{
				mtnm.tmforum.org.performance.PMTPSelect_T[] _arg0=mtnm.tmforum.org.performance.PMTPSelectList_THelper.read(_input);
				mtnm.tmforum.org.performance.PMTPSelectList_THolder _arg1= new mtnm.tmforum.org.performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				enablePMData(_arg0,_arg1);
				mtnm.tmforum.org.performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // getHistoryPMData
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				mtnm.tmforum.org.performance.PMTPSelect_T[] _arg3=mtnm.tmforum.org.performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg4=mtnm.tmforum.org.performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg5=_input.read_string();
				java.lang.String _arg6=_input.read_string();
				boolean _arg7=_input.read_boolean();
				_out = handler.createReply();
				getHistoryPMData(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // deletePMCollectionTask
			{
			try
			{
				java.lang.String[] _arg0=mtnm.tmforum.org.performance.CollectTaskNameList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				deletePMCollectionTask(_arg0,_arg1);
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
