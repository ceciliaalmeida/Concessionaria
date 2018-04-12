
package ConcessionariaSys;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       
        Main m = new Main();
        m.menu();
    }
    

    private void menu() {
        System.out.println("1- Cadastrar motocicleta \n"
                + "2- Cadastrar automóvel \n"
                + "3- Cadastrar comprador \n"
                + "4- Vender motocicleta \n"
                + "5- Vender automóvel \n"
                + "6- Consultar produto pelo chassi \n"
                + "7- Consultar produtos pelo cpf do comprador \n"
                + "8- Listar motocicletas disponiveis para venda \n"
                + "9- Listar motocicletas vendidas \n"
                + "10- Listar automoveis disponiveis para venda \n"
                + "11- Listar automoveis vendidos \n"
                + "0 - SAIR");
        int opc = input.nextInt();
        switch (opc) {
            case 1:
                cadMotocicleta();
                menu();
                break;
            case 2:
                cadCarro();
                menu();
                break;
            case 3:
                cadComprador();
                menu();
                break;
            case 4:
                VendaMoto();
                menu();
                break;
            case 5:
                VenderAutomovel();
                menu();
                break;
            case 6:
                ConsultarPeloChassi();
                menu();
                break;
            case 7:
                ConsultarPeloCpf();
                menu();
                break;
            case 8:
                ListaMotosDisponiveis();
                menu();
                break;
            case 9:
                ListaMotosVendidas();
                menu();
                break;
            case 10:
                ListaCarrosDisponiveis();
                menu();
                break;
            case 11:
                ListaCarrosVendidos();
                menu();
                break;
            default:
                break;
        }
    }

    public void cadMotocicleta() {
        System.out.println("Digite o nome do produto:");
        String nome = input.next();
        System.out.println("Digite o Ano de fabricação:");
        int ano = input.nextInt();
        System.out.println("Digite o numero do chassi:");
        int chassi = input.nextInt();
        System.out.println("Digite o nome da categoria:");
        String categoria = input.next();
        Motocicleta z = new Motocicleta(nome, ano, chassi, categoria);
        Singleton.getInstance().getMotos().add(z);
        Singleton.getInstance().getTodosProdutos().add(z);
    }

    public void cadCarro() {
        System.out.println("Digite o nome do produto:");
        String nome = input.next();
        System.out.println("Digite o Ano de fabricação:");
        int ano = input.nextInt();
        System.out.println("Digite o numero do chassi:");
        int chassi = input.nextInt();
        System.out.println("Digite o nome da categoria:");
        String categoria = input.next();
        Automovel z = new Automovel(nome, ano, chassi, categoria);
        Singleton.getInstance().getCarros().add(z);
        Singleton.getInstance().getTodosProdutos().add(z);
    }

    public void cadComprador() {
        System.out.println("Digite o nome:");
        String nome = input.next();
        System.out.println("Digite o CPF:");
        int cpf = input.nextInt();
        Comprador z = new Comprador(nome, cpf);
        Singleton.getInstance().getCompradores().add(z);
    }

    public void VendaMoto() {
        Produto z = null;
        Comprador x = null;
        System.out.println("Digite o Chassi da moto:");
        int chassi = input.nextInt();
        System.out.println("Digite o Cpf do comprador:");
        int cpf = input.nextInt();
        for (int i = 0; i < Singleton.getInstance().getMotos().size(); i++) {
            if (Singleton.getInstance().getMotos().get(i).getNumChassi() == chassi) {
                z = Singleton.getInstance().getMotos().get(i);
            }
        }
        for (int i = 0; i < Singleton.getInstance().getCompradores().size(); i++) {
            if (Singleton.getInstance().getCompradores().get(i).getCpf() == cpf) {
                x = Singleton.getInstance().getCompradores().get(i);
            }
        }
        z.setComprou(true);
        x.getProds().add(z);
        Vendas w = new Vendas(z, x);
    }
    
    private void VenderAutomovel() {
        Produto z = null;
        Comprador x = null;
        System.out.println("Digite o Chassi do Automovel:");
        int chassi = input.nextInt();
        System.out.println("Digite o Cpf do comprador:");
        int cpf = input.nextInt();
        for (int i = 0; i < Singleton.getInstance().getCarros().size(); i++) {
            if (Singleton.getInstance().getCarros().get(i).getNumChassi() == chassi) {
                z = Singleton.getInstance().getCarros().get(i);
            }
        }
        for (int i = 0; i < Singleton.getInstance().getCompradores().size(); i++) {
            if (Singleton.getInstance().getCompradores().get(i).getCpf() == cpf) {
                x = Singleton.getInstance().getCompradores().get(i);
            }
        }
        z.setComprou(true);
        x.getProds().add(z);
        Vendas w = new Vendas(z, x);
    }

    private void ConsultarPeloChassi() {
        System.out.println("Digite o numero do chassi:");
        int chassi = input.nextInt();
        for(int i = 0; i < Singleton.getInstance().getTodosProdutos().size();i++){
            if(Singleton.getInstance().getTodosProdutos().get(i).getNumChassi()==chassi){
                System.out.println("Produto: " + Singleton.getInstance().getTodosProdutos().get(i));
            }
        }
        
    }

    private void ConsultarPeloCpf() {
        System.out.println("Digite o numero do CPF:");
        int cpf = input.nextInt();
        for (int i = 0; i < Singleton.getInstance().getCompradores().size(); i++) {
            if(Singleton.getInstance().getCompradores().get(i).getCpf()==cpf){
                System.out.println("Produto: " + Singleton.getInstance().getCompradores().get(i).getProds().toString());
            }
        }
    }

    public void ListaMotosDisponiveis() {
        for (int i = 0; i < Singleton.getInstance().getMotos().size(); i++) {
            if (Singleton.getInstance().getMotos().get(i).isComprou() == false) {
                System.out.println("Motos:" + Singleton.getInstance().getMotos().toString()+"\n");
            }
        }
    }

    public void ListaMotosVendidas() {
        for (int i = 0; i < Singleton.getInstance().getMotos().size(); i++) {
            if (Singleton.getInstance().getMotos().get(i).isComprou() == true) {
                System.out.println("Motos:" + Singleton.getInstance().getMotos().toString());
            }
        }
    }

    private void ListaCarrosDisponiveis() {
        for (int i = 0; i < Singleton.getInstance().getCarros().size(); i++) {
            if (Singleton.getInstance().getCarros().get(i).isComprou() == false) {
                System.out.println("Automoveis:" + Singleton.getInstance().getCarros().toString()+"\n");
            }
        }
    }

    private void ListaCarrosVendidos() {
        for (int i = 0; i < Singleton.getInstance().getCarros().size(); i++) {
            if (Singleton.getInstance().getCarros().get(i).isComprou() == false) {
                System.out.println("Automoveis:" + Singleton.getInstance().getCarros().toString()+"\n");
            }
        }
    }

    
    
}
