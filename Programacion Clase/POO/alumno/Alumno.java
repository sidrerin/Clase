package alumno;

public class Alumno {
	
	private String nombre;
	private String apellidos;
	private int a�o_nacimiento;
	private int matricula;
	private String grupo;
	private String horario;
	
	
	//CONSTRUCTORES
	public Alumno(String n, String a, int a�o, int mat){
		
		nombre=n;
		apellidos=a;
		a�o_nacimiento=a�o;
		matricula=mat;
		
	}
	
	
	
	public Alumno(String n, String a, int a�o, int mat, String g,String h){
		
		nombre=n;
		apellidos=a;
		a�o_nacimiento=a�o;
		matricula=mat;
		grupo=g;
		horario=h;
		
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellidos;
	}
	public void setApellido1(String apellido1) {
		this.apellidos = apellido1;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getA�o_nacimiento() {
		return a�o_nacimiento;
	}
	public int getMatricula() {
		return matricula;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido1=" + apellidos + ", a�o_nacimiento=" + a�o_nacimiento
				+ ", matricula=" + matricula + ", grupo=" + grupo + ", horario=" + horario + "]";
	} 
	
	}
