package tencent.im.oidb.cmd0x5cf;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class Oidb_0x5cf$DelDecideInfo
  extends MessageMicro
{
  public static final int UINT32_REQ_TYPE_FIELD_NUMBER = 3;
  public static final int UINT32_TIME_FIELD_NUMBER = 2;
  public static final int UINT64_UIN_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24 }, new String[] { "uint64_uin", "uint32_time", "uint32_req_type" }, new Object[] { Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0) }, DelDecideInfo.class);
  public final PBUInt32Field uint32_req_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_time = PBField.initUInt32(0);
  public final PBUInt64Field uint64_uin = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x5cf\Oidb_0x5cf$DelDecideInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */