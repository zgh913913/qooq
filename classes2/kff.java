import com.tencent.litetransfersdk.LiteTransferWrapper;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class kff
  implements Runnable
{
  public kff(LiteTransferWrapper paramLiteTransferWrapper, String paramString)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    if (LiteTransferWrapper.access$200(this.jdField_a_of_type_ComTencentLitetransfersdkLiteTransferWrapper) != 0L) {
      this.jdField_a_of_type_ComTencentLitetransfersdkLiteTransferWrapper.SetDefaultPathToJNI(LiteTransferWrapper.access$200(this.jdField_a_of_type_ComTencentLitetransfersdkLiteTransferWrapper), this.jdField_a_of_type_JavaLangString);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\kff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */