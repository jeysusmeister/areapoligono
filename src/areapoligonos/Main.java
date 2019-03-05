package areapoligonos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import poligonos.Area;
import javax.swing.JOptionPane;


public class Main {
    
    public static void main(String[] args) {
        
        String seleccion;
        
        Area area = new Area();
        
        try{
            
            seleccion = JOptionPane.showInputDialog("Calcule el Área de los siguientes polígonos:\n"
                    + "1.- Rectángulo.\n"
                    + "2.- Triángulo.\n"
                    + "3.- Cuadrado.\n"
                    + "4.- Círculo.");
            
            switch(seleccion)
            {
                
                case "1":Main.rectangulo(area);break;
                
                case "2":Main.triangulo(area);break;  
                                          
                case "3":Main.cuadrado(area);break;
                
                case "4":Main.circulo(area);break;
            
            }
            
        }catch(NullPointerException e){
            
            JOptionPane.showMessageDialog(null,"Debe seleccionar una opción vuelva a ejecutar el programa","[ERROR]",JOptionPane.ERROR_MESSAGE);
       
        }
        
    }
    
    public static void rectangulo(Area area)
    {
        
        JOptionPane.showMessageDialog(null, "Ud. selecciono:\nCálculo del área rectángulo", "Selecciono",JOptionPane.WARNING_MESSAGE);
        
        try{
        
            area.setBaseR(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la  Base del rectángulo")));
        
            area.setAlturaR(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la  Altura del rectángulo")));
            
            JOptionPane.showMessageDialog(null, "El área del rectángulo de \nBase: "+area.getBaseR()+" y Altura "+area.getAlturaR()+"\n es: "+(area.getBaseR()*area.getAlturaR()), "Resultado",JOptionPane.DEFAULT_OPTION);
        
        }catch(NullPointerException a){
        
            if(area.getBaseR()== 0){
            
                JOptionPane.showMessageDialog(null,"La Base del Rectángulo no debe estar vacia.\n Adios! ","[ERROR]",JOptionPane.ERROR_MESSAGE);
            
            }else if (area.getAlturaR()== 0) {
            
                JOptionPane.showMessageDialog(null,"La Altura del Rectángulo no debe estar vacia.\n Adios! ","[ERROR]",JOptionPane.ERROR_MESSAGE);
            
            }
        
        }
    
    }
    
    public static void triangulo(Area area)
    {
        
        JOptionPane.showMessageDialog(null, "Ud. selecciono:\nCálculo del área del triángulo", "Selecciono",JOptionPane.WARNING_MESSAGE);
        
        try{
        
            area.setBaseT(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la  Base del triángulo")));
            
            area.setAlturaT(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la  Altura del triángulo")));
            
            JOptionPane.showMessageDialog(null, "El área del triángulo de \nBase: "+area.getBaseT()+" y Altura "+area.getAlturaT()+"\n es: "+(new BigDecimal(area.getBaseT()*area.getAlturaT()/2).setScale(2, RoundingMode.CEILING)), "Resultado",JOptionPane.DEFAULT_OPTION);
        
        }catch(NullPointerException b){
        
            if(area.getBaseR()== 0){
            
                JOptionPane.showMessageDialog(null,"La Base del triángulo no debe estar vacia.\n Adios! ","[ERROR]",JOptionPane.ERROR_MESSAGE);
            
            }else if (area.getAlturaR()== 0) {
            
                JOptionPane.showMessageDialog(null,"La Altura del triángulo no debe estar vacia.\n Adios! ","[ERROR]",JOptionPane.ERROR_MESSAGE);
            
            }
            
        }
        
    }
    
    public static void cuadrado(Area area){
        
        double areaC;
        
        JOptionPane.showMessageDialog(null, "Ud. Selecciono:\nCálculo del área del Cuadrado", "Selecciono",JOptionPane.WARNING_MESSAGE);
        
        try{
            
            area.setLadoC(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el lado del cuadrado")));
            
            areaC = Math.pow(area.getLadoC(), 2.0);
            
            JOptionPane.showMessageDialog(null, "El área del cuadrado que posee un lado: "+area.getLadoC()+" \n es: "+areaC, "Resultado",JOptionPane.DEFAULT_OPTION);
        
        }catch(NullPointerException c){
        
            if(area.getLadoC()== 0){
            
                JOptionPane.showMessageDialog(null,"Debe ingresar el lado del cuadrado.\n Adios! ","[ERROR]",JOptionPane.ERROR_MESSAGE);
            
            }
            
        }
        
    }
    
    public static void circulo(Area area){
        
        JOptionPane.showMessageDialog(null, "Ud. Selecciono:\nCálculo del círculo", "Selecciono",JOptionPane.WARNING_MESSAGE);
        
        try{
            
            area.setRadio(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el radio del círculo")));
            
            JOptionPane.showMessageDialog(null, "El área del círculo de radio: "+area.getRadio()+" \n es: "+(new BigDecimal(Math.PI * Math.pow(area.getRadio(),2)).setScale(2, RoundingMode.CEILING)), "Resultado",JOptionPane.DEFAULT_OPTION);
        
        }catch(NullPointerException c){
        
            if(area.getRadio()== 0){
            
                JOptionPane.showMessageDialog(null,"Debe ingresar el radio del círculo.\n Adios! ","[ERROR]",JOptionPane.ERROR_MESSAGE);
            
            }
            
        }
        
    }
   
}
