package mtnm.tmforum.org.notifications;
/**
 * Generated from IDL enum "FileTransferStatus_T".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public final class FileTransferStatus_T
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _FT_IN_PROGRESS = 0;
	public static final FileTransferStatus_T FT_IN_PROGRESS = new FileTransferStatus_T(_FT_IN_PROGRESS);
	public static final int _FT_FAILED = 1;
	public static final FileTransferStatus_T FT_FAILED = new FileTransferStatus_T(_FT_FAILED);
	public static final int _FT_COMPLETED = 2;
	public static final FileTransferStatus_T FT_COMPLETED = new FileTransferStatus_T(_FT_COMPLETED);
	public int value()
	{
		return value;
	}
	public static FileTransferStatus_T from_int(int value)
	{
		switch (value) {
			case _FT_IN_PROGRESS: return FT_IN_PROGRESS;
			case _FT_FAILED: return FT_FAILED;
			case _FT_COMPLETED: return FT_COMPLETED;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _FT_IN_PROGRESS: return "FT_IN_PROGRESS";
			case _FT_FAILED: return "FT_FAILED";
			case _FT_COMPLETED: return "FT_COMPLETED";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected FileTransferStatus_T(int i)
	{
		value = i;
	}
	/**
	 * Designate replacement object when deserialized from stream. See
	 * http://www.omg.org/docs/ptc/02-01-03.htm#Issue4271
	 *
	 * @throws java.io.ObjectStreamException
	 */
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
