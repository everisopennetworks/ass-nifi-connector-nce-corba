package mtnm.tmforum.org.subnetworkConnection;


/**
 * Generated from IDL struct "WaveLengthStatus_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class WaveLengthStatus_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(WaveLengthStatus_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.subnetworkConnection.WaveLengthStatus_THelper.id(),"WaveLengthStatus_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("frequency", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("used", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2)), null),new org.omg.CORBA.StructMember("unused", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2)), null),new org.omg.CORBA.StructMember("addtionalInfo", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.id(), "NamingAttributes_T",org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NVSList_THelper.id(), "NVSList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.globaldefs.NameAndStringValue_THelper.id(),"NameAndStringValue_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.subnetworkConnection.WaveLengthStatus_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.subnetworkConnection.WaveLengthStatus_T extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/WaveLengthStatus_T:1.0";
	}
	public static mtnm.tmforum.org.subnetworkConnection.WaveLengthStatus_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.subnetworkConnection.WaveLengthStatus_T result = new mtnm.tmforum.org.subnetworkConnection.WaveLengthStatus_T();
		result.frequency=in.read_string();
		result.used=in.read_short();
		result.unused=in.read_short();
		result.addtionalInfo = mtnm.tmforum.org.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.subnetworkConnection.WaveLengthStatus_T s)
	{
		java.lang.String tmpResult679 = s.frequency;
out.write_string( tmpResult679 );
		out.write_short(s.used);
		out.write_short(s.unused);
		mtnm.tmforum.org.globaldefs.NVSList_THelper.write(out,s.addtionalInfo);
	}
}
