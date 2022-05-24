public class Robo{
  private int bateria;
  public Robo(){}
  public Robo(int bateria){
    this.bateria = bateria;
  }
  
  public void viraDireita(int grau){
    if (bateria > bateria * 0.1){
      System.out.println("Virou "+ grau+"° a direita");
      this.bateria -= 20;
    }else{
      System.out.println("Bateria muito Baixa!");
    }
    
  }


   public void andaFrente(int metros){
     if (bateria > bateria * 0.1){
       System.out.println("Andou "+ metros+" metros para frente");
       this.bateria -= 20;
    }else{
      System.out.println("Bateria muito Baixa!");
    }
  }

   public void viraEsquerda(int grau){
     if (bateria > bateria * 0.1){
       System.out.println("Virou "+ grau+"° a esquerda");
       this.bateria -= 20;
    }else{
      System.out.println("Bateria muito Baixa!");
    }
  }

  public void andaAtras(int metros){
    if (bateria > bateria * 0.1){
      System.out.println("Andou "+ metros+" metros para tras");
      this.bateria -= 20;
    }else{
      System.out.println("Bateria muito Baixa!");
    }
  }

  public void fotinho(){
    if (bateria > bateria * 0.1){
      System.out.println ("A foto foi captura");
      this.bateria -= 20;
    }else{
      System.out.println("Bateria muito Baixa!");
    }
  }

  public void getStatus(){
    System.out.println("Estou com "+this.bateria+"% De Bateria!");
  }
  
}
