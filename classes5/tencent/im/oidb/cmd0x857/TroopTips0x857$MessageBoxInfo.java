package tencent.im.oidb.cmd0x857;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class TroopTips0x857$MessageBoxInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField opt_bytes_button = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField opt_bytes_content = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField opt_bytes_title = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26 }, new String[] { "opt_bytes_content", "opt_bytes_title", "opt_bytes_button" }, new Object[] { localByteStringMicro1, localByteStringMicro2, localByteStringMicro3 }, MessageBoxInfo.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x857\TroopTips0x857$MessageBoxInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */