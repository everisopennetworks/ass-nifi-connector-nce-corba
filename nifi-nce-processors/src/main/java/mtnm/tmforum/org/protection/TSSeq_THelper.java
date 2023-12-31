package mtnm.tmforum.org.protection;

/**
 * Generated from IDL alias "TSSeq_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class TSSeq_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, short[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static short[] extract (final org.omg.CORBA.Any any)
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
			synchronized(TSSeq_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.protection.TSSeq_THelper.id(), "TSSeq_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4))));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/protection/TSSeq_T:1.0";
	}
	public static short[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		short[] _result;
		int _l_result153 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result153 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result153);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new short[_l_result153];
		_in.read_ushort_array(_result,0,_l_result153);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, short[] _s)
	{
		
		_out.write_long(_s.length);
		_out.write_ushort_array(_s,0,_s.length);
	}
}
