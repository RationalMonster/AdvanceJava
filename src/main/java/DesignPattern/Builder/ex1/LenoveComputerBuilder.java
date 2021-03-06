<<<<<<< HEAD
package DesignPattern.Builder.ex1;

spublic class LenoveComputerBuilder implements ComputerBuilder {  
   private Computer lenoveComputer;    
   public LenoveComputerBuilder(){    
       lenoveComputer = new Computer();    
   }    
   @Override  
   public void buildCPU() {  
       lenoveComputer.setCpu(new IntelCPU());  
   }  
 
   @Override  
   public void buildMemory() {  
       lenoveComputer.setMemory(new KingstonMemory());  
   }  
 
   @Override  
   public void buildMainboard() {  
       lenoveComputer.setMainboard(new AsusMainboard());  
   }  
 
   @Override  
   public Computer getComputer() {  
       return lenoveComputer;  
   }  
 
}  
=======
package DesignPattern.Builder.ex1;

spublic class LenoveComputerBuilder implements ComputerBuilder {  
   private Computer lenoveComputer;    
   public LenoveComputerBuilder(){    
       lenoveComputer = new Computer();    
   }    
   @Override  
   public void buildCPU() {  
       lenoveComputer.setCpu(new IntelCPU());  
   }  
 
   @Override  
   public void buildMemory() {  
       lenoveComputer.setMemory(new KingstonMemory());  
   }  
 
   @Override  
   public void buildMainboard() {  
       lenoveComputer.setMainboard(new AsusMainboard());  
   }  
 
   @Override  
   public Computer getComputer() {  
       return lenoveComputer;  
   }  
 
}  
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
