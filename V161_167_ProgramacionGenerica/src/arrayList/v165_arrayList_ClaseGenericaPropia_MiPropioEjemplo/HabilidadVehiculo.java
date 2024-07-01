package arrayList.v165_arrayList_ClaseGenericaPropia_MiPropioEjemplo;

public class HabilidadVehiculo {

	public static void main(String[] args) {
		
		


		MonoCiclo instanciaMonocicleta = new MonoCiclo(" Soy un MonoCiclo y ando en 1 rueda");
		Vehiculo<MonoCiclo> monoCiclo = new Vehiculo<>();
		monoCiclo.setHabilidad(instanciaMonocicleta);
		System.out.println(monoCiclo.getHabilidad());
		
		


		Moto instanciaMoto = new Moto(" Soy Moto y ando en 2 ruedas");
		Vehiculo<Moto> instanciaVehiculo1 = new Vehiculo<>();
		instanciaVehiculo1.setHabilidad(instanciaMoto);
		System.out.println(instanciaVehiculo1.getHabilidad());




		Auto instanciaAuto = new Auto("Soy un auto y Ando en cuatro ruedas");
		Vehiculo<Auto> instanciaVehiculo2 = new Vehiculo<>();
		instanciaVehiculo2.setHabilidad(instanciaAuto);
		System.out.println(instanciaVehiculo2.getHabilidad());




		Camion instanciaCamion = new Camion(" Soy Camion y ando en 6 ruedas y más");
		Vehiculo<Camion> instanciaVehiculo3 = new Vehiculo<>();
		instanciaVehiculo3.setHabilidad(instanciaCamion);
		System.out.println(instanciaVehiculo3.getHabilidad());





	}
}


