import java.util.logging.Level;

public class Player {
   private String name;
   private int edad;
   private boolean isAlive = true;
   private String[] inventario;
   private int inventarioSize = 10;
   private int maxInventarioSize = 30;

   public int getAgeFactorial() {
        int factorial = 1;
        for (int i = 1; i <= edad; i++) {
            factorial *= i;
        }
       return factorial;
   }

   public Player(String name, int edad) {
       this.name = name;
       this.edad = edad;
       inventario = new String [inventarioSize];
   }

   public String getName() {
       return name;
   }

   public int getEdad() {
       return edad;
   }

   public void levelup() {
       Level++;
       strength += 5;
       intelligence += 5;
       agility += 5;
       Health += 10;
       Mana += 10;
       increaseInventorySize();

   }

   public boolean isAlive() {
       return isAlive;
   }


   public  void die() {
       isAlive = false;
   }

   public void gainexp(int xp) {
    experience += xp;
       if (xp >= 100) {
           levelup();
           Experience = 0;
       }
   }

   public void gainGold(int gold) {
       gold += gold;
   }

   public void addItemToInventory(String item) {
       if (inventarioSize < maxInventarioSize) {
           for (int i = 0; i < inventario.length; i++) {
               if (inventario[i] == null) {
                   inventario[i] = item;
                   break;
               }
               else {
                   System.out.println("El inventario está lleno.");
               }
           }       
       } else {
           System.out.println("El inventario está lleno.");
       }
   }

   public void increaseInventorySize() {
       if (inventarioSize < maxInventarioSize) {
           inventarioSize += 1;
           String[] newInventario = new String[inventarioSize];
           for (int i = 0; i < inventario.length; i++) {
               newInventario[i] = inventario[i];
           }
          inventario = newInventario;
        
       else {
           System.out.println("El inventario ya está lleno.");
       }

   int Health = 100;
   int Mana = 100;
   int strength = 10;
   int intelligence = 10;
   int agility = 10;
   int level = 1;
}
