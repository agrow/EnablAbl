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
public class TestEntity_StepFactories {
   static public Step stepFactory0(int __$stepID, Behavior __$behaviorParent, final Object[] __$behaviorFrame) {
      final Method __$stepFactory = TestEntity.__$stepFactory0_rfield;
      switch (__$stepID) {
         case -3: {
            // default wait step
            return new WaitStep(-3, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null);
         }
         case -2: {
            // default fail step
            return new FailStep(-2, __$stepFactory, __$behaviorParent, false, false, false, (short)-32768, (short)0, false, null, null);
         }
         case -1: {
            // default succeed step
            return new SucceedStep(-1, __$stepFactory, __$behaviorParent, false, false, (short)-32768, (short)0, false, null, null);
         }
         case 0: {
            // testEntityWMETest_1Step1
            return new MentalStep(0, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, TestEntity.__$mentalExecute0_rfield, null, null, null);
         }
         case 1: {
            // testEntityWMETest_1Step2
            return new GoalStep(1, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, TestEntity.__$argumentExecute0_rfield, null, null, null, "testEntityWMETest-0->AnonymousStep1()", null, (short)0);
         }
         case 2: {
            // testEntityWMETest-0->AnonymousStep1_1Step1
            return new GoalStep(2, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, "testEntityWMETest_boop()", null, (short)0);
         }
         case 3: {
            // testEntityWMETest-0->AnonymousStep1_1Step2
            return new GoalStep(3, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, "testEntityWMETest_boop()", null, (short)0);
         }
         case 4: {
            // testEntityWMETest-0->AnonymousStep1_1Step3
            return new GoalStep(4, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, "testEntityWMETest_boop()", null, (short)0);
         }
         case 5: {
            // testEntityWMETest_boop_1Step1
            return new MentalStep(5, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, TestEntity.__$mentalExecute0_rfield, null, null, null);
         }
         case 6: {
            // testEntityWMETest_boop_2Step1
            return new MentalStep(6, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, TestEntity.__$mentalExecute0_rfield, null, null, null);
         }
         case 7: {
            // TestEntity_RootCollectionBehaviorStep1
            return new MentalStep(7, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, TestEntity.__$mentalExecute0_rfield, null, null, null);
         }
         case 8: {
            // TestEntity_RootCollectionBehaviorStep2
            return new GoalStep(8, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, TestEntity.__$argumentExecute0_rfield, null, null, null, "TestEntity_RootCollectionBehavior-4->AnonymousStep8()", null, (short)0);
         }
         case 9: {
            // TestEntity_RootCollectionBehavior-4->AnonymousStep8_1Step1
            return new GoalStep(9, __$stepFactory, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, "testEntityWMETest()", null, (short)0);
         }
      default:
         throw new AblRuntimeError("Unexpected stepID " + __$stepID);
      }
   }
}
