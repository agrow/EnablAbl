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

public class TestEntity extends BehavingEntity {
   String s = "Hello World";
   public final static Rule[] __$allRuleArray = {};
   public final static Rulegroup[] __$allRulegroupArray = {};
   private final static Object[] __$tempObjArray = new Object[1];
   private final static Class[] __$sensorFactoryArgArray = new Class[1];
   private final static Class[] __$behFactoryArgArray = new Class[6];
   private final static Class[] __$preconditionArgArray = new Class[4];
   private final static Class[] __$conditionalTestArgArray = new Class[3];
   private final static Class[] __$continuousConditionArgArray = new Class[3];
   private final static Class[] __$stepFactoryArgArray = new Class[3];
   private final static Class[] __$argumentStepExecuteArgArray = new Class[3];
   private final static Class[] __$mentalStepExecuteArgArray = new Class[4];
   private final static Class[] __$reinforcementSignalArgArray = new Class[3];
   private final static Class[] __$rlPolicyArgArray = new Class[6];
   private final static Class[] __$stateWMEArgArray = new Class[3];
   private final static Class[] __$successConditionArgArray = new Class[3];
   private final static Class[] __$analysisArgArray = new Class[1];
   private final static Class __$TestEntity_BehaviorFactories_rfield;
   final static Method __$behaviorFactory0_rfield;
   private final static Class __$TestEntity_Preconditions_rfield;
   final static Method __$precondition0_rfield;
   private final static Class __$TestEntity_PreconditionSensorFactories_rfield;
   final static Method __$preconditionSensorFactory0_rfield;
   private final static Class __$TestEntity_ConditionalTests_rfield;
   final static Method __$conditionalTest0_rfield;
   private final static Class __$TestEntity_ConditionalTestSensorFactories_rfield;
   final static Method __$conditionalTestSensorFactory0_rfield;
   private final static Class __$TestEntity_ContextConditions_rfield;
   final static Method __$contextCondition0_rfield;
   private final static Class __$TestEntity_ContextConditionSensorFactories_rfield;
   final static Method __$contextConditionSensorFactory0_rfield;
   private final static Class __$TestEntity_StepFactories_rfield;
   final static Method __$stepFactory0_rfield;
   private final static Class __$TestEntity_ArgumentStepExecute_rfield;
   final static Method __$argumentExecute0_rfield;
   private final static Class __$TestEntity_MentalStepExecute_rfield;
   final static Method __$mentalExecute0_rfield;
   private final static Class __$TestEntity_SuccessTests_rfield;
   final static Method __$successTest0_rfield;
   private final static Class __$TestEntity_SuccessTestSensorFactories_rfield;
   final static Method __$successTestSensorFactory0_rfield;
   private final static Class __$TestEntity_ReinforcementSignals_rfield;
   final static Method __$reinforcementSignal0_rfield;
   private final static Class __$TestEntity_ReinforcementSignalSensorFactories_rfield;
   final static Method __$reinforcementSignalSensorFactory0_rfield;
   private final static Class __$TestEntity_RLPolicy_rfield;
   final static Method __$rlPolicy0_rfield;
   private final static Class __$TestEntity_StateWMEs_rfield;
   final static Method __$stateWME0_rfield;
   private final static Class __$TestEntity_StateWMESensorFactories_rfield;
   final static Method __$stateWMESensorFactory0_rfield;
   private final static Class __$TestEntity_SuccessConditions_rfield;
   final static Method __$successCondition0_rfield;
   private final static Class __$TestEntity_SuccessConditionSensorFactories_rfield;
   final static Method __$successConditionSensorFactory0_rfield;
   private final static Class __$TestEntity_Analysis_rfield;
   final static Method __$analysis0_rfield;

   static {
      try {
         __$sensorFactoryArgArray[0] = Integer.TYPE;
         __$behFactoryArgArray[0] = Integer.TYPE;
         __$behFactoryArgArray[1] = __$tempObjArray.getClass();
         __$behFactoryArgArray[2] = Class.forName("java.util.Map");
         __$behFactoryArgArray[3] = Class.forName("abl.runtime.GoalStep");
         __$behFactoryArgArray[4] = Class.forName("java.lang.String");
         __$behFactoryArgArray[5] = Class.forName("abl.runtime.BehavingEntity");
         __$preconditionArgArray[0] = Integer.TYPE;
         __$preconditionArgArray[1] = __$tempObjArray.getClass();
         __$preconditionArgArray[2] = Class.forName("java.util.Map");
         __$preconditionArgArray[3] = Class.forName("abl.runtime.BehavingEntity");
         __$conditionalTestArgArray[0] = Integer.TYPE;
         __$conditionalTestArgArray[1] = __$tempObjArray.getClass();
         __$conditionalTestArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
         __$continuousConditionArgArray[0] = Integer.TYPE;
         __$continuousConditionArgArray[1] = __$tempObjArray.getClass();
         __$continuousConditionArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
         __$stepFactoryArgArray[0] = Integer.TYPE;
         __$stepFactoryArgArray[1] = Class.forName("abl.runtime.Behavior");
         __$stepFactoryArgArray[2] = __$tempObjArray.getClass();
         __$argumentStepExecuteArgArray[0] = Integer.TYPE;
         __$argumentStepExecuteArgArray[1] = __$tempObjArray.getClass();
         __$argumentStepExecuteArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
         __$mentalStepExecuteArgArray[0] = Integer.TYPE;
         __$mentalStepExecuteArgArray[1] = __$tempObjArray.getClass();
         __$mentalStepExecuteArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
         __$mentalStepExecuteArgArray[3] = Class.forName("abl.runtime.MentalStep");
         __$reinforcementSignalArgArray[0] = Integer.TYPE;
         __$reinforcementSignalArgArray[1] = __$tempObjArray.getClass();
         __$reinforcementSignalArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
         __$rlPolicyArgArray[0] = Integer.TYPE;
         __$rlPolicyArgArray[1] = Class.forName("java.lang.Object");
         __$rlPolicyArgArray[2] = Integer.TYPE;
         __$rlPolicyArgArray[3] = Class.forName("java.lang.Object");
         __$rlPolicyArgArray[4] = Double.TYPE;
         __$rlPolicyArgArray[5] = Boolean.TYPE;
         __$stateWMEArgArray[0] = Integer.TYPE;
         __$stateWMEArgArray[1] = __$tempObjArray.getClass();
         __$stateWMEArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
         __$successConditionArgArray[0] = Integer.TYPE;
         __$successConditionArgArray[1] = __$tempObjArray.getClass();
         __$successConditionArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
         __$analysisArgArray[0] = Integer.TYPE;
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_BehaviorFactories_rfield = Class.forName("compiledAbl.TestEntity_BehaviorFactories");
         __$behaviorFactory0_rfield = __$TestEntity_BehaviorFactories_rfield.getDeclaredMethod("behaviorFactory0", __$behFactoryArgArray);
         __$behaviorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_Preconditions_rfield = Class.forName("compiledAbl.TestEntity_Preconditions");
         __$precondition0_rfield = __$TestEntity_Preconditions_rfield.getDeclaredMethod("precondition0", __$preconditionArgArray);
         __$precondition0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_PreconditionSensorFactories_rfield = Class.forName("compiledAbl.TestEntity_PreconditionSensorFactories");
         __$preconditionSensorFactory0_rfield = __$TestEntity_PreconditionSensorFactories_rfield.getDeclaredMethod("preconditionSensorFactory0", __$sensorFactoryArgArray);
         __$preconditionSensorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_ConditionalTests_rfield = Class.forName("compiledAbl.TestEntity_ConditionalTests");
         __$conditionalTest0_rfield = __$TestEntity_ConditionalTests_rfield.getDeclaredMethod("conditionalTest0", __$conditionalTestArgArray);
         __$conditionalTest0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_ConditionalTestSensorFactories_rfield = Class.forName("compiledAbl.TestEntity_ConditionalTestSensorFactories");
         __$conditionalTestSensorFactory0_rfield = __$TestEntity_ConditionalTestSensorFactories_rfield.getDeclaredMethod("conditionalTestSensorFactory0", __$sensorFactoryArgArray);
         __$conditionalTestSensorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_ContextConditions_rfield = Class.forName("compiledAbl.TestEntity_ContextConditions");
         __$contextCondition0_rfield = __$TestEntity_ContextConditions_rfield.getDeclaredMethod("contextCondition0", __$continuousConditionArgArray);
         __$contextCondition0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_ContextConditionSensorFactories_rfield = Class.forName("compiledAbl.TestEntity_ContextConditionSensorFactories");
         __$contextConditionSensorFactory0_rfield = __$TestEntity_ContextConditionSensorFactories_rfield.getDeclaredMethod("contextConditionSensorFactory0", __$sensorFactoryArgArray);
         __$contextConditionSensorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_StepFactories_rfield = Class.forName("compiledAbl.TestEntity_StepFactories");
         __$stepFactory0_rfield = __$TestEntity_StepFactories_rfield.getDeclaredMethod("stepFactory0", __$stepFactoryArgArray);
         __$stepFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_ArgumentStepExecute_rfield = Class.forName("compiledAbl.TestEntity_ArgumentStepExecute");
         __$argumentExecute0_rfield = __$TestEntity_ArgumentStepExecute_rfield.getDeclaredMethod("argumentExecute0", __$argumentStepExecuteArgArray);
         __$argumentExecute0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_MentalStepExecute_rfield = Class.forName("compiledAbl.TestEntity_MentalStepExecute");
         __$mentalExecute0_rfield = __$TestEntity_MentalStepExecute_rfield.getDeclaredMethod("mentalExecute0", __$mentalStepExecuteArgArray);
         __$mentalExecute0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_SuccessTests_rfield = Class.forName("compiledAbl.TestEntity_SuccessTests");
         __$successTest0_rfield = __$TestEntity_SuccessTests_rfield.getDeclaredMethod("successTest0", __$continuousConditionArgArray);
         __$successTest0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_SuccessTestSensorFactories_rfield = Class.forName("compiledAbl.TestEntity_SuccessTestSensorFactories");
         __$successTestSensorFactory0_rfield = __$TestEntity_SuccessTestSensorFactories_rfield.getDeclaredMethod("successTestSensorFactory0", __$sensorFactoryArgArray);
         __$successTestSensorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_ReinforcementSignals_rfield = Class.forName("compiledAbl.TestEntity_ReinforcementSignals");
         __$reinforcementSignal0_rfield = __$TestEntity_ReinforcementSignals_rfield.getDeclaredMethod("reinforcementSignal0", __$reinforcementSignalArgArray);
         __$reinforcementSignal0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_ReinforcementSignalSensorFactories_rfield = Class.forName("compiledAbl.TestEntity_ReinforcementSignalSensorFactories");
         __$reinforcementSignalSensorFactory0_rfield = __$TestEntity_ReinforcementSignalSensorFactories_rfield.getDeclaredMethod("reinforcementSignalSensorFactory0", __$sensorFactoryArgArray);
         __$reinforcementSignalSensorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_RLPolicy_rfield = Class.forName("compiledAbl.TestEntity_RLPolicy");
         __$rlPolicy0_rfield = __$TestEntity_RLPolicy_rfield.getDeclaredMethod("rlPolicy0", __$rlPolicyArgArray);
         __$rlPolicy0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_StateWMEs_rfield = Class.forName("compiledAbl.TestEntity_StateWMEs");
         __$stateWME0_rfield = __$TestEntity_StateWMEs_rfield.getDeclaredMethod("stateWME0", __$stateWMEArgArray);
         __$stateWME0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_StateWMESensorFactories_rfield = Class.forName("compiledAbl.TestEntity_StateWMESensorFactories");
         __$stateWMESensorFactory0_rfield = __$TestEntity_StateWMESensorFactories_rfield.getDeclaredMethod("stateWMESensorFactory0", __$sensorFactoryArgArray);
         __$stateWMESensorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_SuccessConditions_rfield = Class.forName("compiledAbl.TestEntity_SuccessConditions");
         __$successCondition0_rfield = __$TestEntity_SuccessConditions_rfield.getDeclaredMethod("successCondition0", __$successConditionArgArray);
         __$successCondition0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_SuccessConditionSensorFactories_rfield = Class.forName("compiledAbl.TestEntity_SuccessConditionSensorFactories");
         __$successConditionSensorFactory0_rfield = __$TestEntity_SuccessConditionSensorFactories_rfield.getDeclaredMethod("successConditionSensorFactory0", __$sensorFactoryArgArray);
         __$successConditionSensorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$TestEntity_Analysis_rfield = Class.forName("compiledAbl.TestEntity_Analysis");
         __$analysis0_rfield = __$TestEntity_Analysis_rfield.getDeclaredMethod("analysis0", __$analysisArgArray);
         __$analysis0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }


   private static void registerBehaviors_0(BehaviorLibrary behaviorLibrary) {
      behaviorLibrary.registerBehavior(new __BehaviorDesc(0, __$behaviorFactory0_rfield, null, null, "testEntityWMETest()", new String[] {"testEntityWMETest()"}, null, (short)0), __$analysis0_rfield);
      behaviorLibrary.registerBehavior(new __BehaviorDesc(1, __$behaviorFactory0_rfield, null, null, "testEntityWMETest-0->AnonymousStep1()", new String[] {"testEntityWMETest-0->AnonymousStep1()"}, null, (short)0), __$analysis0_rfield);
      behaviorLibrary.registerBehavior(new __BehaviorDesc(2, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "testEntityWMETest_boop()", new String[] {"testEntityWMETest_boop()"}, null, (short)0), __$analysis0_rfield);
      behaviorLibrary.registerBehavior(new __BehaviorDesc(3, __$behaviorFactory0_rfield, null, null, "testEntityWMETest_boop()", new String[] {"testEntityWMETest_boop()"}, null, (short)0), __$analysis0_rfield);
      behaviorLibrary.registerBehavior(new __BehaviorDesc(4, __$behaviorFactory0_rfield, null, null, "TestEntity_RootCollectionBehavior()", new String[] {"TestEntity_RootCollectionBehavior()"}, null, (short)0), __$analysis0_rfield);
      behaviorLibrary.registerBehavior(new __BehaviorDesc(5, __$behaviorFactory0_rfield, null, null, "TestEntity_RootCollectionBehavior-4->AnonymousStep8()", new String[] {"TestEntity_RootCollectionBehavior-4->AnonymousStep8()"}, null, (short)0), __$analysis0_rfield);
      behaviorLibrary.registerBehavior(new __BehaviorDesc(6, __$behaviorFactory0_rfield, null, null, "__$defaultMemoryExecuteBehavior()", new String[] {"__$defaultMemoryExecuteBehavior()"}, null, (short)0), __$analysis0_rfield);
   }

   private static void registerBehaviors_1(BehaviorLibrary behaviorLibrary) {
   }

   public static void main(String[] args) {
      TestEntity ent = new TestEntity();
      ent.startBehaving();
   }

   public TestEntity() {
      individualBehaviorLibrary = new BehaviorLibrary(14);
      jointBehaviorLibrary = new BehaviorLibrary(0);
      registerBehaviors_0(individualBehaviorLibrary);
      registerBehaviors_1(jointBehaviorLibrary);
      ABT = (CollectionBehavior)TestEntity_BehaviorFactories.behaviorFactory0(4, null, null, null, "TestEntity_RootCollectionBehavior()", this);
      startWMEReflection(ABT);
      registerEntity("TestEntity", this);
   }

}
