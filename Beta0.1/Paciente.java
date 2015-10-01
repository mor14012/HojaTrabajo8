public class Paciente implements Comparable<Paciente> {
	private String string;
	private int value;

	public void setstring(String string){
		this.string = string;
	}
	public String getstring(){
		return string;
	}
	public void setvalue(int value){
		this.value = value;
	}
	public int getvalue(){
		return value;
	}
	public int compareTo(Paciente paciente){
		if(value - paciente.getvalue()>0)
			return 1;
		if(value - paciente.getvalue()<0)
			return -1;
		return 0;
	}
	public String toString(){
		return "String: "+string+"\nValue: "+value;
	}
}