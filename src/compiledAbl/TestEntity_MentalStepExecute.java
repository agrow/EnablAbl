package compiledAbl;

import abl.runtime.*;
import wm.WME;
import wm.WorkingMemorySet;
import wm.WMEIndex;
import wm.TrackedWorkingMemory;
import java.util.*;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import abl.learning.*;
import java.lang.*;
import javaPackage.*;
import wm.WME;
import wm.ScorableWME;
import wm.WorkingMemory;
import abl.runtime.Rulegroup;
import abl.runtime.Rule;
public class TestEntity_MentalStepExecute {
   static public void mentalExecute0(int __$stepID, final Object[] __$behaviorFrame, final BehavingEntity __$thisEntity, MentalStep __$thisStep) {
      switch (__$stepID) {
         case 0: {
            // testEntityWMETest_1Step1
            System.out.println(" from WMETest");
            __$behaviorFrame[0] = new TestWME(666 , "boop");
            __$thisEntity.addWME(((TestWME)__$behaviorFrame[0]));
            break;
         }
         case 5: {
            // testEntityWMETest_boop_1Step1
            System.out.println("  BOOPED YOU!!!!!");
            break;
         }
         case 6: {
            // testEntityWMETest_boop_2Step1
            System.out.println("  Booped You...?");
            break;
         }
         case 7: {
            // TestEntity_RootCollectionBehaviorStep1
            System.out.println(((TestEntity)__$thisEntity).s);
            break;
         }
      default:
         throw new AblRuntimeError("Unexpected stepID " + __$stepID);
      }
   }
}
