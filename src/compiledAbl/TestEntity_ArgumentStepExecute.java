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
public class TestEntity_ArgumentStepExecute {
   static public Object[] argumentExecute0(int __$stepID, final Object[] __$behaviorFrame, final BehavingEntity __$thisEntity) {
      switch (__$stepID) {
         case 1: {
            // testEntityWMETest_1Step2
            final Object[] args = __$behaviorFrame;
            return args;
         }
         case 8: {
            // TestEntity_RootCollectionBehaviorStep2
            final Object[] args = __$behaviorFrame;
            return args;
         }
      default:
         throw new AblRuntimeError("Unexpected stepID " + __$stepID);
      }
   }
}
