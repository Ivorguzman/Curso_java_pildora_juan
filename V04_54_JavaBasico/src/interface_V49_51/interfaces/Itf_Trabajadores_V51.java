package interface_V49_51.interfaces;

public interface Itf_Trabajadores_V51 {

	// Los metodos abstract en las interfaces se definen pero no se desarrolla
	// Los metodos por definici´n son public y astaract
	// Por convencion no se ponen el public y el astract
	double estableceBonus(double gratificacion);

	
	// las Interfaxes solo ouede tenes constantes no variablres comunes.
	// Valor minimo del bono es 2
	// Las constantes en las interfaces son por definición public static final
	double bonus_base = 2;
	


}
