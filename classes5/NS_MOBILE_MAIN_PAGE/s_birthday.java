package NS_MOBILE_MAIN_PAGE;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;

public final class s_birthday
  extends JceStruct
{
  static ArrayList cache_datalist;
  public int allnum;
  public ArrayList datalist;
  public int undealnum;
  
  public s_birthday()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public s_birthday(int paramInt1, ArrayList paramArrayList, int paramInt2)
  {
    this.allnum = paramInt1;
    this.datalist = paramArrayList;
    this.undealnum = paramInt2;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.allnum = paramJceInputStream.read(this.allnum, 0, false);
    if (cache_datalist == null)
    {
      cache_datalist = new ArrayList();
      s_user locals_user = new s_user();
      cache_datalist.add(locals_user);
    }
    this.datalist = ((ArrayList)paramJceInputStream.read(cache_datalist, 1, false));
    this.undealnum = paramJceInputStream.read(this.undealnum, 2, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.allnum, 0);
    if (this.datalist != null) {
      paramJceOutputStream.write(this.datalist, 1);
    }
    paramJceOutputStream.write(this.undealnum, 2);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\NS_MOBILE_MAIN_PAGE\s_birthday.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */