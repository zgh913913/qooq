import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.tencent.mobileqq.activity.PhoneUnityBindInfoActivity;
import com.tencent.mobileqq.activity.PhoneUnityVerifyActivity;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.SecSvcObserver;
import com.tencent.mobileqq.equipmentlock.EquipLockWebEntrance;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.widget.ActionSheet;
import java.net.URLEncoder;

public class lzj
  extends SecSvcObserver
{
  public lzj(PhoneUnityBindInfoActivity paramPhoneUnityBindInfoActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(int paramInt, String paramString)
  {
    Object localObject = this.a;
    RelativeLayout localRelativeLayout = this.a.jdField_b_of_type_AndroidWidgetRelativeLayout;
    if (paramInt == 0) {}
    for (int i = 1;; i = 3)
    {
      PhoneUnityBindInfoActivity.a((PhoneUnityBindInfoActivity)localObject, localRelativeLayout, i, 2);
      if (paramInt != 0)
      {
        if (paramInt != 39) {
          break;
        }
        ReportController.b(this.a.app, "CliOper", "", "", "0X8005BFD", "0X8005BFD", 0, 0, "", "", "", "");
        DialogUtil.a(this.a, 230, this.a.getString(2131371011), this.a.getString(2131371012), null, this.a.getString(2131370776), new lzo(this), null).show();
      }
      return;
    }
    localObject = paramString;
    if (TextUtils.isEmpty(paramString)) {
      localObject = this.a.getString(2131371006);
    }
    QQToast.a(this.a, (CharSequence)localObject, 0).b(this.a.getTitleBarHeight());
  }
  
  public void a(boolean paramBoolean, Bundle paramBundle)
  {
    if (this.a.isFinishing()) {
      return;
    }
    PhoneUnityBindInfoActivity.a(this.a);
    if (paramBoolean)
    {
      ActionSheet localActionSheet = this.a.jdField_a_of_type_ComTencentWidgetActionSheet;
      if (localActionSheet != null) {
        localActionSheet.dismiss();
      }
    }
    for (;;)
    {
      PhoneUnityBindInfoActivity.a(this.a, paramBoolean, paramBundle, true);
      return;
      PhoneUnityBindInfoActivity.a(this.a, 2131369830);
    }
  }
  
  public void b(boolean paramBoolean, Bundle paramBundle)
  {
    PhoneUnityBindInfoActivity.a(this.a);
    if (this.a.isFinishing()) {}
    do
    {
      do
      {
        do
        {
          int i;
          do
          {
            return;
            if (paramBoolean) {
              break label570;
            }
            if (paramBundle == null) {
              break label533;
            }
            this.a.jdField_a_of_type_AndroidOsBundle = paramBundle;
            localObject = this.a;
            i = paramBundle.getInt("sso_result", -1);
            if (i != 66) {
              break;
            }
            if (this.a.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog == null)
            {
              this.a.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog = DialogUtil.a((Context)localObject, 230, "绑定冲突", "该手机号码已绑定一个无密码的QQ号，需给原QQ号设置密码后才能解绑并绑定新QQ号。", null, "我知道了", new lzk(this), null);
              this.a.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.setOnCancelListener(new lzl(this));
            }
            if ((this.a.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog != null) && (!this.a.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.isShowing()) && (!this.a.isFinishing()))
            {
              this.a.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.show();
              this.a.e = true;
            }
            paramBundle = this.a.jdField_a_of_type_ComTencentWidgetActionSheet;
          } while (paramBundle == null);
          paramBundle.dismiss();
          return;
          if (i != 65) {
            break;
          }
          if (this.a.jdField_b_of_type_ComTencentMobileqqUtilsQQCustomDialog == null)
          {
            this.a.jdField_b_of_type_ComTencentMobileqqUtilsQQCustomDialog = DialogUtil.a((Context)localObject, 230, "无法绑定", "当前要改绑QQ号未设置密码，无法绑定新的手机号码。请设置密码后重试。", null, "我知道了", new lzm(this), null);
            this.a.jdField_b_of_type_ComTencentMobileqqUtilsQQCustomDialog.setOnCancelListener(new lzn(this));
          }
          if ((this.a.jdField_b_of_type_ComTencentMobileqqUtilsQQCustomDialog != null) && (!this.a.jdField_b_of_type_ComTencentMobileqqUtilsQQCustomDialog.isShowing()) && (!this.a.isFinishing()))
          {
            this.a.jdField_b_of_type_ComTencentMobileqqUtilsQQCustomDialog.show();
            this.a.e = true;
          }
          paramBundle = this.a.jdField_a_of_type_ComTencentWidgetActionSheet;
        } while (paramBundle == null);
        paramBundle.dismiss();
        return;
      } while (!paramBundle.containsKey("skip_url"));
      paramBundle = paramBundle.getString("skip_url");
    } while (TextUtils.isEmpty(paramBundle));
    paramBundle = new StringBuilder(paramBundle);
    paramBundle.append("?");
    paramBundle.append("type=" + EquipLockWebEntrance.d);
    paramBundle.append("&plat=1");
    paramBundle.append("&app=1");
    paramBundle.append("&version=6.5.5.2880");
    paramBundle.append("&device=" + URLEncoder.encode(Build.DEVICE));
    paramBundle.append("&system=" + Build.VERSION.RELEASE);
    paramBundle.append("&systemInt=" + Integer.toString(Build.VERSION.SDK_INT));
    paramBundle = paramBundle.toString();
    Object localObject = new Intent(this.a, PhoneUnityVerifyActivity.class);
    ((Intent)localObject).putExtra("url", paramBundle);
    this.a.startActivityForResult((Intent)localObject, 1006);
    BaseActivity.sTopActivity.overridePendingTransition(2130968592, 0);
    return;
    label533:
    QQToast.a(this.a, this.a.getString(2131371000), 0).b(this.a.getTitleBarHeight());
    this.a.finish();
    return;
    label570:
    PhoneUnityBindInfoActivity.a(this.a);
    if (paramBoolean)
    {
      localObject = this.a.jdField_a_of_type_ComTencentWidgetActionSheet;
      if (localObject != null) {
        ((ActionSheet)localObject).dismiss();
      }
      ReportController.b(this.a.app, "CliOper", "", "", "0X8005D0B", "0X8005D0B", 0, 0, "", "", "", "");
      PhoneUnityBindInfoActivity.a(this.a, paramBoolean, paramBundle, true);
      return;
    }
    PhoneUnityBindInfoActivity.a(this.a, "统一绑定失败，请重新尝试！");
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\lzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */