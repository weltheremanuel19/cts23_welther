package main;


import clase.DealerAuto;

public class Main {
    public static void main(String[] args) {
        DealerAuto dealerAuto = new DealerAuto("Renault Clio", 5, "Porsche 911", 300, "Tesla Model S", 500);

        System.out.println(dealerAuto.getDetaliiMasinaFamilie());
        System.out.println(dealerAuto.getDetaliiMasinaSport());
        System.out.println(dealerAuto.getDetaliiMasinaElectrica());
    }
}