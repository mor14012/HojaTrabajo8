public class Paciente implements Comparable<Paciente> {
	private String ficha;
	private char prioridad; 

	//Constructor
	public Paciente(String ficha, char prioridad){
		this.ficha = ficha;
		this.prioridad = prioridad;
	}
	public void setficha(String ficha){
		this.ficha = ficha;
	}
	public String getficha(){
		return ficha;
	}
	public void setprioridad(char prioridad){
		this.prioridad = prioridad;
	}
	public char getprioridad(){
		return prioridad;
	}
	public int compareTo(Paciente paciente){
		if(prioridad - paciente.getprioridad()>0)
			return 1;
		if(prioridad - paciente.getprioridad()<0)
			return -1;
		return 0;
	}
	public String toString(){
		return ficha;
	}
}

/*
Comparable http://stackoverflow.com/questions/13244289/how-to-implement-comparable-class
*/
