package mtnm.tmforum.org.guiCutThrough;


/**
 * Generated from IDL interface "GuiCutThroughMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public interface GuiCutThroughMgr_IOperations
	extends mtnm.tmforum.org.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getGCTProfileInfo(mtnm.tmforum.org.guiCutThrough.GCTProfileInfo_THolder gctProfileInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void launchGCT(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String gctContext, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] userInfo, java.lang.String displayAddress, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] additionalInputInfo, org.omg.CORBA.BooleanHolder closingEnabled, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalOutputInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
	void destroyGCT(java.lang.String displayAddress) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException;
}
