
package com.istloja.utilidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
    public class utilidades {
    
        public boolean validadorcedula(String cedula){
            boolean cedulaCorrecta = false;
 
            try {

            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
             int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
            if (tercerDigito < 6) {
            int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
            int verificador = Integer.parseInt(cedula.substring(9,10));
            int suma = 0;
             int digito = 0;
        for (int i = 0; i < (cedula.length() - 1); i++) {
         digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
         suma += ((digito % 10) + (digito / 10));
        }

        if ((suma % 10 == 0) && (suma % 10 == verificador)) {
         cedulaCorrecta = true;
        }
        else if ((10 - (suma % 10)) == verificador) {
         cedulaCorrecta = true;
        } else {
         cedulaCorrecta = false;
        }
        } else {
        cedulaCorrecta = false;
        }
        } else {
        cedulaCorrecta = false;
        }
        } catch (NumberFormatException nfe) {
        cedulaCorrecta = false;
        } catch (Exception err) {
        System.out.println("Una excepcion ocurrio en el proceso de validacion");
        cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
        System.out.println("La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
        }

  public boolean validarnumero (String numero){
      if(numero.charAt(0)!='0'){
          return false;
      }
      if (numero.isEmpty()){
          return false;
      }else if(numero.length()<10){
          return false;
      }
      try {
          int validarnumero= Integer.parseInt (numero);
          return true;
      }catch (Exception e){
      return false;}
  }
   public boolean validarcorreo(String email) {
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }
    
}
