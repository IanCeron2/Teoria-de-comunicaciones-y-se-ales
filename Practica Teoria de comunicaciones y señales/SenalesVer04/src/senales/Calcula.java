/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package senales;

public class Calcula {
   /*Este señor recibe los pedazitos de los arreglos a partir del origen
    y los sumay guarda las sumas en un nuevo arreglo llamado suma :D, a y los imprime :D*/
    public String[] sumaPosiciones(String[]g,String[]h){
       int size;
       int x;
       String []suma;
       String []corto;
       boolean mayor = false;
       if(g.length<h.length){
           mayor = true;
           size = h.length;
           corto = new String[size];
           for(x=0; x<g.length; x++){
               corto[x] = g[x];
           }
           for(x=g.length; x<size; x++)
               corto[x] = "0";
       }else{
           size = g.length;
           corto = new String[size];
           for(x=0; x<h.length; x++){
               corto[x] = h[x];
           }
           for(x=h.length; x<size; x++)
               corto[x] = "0";
       }
       suma = new String[size];
        //System.out.println("El arreglo es de tamaño " + size);
//        for(String w : corto){
//            System.out.print(w + ", ");
//        }        
//        System.out.println("");
       boolean origen = false;
       float aux = 0;
       for(int i = 0;i<size;i++){
            if(mayor){
                //le quitamos el signo del origen
                if(corto[i].contains("*") && h[i].contains("*")){
                    corto[i] = corto[i].replace("*", "");
                    h[i] = h[i].replace("*", "");
                    origen = true;
                }
                aux = Float.parseFloat(corto[i]) + Float.parseFloat(h[i]);
                
                //le devolvemos el signo
                if(origen){
                    suma[i] = "*" + String.format("%.02f", aux);
                    origen = false;
                } else{
                    suma[i] = String.format("%.02f", aux);
                }
                //System.out.println("Se tiene la suma de "+corto[i]+" + "+h[i]+" y nos da "+suma[i]);
            }
            else{
                //le quitamos el signo del origen
                if(corto[i].contains("*") && g[i].contains("*")){
                    corto[i] = corto[i].replace("*", "");
                    g[i] = g[i].replace("*", "");
                    origen = true;
                }
                aux = Float.parseFloat(corto[i]) + Float.parseFloat(g[i]);
                
                //le devolvemos el signo
                if(origen){
                    suma[i] = "*" + String.format("%.02f", aux);
                    origen = false;
                } else{
                    suma[i] = String.format("%.02f", aux);
                }
               //System.out.println("Se tiene la suma de "+g[i]+" + "+corto[i]+" y nos da "+suma[i]);
            }
        }
       return suma;
  }
       
    public String[] restaPosiciones(String[]g,String[]h){
       int size;
       int x;
       String []resta;
       String []corto;
       boolean mayor = false;
       if(g.length<h.length){
           mayor = true;
           size = h.length;
           corto = new String[size];
           for(x=0; x<g.length; x++){
               corto[x] = g[x];
           }
           for(x=g.length; x<size; x++)
               corto[x] = "0";
       }else{
           size = g.length;
           corto = new String[size];
           for(x=0; x<h.length; x++){
               corto[x] = h[x];
           }
           for(x=h.length; x<size; x++)
               corto[x] = "0";
       }
       resta = new String[size];
        //System.out.println("El arreglo es de tamaño " + size);
//        for(String w : corto){
//            System.out.print(w + ", ");
//        }        
//        System.out.println("");
       boolean origen = false;
       float aux = 0;
       for(int i = 0;i<size;i++){
            if(mayor){
                //le quitamos el signo del origen
                if(corto[i].contains("*") && h[i].contains("*")){
                    corto[i] = corto[i].replace("*", "");
                    h[i] = h[i].replace("*", "");
                    origen = true;
                }
                aux = Float.parseFloat(corto[i]) - Float.parseFloat(h[i]);
                
                //le devolvemos el signo
                if(origen){
                    resta[i] = "*" + String.format("%.02f", aux);
                    origen = false;
                } else{
                    resta[i] = String.format("%.02f", aux);
                }
                //System.out.println("Se tiene la resta de "+corto[i]+" - "+h[i]+" y nos da "+resta[i]);
            }
            else{
                //le quitamos el signo del origen
                if(corto[i].contains("*") && g[i].contains("*")){
                    corto[i] = corto[i].replace("*", "");
                    g[i] = g[i].replace("*", "");
                    origen = true;
                }
                aux = Float.parseFloat(g[i]) - Float.parseFloat(corto[i]);
                
                
                //le devolvemos el signo
                if(origen){
                    resta[i] = "*" + String.format("%.02f", aux);
                    origen = false;
                } else{
                    resta[i] = String.format("%.02f", aux);
                }
               //System.out.println("Se tiene la resta de "+g[i]+" - "+corto[i]+" y nos da "+resta[i]);
            }
        }
       return resta;
    }
    
