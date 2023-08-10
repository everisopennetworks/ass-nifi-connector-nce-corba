package mtnm.huawei.com.HW_mstpService;


/**
 * Generated from IDL interface "HW_MSTPServiceMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface HW_MSTPServiceMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void createEthService(mtnm.huawei.com.HW_mstpService.HW_EthServiceCreateData_T createData, mtnm.huawei.com.HW_mstpService.HW_EthServiceList_THolder ethServiceList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteEthService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllEthService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, mtnm.huawei.com.HW_mstpService.HW_EthServiceType_T[] typeList, int how_many, mtnm.huawei.com.HW_mstpService.HW_EthServiceList_THolder serviceList, mtnm.huawei.com.HW_mstpService.HW_EthServiceIterator_IHolder serviceIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getEthService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName, mtnm.huawei.com.HW_mstpService.HW_EthService_THolder ethService) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void createAtmService(mtnm.huawei.com.HW_mstpService.HW_AtmServiceCreateData_T createData, mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder atmService) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deleteAtmService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAllAtmService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] meName, mtnm.huawei.com.HW_mstpService.HW_AtmServiceType_T[] typeList, int how_many, mtnm.huawei.com.HW_mstpService.HW_AtmServiceList_THolder serviceList, mtnm.huawei.com.HW_mstpService.HW_AtmServiceIterator_IHolder serviceIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void getAtmService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName, mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder atmService) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void activateAtmService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName, mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder atmService) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void deactivateAtmService(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] serviceName, mtnm.huawei.com.HW_mstpService.HW_AtmService_THolder atmService) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
