import com.tencent.mobileqq.activity.TroopMemberListActivity.ATroopMember;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.Comparator;

class gef
  implements Comparator
{
  int jdField_a_of_type_Int;
  boolean jdField_a_of_type_Boolean;
  
  public gef(ged paramged, int paramInt, boolean paramBoolean)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_Int = -1;
    this.jdField_a_of_type_Boolean = false;
    this.jdField_a_of_type_Int = paramInt;
    this.jdField_a_of_type_Boolean = paramBoolean;
  }
  
  public int a(TroopMemberListActivity.ATroopMember paramATroopMember1, TroopMemberListActivity.ATroopMember paramATroopMember2)
  {
    int i = -1;
    int k = 1;
    int m = 1;
    int j = 1;
    if (this.jdField_a_of_type_Int == 0) {
      i = paramATroopMember1.jdField_c_of_type_JavaLangString.compareToIgnoreCase(paramATroopMember2.jdField_c_of_type_JavaLangString);
    }
    label92:
    label212:
    do
    {
      do
      {
        do
        {
          do
          {
            return i;
            if (this.jdField_a_of_type_Int != 1) {
              break label92;
            }
            if (paramATroopMember1.b == paramATroopMember2.b) {
              return 0;
            }
            if (paramATroopMember1.b <= paramATroopMember2.b) {
              break;
            }
          } while (this.jdField_a_of_type_Boolean);
          return 1;
          if (this.jdField_a_of_type_Boolean) {}
          for (i = j;; i = -1) {
            return i;
          }
          if (this.jdField_a_of_type_Int != 2) {
            break;
          }
          if (paramATroopMember1.jdField_c_of_type_Long == paramATroopMember2.jdField_c_of_type_Long) {
            return 0;
          }
          if (paramATroopMember1.jdField_c_of_type_Long > paramATroopMember2.jdField_c_of_type_Long)
          {
            if (this.jdField_a_of_type_Boolean) {}
            for (i = k;; i = -1) {
              return i;
            }
          }
        } while (this.jdField_a_of_type_Boolean);
        return 1;
        if (this.jdField_a_of_type_Int != 4) {
          break label212;
        }
        if (paramATroopMember1.jdField_a_of_type_Long == paramATroopMember2.jdField_a_of_type_Long) {
          return 0;
        }
        if (paramATroopMember1.jdField_a_of_type_Long <= paramATroopMember2.jdField_a_of_type_Long) {
          break;
        }
      } while (this.jdField_a_of_type_Boolean);
      return 1;
      if (this.jdField_a_of_type_Boolean) {}
      for (i = m;; i = -1) {
        return i;
      }
      if (this.jdField_a_of_type_Int != 3) {
        break;
      }
      if (paramATroopMember1.jdField_a_of_type_Double == paramATroopMember2.jdField_a_of_type_Double) {
        return 0;
      }
    } while (paramATroopMember1.jdField_a_of_type_Double <= paramATroopMember2.jdField_a_of_type_Double);
    return 1;
    return 0;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\gef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */