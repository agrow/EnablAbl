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
public class TestEntity_Preconditions {
   static public boolean precondition0(int __$behaviorID, Object[] __$args, Map __$variableTable, final BehavingEntity __$thisEntity) {
      switch (__$behaviorID) {
         case 2: {
            // testEntityWMETest_boop_1
            TestWME myTestWME;
               List wmeList0;
               ListIterator wmeIter0;
               wmeList0 = BehavingEntity.getBehavingEntity().lookupWME("TestWME");
               wmeIter0 = wmeList0.listIterator();
               while(wmeIter0.hasNext()) {
                  TestWME wme__0 = (TestWME)wmeIter0.next();
                  myTestWME = wme__0;
                  if (
                     true
                  )

                  {
                        if (
                           myTestWME.getS().equals("boop")
                        )

                        {
                           __$variableTable.put("myTestWME", new ObjectWrapper(myTestWME));
                           return true;
                        }


                  }

               }


            return false;
         }
      default:
         throw new AblRuntimeError("Unexpected behaviorID " + __$behaviorID);
      }
   }
}
