/*
Codigo fuente obtenido del Capitulo 13.4.1 del libro Java Structures de Duane A. Bailey
*/


/**
 * @author Andre Rodas y Diego Morales
 *
 */

import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> implements ADTPriorityQueue<E>{
	protected Vector<E> data;

	/**
	 * Clase para instanciar el objeto
	 */
	public VectorHeap(){
		data = new Vector<E>();
	}

	public VectorHeap(Vector<E> v){
		data = new Vector<E>(v.size());
		for(int i=0; i<v.size(); i++){
			add(v.get(i));
		}
	}

	/**
	 * Obtener padre
	 */
	protected static int parent(int i){
		return (i-1)/2;
	}


	/**
	 * Obtener hijo
	 */
	protected static int left(int i){
		return 2*i+1;
	}


	/**
	 * Obtener hijo
	 */
	protected static int right(int i){
		return (2*i+1) + 1;
	}


	/**
	 * Agregar uno nuevo al arbol
	 */
	public void add(E value){
		data.add(value);
		percolateUp(data.size()-1);
	}


	/**
	 * Quitar/Eliminar del arbol
	 */
	public E remove(){
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if (data.size() > 1) pushDownRoot(0);
		return minVal;
	}
	

	/**
	 * Orden ascendente de despliegue
	 */
	protected void percolateUp(int leaf){
		int parent = parent(leaf);
		E value = data.get(leaf);
		while (leaf > 0 &&
		(value.compareTo(data.get(parent)) < 0))
		{
			data.set(leaf,data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf,value);
	}

	/**
	 * Orden descendiente de despliegue
	 */
	protected void pushDownRoot(int root){
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) {
			int childpos = left(root);
			if (childpos < heapSize)
			{
				if ((right(root) < heapSize) &&
				((data.get(childpos+1)).compareTo
				(data.get(childpos)) < 0))
				{
					childpos++;
				}
			if ((data.get(childpos)).compareTo
				(value) < 0)
			{
				data.set(root,data.get(childpos));
				root = childpos; 
			} else {
				data.set(root,value);
				return;
			}
			} else {
				data.set(root,value);
				return;
			}
		}
	}
        
    public E getFirst(){
        return data.get(0);
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int size(){
        return data.size();
    }

    public void clear(){
        data.clear();
    }		
}