package arrayList.v165_arrayList_ClaseGenericaPropia;

public class HabilidadVehiculo {

	public static void main(String[] args) {
		
		
		MonoCicleta instanciaMonocicleta = new MonoCicleta(" Soy una MonoCicleta y ando en 1 rueda");
		
		Vehiculo<MonoCicleta> instanciaVehiculo0 = new Vehiculo<MonoCicleta>();
		instanciaVehiculo0.setHabilidad(instanciaMonocicleta);
		System.out.println(instanciaVehiculo0.getHabilidad());
		
		


		Moto instanciaMoto = new Moto(" Soy Moto y ando en 2 ruedas");

		Vehiculo<Moto> instanciaVehiculo1 = new Vehiculo<Moto>();
		instanciaVehiculo1.setHabilidad(instanciaMoto);
		System.out.println(instanciaVehiculo1.getHabilidad());




		Auto instanciaAuto = new Auto("Soy un auto y Ando en cuatro ruedas");

		Vehiculo<Auto> instanciaVehiculo2 = new Vehiculo<Auto>();
		instanciaVehiculo2.setHabilidad(instanciaAuto);
		System.out.println(instanciaVehiculo2.getHabilidad());




		Camion instanciaCamion = new Camion(" Soy Camion y ando en 6 ruedas");

		Vehiculo<Camion> instanciaVehiculo3 = new Vehiculo<Camion>();
		instanciaVehiculo3.setHabilidad(instanciaCamion);
		System.out.println(instanciaVehiculo3.getHabilidad());





	}
}


