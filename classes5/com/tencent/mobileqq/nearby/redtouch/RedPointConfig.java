package com.tencent.mobileqq.nearby.redtouch;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.io.Serializable;

public class RedPointConfig
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public int bindLevel;
  public int passThroughLevel;
  public int redPointId;
  public int taskId;
  
  public RedPointConfig()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\nearby\redtouch\RedPointConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */