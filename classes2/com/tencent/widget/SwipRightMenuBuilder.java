package com.tencent.widget;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.Stack;

public abstract class SwipRightMenuBuilder
{
  private final SwipRightMenuBuilder.SwipRightMenuItem[] a;
  protected final Stack[] a;
  protected String b;
  protected final int e;
  
  public SwipRightMenuBuilder(int paramInt1, int paramInt2)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.b = SwipRightMenuBuilder.class.getSimpleName();
    this.e = paramInt1;
    if ((this.e < 0) || ((this.e > 0) && (paramInt2 < 1))) {
      throw new IllegalArgumentException("SwipRightMenuBuilder, menuTypeCount = " + paramInt2);
    }
    this.jdField_a_of_type_ArrayOfJavaUtilStack = new Stack[paramInt2];
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      this.jdField_a_of_type_ArrayOfJavaUtilStack[paramInt1] = new Stack();
      paramInt1 += 1;
    }
    this.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem = new SwipRightMenuBuilder.SwipRightMenuItem[this.e];
    paramInt1 = i;
    while (paramInt1 < this.e)
    {
      this.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[paramInt1] = new SwipRightMenuBuilder.SwipRightMenuItem();
      paramInt1 += 1;
    }
  }
  
  private void a(SwipRightMenuBuilder.SwipRightMenuItem paramSwipRightMenuItem)
  {
    if (paramSwipRightMenuItem == null) {
      return;
    }
    if (paramSwipRightMenuItem.jdField_a_of_type_AndroidViewView != null)
    {
      ??? = paramSwipRightMenuItem.jdField_a_of_type_AndroidViewView.getParent();
      if (??? != null) {
        break label74;
      }
    }
    synchronized (this.jdField_a_of_type_ArrayOfJavaUtilStack)
    {
      for (;;)
      {
        if ((paramSwipRightMenuItem.jdField_a_of_type_Int >= 0) && (paramSwipRightMenuItem.jdField_a_of_type_Int < this.jdField_a_of_type_ArrayOfJavaUtilStack.length)) {
          this.jdField_a_of_type_ArrayOfJavaUtilStack[paramSwipRightMenuItem.jdField_a_of_type_Int].push(paramSwipRightMenuItem.jdField_a_of_type_AndroidViewView);
        }
        paramSwipRightMenuItem.a();
        return;
        label74:
        if (!(??? instanceof ViewGroup)) {
          break;
        }
        ((ViewGroup)???).removeView(paramSwipRightMenuItem.jdField_a_of_type_AndroidViewView);
      }
      throw new IllegalArgumentException("recycleMenuView, parent is not ViewGroup");
    }
  }
  
  public int a(Context paramContext, View paramView, int paramInt, Object paramObject, SwipRightMenuBuilder.SwipItemBaseHolder paramSwipItemBaseHolder, View.OnClickListener paramOnClickListener)
  {
    int i = 0;
    if ((!(paramView instanceof LinearLayout)) || (paramSwipItemBaseHolder == null) || (paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem == null) || (paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem.length == 0) || (paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem.length > this.e)) {
      return 0;
    }
    LinearLayout localLinearLayout = (LinearLayout)paramView;
    a(paramInt, paramObject, this.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem);
    int j = 0;
    int n = 0;
    while (n < this.e)
    {
      if ((this.jdField_a_of_type_ArrayOfJavaUtilStack.length > 1) && (paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].jdField_a_of_type_Int != this.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].jdField_a_of_type_Int)) {
        a(paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n]);
      }
      paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].jdField_a_of_type_Int = this.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].jdField_a_of_type_Int;
      paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].b = this.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].b;
      paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].c = 0;
      paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].d = -1;
      int k = paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].jdField_a_of_type_Int;
      Object localObject1 = paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].jdField_a_of_type_AndroidViewView;
      int m;
      if ((k < 0) || (k >= this.jdField_a_of_type_ArrayOfJavaUtilStack.length))
      {
        m = j;
        k = i;
        if (localObject1 != null)
        {
          ((View)localObject1).setVisibility(8);
          k = j + 1;
          j = i;
          i = k;
          n += 1;
          k = j;
          j = i;
          i = k;
        }
      }
      else
      {
        int i1;
        if (localObject1 == null)
        {
          synchronized (this.jdField_a_of_type_ArrayOfJavaUtilStack)
          {
            if (!this.jdField_a_of_type_ArrayOfJavaUtilStack[k].isEmpty()) {
              localObject1 = (View)this.jdField_a_of_type_ArrayOfJavaUtilStack[k].pop();
            }
            ??? = localObject1;
            if (localObject1 == null) {
              ??? = a(paramContext, k);
            }
            if (??? == null) {
              throw new NullPointerException("updateRightMenuView menuView is null");
            }
          }
          paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].jdField_a_of_type_AndroidViewView = ((View)???);
          i1 = 1;
          localObject1 = ???;
        }
        for (;;)
        {
          a(paramInt, paramObject, paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n], paramOnClickListener);
          if (paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].c >= 0) {
            break;
          }
          throw new IllegalArgumentException("updateRightMenuView, menuWidth = " + paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].c);
          i1 = 0;
        }
        i += paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].c;
        j += 1;
        ((View)localObject1).setVisibility(0);
        m = j;
        k = i;
        if (i1 != 0)
        {
          ??? = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
          if (??? != null) {
            break label594;
          }
          ??? = new LinearLayout.LayoutParams(paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].c, paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].d);
          ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)???);
        }
      }
      for (;;)
      {
        ((LinearLayout.LayoutParams)???).gravity = 16;
        localLinearLayout.addView((View)localObject1, j);
        k = i;
        m = j;
        i = m;
        j = k;
        break;
        label594:
        ((LinearLayout.LayoutParams)???).width = paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].c;
        ((LinearLayout.LayoutParams)???).height = paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[n].d;
      }
    }
    paramView.setTag(-3, Integer.valueOf(i));
    return i;
  }
  
  public abstract View a(int paramInt, Object paramObject, SwipRightMenuBuilder.SwipRightMenuItem paramSwipRightMenuItem, View.OnClickListener paramOnClickListener);
  
  public abstract View a(Context paramContext, int paramInt);
  
  public final View a(Context paramContext, View paramView, SwipRightMenuBuilder.SwipItemBaseHolder paramSwipItemBaseHolder, int paramInt)
  {
    if ((paramSwipItemBaseHolder == null) || (paramView == null)) {
      throw new NullPointerException("SwipRightMenuBuilder.createView holder is null or leftView is null");
    }
    if (this.e > 0)
    {
      paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem = new SwipRightMenuBuilder.SwipRightMenuItem[this.e];
      int i = 0;
      while (i < this.e)
      {
        paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[i] = new SwipRightMenuBuilder.SwipRightMenuItem();
        paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[i].jdField_a_of_type_Int = -1;
        paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[i].c = 0;
        paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem[i].jdField_a_of_type_AndroidViewView = null;
        i += 1;
      }
      paramContext = new LinearLayout(paramContext);
      paramContext.setOrientation(0);
      paramContext.addView(paramView, new LinearLayout.LayoutParams(paramInt, -2));
    }
    for (;;)
    {
      paramSwipItemBaseHolder.e = paramView;
      return paramContext;
      paramSwipItemBaseHolder.jdField_a_of_type_ArrayOfComTencentWidgetSwipRightMenuBuilder$SwipRightMenuItem = null;
      paramContext = paramView;
    }
  }
  
  public abstract void a(int paramInt, Object paramObject, SwipRightMenuBuilder.SwipRightMenuItem[] paramArrayOfSwipRightMenuItem);
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\widget\SwipRightMenuBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */