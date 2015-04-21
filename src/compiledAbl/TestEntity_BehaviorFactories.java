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
public class TestEntity_BehaviorFactories {
   static public Behavior behaviorFactory0(int __$behaviorID, Object[] __$args, Map __$boundVars, GoalStep __$parentGoal, String __$signature, BehavingEntity __$thisEntity) {
      switch (__$behaviorID) {
         case 1: {
            // testEntityWMETest-0->AnonymousStep1_1
               final Object[] __$behaviorFrame = __$args;

            final __StepDesc[] __$steps = {new __StepDesc(2, TestEntity.__$stepFactory0_rfield), new __StepDesc(3, TestEntity.__$stepFactory0_rfield), new __StepDesc(4, TestEntity.__$stepFactory0_rfield)};
            return new ParallelBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 1, __$behaviorFrame, __$steps, 3);
         }
         case 0: {
            // testEntityWMETest_1
               final Object[] __$behaviorFrame = new Object[1];

            final __StepDesc[] __$steps = {new __StepDesc(0, TestEntity.__$stepFactory0_rfield), new __StepDesc(1, TestEntity.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 0, __$behaviorFrame, __$steps);
         }
         case 2: {
            // testEntityWMETest_boop_1
               final Object[] __$behaviorFrame = new Object[1];
               __$behaviorFrame[0] = ((ObjectWrapper)__$boundVars.get("myTestWME")).objectValue();

            final __StepDesc[] __$steps = {new __StepDesc(5, TestEntity.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 2, __$behaviorFrame, __$steps);
         }
         case 3: {
            // testEntityWMETest_boop_2

            final __StepDesc[] __$steps = {new __StepDesc(6, TestEntity.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 3, null, __$steps);
         }
         case 5: {
            // TestEntity_RootCollectionBehavior-4->AnonymousStep8_1
               final Object[] __$behaviorFrame = __$args;

            final __StepDesc[] __$steps = {new __StepDesc(9, TestEntity.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 5, __$behaviorFrame, __$steps);
         }
         case 4: {
            // TestEntity_RootCollectionBehavior

            final __StepDesc[] __$steps = {new __StepDesc(7, TestEntity.__$stepFactory0_rfield), new __StepDesc(8, TestEntity.__$stepFactory0_rfield)};
            return new CollectionBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 4, null, __$steps, 2);
         }
         case 6: {
            // __$defaultMemoryExecuteBehavior_1
               final Object[] __$behaviorFrame = __$args;

            final __StepDesc[] __$steps = null;
            return new MemoryExecuteBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 6, __$behaviorFrame, __$steps, 0);
         }
      default:
         throw new AblRuntimeError("Unexpected behaviorID " + __$behaviorID);
      }
   }
}
