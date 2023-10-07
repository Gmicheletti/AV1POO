package br.av1;


public class home {
    public static void main(String[] args) {

        Socio socio = new Socio();
        socio.setId(1);
        socio.setNome("Guilherme");
        socio.setEndereco("Avenida Tancredo Neves, 331");
        socio.setTelefone("(31) 9 9476-9663");
        String u = socio.toString();
        System.out.println(u);

        Dependente dependente1 = new Dependente();
        dependente1.setId(1);
        dependente1.setNome("Rosangela");
        dependente1.setDataNascimento("17/02/1972");

        Dependente dependente2 = new Dependente();
        dependente1.setId(2);
        dependente1.setNome("Antonio");
        dependente1.setDataNascimento("05/08/1965");

        socio.addDependente(dependente1);
        socio.addDependente(dependente2);

    }


}
