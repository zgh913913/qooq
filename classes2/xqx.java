import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import com.tencent.sharp.jni.AudioDeviceInterface;
import com.tencent.sharp.jni.TraeAudioManager;
import com.tencent.sharp.jni.TraeAudioManager.DeviceConfigManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class xqx
  extends xqy
{
  static final int jdField_a_of_type_Int = 2;
  public static final String a = "android.bluetooth.headset.action.AUDIO_STATE_CHANGED";
  static final int jdField_b_of_type_Int = 0;
  public static final String b = "android.bluetooth.headset.action.STATE_CHANGED";
  public static final int c = 0;
  public static final int d = 1;
  Context jdField_a_of_type_AndroidContentContext;
  TraeAudioManager.DeviceConfigManager jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager;
  Class jdField_a_of_type_JavaLangClass;
  Object jdField_a_of_type_JavaLangObject;
  Method jdField_a_of_type_JavaLangReflectMethod;
  Class jdField_b_of_type_JavaLangClass;
  
  public xqx(TraeAudioManager paramTraeAudioManager)
  {
    super(paramTraeAudioManager);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaLangClass = null;
    this.b = null;
    this.jdField_a_of_type_JavaLangObject = null;
    this.jdField_a_of_type_JavaLangReflectMethod = null;
    this.jdField_a_of_type_AndroidContentContext = null;
    this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager = null;
  }
  
  public String a()
  {
    return "BluetoohHeadsetCheckFor2x";
  }
  
  public void a()
  {
    AudioDeviceInterface.LogTraceEntry("");
    if (this.jdField_a_of_type_JavaLangObject == null) {}
    for (;;)
    {
      return;
      try
      {
        localMethod = this.jdField_a_of_type_JavaLangClass.getDeclaredMethod("close", new Class[0]);
        if (localMethod == null) {
          continue;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        try
        {
          Method localMethod;
          localMethod.invoke(this.jdField_a_of_type_JavaLangObject, new Object[0]);
          this.jdField_a_of_type_JavaLangClass = null;
          this.b = null;
          this.jdField_a_of_type_JavaLangObject = null;
          this.jdField_a_of_type_JavaLangReflectMethod = null;
          AudioDeviceInterface.LogTraceExit();
          return;
          localNoSuchMethodException = localNoSuchMethodException;
          if (QLog.isColorLevel()) {
            QLog.e("TRAE", 2, "BTLooperThread _uninitHeadsetfor2x method close NoSuchMethodException");
          }
          Object localObject = null;
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          for (;;) {}
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          for (;;) {}
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          for (;;) {}
        }
      }
    }
  }
  
  void a(Context paramContext, Intent paramIntent)
  {
    int i;
    int j;
    int k;
    if ("android.bluetooth.headset.action.AUDIO_STATE_CHANGED".equals(paramIntent.getAction()))
    {
      i = paramIntent.getIntExtra("android.bluetooth.headset.extra.STATE", -2);
      j = paramIntent.getIntExtra("android.bluetooth.headset.extra.PREVIOUS_STATE", -2);
      k = paramIntent.getIntExtra("android.bluetooth.headset.extra.AUDIO_STATE", -2);
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "++ AUDIO_STATE_CHANGED|  STATE " + i);
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "       PREVIOUS_STATE " + j);
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "       AUDIO_STATE " + k);
      }
      if (k != 2) {}
    }
    do
    {
      do
      {
        this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a("DEVICE_BLUETOOTHHEADSET", true);
        do
        {
          return;
        } while (k != 0);
        this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a("DEVICE_BLUETOOTHHEADSET", false);
        return;
      } while (!"android.bluetooth.headset.action.STATE_CHANGED".equals(paramIntent.getAction()));
      i = paramIntent.getIntExtra("android.bluetooth.headset.extra.STATE", -2);
      j = paramIntent.getIntExtra("android.bluetooth.headset.extra.PREVIOUS_STATE", -2);
      k = paramIntent.getIntExtra("android.bluetooth.headset.extra.AUDIO_STATE", -2);
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "++ STATE_CHANGED|  STATE " + i);
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "       PREVIOUS_STATE " + j);
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "       AUDIO_STATE " + k);
      }
      if (k == 2)
      {
        this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a("DEVICE_BLUETOOTHHEADSET", true);
        return;
      }
    } while (k != 0);
    this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a("DEVICE_BLUETOOTHHEADSET", false);
  }
  
  void a(IntentFilter paramIntentFilter)
  {
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, " " + a() + " _addAction");
    }
    paramIntentFilter.addAction("android.bluetooth.headset.action.AUDIO_STATE_CHANGED");
    paramIntentFilter.addAction("android.bluetooth.headset.action.STATE_CHANGED");
  }
  
  public boolean a()
  {
    String str4 = null;
    if ((this.jdField_a_of_type_JavaLangReflectMethod == null) || (this.jdField_a_of_type_JavaLangReflectMethod == null)) {
      return false;
    }
    try
    {
      Object localObject = this.jdField_a_of_type_JavaLangReflectMethod.invoke(this.jdField_a_of_type_JavaLangObject, new Object[0]);
      if (QLog.isColorLevel())
      {
        StringBuilder localStringBuilder = new StringBuilder().append("BTLooperThread BluetoothHeadset method getCurrentHeadset res:");
        if (localObject != null)
        {
          str4 = " Y";
          QLog.w("TRAE", 2, str4);
        }
      }
      else
      {
        if (localObject == null) {
          break label152;
        }
        return true;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        String str1 = str4;
        if (QLog.isColorLevel())
        {
          QLog.w("TRAE", 2, "BTLooperThread BluetoothHeadset method getCurrentHeadset IllegalArgumentException");
          str1 = str4;
        }
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        String str2 = str4;
        if (QLog.isColorLevel())
        {
          QLog.w("TRAE", 2, "BTLooperThread BluetoothHeadset method getCurrentHeadset IllegalAccessException");
          str2 = str4;
        }
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        String str3 = str4;
        if (QLog.isColorLevel())
        {
          QLog.w("TRAE", 2, "BTLooperThread BluetoothHeadset method getCurrentHeadset InvocationTargetException");
          str3 = str4;
          continue;
          str4 = "N";
        }
      }
    }
    label152:
    return false;
  }
  
  public boolean a(Context paramContext, TraeAudioManager.DeviceConfigManager paramDeviceConfigManager)
  {
    AudioDeviceInterface.LogTraceEntry("");
    this.jdField_a_of_type_AndroidContentContext = paramContext;
    this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager = paramDeviceConfigManager;
    if ((this.jdField_a_of_type_AndroidContentContext == null) || (this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager == null)) {}
    for (;;)
    {
      return false;
      try
      {
        this.jdField_a_of_type_JavaLangClass = Class.forName("android.bluetooth.BluetoothHeadset");
        if (this.jdField_a_of_type_JavaLangClass == null) {
          continue;
        }
      }
      catch (Exception paramDeviceConfigManager)
      {
        try
        {
          this.b = Class.forName("android.bluetooth.BluetoothHeadset$ServiceListener");
          if (this.b != null) {}
        }
        catch (Exception paramDeviceConfigManager)
        {
          try
          {
            this.jdField_a_of_type_JavaLangReflectMethod = this.jdField_a_of_type_JavaLangClass.getDeclaredMethod("getCurrentHeadset", new Class[0]);
            if (this.jdField_a_of_type_JavaLangReflectMethod == null) {
              continue;
            }
          }
          catch (NoSuchMethodException paramDeviceConfigManager)
          {
            try
            {
              do
              {
                for (;;)
                {
                  this.jdField_a_of_type_JavaLangObject = this.jdField_a_of_type_JavaLangClass.getConstructor(new Class[] { Context.class, this.b }).newInstance(new Object[] { paramContext, null });
                  if (this.jdField_a_of_type_JavaLangObject == null) {
                    break;
                  }
                  this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a("DEVICE_BLUETOOTHHEADSET", a());
                  if (!a()) {
                    break label344;
                  }
                  this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a("DEVICE_BLUETOOTHHEADSET", true);
                  this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager.a("DEVICE_BLUETOOTHHEADSET", true);
                  AudioDeviceInterface.LogTraceExit();
                  return true;
                  paramDeviceConfigManager = paramDeviceConfigManager;
                  if (QLog.isColorLevel())
                  {
                    QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset class not found");
                    continue;
                    paramDeviceConfigManager = paramDeviceConfigManager;
                    if (QLog.isColorLevel()) {
                      QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset.ServiceListener class not found:" + paramDeviceConfigManager);
                    }
                  }
                }
                paramDeviceConfigManager = paramDeviceConfigManager;
              } while (!QLog.isColorLevel());
              QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset method getCurrentHeadset NoSuchMethodException");
            }
            catch (IllegalArgumentException paramContext)
            {
              for (;;)
              {
                if (QLog.isColorLevel()) {
                  QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor IllegalArgumentException");
                }
              }
            }
            catch (InstantiationException paramContext)
            {
              for (;;)
              {
                if (QLog.isColorLevel()) {
                  QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor InstantiationException");
                }
              }
            }
            catch (IllegalAccessException paramContext)
            {
              for (;;)
              {
                if (QLog.isColorLevel()) {
                  QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor IllegalAccessException");
                }
              }
            }
            catch (InvocationTargetException paramContext)
            {
              for (;;)
              {
                if (QLog.isColorLevel()) {
                  QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor InvocationTargetException");
                }
              }
            }
            catch (NoSuchMethodException paramContext)
            {
              for (;;)
              {
                if (QLog.isColorLevel())
                {
                  QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor NoSuchMethodException");
                  continue;
                  label344:
                  this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a("DEVICE_BLUETOOTHHEADSET", false);
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\xqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */