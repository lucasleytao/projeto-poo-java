import java.util.Scanner; 

public class Sistema { 
    //atributos da classe
    String desc;
    int qtd, num;
    double preco, total;

    //metodos da classe

    void setNum() { //metodo especial set -- grava valor
        System.out.print("Num item: ");
        Scanner num = new Scanner(System.in);//cria um objeto de entrada de dados
        this.num = num.nextInt();//this.(esse) objeto = objeto.leitura da linha de entrada(inteiro)()
        num.close(); //fechamento de recurso
    }
    void setDesc() { //metodo sem parametro e sem valor de retorno -- executa uma acao 'definir descricao'
        System.out.print("Descricao: ");
        Scanner desc = new Scanner(System.in); //cria um objeto desc da classe scanner -- entrada via teclado
        this.desc = desc.nextLine(); //this.(esse) objeto = objeto.leitura da linha de entrada(string)()
        desc.close();
    }
    void setQtd() {
        System.out.print("Quantidade: ");
        Scanner qtd = new Scanner(System.in);
        this.qtd = qtd.nextInt();
        qtd.close();
    }
    void setPreco() {
        System.out.print("Preco: ");
        Scanner preco = new Scanner(System.in);
        this.preco = preco.nextDouble();
        preco.close();
    }
    
    int getNum() {  //metodo especial get -- recupera valor
        return num;
    }
    String getDesc() {
        return desc;
    }
    int getQtd() {
        return qtd;
    }
    double getPreco() {
        if (preco < 0) {
            return 0.0;  
        } else {
            return (double)preco;
        } 
    }
    //metodo get que calcula o valor de cada item e retorna um double
    double getTotalFatura() {

        total = qtd*preco; 

        if (total < 0) {
            return 0.0;
        } else {
            return total;
        }
    }
}
