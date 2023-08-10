package mtnm.tmforum.org.flowDomain;


/**
 * Generated from IDL interface "FlowDomainMgr_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public class _FlowDomainMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements mtnm.tmforum.org.flowDomain.FlowDomainMgr_I
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private String[] ids = {"IDL:mtnm.tmforum.org/flowDomain/FlowDomainMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = mtnm.tmforum.org.flowDomain.FlowDomainMgr_IOperations.class;
	public void getFDFrsWithTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] tpName, int how_many, mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder fdfrList, mtnm.tmforum.org.flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getFDFrsWithTP", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,tpName);
					_os.write_ulong(how_many);
					_is = _invoke(_os);
					fdfrList.value = mtnm.tmforum.org.flowDomainFragment.FDFrList_THelper.read(_is);
					fdfrIt.value = mtnm.tmforum.org.flowDomainFragment.FDFrIterator_IHelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFrsWithTP", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getFDFrsWithTP(tpName,how_many,fdfrList,fdfrIt);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void associateCPTPsWithFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "associateCPTPsWithFlowDomain", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdName);
					mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_os,tpNames);
					_is = _invoke(_os);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "associateCPTPsWithFlowDomain", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.associateCPTPsWithFlowDomain(fdName,tpNames);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void createFDFr(mtnm.tmforum.org.flowDomainFragment.FDFrCreateData_T createData, mtnm.tmforum.org.flowDomain.ConnectivityRequirement_T connectivityRequirement, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder endTPs, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder internalTPs, mtnm.tmforum.org.flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrs, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "createFDFr", true);
					mtnm.tmforum.org.flowDomainFragment.FDFrCreateData_THelper.write(_os,createData);
					mtnm.tmforum.org.flowDomain.ConnectivityRequirement_THelper.write(_os,connectivityRequirement);
					mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_os,endTPs.value);
					mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_os,internalTPs.value);
					mtnm.tmforum.org.flowDomainFragment.MatrixFlowDomainFragmentList_THelper.write(_os,mfdfrs.value);
					mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
					_is = _invoke(_os);
					endTPs.value = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_is);
					internalTPs.value = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_is);
					mfdfrs.value = mtnm.tmforum.org.flowDomainFragment.MatrixFlowDomainFragmentList_THelper.read(_is);
					tpsToModify.value = mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.read(_is);
					theFDFr.value = mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.read(_is);
					errorReason.value = _is.read_string();
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createFDFr", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.createFDFr(createData,connectivityRequirement,endTPs,internalTPs,mfdfrs,tpsToModify,theFDFr,errorReason);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void createMFD(mtnm.tmforum.org.flowDomain.MFDCreateData_T createData, mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder theMFD) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "createMFD", true);
					mtnm.tmforum.org.flowDomain.MFDCreateData_THelper.write(_os,createData);
					_is = _invoke(_os);
					theMFD.value = mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createMFD", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.createMFD(createData,theMFD);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void unassignCPTPsFromMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "unassignCPTPsFromMFD", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,mfdName);
					mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_os,tpNames);
					_is = _invoke(_os);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "unassignCPTPsFromMFD", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.unassignCPTPsFromMFD(mfdName,tpNames);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void activateFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "activateFDFr", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdfrName);
					_is = _invoke(_os);
					fdfr.value = mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "activateFDFr", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.activateFDFr(fdfrName,fdfr);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void deleteMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "deleteMFD", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,mfdName);
					_is = _invoke(_os);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteMFD", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.deleteMFD(mfdName);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getTransmissionParams(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder transmissionParams) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getTransmissionParams", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,name);
					mtnm.tmforum.org.flowDomain.ParameterGroupsList_THelper.write(_os,filter);
					_is = _invoke(_os);
					transmissionParams.value = mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTransmissionParams", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getTransmissionParams(name,filter,transmissionParams);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void addFPsToFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomain.ConnectivityRequirement_T connectivityRequirement, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder tpNames, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder internalTpNames, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "addFPsToFDFr", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdfrName);
					mtnm.tmforum.org.flowDomain.ConnectivityRequirement_THelper.write(_os,connectivityRequirement);
					mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_os,tpNames.value);
					mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_os,internalTpNames.value);
					mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
					_is = _invoke(_os);
					tpNames.value = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_is);
					internalTpNames.value = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_is);
					tpsToModify.value = mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.read(_is);
					errorReason.value = _is.read_string();
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "addFPsToFDFr", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.addFPsToFDFr(fdfrName,connectivityRequirement,tpNames,internalTpNames,tpsToModify,errorReason);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void setOwner(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "setOwner", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,objectName);
					java.lang.String tmpResult156 = owner;
_os.write_string( tmpResult156 );
					_is = _invoke(_os);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setOwner", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.setOwner(objectName,owner);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getFDfromMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.flowDomain.FlowDomain_THolder _flowDomain) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getFDfromMFD", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,mfdName);
					_is = _invoke(_os);
					_flowDomain.value = mtnm.tmforum.org.flowDomain.FlowDomain_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDfromMFD", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getFDfromMFD(mfdName,_flowDomain);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getAssigningMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] cptpName, mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder mfd) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getAssigningMFD", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,cptpName);
					_is = _invoke(_os);
					mfd.value = mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAssigningMFD", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAssigningMFD(cptpName,mfd);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getAllFDFrs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder fdfrList, mtnm.tmforum.org.flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getAllFDFrs", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdName);
					_os.write_ulong(how_many);
					mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.write(_os,connectivityRateList);
					_is = _invoke(_os);
					fdfrList.value = mtnm.tmforum.org.flowDomainFragment.FDFrList_THelper.read(_is);
					fdfrIt.value = mtnm.tmforum.org.flowDomainFragment.FDFrIterator_IHelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFDFrs", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllFDFrs(fdName,how_many,connectivityRateList,fdfrList,fdfrIt);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void deactivateFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "deactivateFDFr", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdfrName);
					_is = _invoke(_os);
					fdfr.value = mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateFDFr", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.deactivateFDFr(fdfrName,fdfr);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getAssignableCPTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getAssignableCPTPs", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,mfdName);
					_os.write_ulong(how_many);
					_is = _invoke(_os);
					tpList.value = mtnm.tmforum.org.terminationPoint.TerminationPointList_THelper.read(_is);
					tpIt.value = mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAssignableCPTPs", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAssignableCPTPs(mfdName,how_many,tpList,tpIt);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void deAssociateCPTPsFromFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "deAssociateCPTPsFromFlowDomain", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdName);
					mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_os,tpNames);
					_is = _invoke(_os);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deAssociateCPTPsFromFlowDomain", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.deAssociateCPTPsFromFlowDomain(fdName,tpNames);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void createFlowDomain(mtnm.tmforum.org.flowDomain.FDCreateData_T createData, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder fdEdgeCPTPs, mtnm.tmforum.org.flowDomain.FlowDomain_THolder theFD, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "createFlowDomain", true);
					mtnm.tmforum.org.flowDomain.FDCreateData_THelper.write(_os,createData);
					mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_os,fdEdgeCPTPs.value);
					_is = _invoke(_os);
					fdEdgeCPTPs.value = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_is);
					theFD.value = mtnm.tmforum.org.flowDomain.FlowDomain_THelper.read(_is);
					errorReason.value = _is.read_string();
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createFlowDomain", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.createFlowDomain(createData,fdEdgeCPTPs,theFD,errorReason);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void deAssociateMFDsFromFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] mfdNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "deAssociateMFDsFromFlowDomain", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdName);
					mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_os,mfdNames);
					_is = _invoke(_os);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deAssociateMFDsFromFlowDomain", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.deAssociateMFDsFromFlowDomain(fdName,mfdNames);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void deleteFTP(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] ftpName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "deleteFTP", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,ftpName);
					_is = _invoke(_os);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteFTP", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.deleteFTP(ftpName);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void deleteFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "deleteFDFr", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdfrName);
					mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
					_is = _invoke(_os);
					tpsToModify.value = mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteFDFr", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.deleteFDFr(fdfrName,tpsToModify);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void createFTP(mtnm.tmforum.org.flowDomain.FTPCreateData_T createData, mtnm.tmforum.org.terminationPoint.TerminationPoint_THolder theFTP) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "createFTP", true);
					mtnm.tmforum.org.flowDomain.FTPCreateData_THelper.write(_os,createData);
					_is = _invoke(_os);
					theFTP.value = mtnm.tmforum.org.terminationPoint.TerminationPoint_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createFTP", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.createFTP(createData,theFTP);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void modifyFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.flowDomain.FDModifyData_T fdModifyData, mtnm.tmforum.org.flowDomain.FlowDomain_THolder newFD) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "modifyFlowDomain", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdName);
					mtnm.tmforum.org.flowDomain.FDModifyData_THelper.write(_os,fdModifyData);
					_is = _invoke(_os);
					newFD.value = mtnm.tmforum.org.flowDomain.FlowDomain_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyFlowDomain", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.modifyFlowDomain(fdName,fdModifyData,newFD);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getAllCPTPs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdOrMfdName, int how_many, mtnm.tmforum.org.terminationPoint.TerminationPointList_THolder tpList, mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHolder tpIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getAllCPTPs", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdOrMfdName);
					_os.write_ulong(how_many);
					_is = _invoke(_os);
					tpList.value = mtnm.tmforum.org.terminationPoint.TerminationPointList_THelper.read(_is);
					tpIt.value = mtnm.tmforum.org.terminationPoint.TerminationPointIterator_IHelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCPTPs", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllCPTPs(fdOrMfdName,how_many,tpList,tpIt);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void deleteFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "deleteFlowDomain", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdName);
					_is = _invoke(_os);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteFlowDomain", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.deleteFlowDomain(fdName);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getAllMFDNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] holderName, int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getAllMFDNames", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,holderName);
					_os.write_ulong(how_many);
					_is = _invoke(_os);
					nameList.value = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_is);
					nameIt.value = mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMFDNames", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllMFDNames(holderName,how_many,nameList,nameIt);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getCapabilities(mtnm.tmforum.org.common.CapabilityList_THolder capabilities) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getCapabilities", true);
					_is = _invoke(_os);
					capabilities.value = mtnm.tmforum.org.common.CapabilityList_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCapabilities", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getCapabilities(capabilities);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void performEthernetOAMCommand(mtnm.tmforum.org.flowDomain.EthernetOAMOperation_T operation, mtnm.tmforum.org.flowDomain.EthernetLTTestResultList_THolder ltTestResult) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "performEthernetOAMCommand", true);
					mtnm.tmforum.org.flowDomain.EthernetOAMOperation_THelper.write(_os,operation);
					_is = _invoke(_os);
					ltTestResult.value = mtnm.tmforum.org.flowDomain.EthernetLTTestResultList_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "performEthernetOAMCommand", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.performEthernetOAMCommand(operation,ltTestResult);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void modifyMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.flowDomain.MFDModifyData_T mfdModifyData, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] transmissionDescriptorName, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder transmissionParams, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalModificationInfo, mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder newMFD, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "modifyMFD", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,mfdName);
					mtnm.tmforum.org.flowDomain.MFDModifyData_THelper.write(_os,mfdModifyData);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,transmissionDescriptorName);
					mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.write(_os,transmissionParams.value);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,additionalModificationInfo.value);
					_is = _invoke(_os);
					transmissionParams.value = mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.read(_is);
					additionalModificationInfo.value = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_is);
					newMFD.value = mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THelper.read(_is);
					errorReason.value = _is.read_string();
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyMFD", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.modifyMFD(mfdName,mfdModifyData,transmissionDescriptorName,transmissionParams,additionalModificationInfo,newMFD,errorReason);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getAllFDFrNames(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getAllFDFrNames", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdName);
					_os.write_ulong(how_many);
					mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.write(_os,connectivityRateList);
					_is = _invoke(_os);
					nameList.value = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_is);
					nameIt.value = mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFDFrNames", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllFDFrNames(fdName,how_many,connectivityRateList,nameList,nameIt);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void removeFPsFromFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder tpNames, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "removeFPsFromFDFr", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdfrName);
					mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_os,tpNames.value);
					_is = _invoke(_os);
					tpNames.value = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_is);
					errorReason.value = _is.read_string();
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "removeFPsFromFDFr", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.removeFPsFromFDFr(fdfrName,tpNames,errorReason);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void modifyFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment.FDFrModifyData_T fdfrModifyData, mtnm.tmforum.org.subnetworkConnection.TPDataList_THolder tpsToModify, mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_T tolerableImpact, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "modifyFDFr", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdfrName);
					mtnm.tmforum.org.flowDomainFragment.FDFrModifyData_THelper.write(_os,fdfrModifyData);
					mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
					mtnm.tmforum.org.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
					_is = _invoke(_os);
					tpsToModify.value = mtnm.tmforum.org.subnetworkConnection.TPDataList_THelper.read(_is);
					newFDFr.value = mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.read(_is);
					errorReason.value = _is.read_string();
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyFDFr", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.modifyFDFr(fdfrName,fdfrModifyData,tpsToModify,tolerableImpact,newFDFr,errorReason);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getFlowDomainsByUserLabel(java.lang.String userLabel, mtnm.tmforum.org.flowDomain.FDList_THolder flowDomains) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getFlowDomainsByUserLabel", true);
					java.lang.String tmpResult157 = userLabel;
_os.write_string( tmpResult157 );
					_is = _invoke(_os);
					flowDomains.value = mtnm.tmforum.org.flowDomain.FDList_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFlowDomainsByUserLabel", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getFlowDomainsByUserLabel(userLabel,flowDomains);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getAllEthernetOAMPoint(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] Fdfrname, mtnm.tmforum.org.flowDomain.EthernetOAMPointList_THolder oamPointList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getAllEthernetOAMPoint", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,Fdfrname);
					_is = _invoke(_os);
					oamPointList.value = mtnm.tmforum.org.flowDomain.EthernetOAMPointList_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllEthernetOAMPoint", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllEthernetOAMPoint(Fdfrname,oamPointList);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getFDFrServerTrail(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder serverNameList) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getFDFrServerTrail", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdfrName);
					_is = _invoke(_os);
					serverNameList.value = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFrServerTrail", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getFDFrServerTrail(fdfrName,serverNameList);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getAllFlowDomainNames(int how_many, mtnm.tmforum.org.globaldefs.NamingAttributesList_THolder nameList, mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHolder nameIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getAllFlowDomainNames", true);
					_os.write_ulong(how_many);
					_is = _invoke(_os);
					nameList.value = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(_is);
					nameIt.value = mtnm.tmforum.org.globaldefs.NamingAttributesIterator_IHelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFlowDomainNames", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllFlowDomainNames(how_many,nameList,nameIt);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void assignCPTPsToMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] tpNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "assignCPTPsToMFD", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,mfdName);
					mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_os,tpNames);
					_is = _invoke(_os);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "assignCPTPsToMFD", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.assignCPTPsToMFD(mfdName,tpNames);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getFDFrsByUserLabel(java.lang.String userLabel, mtnm.tmforum.org.flowDomainFragment.FDFrList_THolder fdfrs) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getFDFrsByUserLabel", true);
					java.lang.String tmpResult158 = userLabel;
_os.write_string( tmpResult158 );
					_is = _invoke(_os);
					fdfrs.value = mtnm.tmforum.org.flowDomainFragment.FDFrList_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFrsByUserLabel", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getFDFrsByUserLabel(userLabel,fdfrs);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getAllFlowDomains(int how_many, mtnm.tmforum.org.flowDomain.FDList_THolder flowDomains, mtnm.tmforum.org.flowDomain.FDIterator_IHolder fdIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getAllFlowDomains", true);
					_os.write_ulong(how_many);
					_is = _invoke(_os);
					flowDomains.value = mtnm.tmforum.org.flowDomain.FDList_THelper.read(_is);
					fdIt.value = mtnm.tmforum.org.flowDomain.FDIterator_IHelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFlowDomains", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllFlowDomains(how_many,flowDomains,fdIt);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void associateMFDsWithFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.globaldefs.NameAndStringValue_T[][] mfdNames) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "associateMFDsWithFlowDomain", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdName);
					mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(_os,mfdNames);
					_is = _invoke(_os);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "associateMFDsWithFlowDomain", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.associateMFDsWithFlowDomain(fdName,mfdNames);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void setUserLabel(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "setUserLabel", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,objectName);
					java.lang.String tmpResult159 = userLabel;
_os.write_string( tmpResult159 );
					_os.write_boolean(enforceUniqueness);
					_is = _invoke(_os);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setUserLabel", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.setUserLabel(objectName,userLabel,enforceUniqueness);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getFDFr(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdfrName, mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getFDFr", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdfrName);
					_is = _invoke(_os);
					fdfr.value = mtnm.tmforum.org.flowDomainFragment.FlowDomainFragment_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFr", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getFDFr(fdfrName,fdfr);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THolder mfd) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getMFD", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,mfdName);
					_is = _invoke(_os);
					mfd.value = mtnm.tmforum.org.flowDomain.MatrixFlowDomain_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMFD", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getMFD(mfdName,mfd);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void validateTMDAssignmentToMFD(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] mfdName, org.omg.CORBA.StringHolder tmdAssignmentState, mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THolder transmissionParams, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalTPInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "validateTMDAssignmentToMFD", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,mfdName);
					_is = _invoke(_os);
					tmdAssignmentState.value = _is.read_string();
					transmissionParams.value = mtnm.tmforum.org.transmissionParameters.LayeredParameterList_THelper.read(_is);
					additionalTPInfo.value = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "validateTMDAssignmentToMFD", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.validateTMDAssignmentToMFD(mfdName,tmdAssignmentState,transmissionParams,additionalTPInfo);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getFlowDomain(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] fdName, mtnm.tmforum.org.flowDomain.FlowDomain_THolder _flowDomain) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getFlowDomain", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,fdName);
					_is = _invoke(_os);
					_flowDomain.value = mtnm.tmforum.org.flowDomain.FlowDomain_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFlowDomain", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getFlowDomain(fdName,_flowDomain);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void getAllMFDs(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] holderName, int how_many, mtnm.tmforum.org.flowDomain.MFDList_THolder mfds, mtnm.tmforum.org.flowDomain.MFDIterator_IHolder mfdIt) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "getAllMFDs", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,holderName);
					_os.write_ulong(how_many);
					_is = _invoke(_os);
					mfds.value = mtnm.tmforum.org.flowDomain.MFDList_THelper.read(_is);
					mfdIt.value = mtnm.tmforum.org.flowDomain.MFDIterator_IHelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMFDs", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.getAllMFDs(holderName,how_many,mfds,mfdIt);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void setAdditionalInfo(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, mtnm.tmforum.org.globaldefs.NVSList_THolder additionalInfo) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "setAdditionalInfo", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,objectName);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
					_is = _invoke(_os);
					additionalInfo.value = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setAdditionalInfo", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.setAdditionalInfo(objectName,additionalInfo);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

	public void setNativeEMSName(mtnm.tmforum.org.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws mtnm.tmforum.org.globaldefs.ProcessingFailureException
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "setNativeEMSName", true);
					mtnm.tmforum.org.globaldefs.NVSList_THelper.write(_os,objectName);
					java.lang.String tmpResult160 = nativeEMSName;
_os.write_string( tmpResult160 );
					_is = _invoke(_os);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
						{
							throw mtnm.tmforum.org.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setNativeEMSName", _opsClass );
			if( _so == null )
				continue;
			FlowDomainMgr_IOperations _localServant = (FlowDomainMgr_IOperations)_so.servant;
			try
			{
				_localServant.setNativeEMSName(objectName,nativeEMSName);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (mtnm.tmforum.org.globaldefs.ProcessingFailureException ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

}
