package beecrowd.iniciante.coordenadas.domain;

public class Coordenadas{
	private double x;
	private double y;

	public void mostrarLocalPonto(double x, double y){
		String ponto = verificaCoordenadas(x,y);
		System.out.println(ponto);
	}

	public String verificaCoordenadas(double x, double y){
		if(x == 0.0 && y == 0.0){
			
			return "Origem";
		
		}else if(y == 0.0){
		
			return "Eixo x";
		
		}else if(x == 0.0){
		
			return "Eixo y";
		
		}else if(x > 0.0 && y > 0.0){
		
			return "Primeiro Quadrante";
		
		}else if(x < 0.0 && y > 0.0){
		
			return "Segundo Quadrante";
		
		}else if(x < 0.0 && y < 0.0){
		
			return "Terceiro Quadrante";
		
		}else{
		
			return "Quarto Quadrante";
		
		}
	}

	public void setX(double x){
		this.x = x;
	}

	public double getX(){
		return x;
	}

	public void setY(double y){
		this.y = y;
	}

	public double getY(){
		return y;
	}
}
