
/**
 * Write a description of class ArmaduraMineCraf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArmaduraMineCraf
{
      private String casco;
      private String peto;
      private String grebas;
      private String botas;
      public ArmaduraMineCraf(){
            casco  = "cuero";
            peto   = "cuero";
            grebas = "cuero";
            botas  = "cuero";
      }
      public String equiparArmadura(){
           String mensaje = "armadura equipada";
           return mensaje;
      }
      public void cmbiarMaterialArmadura(String otroMaterial){
          casco = otroMaterial;
          peto = otroMaterial;
          grebas = otroMaterial;
          botas = otroMaterial;
      }
      public String getCasco(){
         return casco;
      }
       public String getPeto(){
         return peto;
      }
      public String getGrebas(){
         return grebas;
      }
      public String getBotas(){
         return botas;
      }
      public void setCasco(String nuevoCasco){
          casco = nuevoCasco;
      }
      public void setPeto(String nuevoPeto){
          peto = nuevoPeto;
      }
      public void setGrevas(String nuevoGrebas){
          grebas = nuevoGrebas;
      }
      public void setBotas(String nuevoBotas){
          botas = nuevoBotas;
      }
}
