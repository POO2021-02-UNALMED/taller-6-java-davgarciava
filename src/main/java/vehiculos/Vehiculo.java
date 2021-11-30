package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	static int cantidadVehiculos;
	static int cantidadCamiones;
	static int cantidadCamionetas;
	static int cantidadAutomoviles;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.cantidadVehiculos++;
		if (Fabricante.vehiculosXFabricante.containsKey(fabricante)) {
			int n = Fabricante.vehiculosXFabricante.get(fabricante);
			Fabricante.vehiculosXFabricante.replace(fabricante, n+1);
		} else {
			Fabricante.vehiculosXFabricante.put(fabricante, 1);
		}
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getPuertas() {
		return this.puertas;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return Vehiculo.cantidadVehiculos;
	}
	
	public static int setCantidadVehiculos(int cantidadVehiculos) {
		return Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: " + Vehiculo.cantidadAutomoviles +
				"\nCamionetas: " + Vehiculo.cantidadCamionetas +
				"\nCamiones: " + Vehiculo.cantidadCamiones;
	}
}
