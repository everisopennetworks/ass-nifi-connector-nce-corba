package mtnm.tmforum.org.notifications;

/**
 * Generated from IDL alias "NVList_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class NVList_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, mtnm.tmforum.org.notifications.NameAndAnyValue_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static mtnm.tmforum.org.notifications.NameAndAnyValue_T[] extract (final org.omg.CORBA.Any any)
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
			synchronized(NVList_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.notifications.NVList_THelper.id(), "NVList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.notifications.NameAndAnyValue_THelper.id(),"NameAndAnyValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(11)), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/NVList_T:1.0";
	}
	public static mtnm.tmforum.org.notifications.NameAndAnyValue_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		mtnm.tmforum.org.notifications.NameAndAnyValue_T[] _result;
		int _l_result126 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result126 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result126);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new mtnm.tmforum.org.notifications.NameAndAnyValue_T[_l_result126];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=mtnm.tmforum.org.notifications.NameAndAnyValue_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, mtnm.tmforum.org.notifications.NameAndAnyValue_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			mtnm.tmforum.org.notifications.NameAndAnyValue_THelper.write(_out,_s[i]);
		}

	}
}
