package Main;

import Controller.CachorroController;
import Controller.GatoController;
import Controller.PassaroController;
import Controller.ProprietarioController;
import Controller.RelPropAnimalController;
import View.CadCachorroView;
import View.CadGatoView;
import View.CadPassaroView;
import View.CadProprietarioView;
import View.CadRelPropAnimalView;
public class Main {

	public static void main(String[] args) {
		CadCachorroView cadCachorro = new CadCachorroView();
		new CachorroController(cadCachorro);
		CadGatoView cadGatos = new CadGatoView();
		new GatoController(cadGatos);
		CadPassaroView cadPassaros = new CadPassaroView();
		new PassaroController(cadPassaros);
		CadProprietarioView cadProprietario = new CadProprietarioView();
		new ProprietarioController(cadProprietario);
		CadRelPropAnimalView relCadProprietario = new CadRelPropAnimalView();
		new RelPropAnimalController(relCadProprietario);
	}

}
