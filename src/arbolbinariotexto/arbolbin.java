
package arbolbinariotexto;

import java.io.FileWriter;
import java.io.PrintWriter;

public class arbolbin {
    nodoarbol raiz; //crea el nodo raiz del árbol
    
  public arbolbin(){
      raiz = null; // inicializa el nodo creado como nulo
  }
  
  //método para insertar un nodo en el árbol
  public boolean arbvacio(){
      return raiz == null;
  }
  
  //método para insertar un nodo en el árbol
  public void agregaNodo(String nom){
      nodoarbol nuevo = new nodoarbol(nom);
      if (raiz==null){
          raiz = nuevo;
      }else{
          nodoarbol auxiliar = raiz;
          nodoarbol padre;
          while(true){
              padre = auxiliar;
              if(nom.compareTo(auxiliar.nombre)<=0){
                  auxiliar = auxiliar.hizquierdo;
                  if(auxiliar == null){
                      padre.hizquierdo = nuevo;
                      return;
                  }
              }else{
                  auxiliar = auxiliar.hderecho;
                  if(auxiliar == null){
                      padre.hderecho = nuevo;
                      return;
                  }
              }
          }
      }
  }
  
  //metodo para recorrer árbol INORDEN
  public void inOrden(nodoarbol r){
      if(r!=null){
          inOrden(r.hizquierdo);
          System.out.print(r.nombre + ", ");
          inOrden(r.hderecho);
          
      }
  }
  
  
  
  
  public void preOrden (nodoarbol r){
      if(r!=null){
          System.out.println(r.nombre);
          preOrden(r.hizquierdo);
          preOrden(r.hderecho);
      }
  }
  public void Postorden (nodoarbol r){
      if(r!=null){
          Postorden(r.hizquierdo);
          Postorden(r.hderecho);
          System.out.println(r.nombre);
      }
  }
  
  
}

