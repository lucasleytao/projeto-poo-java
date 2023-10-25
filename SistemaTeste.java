public class SistemaTeste extends Sistema {
    public static void main(String[] args) { //main -- metodo principal
        
        Sistema obj = new Sistema(); //cria um novo objeto obj do tipo sistema

        //instanciamento

        obj.setNum(); //recebe os valores informados pelo usuario via teclado -- recebe
        obj.setDesc();
        obj.setQtd();
        obj.setPreco();
        
        System.out.print("Número:" + obj.getNum()); //mostra os valores informados pelo usuario via teclado -- mostra
        System.out.print(" -- Descrição: " + obj.getDesc());
        System.out.print(" -- Quantidade: " + obj.getQtd());
        System.out.print(" -- Preço: R$" + obj.getPreco());
        System.out.println(" ** Total: R$" + obj.getTotalFatura());

        Sistema obj1 = new Sistema();

        obj1.setNum();
        obj1.setDesc();
        obj1.setQtd();
        obj1.setPreco();
        
        System.out.print("Número:" + obj1.getNum()); //mostra um valor
        System.out.print(" -- Descrição: " + obj1.getDesc());
        System.out.print(" -- Quantidade: " + obj1.getQtd());
        System.out.print(" -- Preço: R$" + obj1.getPreco());
        System.out.println(" ** Total: R$" + obj1.getTotalFatura()); 
        
    }
}
