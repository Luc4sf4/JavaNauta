public class EstruturaIfElse {
    public static void main(String[] args) {
//        int idade = 30;
////
////        if(idade >= 18){
////            System.out.println("voce eh maior de idade");
////        } else{
////            System.out.println("voce eh menor de idade");
////        }

//        boolean estaChovendo = true;
//
//        if(!estaChovendo) {
//            System.out.println("Vamos sair para passear ");
//        } else{
//            System.out.println("Vamos ficar em casa ");
//        }

          boolean temDinheiro = true;
          boolean temCartao = true;

          if(temDinheiro && temCartao){
              System.out.println("Pede um ifood e um Ze delivery pae");
          } else if (temDinheiro || temCartao) {
              System.out.println("Pede so um ifood pae");
          }
          else {
              System.out.println("Tem que economizar papae ");
          }

          // ? -> if
          // else -> else
          String mensagem = (temDinheiro) ? "Pede um ifood" : "Vai ter que fazer a janta";
        System.out.println(mensagem);
    }
}
