package com.tencent.mobileqq.troop.data;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.StringUtil;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class TroopFeedsDataManager$ProclamationXmlHandler
  extends DefaultHandler
{
  public String a;
  public String b;
  public String c;
  public String d;
  protected String e;
  
  public TroopFeedsDataManager$ProclamationXmlHandler(TroopFeedsDataManager paramTroopFeedsDataManager)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.e != null)
    {
      paramArrayOfChar = new String(paramArrayOfChar, paramInt1, paramInt2);
      if (!this.e.equals("title")) {
        break label46;
      }
      if (StringUtil.b(this.jdField_a_of_type_JavaLangString)) {
        this.jdField_a_of_type_JavaLangString = paramArrayOfChar;
      }
    }
    label46:
    while (!this.e.equals("summary")) {
      return;
    }
    this.c = paramArrayOfChar;
  }
  
  public void endElement(String paramString1, String paramString2, String paramString3)
  {
    this.e = null;
  }
  
  public void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
  {
    if (paramString2.equals("picture")) {
      this.b = paramAttributes.getValue("cover");
    }
    for (;;)
    {
      this.e = paramString2;
      return;
      if (paramString2.equals("msg")) {
        this.d = paramAttributes.getValue("url");
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\troop\data\TroopFeedsDataManager$ProclamationXmlHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */