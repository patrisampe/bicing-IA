package bicing;
import java.util.HashMap;
import java.util.Map;
import IA.Bicing.Estacion;
import IA.Bicing.Estaciones;
public class GeneraProblema {

	private static Estaciones es;
	private static Map<DosEst,Double> dist;
	
	public GeneraProblema(int nest, int nbic,int dem, int seed) {
		es= new Estaciones(nest,nbic,dem,seed);
		dist= new HashMap<DosEst,Double>();
	}
	
	public static Estaciones getEstaciones() {
		return es;
	}
	public static Double distancia(Estacion a, Estacion b){
		DosEst aux=new DosEst(a,b);
		return dist.get(aux);
	}
	
}
