package com.tencent.pb.clubcontent;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class ClubContentUpdateInfoPb$ReqItemInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "str_name", "uint_version" }, new Object[] { "", Integer.valueOf(0) }, ReqItemInfo.class);
  public final PBStringField str_name = PBField.initString("");
  public final PBUInt32Field uint_version = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\pb\clubcontent\ClubContentUpdateInfoPb$ReqItemInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */