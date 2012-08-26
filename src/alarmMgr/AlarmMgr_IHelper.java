package alarmMgr;


/**
 * Generated from IDL interface "AlarmMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:46
 */

public final class AlarmMgr_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final alarmMgr.AlarmMgr_I s)
	{
			any.insert_Object(s);
	}
	public static alarmMgr.AlarmMgr_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/alarmMgr/AlarmMgr_I:1.0", "AlarmMgr_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/alarmMgr/AlarmMgr_I:1.0";
	}
	public static AlarmMgr_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(alarmMgr._AlarmMgr_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final alarmMgr.AlarmMgr_I s)
	{
		_out.write_Object(s);
	}
	public static alarmMgr.AlarmMgr_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof alarmMgr.AlarmMgr_I)
		{
			return (alarmMgr.AlarmMgr_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/alarmMgr/AlarmMgr_I:1.0"))
		{
			alarmMgr._AlarmMgr_IStub stub;
			stub = new alarmMgr._AlarmMgr_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static alarmMgr.AlarmMgr_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof alarmMgr.AlarmMgr_I)
		{
			return (alarmMgr.AlarmMgr_I)obj;
		}
		else
		{
			alarmMgr._AlarmMgr_IStub stub;
			stub = new alarmMgr._AlarmMgr_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}