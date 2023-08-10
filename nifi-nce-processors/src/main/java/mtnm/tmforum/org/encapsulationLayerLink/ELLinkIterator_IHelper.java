package mtnm.tmforum.org.encapsulationLayerLink;


/**
 * Generated from IDL interface "ELLinkIterator_I".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13/07/2021 04:51:40 PM
 */

public abstract class ELLinkIterator_IHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ELLinkIterator_IHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/encapsulationLayerLink/ELLinkIterator_I:1.0", "ELLinkIterator_I");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_I s)
	{
			any.insert_Object(s);
	}
	public static mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/encapsulationLayerLink/ELLinkIterator_I:1.0";
	}
	public static ELLinkIterator_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(mtnm.tmforum.org.encapsulationLayerLink._ELLinkIterator_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_I s)
	{
		_out.write_Object(s);
	}
	public static mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_I)
		{
			return (mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/encapsulationLayerLink/ELLinkIterator_I:1.0"))
		{
			mtnm.tmforum.org.encapsulationLayerLink._ELLinkIterator_IStub stub;
			stub = new mtnm.tmforum.org.encapsulationLayerLink._ELLinkIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_I)
		{
			return (mtnm.tmforum.org.encapsulationLayerLink.ELLinkIterator_I)obj;
		}
		else
		{
			mtnm.tmforum.org.encapsulationLayerLink._ELLinkIterator_IStub stub;
			stub = new mtnm.tmforum.org.encapsulationLayerLink._ELLinkIterator_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
