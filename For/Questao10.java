package For.lista_01;
import java.util.*;

public class Questao10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String residencia;
		int tempoResidencia;
		String grauInstrucao;
		String experiencia;
		String area;
		String exigencia = "";
		int contaAprovadoComercio = 0;
		int contaAprovadoIndustria = 0;
		int contaInaptoComercio = 0;
		int contaInaptoIndustria = 0;
		int contaComercio = 0;
		int contaIndustria = 0;
		
		for(int i = 1;i <= 30;i++){
			System.out.println("area");
			area = s.next();
			if(area.equalsIgnoreCase("comercio")){
				contaComercio++;
				System.out.println("reside na cidade S/N");
				residencia = s.next();
				if(residencia.equalsIgnoreCase("s")){
					System.out.println("tempo de residencia em anos");
					tempoResidencia = s.nextInt();
					if(tempoResidencia >= 1){
						System.out.println("grau de instru��o em/es");
						grauInstrucao = s.next();
						if(grauInstrucao.equalsIgnoreCase("em") || grauInstrucao.equalsIgnoreCase("es")){
							System.out.println("Informe experiencia S/N");
							experiencia = s.next();
							if(experiencia.equalsIgnoreCase("s")){
								contaAprovadoComercio++;
								exigencia = "Candidato apto";
							}else{
								contaInaptoComercio++;
								exigencia = "Candidato inapto, pois n�o possui experiencia";
							}
						}else{
							contaInaptoComercio++;
							exigencia = "Candidato inapto, pois n�o possui ensino medio completo";
						}
					}else{
						contaInaptoComercio++;
						exigencia = "Candidato inapto, pois não reside na cidade há pelo menos um ano";
					}
				}else{
					contaInaptoComercio++;
					exigencia = "Candidato inapto, pois não reside na cidade";
				}
			}else{
				if(area.equalsIgnoreCase("industria")){
					contaIndustria++;
					System.out.println("Informe setor operacional/gerencia");
					String setor = s.next();
					System.out.println("grau de instru��o em/es");
					grauInstrucao = s.next();
					if(setor.equalsIgnoreCase("operacional")){
						if(grauInstrucao.equalsIgnoreCase("em") || grauInstrucao.equalsIgnoreCase("es")){
							contaAprovadoIndustria++;
							exigencia = "Candidato apto";
						}else{
							contaInaptoIndustria++;
							exigencia = "Candidato inapto, pois n�o possui ensino medio completo";
						}
					}else{
						if(setor.equalsIgnoreCase("gerencia")){
							if(grauInstrucao.equalsIgnoreCase("es")){
								System.out.println("Possui experiencia S/N");
								experiencia = s.next();
								if(experiencia.equalsIgnoreCase("s")){
									contaAprovadoIndustria++;
									exigencia = "Candidato apto";
								}else{
									contaInaptoIndustria++;
									exigencia = "Candidato inapto, pois n�o possui experiencia comprovada";
								}
							}else{
								contaInaptoIndustria++;
								exigencia = "Candidato inapto, pois n�o possui ensino superior completo";
							}
						}
					}
				}
			}
			System.out.println(exigencia);
		}
		System.out.println("computados para comercio == " + contaComercio + 
						   "\ncomputados para industria == " + contaIndustria +
						   "\npercentual de inaptos pro comercio == " + ((contaInaptoComercio * 100)/contaComercio) + 
						   "\npercentual de inaptos pra industria == " + ((contaInaptoIndustria * 100)/contaIndustria) + 
						   "\naptos para comercio == " + contaAprovadoComercio + 
						   "\naptos para industria == " + contaAprovadoIndustria);

	}

}
