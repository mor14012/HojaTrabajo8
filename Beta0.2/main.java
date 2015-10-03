import java.util.PriorityQueue;

class main{
	public static void main(String[] args) {
		System.out.println("\nBienvenido a PriorityHealth");

		//Pacientes de prueba
		String fichas [] = new String[4];
		char prioridad [] = new char[4];
		fichas[0] = "Diego Morales, Sobredósis de Coca-Cola, C";
		fichas[1] = "Juan Benitez, Gripe, A";
		fichas[2] = "Julio Gonzalez, Problemas de ira, D";
		fichas[3] = "Michel Ramirez, Alcohólico, B";
		prioridad[0] = 'C';
		prioridad[1] = 'A';
		prioridad[2] = 'D';
		prioridad[3] = 'B';
		//Creacion de Array de pacientes
		Paciente [] pacientes = new Paciente [4];
		for(int i=0; i<fichas.length; i++){
			pacientes[i] = new Paciente(fichas[i], prioridad[i]);
		}


		/*----------------
		| Priority Queue |
		----------------*/
		System.out.println("\n------------------\n| Priority Queue |\n----------------");
		PriorityQueue<Paciente> pq = new PriorityQueue<Paciente>();
		
		//Agregar pacientes a la Priority Queue
		for(int i=0; i<pacientes.length; i++){
			pq.add(pacientes[i]);
		}
		
		//Imprimir pacientes del Priority Queue
		for(int i=0; i<pacientes.length; i++){
			System.out.println(pq.poll());
		}

		/*----------------
		|   Vector Heap  |
		----------------*/
		System.out.println("\n----------------\n| Vector Heap |\n--------------");

		VectorHeap vh = new VectorHeap();

		//Agregar pacientes a la Priority Queue
		for(int i=0; i<pacientes.length; i++){
			vh.add(pacientes[i]);
		}
		//Imprimir pacientes del Priority Queue
		for(int i=0; i<pacientes.length; i++){
			System.out.println(vh.remove());
		}

	}
}