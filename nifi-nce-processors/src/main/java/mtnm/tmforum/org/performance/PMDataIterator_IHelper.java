package mtnm.tmforum.org.performance;


/**
 * Generated from IDL interface "PMDataIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class PMDataIterator_IHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PMDataIterator_IHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/performance/PMDataIterator_I:1.0", "PMDataIterator_I");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.performance.PMDataIterator_I s)
	{
			any.insert_Object(s);
	}
	public static mtnm.tmforum.org.performance.PMDataIterator_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMDataIterator_I:1.0";
	}
	public static PMDataIterator_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(mtnm.tmforum.org.performance._PMDataIterator_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final mtnm.tmforum.org.performance.PMDataIterator_I s)
	{
		_out.write_Object(s);
	}
	public static mtnm.tmforum.org.performance.PMDataIterator_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof mtnm.tmforum.org.performance.PMDataIterator_I)
		{
			return (mtnm.tmforum.org.performance.PMDataIterator_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/performance/PMDataIterator_I:1.0"))
		{
			mtnm.tmforum.org.performance._PMDataIterator_IStub stub;
			stub = new mtnm.tmforum.org.performance._PMDataIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static mtnm.tmforum.org.performance.PMDataIterator_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof mtnm.tmforum.org.performance.PMDataIterator_I)
		{
			return (mtnm.tmforum.org.performance.PMDataIterator_I)obj;
		}
		else
		{
			mtnm.tmforum.org.performance._PMDataIterator_IStub stub;
			stub = new mtnm.tmforum.org.performance._PMDataIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
