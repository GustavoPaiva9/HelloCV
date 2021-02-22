package src;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class Teste_Main {
	
  public static void main(String[] args) {
	  
	System.out.println("Bem-Vindo ao Open CV "+ Core.VERSION);//Mostra a Versão do OpenCV que você está utilizando.
	System.loadLibrary(Core.NATIVE_LIBRARY_NAME);/*Carrega a biblioteca do sistema especificado pelo argumento libname. 
	É a maneira pela qual o nome da biblioteca é mapeada para o sistema de biblioteca real é dependente do sistema.
	A chamada System.LoadLibrary (Atribuição da chamada) é efetivamente equivalente à chamada */
	Mat M =Mat.eye(5, 5, CvType.CV_8UC1);/*
	8 - é profundidade de bits utilizado
	UC- Unsigned Char  
	1 - é o canal do componente utilizado*/
	System.out.println("M="+M.dump());/*Exibe a Matriz 
	dump significa Despejo 
	Exibe a matriz de forma A11,A12,A13 etc dependendo do tamanho da matriz em que a pessoa implementou definiu*/
	}

}
