package mtnm.tmforum.org.maintenanceOps;


/**
 * Generated from IDL interface "MaintenanceMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class MaintenanceMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "setNativeEMSName", Integer.valueOf(0));
		m_opsHash.put ( "performMaintenanceOperationEx", Integer.valueOf(1));
		m_opsHash.put ( "getActiveMaintenanceOperations", Integer.valueOf(2));
		m_opsHash.put ( "setOAMParameters", Integer.valueOf(3));
		m_opsHash.put ( "getOAMParameters", Integer.valueOf(4));
		m_opsHash.put ( "performMaintenanceOperation", Integer.valueOf(5));
		m_opsHash.put ( "disablePRBSTest", Integer.valueOf(6));
		m_opsHash.put ( "setUserLabel", Integer.valueOf(7));
		m_opsHash.put ( "setServiceAlarmReportingOn", Integer.valueOf(8));
		m_opsHash.put ( "getPRBSTestResult", Integer.valueOf(9));
		m_opsHash.put ( "createATMMaintenanceEntity", Integer.valueOf(10));
		m_opsHash.put ( "deleteMaintenanceAssociation", Integer.valueOf(11));
		m_opsHash.put ( "getCapabilities", Integer.valueOf(12));
		m_opsHash.put ( "setServiceAlarmReportingOff", Integer.valueOf(13));
		m_opsHash.put ( "createMaintenanceDomain", Integer.valueOf(14));
		m_opsHash.put ( "setAdditionalInfo", Integer.valueOf(15));
		m_opsHash.put ( "setOwner", Integer.valueOf(16));
		m_opsHash.put ( "getAllMaintenanceAssociations", Integer.valueOf(17));
		m_opsHash.put ( "createMaintenancePoints", Integer.valueOf(18));
		m_opsHash.put ( "createMaintenanceAssociation", Integer.valueOf(19));
		m_opsHash.put ( "deleteMaintenancePoint", Integer.valueOf(20));
		m_opsHash.put ( "getAllMaintenanceDomains", Integer.valueOf(21));
		m_opsHash.put ( "getAllMaintenancePoints", Integer.valueOf(22));
		m_opsHash.put ( "enablePRBSTest", Integer.valueOf(23));
		m_opsHash.put ( "deleteMaintenanceDomain", Integer.valueOf(24));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/maintenanceOps/MaintenanceMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_I _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_I __r = mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IHelper.narrow(__o);
		return __r;
	}
	public mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_I _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_I __r = mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IHelper.narrow(__o);
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
			case 0: // setNativeEMSName
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
			case 1: // performMaintenanceOperationEx
			{
			try
			{
				mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_T _arg0=mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_THelper.read(_input);
				mtnm.tmforum.org.maintenanceOps.MaintenanceOperationMode_T _arg1=mtnm.tmforum.org.maintenanceOps.MaintenanceOperationMode_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg2= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				performMaintenanceOperationEx(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getActiveMaintenanceOperations
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationList_THolder _arg2= new mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationList_THolder();
				mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationIterator_IHolder _arg3= new mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationIterator_IHolder();
				_out = handler.createReply();
				getActiveMaintenanceOperations(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperationIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setOAMParameters
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				mtnm.tmforum.org.transmissionParameters.LayeredParameters_T[] _arg2=mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.read(_input);
				mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THolder _arg3= new mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THolder();
				_out = handler.createReply();
				setOAMParameters(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getOAMParameters
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder _arg1= new mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder();
				_out = handler.createReply();
				getOAMParameters(_arg0,_arg1);
				mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // performMaintenanceOperation
			{
			try
			{
				mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_T _arg0=mtnm.tmforum.org.maintenanceOps.CurrentMaintenanceOperation_THelper.read(_input);
				mtnm.tmforum.org.maintenanceOps.MaintenanceOperationMode_T _arg1=mtnm.tmforum.org.maintenanceOps.MaintenanceOperationMode_THelper.read(_input);
				_out = handler.createReply();
				performMaintenanceOperation(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // disablePRBSTest
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				disablePRBSTest(_arg0,_arg1);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // setUserLabel
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
			case 8: // setServiceAlarmReportingOn
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=mtnm.tmforum.org.maintenanceOps.AlarmEventList_THelper.read(_input);
				_out = handler.createReply();
				setServiceAlarmReportingOn(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getPRBSTestResult
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] _arg0=mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_input);
				mtnm.tmforum.org.maintenanceOps.PRBSTestResultList_THolder _arg1= new mtnm.tmforum.org.maintenanceOps.PRBSTestResultList_THolder();
				_out = handler.createReply();
				getPRBSTestResult(_arg0,_arg1);
				mtnm.tmforum.org.maintenanceOps.PRBSTestResultList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // createATMMaintenanceEntity
			{
			try
			{
				mtnm.tmforum.org.maintenanceOps.HW_ATMMaintenanceEntityAttr_T _arg0=mtnm.tmforum.org.maintenanceOps.HW_ATMMaintenanceEntityAttr_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NVSList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NVSList_THolder();
				_out = handler.createReply();
				createATMMaintenanceEntity(_arg0,_arg1);
				mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // deleteMaintenanceAssociation
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteMaintenanceAssociation(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getCapabilities
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
			case 13: // setServiceAlarmReportingOff
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=mtnm.tmforum.org.maintenanceOps.AlarmEventList_THelper.read(_input);
				_out = handler.createReply();
				setServiceAlarmReportingOff(_arg0,_arg1);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // createMaintenanceDomain
			{
			try
			{
				mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomain_T _arg0=mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomain_THelper.read(_input);
				mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomain_THolder _arg1= new mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomain_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createMaintenanceDomain(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomain_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult481 = _arg2.value;
_out.write_string( tmpResult481 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // setAdditionalInfo
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
			case 16: // setOwner
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
			case 17: // getAllMaintenanceAssociations
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociationList_THolder _arg2= new mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociationList_THolder();
				mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociationIterator_IHolder _arg3= new mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociationIterator_IHolder();
				_out = handler.createReply();
				getAllMaintenanceAssociations(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociationList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociationIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // createMaintenancePoints
			{
			try
			{
				mtnm.tmforum.org.maintenanceOps.HW_MaintenancePointCreateData_T _arg0=mtnm.tmforum.org.maintenanceOps.HW_MaintenancePointCreateData_THelper.read(_input);
				mtnm.tmforum.org.maintenanceOps.HW_MaintenancePoint_THolder _arg1= new mtnm.tmforum.org.maintenanceOps.HW_MaintenancePoint_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createMaintenancePoints(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.maintenanceOps.HW_MaintenancePoint_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult482 = _arg2.value;
_out.write_string( tmpResult482 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // createMaintenanceAssociation
			{
			try
			{
				mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociation_T _arg0=mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociation_THelper.read(_input);
				mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociation_THolder _arg1= new mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociation_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createMaintenanceAssociation(_arg0,_arg1,_arg2);
				mtnm.tmforum.org.maintenanceOps.HW_MaintenanceAssociation_THelper.write(_out,_arg1.value);
				java.lang.String tmpResult483 = _arg2.value;
_out.write_string( tmpResult483 );
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // deleteMaintenancePoint
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteMaintenancePoint(_arg0);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getAllMaintenanceDomains
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainList_THolder _arg2= new mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainList_THolder();
				mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainIterator_IHolder _arg3= new mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainIterator_IHolder();
				_out = handler.createReply();
				getAllMaintenanceDomains(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.maintenanceOps.HW_MaintenanceDomainIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getAllMaintenancePoints
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				mtnm.tmforum.org.maintenanceOps.HW_MaintenancePointList_THolder _arg2= new mtnm.tmforum.org.maintenanceOps.HW_MaintenancePointList_THolder();
				mtnm.tmforum.org.maintenanceOps.HW_MaintenancePointIterator_IHolder _arg3= new mtnm.tmforum.org.maintenanceOps.HW_MaintenancePointIterator_IHolder();
				_out = handler.createReply();
				getAllMaintenancePoints(_arg0,_arg1,_arg2,_arg3);
				mtnm.tmforum.org.maintenanceOps.HW_MaintenancePointList_THelper.write(_out,_arg2.value);
				mtnm.tmforum.org.maintenanceOps.HW_MaintenancePointIterator_IHelper.write(_out,_arg3.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // enablePRBSTest
			{
			try
			{
				mtnm.tmforum.org.maintenanceOps.PRBSTestParameter_T[] _arg0=mtnm.tmforum.org.maintenanceOps.PRBSTestParameterList_THelper.read(_input);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder _arg1= new mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				enablePRBSTest(_arg0,_arg1);
				mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(mtnm.tmforum.org.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // deleteMaintenanceDomain
			{
			try
			{
				mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] _arg0=mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteMaintenanceDomain(_arg0);
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
