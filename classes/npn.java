import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.biz.anonymous.AnonymousChatHelper;
import com.tencent.mobileqq.activity.BaseChatPie;
import com.tencent.mobileqq.activity.ChatFragment;
import com.tencent.mobileqq.activity.QQBrowserActivity;
import com.tencent.mobileqq.activity.aio.SessionInfo;
import com.tencent.mobileqq.activity.aio.item.StructingMsgItemBuilder;
import com.tencent.mobileqq.activity.aio.item.StructingMsgItemBuilder.ShareInfoHolder;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.ChatMessage;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.troop.data.TroopTopicDetailInfo;
import com.tencent.mobileqq.troop.utils.TroopTopicMgr;

public class npn
  implements View.OnClickListener
{
  public npn(StructingMsgItemBuilder paramStructingMsgItemBuilder)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    Object localObject2;
    switch (paramView.getId())
    {
    case 2131300745: 
    default: 
    case 2131300743: 
    case 2131300744: 
      TroopTopicMgr localTroopTopicMgr;
      do
      {
        TroopTopicDetailInfo localTroopTopicDetailInfo;
        do
        {
          return;
          localObject1 = (StructingMsgItemBuilder.ShareInfoHolder)paramView.getTag();
          localObject2 = ((StructingMsgItemBuilder.ShareInfoHolder)localObject1).jdField_a_of_type_ComTencentMobileqqDataChatMessage;
          localTroopTopicMgr = (TroopTopicMgr)this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(97);
          localTroopTopicDetailInfo = localTroopTopicMgr.a((ChatMessage)localObject2);
          paramView.setOnClickListener(null);
          ReportController.b(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "dc00899", "Grp_talk", "", "obj", "link_like", 0, 0, "" + ((ChatMessage)localObject2).frienduin, "", "", "");
        } while ((localTroopTopicDetailInfo == null) || (localTroopTopicDetailInfo.mIsZan));
        localTroopTopicDetailInfo.mLikeNum += 1;
        localTroopTopicDetailInfo.mIsZan = true;
        ((StructingMsgItemBuilder.ShareInfoHolder)localObject1).b.setText(localTroopTopicDetailInfo.mLikeNum + "");
        ((StructingMsgItemBuilder.ShareInfoHolder)localObject1).b.setVisibility(0);
        paramView = paramView.getContext().getResources().getDrawable(2130840209);
        paramView.setBounds(0, 0, paramView.getIntrinsicWidth(), paramView.getIntrinsicHeight());
        ((StructingMsgItemBuilder.ShareInfoHolder)localObject1).jdField_a_of_type_AndroidWidgetTextView.setCompoundDrawables(paramView, null, null, null);
      } while (AnonymousChatHelper.a().a(this.a.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.a));
      localTroopTopicMgr.a((ChatMessage)localObject2, 1, new npo(this));
      return;
    case 2131300746: 
    case 2131300747: 
      localObject1 = ((StructingMsgItemBuilder.ShareInfoHolder)paramView.getTag()).jdField_a_of_type_ComTencentMobileqqDataChatMessage;
      ((FragmentActivity)paramView.getContext()).getChatFragment().a().a((ChatMessage)localObject1, 1);
      ReportController.b(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "dc00899", "Grp_talk", "", "obj", "link_reply", 0, 0, "" + ((ChatMessage)localObject1).frienduin, "", "", "");
      return;
    }
    paramView = (TroopTopicDetailInfo)paramView.getTag();
    Object localObject1 = paramView.mViewCommentUrl;
    if (!TextUtils.isEmpty((CharSequence)localObject1))
    {
      localObject2 = new Intent(this.a.jdField_a_of_type_AndroidContentContext, QQBrowserActivity.class);
      ((Intent)localObject2).putExtra("hide_more_button", true);
      ((Intent)localObject2).putExtra("hide_operation_bar", true);
      ((Intent)localObject2).putExtra("url", (String)localObject1);
      this.a.jdField_a_of_type_AndroidContentContext.startActivity((Intent)localObject2);
      ((Activity)this.a.jdField_a_of_type_AndroidContentContext).overridePendingTransition(2130968592, 0);
    }
    ReportController.b(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "dc00899", "Grp_talk", "", "obj", "link_view", 0, 0, "" + paramView.troopUin, "", "", "");
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\npn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */