package com.dataline.activities;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.AbsListView.LayoutParams;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bp;
import bq;
import br;
import by;
import com.dataline.util.DataLineReportUtil;
import com.dataline.util.DatalineFilesAdapter;
import com.dataline.util.file.DLFileInfo;
import com.dataline.util.widget.WaitTextView;
import com.dataline.util.widget.WaitTextView.RefreshListener;
import com.tencent.mobileqq.activity.aio.AIOUtils;
import com.tencent.mobileqq.app.DataLineHandler;
import com.tencent.mobileqq.app.DataLineObserver;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.DatalineMessageManager;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.app.proxy.DataLineMsgProxy;
import com.tencent.mobileqq.data.DataLineMsgRecord;
import com.tencent.mobileqq.data.DataLineMsgSet;
import com.tencent.mobileqq.filemanager.data.FileManagerProxy;
import com.tencent.mobileqq.filemanager.util.FMToastUtil;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LiteMutiPicViewerActivity
  extends IphoneTitleBarActivity
  implements View.OnClickListener, WaitTextView.RefreshListener
{
  private static final int jdField_a_of_type_Int = 3;
  public static final String a = "dataline_group_id";
  private Button jdField_a_of_type_AndroidWidgetButton;
  private GridView jdField_a_of_type_AndroidWidgetGridView;
  private ProgressBar jdField_a_of_type_AndroidWidgetProgressBar;
  private RelativeLayout jdField_a_of_type_AndroidWidgetRelativeLayout;
  private TextView jdField_a_of_type_AndroidWidgetTextView;
  private by jdField_a_of_type_By;
  private WaitTextView jdField_a_of_type_ComDatalineUtilWidgetWaitTextView;
  private DataLineObserver jdField_a_of_type_ComTencentMobileqqAppDataLineObserver;
  private DataLineMsgSet jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet;
  private int jdField_b_of_type_Int;
  private TextView jdField_b_of_type_AndroidWidgetTextView;
  private int c;
  private int d;
  private int e;
  private int f;
  
  public LiteMutiPicViewerActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ComTencentMobileqqAppDataLineObserver = new br(this);
  }
  
  private int a(Activity paramActivity)
  {
    return paramActivity.getWindowManager().getDefaultDisplay().getWidth();
  }
  
  private void b()
  {
    this.jdField_a_of_type_AndroidWidgetGridView = ((GridView)findViewById(2131297912));
    this.jdField_a_of_type_AndroidWidgetRelativeLayout = ((RelativeLayout)findViewById(2131300904));
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131300905));
    this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131300906));
    this.jdField_b_of_type_AndroidWidgetTextView.setTextColor(getResources().getColor(2131428262));
    this.jdField_a_of_type_AndroidWidgetProgressBar = ((ProgressBar)findViewById(2131297902));
    this.jdField_a_of_type_AndroidWidgetButton = ((Button)findViewById(2131300907));
    this.jdField_a_of_type_AndroidWidgetTextView.setOnClickListener(this);
    this.jdField_a_of_type_AndroidWidgetButton.setOnClickListener(this);
    this.jdField_a_of_type_ComDatalineUtilWidgetWaitTextView = new WaitTextView(this);
    this.jdField_a_of_type_ComDatalineUtilWidgetWaitTextView.setRefreshListener(this);
    this.jdField_a_of_type_ComDatalineUtilWidgetWaitTextView.setGravity(17);
    this.jdField_a_of_type_ComDatalineUtilWidgetWaitTextView.setTextColor(getResources().getColor(2131428306));
    this.jdField_a_of_type_ComDatalineUtilWidgetWaitTextView.setTextSize(1, 16.0F);
    this.jdField_a_of_type_ComDatalineUtilWidgetWaitTextView.setPadding(0, 0, 0, AIOUtils.a(50.0F, getResources()));
    AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(a(this), -2);
    this.jdField_a_of_type_ComDatalineUtilWidgetWaitTextView.setLayoutParams(localLayoutParams);
    this.jdField_a_of_type_AndroidWidgetGridView.setNumColumns(3);
    this.jdField_a_of_type_AndroidWidgetGridView.setColumnWidth(this.jdField_b_of_type_Int);
    this.jdField_a_of_type_AndroidWidgetGridView.setVerticalSpacing(this.e * 2);
    this.jdField_a_of_type_AndroidWidgetGridView.setHorizontalSpacing(this.d * 2);
    this.jdField_a_of_type_AndroidWidgetGridView.setPadding(this.f, this.jdField_a_of_type_AndroidWidgetGridView.getPaddingTop(), this.f, this.jdField_a_of_type_AndroidWidgetGridView.getPaddingBottom());
    this.jdField_a_of_type_AndroidWidgetGridView.setSelector(new ColorDrawable(0));
    this.jdField_a_of_type_By = new by(this, null);
    this.jdField_a_of_type_AndroidWidgetGridView.setAdapter(this.jdField_a_of_type_By);
    c();
  }
  
  private void c()
  {
    if ((this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.isCanReciveOrResend()) && (!this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.hasSendingOrRecving()))
    {
      this.jdField_a_of_type_AndroidWidgetRelativeLayout.setVisibility(0);
      this.jdField_a_of_type_AndroidWidgetTextView.setVisibility(0);
      this.jdField_b_of_type_AndroidWidgetTextView.setVisibility(4);
      this.jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(4);
      this.jdField_a_of_type_AndroidWidgetButton.setVisibility(4);
      if (this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.isSendFromLocal()) {
        this.jdField_a_of_type_AndroidWidgetTextView.setText(2131362802);
      }
    }
    for (;;)
    {
      this.jdField_a_of_type_By.notifyDataSetChanged();
      return;
      this.jdField_a_of_type_AndroidWidgetTextView.setText(2131362800);
      continue;
      if (this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.hasSendingOrRecving())
      {
        this.jdField_a_of_type_AndroidWidgetRelativeLayout.setVisibility(0);
        this.jdField_a_of_type_AndroidWidgetTextView.setVisibility(4);
        this.jdField_b_of_type_AndroidWidgetTextView.setVisibility(0);
        this.jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(0);
        this.jdField_a_of_type_AndroidWidgetButton.setVisibility(0);
        d();
      }
      else
      {
        this.jdField_a_of_type_AndroidWidgetRelativeLayout.setVisibility(8);
      }
    }
  }
  
  private void d()
  {
    this.jdField_a_of_type_AndroidWidgetProgressBar.setProgress((int)(this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.getTotalProcess() * 100.0F));
    String str = "(" + this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.getCompletedCount() + "/" + this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.getTotalCount() + ")";
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.isSendFromLocal()) {}
    for (int i = 2131362803;; i = 2131362804)
    {
      str = getString(i) + str;
      this.jdField_b_of_type_AndroidWidgetTextView.setText(str);
      return;
    }
  }
  
  private void e()
  {
    setTitle(2131362215);
    this.rightViewImg.setVisibility(4);
    this.rightViewText.setVisibility(4);
  }
  
  private void f()
  {
    Display localDisplay = ((WindowManager)getSystemService("window")).getDefaultDisplay();
    this.f = getResources().getDimensionPixelSize(2131493036);
    this.d = getResources().getDimensionPixelSize(2131493034);
    this.e = getResources().getDimensionPixelSize(2131493035);
    this.jdField_b_of_type_Int = ((localDisplay.getWidth() - this.f * 2 - this.d * 2) / 3);
    this.c = this.jdField_b_of_type_Int;
  }
  
  private void g()
  {
    this.jdField_a_of_type_ComDatalineUtilWidgetWaitTextView.setText(String.format(getString(2131362225), new Object[] { Integer.valueOf(this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.getTotalCount()) }));
  }
  
  public void a()
  {
    if ((this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet != null) && (this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.isTimeOut()) && (this.jdField_a_of_type_By != null)) {
      this.jdField_a_of_type_By.notifyDataSetChanged();
    }
  }
  
  protected boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    setContentView(2130903982);
    int i = getIntent().getIntExtra("dataline_group_id", -1);
    this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet = this.app.a(0).a(i);
    if (this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet == null) {
      this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet = this.app.a(1).a(i);
    }
    addObserver(this.jdField_a_of_type_ComTencentMobileqqAppDataLineObserver);
    f();
    b();
    e();
    g();
    return true;
  }
  
  protected void doOnDestroy()
  {
    super.doOnDestroy();
    if (this.jdField_a_of_type_ComTencentMobileqqAppDataLineObserver != null) {
      removeObserver(this.jdField_a_of_type_ComTencentMobileqqAppDataLineObserver);
    }
    if (this.app.a() != null) {
      this.app.a().e();
    }
  }
  
  public void onClick(View paramView)
  {
    DataLineHandler localDataLineHandler = (DataLineHandler)this.app.a(8);
    Object localObject1;
    Object localObject2;
    switch (paramView.getId())
    {
    case 2131300906: 
    default: 
      return;
    case 2131300905: 
      if (NetworkUtil.e(this))
      {
        if ((FileManagerUtil.a()) && (this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.getFileTotalSize() > 3145728L))
        {
          paramView = new bp(this, localDataLineHandler);
          localObject1 = new bq(this);
          if (this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.isSendFromLocal())
          {
            DialogUtil.a(this, 230, getString(2131362128), getString(2131362851), 2131367262, 2131362134, paramView, (DialogInterface.OnClickListener)localObject1).show();
            return;
          }
          DialogUtil.a(this, 230, getString(2131362131), getString(2131362852), 2131367262, 2131362134, paramView, (DialogInterface.OnClickListener)localObject1).show();
          return;
        }
        this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.setPaused(false);
        if ((this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.getGroupType() == 63536) && (!this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.isSingle())) {
          DataLineReportUtil.p(this.app);
        }
        localObject1 = null;
        paramView = null;
        Iterator localIterator = this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.values().iterator();
        while (localIterator.hasNext())
        {
          DataLineMsgRecord localDataLineMsgRecord = (DataLineMsgRecord)localIterator.next();
          DLFileInfo localDLFileInfo = DatalineFilesAdapter.a(localDataLineMsgRecord);
          if (localDLFileInfo.a == 1)
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new ArrayList();
            }
            ((ArrayList)localObject2).add(localDataLineMsgRecord);
            localObject1 = localObject2;
          }
          else
          {
            if (localDLFileInfo.a != 4)
            {
              localObject2 = paramView;
              if (localDLFileInfo.a != 2) {}
            }
            else if ((localDataLineMsgRecord.fileMsgStatus == 1L) && (localDataLineMsgRecord.strMoloKey != null))
            {
              if (!DataLineMsgSet.isSingle(localDataLineMsgRecord)) {
                break label409;
              }
              DataLineReportUtil.d(this.app);
            }
            for (;;)
            {
              localObject2 = paramView;
              if (paramView == null) {
                localObject2 = new ArrayList();
              }
              ((List)localObject2).add(Long.valueOf(localDataLineMsgRecord.sessionid));
              int i = DataLineMsgRecord.getDevTypeBySeId(localDataLineMsgRecord.sessionid);
              localDataLineMsgRecord.fileMsgStatus = 0L;
              this.app.a().a(i).c(localDataLineMsgRecord.msgId);
              paramView = (View)localObject2;
              break;
              label409:
              DataLineReportUtil.e(this.app);
            }
          }
        }
        if ((localObject1 != null) && (((ArrayList)localObject1).size() > 0)) {
          localDataLineHandler.a((ArrayList)localObject1, true);
        }
        if ((paramView != null) && (paramView.size() > 0)) {
          localDataLineHandler.a(paramView);
        }
        c();
        return;
      }
      FMToastUtil.a(2131368805);
      return;
    }
    this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.setPaused(true);
    if ((this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.getGroupType() == 63536) && (!this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.isSingle())) {
      DataLineReportUtil.o(this.app);
    }
    if ((this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.getGroupType() == 63201) && (!this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.isReportPause))
    {
      this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.isReportPause = true;
      if (!this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.isSingle()) {
        DataLineReportUtil.m(this.app);
      }
    }
    else
    {
      if ((this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.isSingle()) || (this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.getGroupType() == 63201)) {
        break label607;
      }
      localDataLineHandler.a(this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.getGroupId(), 0L, false);
    }
    for (;;)
    {
      c();
      return;
      DataLineReportUtil.k(this.app);
      break;
      label607:
      paramView = this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet.values().iterator();
      while (paramView.hasNext())
      {
        localObject1 = (DataLineMsgRecord)paramView.next();
        localObject2 = DatalineFilesAdapter.a((DataLineMsgRecord)localObject1);
        if ((((DLFileInfo)localObject2).a == 0) || (((DLFileInfo)localObject2).a == 3)) {
          localDataLineHandler.a(((DataLineMsgRecord)localObject1).groupId, ((DataLineMsgRecord)localObject1).sessionid, false);
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\dataline\activities\LiteMutiPicViewerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */