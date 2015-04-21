package javaPackage;

import wm.WME;

public class TestWME extends WME {
   private int i;
   private String s;


   public TestWME(int i, String s) {
      this.i = i;this.s = s;
   }

   public TestWME() {
   }

   public synchronized int getI() {
      return i;
   }

   public synchronized String getS() {
      return s;
   }

   public synchronized void setI(int i) {
      this.i = i;
   }

   public synchronized void setS(String s) {
      this.s = s;
   }

}
