package mtnm.tmforum.org.notifications;
/**
 * Generated from IDL enum "FileTransferStatus_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FileTransferStatus_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public FileTransferStatus_T value;

	public FileTransferStatus_THolder ()
	{
	}
	public FileTransferStatus_THolder (final FileTransferStatus_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return FileTransferStatus_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FileTransferStatus_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		FileTransferStatus_THelper.write (out,value);
	}
}
