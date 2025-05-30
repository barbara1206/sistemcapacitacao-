package aplicacao;

import entidades.ServidorPublico;

public class Programa {
    public static void main(String[] args) {
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("ANVISA");
        isabela.setLotacao("Brasilia");
        isabela.setEmail("isabela@gmail.");

        isabela.setHorasExtras(600);
        isabela.setSalarioMensal(3000);
        isabela.calcularNumeros(4,10,8);
        System.out.println("Servidor: "+ isabela.getNome());
        System.out.printf("Horas extras R$ %.2f: ",isabela.getHorasExtras());



    }
}
