package runner;

import abl.runtime.BehavingEntity;

/**
 * Bootstrap for running an ABL agent. It takes the fully-qualified class name
 * of an agent as its only argument.
 */
public class Runner {

   /**
    * @param args
    */
   public static void main(String[] args) {
   	  if(1 == args.length) {
   	  	try{
   	  		// Runs agent
   	  		//((BehavingEntity)Class.forName(args[0]).newInstance()).startBehaving(1, false);
   	  		
   	  		BehavingEntity entity = ((BehavingEntity)Class.forName(args[0]).newInstance());
   	  		entity.startBehaving();
   	  	}
	    catch (ClassNotFoundException ex){
	      System.err.println(Runner.class + ": " + ex + " class must be in class path.");
	    }
	    catch(InstantiationException ex){
	      System.err.println(Runner.class + ": " + ex + " class must be concrete.");
	    }
	    catch(IllegalAccessException ex){
	      System.err.println(Runner.class + ": " + ex + " class must have a no-arg constructor.");
	    }
   	  }else{
   	  	System.out.println("Runner: no agent was given to the runner. Using default test entity");
   	  	try {
			((BehavingEntity)Class.forName("compiledAbl.TestEntity").newInstance()).startBehaving(1, false);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Runner: even default was bad!!");
		}
   	  }
   }
}