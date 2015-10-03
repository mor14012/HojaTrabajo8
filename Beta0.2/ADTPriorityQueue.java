/*
Codigo fuente obtenido del Capitulo 13.4.1 del libro Java Structures de Duane A. Bailey
*/

public interface ADTPriorityQueue<E extends Comparable<E>>{
	public E getFirst();

	public E remove();

	public void add(E value);

	public boolean isEmpty();

	public int size();

	public void clear();
}