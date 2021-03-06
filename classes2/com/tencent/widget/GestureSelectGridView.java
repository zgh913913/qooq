package com.tencent.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.concurrent.atomic.AtomicBoolean;
import xti;
import xtj;

public class GestureSelectGridView
  extends GridView
{
  public static final float c = 1.73F;
  float jdField_a_of_type_Float;
  int jdField_a_of_type_Int;
  Handler jdField_a_of_type_AndroidOsHandler = new Handler();
  public AbsListView.OnScrollListener a;
  public GestureSelectGridView.OnSelectListener a;
  Runnable jdField_a_of_type_JavaLangRunnable = new xti(this);
  public AtomicBoolean a;
  public boolean a;
  float b;
  public int b;
  public AtomicBoolean b;
  public boolean b;
  public int c;
  AtomicBoolean c;
  final int d = 20000000;
  
  public GestureSelectGridView(Context paramContext)
  {
    this(paramContext, null);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public GestureSelectGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.jdField_b_of_type_Int = -1;
    this.jdField_c_of_type_Int = -1;
    this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean = new AtomicBoolean(false);
    this.jdField_b_of_type_JavaUtilConcurrentAtomicAtomicBoolean = new AtomicBoolean(false);
    this.jdField_c_of_type_JavaUtilConcurrentAtomicAtomicBoolean = new AtomicBoolean(true);
    this.jdField_a_of_type_Boolean = false;
    this.jdField_b_of_type_Boolean = true;
    this.jdField_a_of_type_Int = (ViewConfiguration.get(paramContext).getScaledTouchSlop() * 15);
    super.setOnScrollListener(new xtj(this));
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = true;
    boolean bool1;
    if (!this.jdField_c_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get()) {
      bool1 = super.onInterceptTouchEvent(paramMotionEvent);
    }
    int i;
    do
    {
      return bool1;
      i = paramMotionEvent.getAction();
      if (i != 2) {
        break;
      }
      bool1 = bool2;
    } while (this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get());
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (i & 0xFF)
    {
    }
    do
    {
      for (;;)
      {
        bool1 = bool2;
        if (this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get()) {
          break;
        }
        return super.onInterceptTouchEvent(paramMotionEvent);
        float f3 = Math.abs(f1 - this.jdField_a_of_type_Float);
        if ((f3 > Math.abs(f2 - this.jdField_b_of_type_Float) * 1.73F) && (f3 > this.jdField_a_of_type_Int))
        {
          this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(true);
          this.jdField_a_of_type_Float = f1;
          this.jdField_b_of_type_Float = f2;
          continue;
          this.jdField_a_of_type_AndroidOsHandler.postDelayed(this.jdField_a_of_type_JavaLangRunnable, 700L);
          this.jdField_a_of_type_Float = f1;
          this.jdField_b_of_type_Float = f2;
          i = b((int)f1, (int)f2);
          if (i != -1)
          {
            this.jdField_c_of_type_Int = i;
            this.jdField_b_of_type_Int = i;
          }
        }
      }
      this.jdField_a_of_type_AndroidOsHandler.removeCallbacks(this.jdField_a_of_type_JavaLangRunnable);
      bool1 = this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get();
      this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(false);
      this.jdField_b_of_type_Int = -1;
      this.jdField_c_of_type_Int = -1;
      this.jdField_b_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(false);
    } while (!bool1);
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.jdField_c_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get()) {
      return super.onTouchEvent(paramMotionEvent);
    }
    int i = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    float f3;
    float f4;
    switch (i & 0xFF)
    {
    default: 
      if (this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get()) {
        return true;
      }
      break;
    case 2: 
      this.jdField_a_of_type_AndroidOsHandler.removeCallbacks(this.jdField_a_of_type_JavaLangRunnable);
      if (!this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get())
      {
        f3 = Math.abs(f1 - this.jdField_a_of_type_Float);
        f4 = Math.abs(f2 - this.jdField_b_of_type_Float);
        if ((f3 > 1.73F * f4) && (f3 > this.jdField_a_of_type_Int))
        {
          this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(true);
          this.jdField_a_of_type_Float = f1;
          this.jdField_b_of_type_Float = f2;
        }
      }
      else
      {
        label163:
        if ((!this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get()) || (this.jdField_a_of_type_Boolean)) {
          break label424;
        }
        if ((f2 < 0.0F) || (f2 > getHeight()))
        {
          this.jdField_a_of_type_Boolean = true;
          if (f2 >= 0.0F) {
            break label402;
          }
          i = -20000000;
          this.jdField_b_of_type_Boolean = false;
        }
      }
      break;
    }
    for (;;)
    {
      label216:
      f(i, 1000000);
      while (this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get())
      {
        if ((!this.jdField_b_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get()) && (this.jdField_b_of_type_Int != -1))
        {
          if (this.jdField_a_of_type_ComTencentWidgetGestureSelectGridView$OnSelectListener != null) {
            this.jdField_a_of_type_ComTencentWidgetGestureSelectGridView$OnSelectListener.b(this.jdField_b_of_type_Int);
          }
          this.jdField_b_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(true);
        }
        i = b((int)f1, (int)f2);
        if (i == -1) {
          break;
        }
        if (this.jdField_b_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get()) {
          break label469;
        }
        this.jdField_c_of_type_Int = i;
        this.jdField_b_of_type_Int = i;
        if (this.jdField_a_of_type_ComTencentWidgetGestureSelectGridView$OnSelectListener != null) {
          this.jdField_a_of_type_ComTencentWidgetGestureSelectGridView$OnSelectListener.b(this.jdField_b_of_type_Int);
        }
        this.jdField_b_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(true);
        break;
        if ((paramMotionEvent.getEventTime() - paramMotionEvent.getDownTime() <= 700L) || (f3 >= 50.0F) || (f4 >= 50.0F)) {
          break label163;
        }
        this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(true);
        this.jdField_a_of_type_Float = f1;
        this.jdField_b_of_type_Float = f2;
        break label163;
        label402:
        if (f2 <= getHeight()) {
          break label627;
        }
        i = 20000000;
        this.jdField_b_of_type_Boolean = true;
        break label216;
        label424:
        if ((this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get()) && (this.jdField_a_of_type_Boolean) && (f2 > 0.0F) && (f2 < getHeight()))
        {
          y();
          this.jdField_a_of_type_Boolean = false;
        }
      }
      label469:
      if (this.jdField_c_of_type_Int == i) {
        break;
      }
      this.jdField_c_of_type_Int = i;
      if ((this.jdField_a_of_type_Boolean) || (this.jdField_a_of_type_ComTencentWidgetGestureSelectGridView$OnSelectListener == null)) {
        break;
      }
      this.jdField_a_of_type_ComTencentWidgetGestureSelectGridView$OnSelectListener.a(this.jdField_b_of_type_Int, this.jdField_c_of_type_Int);
      break;
      this.jdField_a_of_type_Float = f1;
      this.jdField_b_of_type_Float = f2;
      break;
      this.jdField_a_of_type_AndroidOsHandler.removeCallbacks(this.jdField_a_of_type_JavaLangRunnable);
      if (this.jdField_a_of_type_Boolean)
      {
        y();
        this.jdField_a_of_type_Boolean = false;
      }
      boolean bool = this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get();
      this.jdField_b_of_type_Int = -1;
      this.jdField_c_of_type_Int = -1;
      this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(false);
      this.jdField_b_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(false);
      if ((bool) && (this.jdField_a_of_type_ComTencentWidgetGestureSelectGridView$OnSelectListener != null)) {
        this.jdField_a_of_type_ComTencentWidgetGestureSelectGridView$OnSelectListener.g();
      }
      if (!bool) {
        break;
      }
      return true;
      return super.onTouchEvent(paramMotionEvent);
      label627:
      i = 0;
    }
  }
  
  public void setOnIndexChangedListener(GestureSelectGridView.OnSelectListener paramOnSelectListener)
  {
    this.jdField_a_of_type_ComTencentWidgetGestureSelectGridView$OnSelectListener = paramOnSelectListener;
  }
  
  public void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.jdField_a_of_type_ComTencentWidgetAbsListView$OnScrollListener = paramOnScrollListener;
  }
  
  public void setSelectMode(boolean paramBoolean)
  {
    this.jdField_c_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(paramBoolean);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\widget\GestureSelectGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */