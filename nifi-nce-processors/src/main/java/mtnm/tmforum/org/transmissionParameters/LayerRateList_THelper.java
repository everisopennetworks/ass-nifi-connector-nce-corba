package mtnm.tmforum.org.transmissionParameters;

/**
 * Generated from IDL alias "LayerRateList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class LayerRateList_THelper
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
			synchronized(LayerRateList_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.transmissionParameters.LayerRateList_THelper.id(), "LayerRateList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.transmissionParameters.LayerRate_THelper.type()));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/transmissionParameters/LayerRateList_T:1.0";
	}
	public static short[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		short[] _result;
		int _l_result189 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result189 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result189);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new short[_l_result189];
		_in.read_short_array(_result,0,_l_result189);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, short[] _s)
	{
		
		_out.write_long(_s.length);
		_out.write_short_array(_s,0,_s.length);
	}
}
