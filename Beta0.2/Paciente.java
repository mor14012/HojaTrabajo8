public class Paciente implements Comparable<Paciente> {
	private String ficha;
	private int prioridad; //Prioridad de la A a la E (1 a 5)

	//Constructor
	public Paciente(String ficha, int prioridad){
		this.ficha = ficha;
		this.prioridad = prioridad;
	}
	public void setficha(String ficha){
		this.ficha = ficha;
	}
	public String getficha(){
		return ficha;
	}
	public void setprioridad(int prioridad){
		this.prioridad = prioridad;
	}
	public int getprioridad(){
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
		return "String: "+ficha+"\nValue: "+prioridad;
	}
}

/*
Comparable http://stackoverflow.com/questions/13244289/how-to-implement-comparable-class
*/
