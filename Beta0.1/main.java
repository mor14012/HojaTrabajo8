import java.util.PriorityQueue;

class main{
	public static void main(String[] args) {
		System.out.println("Bienvenido a PriorityHealth");

		/*----------------
		| Priority Queue |
		----------------*/
		PriorityQueue pq = new PriorityQueue();

		//Pacientes de prueba
		Paciente pacienteuno = new Paciente("Diego Morales", 3);
		Paciente pacientedos = new Paciente("Juan Benitez", 1);
		Paciente pacientetres = new Paciente("Julio Gonzalez", 4);
		Paciente pacientecuatro = new Paciente("Michel Ramirez", 2);

		//Agregar pacientes a la Priority Queue
		pq.add(pacienteuno);
		pq.add(pacientedos);
		pq.add(pacientetres);
		pq.add(pacientecuatro);

		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}