    public String[] multiplicaPosiciones(String[]g,String[]h){
        int size;
        int x;
        String []multiplica;
        String []corto;
        boolean mayor = false;
        if(g.length<h.length){
            mayor = true;
            size = h.length;
            corto = new String[size];
            for(x=0; x<g.length; x++){
                corto[x] = g[x];
            }
            for(x=g.length; x<size; x++)
                corto[x] = "0";
        }else{
            size = g.length;
            corto = new String[size];
            for(x=0; x<h.length; x++){
                corto[x] = h[x];
            }
            for(x=h.length; x<size; x++)
                corto[x] = "0";
        }
        multiplica = new String[size];
        //System.out.println("El arreglo es de tamaño " + size);
//        for(String w : corto){
//            System.out.print(w + ", ");
//        }        
//        System.out.println("");
        boolean origen = false;
        float aux = 0;
        for(int i = 0;i<size;i++){
            if(mayor){
                //le quitamos el signo del origen
                if(corto[i].contains("*") && h[i].contains("*")){
                    corto[i] = corto[i].replace("*", "");
                    h[i] = h[i].replace("*", "");
                    origen = true;
                }
                aux = Float.parseFloat(corto[i]) * Float.parseFloat(h[i]);
                
                //le devolvemos el signo
                if(origen){
                    multiplica[i] = "*" + String.format("%.02f", aux);
                    origen = false;
                } else{
                    multiplica[i] = String.format("%.02f", aux);
                }
                //System.out.println("Se tiene la multiplicacion de "+corto[i]+" * "+h[i]+" y nos da "+suma[i]);
            }
            else{
                //le quitamos el signo del origen
                if(corto[i].contains("*") && g[i].contains("*")){
                    corto[i] = corto[i].replace("*", "");
                    g[i] = g[i].replace("*", "");
                    origen = true;
                }
                aux = Float.parseFloat(corto[i]) * Float.parseFloat(g[i]);
                
                //le devolvemos el signo
                if(origen){
                    multiplica[i] = "*" + String.format("%.02f", aux);
                    origen = false;
                } else{
                    multiplica[i] = String.format("%.02f", aux);
                }
               //System.out.println("Se tiene la multiplicacion de "+g[i]+" * "+corto[i]+" y nos da "+suma[i]);
            }
        }
       return multiplica;
    }
    
     public String[] dividePosiciones(String[]g,String[]h){
       int size;
       int x;
       String []divide;
       String []corto;
       boolean mayor = false;
       if(g.length<h.length){
            mayor = true;
            size = h.length;
            corto = new String[size];
            for(x=0; x<g.length; x++){
                corto[x] = g[x];
            }
            for(x=g.length; x<size; x++)
                corto[x] = "0";
        }else{
            size = g.length;
            corto = new String[size];
            for(x=0; x<h.length; x++){
                corto[x] = h[x];
            }
            for(x=h.length; x<size; x++)
                corto[x] = "0";
        }
        divide = new String[size];
        //System.out.println("El arreglo es de tamaño " + size);
//        for(String w : corto){
//            System.out.print(w + ", ");
//        }        
//        System.out.println("");
        boolean origen = false;
        float aux = 0;
        for(int i = 0;i<size;i++){
            if(mayor){
                //le quitamos el signo del origen
                if(corto[i].contains("*") && h[i].contains("*")){
                    corto[i] = corto[i].replace("*", "");
                    h[i] = h[i].replace("*", "");
                    origen = true;
                }
                aux = Float.parseFloat(corto[i]) / Float.parseFloat(h[i]);
                
                //le devolvemos el signo
                if(origen){
                    divide[i] = "*" + String.format("%.02f", aux);
                    origen = false;
                } else{
                    divide[i] = String.format("%.02f", aux);
                }
                //System.out.println("Se tiene la division de "+corto[i]+" / "+h[i]+" y nos da "+suma[i]);
            }
            else{
                //le quitamos el signo del origen
                if(corto[i].contains("*") && g[i].contains("*")){
                    corto[i] = corto[i].replace("*", "");
                    g[i] = g[i].replace("*", "");
                    origen = true;
                }
                aux = Float.parseFloat(g[i]) / Float.parseFloat(corto[i]);
                
                //le devolvemos el signo
                if(origen){
                    divide[i] = "*" + String.format("%.02f", aux);
                    origen = false;
                } else{
                    divide[i] = String.format("%.02f", aux);
                }
               //System.out.println("Se tiene la division de "+g[i]+" / "+corto[i]+" y nos da "+suma[i]);
            }
        }
       return divide;
    }
    
    public String[] diezmaPosiciones_pos(String[]g, int multi,int tamanio){
        String []diezmada;
        int saltos;
       // boolean salto = false;
       int q = 0;
              
        if(multi==1){             
            return g;
        } else if(multi < g.length){
            saltos = (int) Math.ceil((double)g.length / multi); 
                          
            //System.out.println("Cantidad de Saltos: "+(saltos));
            //System.out.println("El tamaño de la diezmada: "+(saltos+1));
            diezmada = new String[saltos];
            for(q=0;q<saltos;q++){
               diezmada[q]= g[q*multi];
               //System.out.println("Se ha agregado el "+g[q*multi]+" en el de la diezmada en la pos "+q);        
            }
            return diezmada;
        } else {
            diezmada = new String[1];
            diezmada[0] = g[0];
            return diezmada;
        }
    }
    
    public String[] diezmaPosiciones_pat(String[]g, int multi,int tamanio){
        String []diezmada;
        int saltos;
        int q;
        int aux;    
        if(multi==1){
            return g;
        } else if(multi <= g.length){
            
            saltos = (int) Math.ceil(g.length / multi);
            if(multi == g.length)
                saltos = 1;            
            aux=1;
            //System.out.println("Cantidad de Saltos: "+(saltos));
            //System.out.println("El tamaño de la diezmada: "+(saltos));
            diezmada = new String[saltos];
            for(q=0;q<saltos;q++){
               diezmada[q]= g[(aux*multi)-1];
               //System.out.println("Se ha agregado el "+g[q*multi]+" en el de la diezmada en la pos "+q);        
               aux++;
            }
            return diezmada;
        } else{
            diezmada = new String[0];                
            return diezmada;          
        }
    }
    
    
    
    public String[] interpolaPosiciones(String[]g, int tipo, int valor, float fin){
        int x,y,z = 0;
        float factor;
        String []interpoladog;      
        interpoladog = new String[g.length*valor];
        
        if(tipo == 0){ //tipo 0-------------------
            for(x = 0; x<g.length; x++){
                interpoladog[z] = g[x];
                z++;
                for(y=1; y<valor; y++){
                    interpoladog[z] = "0";
                    z++;
                }               
            }          
        }  //tipo 0------------
       
        if(tipo == 1){ //tipo 1-------------------
            for(x = 0; x<g.length; x++){
                interpoladog[z] = g[x];
                z++;
                
                //le quitamos el signo
                if(g[x].contains("*"))
                    g[x] = g[x].replace("*", "");
                              
                for(y=1; y<valor; y++){
                    interpoladog[z] = g[x];
                    z++;
                }                    
            }          
        }  //tipo 1------------
      
        if(tipo == 2){ //tipo 2-------------------
            float aux = 0;
            boolean bandera = false;
            boolean bandera_2 = false;
            
            for(x = 0; x<g.length; x++){
                interpoladog[z] = g[x];
                
                //le quitamos el signo
                if(g[x].contains("*")){
                    g[x] = g[x].replace("*", "");
                }               
                
                if(x+1>=g.length){
                    factor = (fin - Float.parseFloat(g[x])) / (float)valor;
                }
                else{
                    //le quitamos el signo
                    if(g[x+1].contains("*")){
                        g[x+1] = g[x+1].replace("*", "");
                        bandera = true;
                    }
                    factor = (Float.parseFloat(g[x+1]) - Float.parseFloat(g[x])) / (float)valor;
                }                   
                z++;
                
                if(interpoladog[z-1].contains("*")){
                    interpoladog[z-1] = interpoladog[z-1].replace("*", "");
                    bandera_2 = true;
                }
                    
                for(y=1; y<valor; y++){
                    aux = Float.parseFloat(interpoladog[z-1]) + factor;
                    if(bandera_2){
                        interpoladog[z-1] = "*" + interpoladog[z-1];
                        bandera_2 = false;
                    }
                    interpoladog[z] = String.format("%.02f", aux);
                    z++;
                }
                
                //le devolvemos el signo
                if(bandera){
                    g[x+1] = "*" + g[x+1];
                    bandera = false;
                }
            }
        }  //tipo 2------------
        return interpoladog;
    }
    
    public String[]reflejaPos(String[]g){
        String[]nuevo;
        
        int tamanio = g.length;
        int aux = tamanio-1;
        nuevo = new String[tamanio];
        
        for(int x = 0;x<tamanio;x++){
            nuevo[x]=g[aux];
        //System.out.println("Se ha agregado el numero "+g[aux]);
        aux--;
        }
        return nuevo;
    }
    
    
    
    public String[] desplazaPosiciones(String[]g, int valor){
        int x = 0;
        int contador = 0;
        String []desplazado;
        
        if(valor > g.length){
            desplazado = new String[valor];
            for(x=0;x<g.length;x++)
                desplazado[x] = g[x];
            for(x=g.length;x<valor;x++){                
                if(x == valor-1)
                    desplazado[x] = "*0";
                else
                    desplazado[x] = "0";
            }                
        }
        else{
            desplazado = new String[g.length];
            for(x=0;x<g.length;x++){
                contador = contador + 1;
                if(contador == valor)
                    desplazado[x] = "*" + g[x];
                else
                    desplazado[x] = g[x];
            }    
        }       
        return desplazado;
    }
    
    public String[] desplazaPosicionesNega(String[]g, int valor){ //valor = 3
        int x = 0;
        int contador = 0;
        String []desplazado;
        
        if(valor > g.length-1){
            desplazado = new String[valor+1];
            for(x=0;x<g.length;x++)
                desplazado[x] = g[x];
            for(x=g.length;x<valor+1;x++){                
                if(x == valor)
                    desplazado[x] = "*0";
                else
                    desplazado[x] = "0";
            }                
        }
        else{
            desplazado = new String[g.length];
            for(x=0;x<g.length;x++){
                contador = contador + 1;
                if(contador == valor + 1)
                    desplazado[x] = "*" + g[x];
                else
                    desplazado[x] = g[x];
            }    
        }       
        return desplazado;
    }
    
    
    
    
////////////////////////////////////////////////////////////FIN    
 }


