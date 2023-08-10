package mtnm.tmforum.org.protection;

/**
 * Generated from IDL alias "ProtectionSubnetworkCircle_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ProtectionSubnetworkCircle_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T[][] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T[][] extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ProtectionSubnetworkCircle_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.protection.ProtectionSubnetworkCircle_THelper.id(), "ProtectionSubnetworkCircle_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.protection.ProtectionSubnetworkSection_THelper.type()));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/ProtectionSubnetworkCircle_T:1.0";
	}
	public static mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T[][] read (final org.omg.CORBA.portable.InputStream _in)
	{
		mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T[][] _result;
		int _l_result155 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result155 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result155);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T[_l_result155][];
		for (int i=0;i<_result.length;i++)
		{
			_result[i] = mtnm.tmforum.org.protection.ProtectionSubnetworkSection_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, mtnm.tmforum.org.protection.ProtectionSubnetworkLink_T[][] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			mtnm.tmforum.org.protection.ProtectionSubnetworkSection_THelper.write(_out,_s[i]);
		}

	}
}
