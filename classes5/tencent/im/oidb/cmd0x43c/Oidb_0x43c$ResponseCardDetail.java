package tencent.im.oidb.cmd0x43c;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class Oidb_0x43c$ResponseCardDetail
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField card_id = PBField.initBytes(ByteStringMicro.EMPTY);
  public Oidb_0x43c.CardInfo card_info = new Oidb_0x43c.CardInfo();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "card_id", "card_info" }, new Object[] { localByteStringMicro, null }, ResponseCardDetail.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x43c\Oidb_0x43c$ResponseCardDetail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */