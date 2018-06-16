/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacesTEC.capaLogica.estructura;

import PlacesTEC.capaLogica.logica.Destino;
import java.util.LinkedList;

/**
 *
 * @author sebas
 */
public class Grafo {
    private LinkedList<Vertice> vertices;

    public LinkedList<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(LinkedList<Vertice> vertices) {
        this.vertices = vertices;
    }

    public Grafo(LinkedList<Vertice> vertices) {
        this.vertices = new LinkedList<Vertice>();
    }
  
    
        
    public void agregarVertice(Destino lugar){
        vertices.add(new Vertice(lugar));  //Agrega el vértice al final de la lista de vértices
    }

    //Método para agregar una arista al grafo
    public void agregarArista(Destino origen, Destino destino,int tiempo, int peso){
        buscarVertice(origen).aristas.add(new Arista(origen,destino,tiempo, peso));  //Buscar el vértice origen y agrega un nodo al final de la lista de aristas de ese vértice
    }

    //Método para buscar un vértice en la lista de vertices del grafo según el dato indicado
    public Vertice buscarVertice(Destino lugar){
        //Recorre la lista de vertices
        for(int i = 0; i < this.vertices.size(); i++){
            if(this.vertices.get(i).getLugar() == lugar)  //Si encuentra el vértice lo retorna
                return this.vertices.get(i);
        }
        return null;
    }
    
      //Método para buscar una arista en la lista de aristas
    public Nodo buscarArista(Destino origen, Destino destino){
        Vertice temp = buscarVertice(origen);  //Busca el vértice de origen
        //Busca en la lista de aristas de ese vértice para identificar si se encuentra la arista buscada
        for(int i = 0; i < temp.aristas.size(); i++){
            if(temp.aristas.get(i) == destino){
                return (Nodo) temp.aristas.get(i);
            }
        }
        return null;
    }

 
    
    //Método para eliminar un vértice del grafo
    public void eliminarVertice(int v){
        this.vertices.remove(buscarVertice(v));  //Elimina el vértice de la lista de vértices
        //Elimina todas las aristas en las que el vértice eliminado aparezca como destino
        for(int i = 0; i < vertices.size(); i++)
            eliminarArista(vertices.get(i).vertice, v);
    }

    //Método para eliminar una arista de un vértice origen a un vértice destino dado
    public void eliminarArista(int origen, int destino){
        //Verifica si el grafo es no dirigido
        if((buscarArista(origen,destino) != null) && (buscarArista(destino,origen) != null)){ //Busca si existe arista de origen a destino y viceversa
            //Verifica si el peso de ambas aristas es igual con lo que se asume que es un grafo no dirigido
            if(buscarArista(origen,destino).peso == buscarArista(destino,origen).peso){
                buscarVertice(destino).aristas.remove(buscarArista(destino, origen));
            }
        }
        //Elimina el arista de la lista de aristas del vértice origen
        buscarVertice(origen).aristas.remove(buscarArista(origen, destino));

    }


