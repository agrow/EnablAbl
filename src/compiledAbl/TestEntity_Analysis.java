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
public class TestEntity_Analysis {
   static public List<String> analysis0(int __$behaviorID) {
      switch (__$behaviorID) {
         case 1: {
            // testEntityWMETest-0->AnonymousStep1_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            _$analysisStepIDs.add("testEntityWMETest_boop()"); // stepID 2
            _$analysisStepIDs.add("testEntityWMETest_boop()"); // stepID 3
            _$analysisStepIDs.add("testEntityWMETest_boop()"); // stepID 4
            return _$analysisStepIDs;
         }
         case 0: {
            // testEntityWMETest_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
         case 2: {
            // testEntityWMETest_boop_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
         case 3: {
            // testEntityWMETest_boop_2
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
         case 5: {
            // TestEntity_RootCollectionBehavior-4->AnonymousStep8_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            _$analysisStepIDs.add("testEntityWMETest()"); // stepID 9
            return _$analysisStepIDs;
         }
         case 4: {
            // TestEntity_RootCollectionBehavior
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
         case 6: {
            // __$defaultMemoryExecuteBehavior_1
            List<String> _$analysisStepIDs = new ArrayList<String>();
            return _$analysisStepIDs;
         }
      default:
         throw new AblRuntimeError("Unexpected behaviorID " + __$behaviorID);
      }
   }
}
