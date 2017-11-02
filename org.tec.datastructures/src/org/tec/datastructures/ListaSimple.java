package org.tec.datastructures;

import java.util.Arrays;

public class ListaSimple {
	
	private int size = 0;
	private Object[] lista;
	private Object[] listaVacia = {};
	
	ListaSimple(){
		this.lista = listaVacia;
	}
	
	public boolean add(Object contenido){
		int minimo = size + 1;
		lista = Arrays.copyOf(lista, minimo);
		this.lista[size++] = contenido;
		return true;
	}
	public int getIndice(Object contenido){
		int indice = 0;
		while (lista[indice] != contenido){
			indice++;
			if (indice == size){break;}
		} 
		return indice;
	}
	public boolean isIn(Object contenido){
		int indice = 0;
		while (indice < size){
			if (lista[indice] == contenido){return true;}
			indice++;
		} 
		return false;
	}
	public boolean delete(Object contenido){
		int indice = 0;
		while (indice != size){
			if (lista[indice] == contenido){
				deleteAux(indice);
				return true;
			}
			indice++;
		} 
		return false;
	}
	private void deleteAux(int indice){
		int i = this.size-1;
		while (i > 0){
			System.out.println(this.lista[i-1]);
			this.lista[i-1] = this.lista[i];
			System.out.println(this.lista[i-1]);
			i = i-1;
			if (i == indice){return;}
		}
		
		 
	}
	public int size() {
		return size;
	}
    public boolean isEmpty() {
    	return size==0;
	}
    public static void main(String[] args){
    	ListaSimple lista = new ListaSimple();
    	lista.add(0);
    	lista.add(1);
    	lista.add(2);
    	lista.add(3);
    	System.out.println("tamaño");
        System.out.println(lista.size);
        System.out.println("indice de 3");
    	System.out.println(lista.getIndice(3));
    	System.out.println("elimina 1");
    	System.out.println(lista.delete(1));
    	System.out.println("tamaño");
    	System.out.println(lista.size);
    	System.out.println("indice de 3");
    	System.out.println(lista.getIndice(3));
    }
	
    
}
