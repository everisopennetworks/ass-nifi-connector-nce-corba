package mtnm.tmforum.org.managedElement;


/**
 * Generated from IDL struct "neGroup_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class neGroup_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(neGroup_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(mtnm.tmforum.org.managedElement.neGroup_THelper.id(),"neGroup_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("neGroupName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nameList", org.omg.CORBA.ORB.init().create_alias_tc(mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.id(), "NamingAttributesList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, mtnm.tmforum.org.globaldefs.NamingAttributes_THelper.type())), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.managedElement.neGroup_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.managedElement.neGroup_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/managedElement/neGroup_T:1.0";
	}
	public static mtnm.tmforum.org.managedElement.neGroup_T read (final org.omg.CORBA.portable.InputStream in)
	{
		mtnm.tmforum.org.managedElement.neGroup_T result = new mtnm.tmforum.org.managedElement.neGroup_T();
		result.neGroupName=in.read_string();
		result.nameList = mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final mtnm.tmforum.org.managedElement.neGroup_T s)
	{
		java.lang.String tmpResult493 = s.neGroupName;
out.write_string( tmpResult493 );
		mtnm.tmforum.org.globaldefs.NamingAttributesList_THelper.write(out,s.nameList);
	}
}
