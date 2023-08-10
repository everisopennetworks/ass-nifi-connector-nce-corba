package mtnm.tmforum.org.notifications;
/**
 * Generated from IDL enum "FileTransferStatus_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class FileTransferStatus_THelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(FileTransferStatus_THelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(mtnm.tmforum.org.notifications.FileTransferStatus_THelper.id(),"FileTransferStatus_T",new String[]{"FT_IN_PROGRESS","FT_FAILED","FT_COMPLETED"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.notifications.FileTransferStatus_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static mtnm.tmforum.org.notifications.FileTransferStatus_T extract (final org.omg.CORBA.Any any)
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
		return "IDL:mtnm.tmforum.org/notifications/FileTransferStatus_T:1.0";
	}
	public static FileTransferStatus_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return FileTransferStatus_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final FileTransferStatus_T s)
	{
		out.write_long(s.value());
	}
}