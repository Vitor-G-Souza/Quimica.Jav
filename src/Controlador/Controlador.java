/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Home
 */
public class Controlador {
    JLabel Nome;
    JLabel Massa;
    JLabel Número;
    JLabel Carga;
    JLabel Eletrons;
    JLabel Isotopo;
    JLabel Neutron;
    JPanel jPanel2, jPanel3, jPanel4;

    public Controlador(JLabel Nome, JLabel Massa, JLabel Número, JLabel Carga, JLabel Eletrons, JLabel Isotopo, JLabel Neutron, JPanel jPanel2, JPanel jPanel3, JPanel jPanel4) {
        this.Nome = Nome;
        this.Massa = Massa;
        this.Número = Número;
        this.Carga = Carga;
        this.Eletrons = Eletrons;
        this.Isotopo = Isotopo;
        this.Neutron = Neutron;
        this.jPanel2 = jPanel2;
        this.jPanel3 = jPanel3;
        this.jPanel4 = jPanel4;
        
        CarregarIsotopos();
        
    }

Map<String, int[]> isotopos = new HashMap<>();
Map<String, boolean[]> radioativos = new HashMap<>();
    
    int carga;
    int protons;
    int eletrons;
    int neutron;
    int massa;
    String nome;
    
public void Hidrogenio(){
    nome = "Hidrogenio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 1");
    protons = 1;
    eletrons = 1;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Helio() {
    nome = "Helio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 2");
    protons = 2;
    eletrons = 2;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Litio() {
    nome = "Litio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 3");
    protons = 3;
    eletrons = 3;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Berilio() {
    nome = "Berilio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 4");
    protons = 4;
    eletrons = 4;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Boro() {
    nome = "Boro";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 5");
    protons = 5;
    eletrons = 5;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Carbono() {
    nome = "Carbono";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 6");
    protons = 6;
    eletrons = 6;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Nitrogenio() {
    nome = "Nitrogenio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 7");
    protons = 7;
    eletrons = 7;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Oxigenio() {
    nome = "Oxigenio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 8");
    protons = 8;
    eletrons = 8;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Fluor() {
    nome = "Fluor";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 9");
    protons = 9;
    eletrons = 9;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Neonio() {
    nome = "Neonio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 10");
    protons = 10;
    eletrons = 10;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Sodio() {
    nome = "Sodio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 11");
    protons = 11;
    eletrons = 11;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Magnesio() {
    nome = "Magnesio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 12");
    protons = 12;
    eletrons = 12;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Aluminio() {
    nome = "Aluminio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 13");
    protons = 13;
    eletrons = 13;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Silicio() {
    nome = "Silicio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 14");
    protons = 14;
    eletrons = 14;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Fosforo() {
    nome = "Fosforo";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 15");
    protons = 15;
    eletrons = 15;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Enxofre() {
    nome = "Enxofre";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 16");
    protons = 16;
    eletrons = 16;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Cloro() {
    nome = "Cloro";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 17");
    protons = 17;
    eletrons = 17;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Argonio() { 
    nome = "Argonio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 18");
    protons = 18;
    eletrons = 18;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Potassio() {
    nome = "Potassio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 19");
    protons = 19;
    eletrons = 19;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Calcio() {
    nome = "Calcio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 20");
    protons = 20;
    eletrons = 20;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Ferro() {
    nome = "Ferro";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 26");
    protons = 26;
    eletrons = 26;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Galio() {
    nome = "Galio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 31");
    protons = 31;
    eletrons = 31;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Germanio() {
    nome = "Germanio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 32");
    protons = 32;
    eletrons = 32;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Arsenio() {
    nome = "Arsenio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 33");
    protons = 33;
    eletrons = 33;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Selenio() {
    nome = "Selenio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 34");
    protons = 34;
    eletrons = 34;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Bromo() {
    nome = "Bromo";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 35");
    protons = 35;
    eletrons = 35;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Criptonio() {
    nome = "Criptonio";
    Nome.setText("Nome: " + nome);
    Número.setText("Número Atomico: 36");
    protons = 36;
    eletrons = 36;
    neutron = protons;
    massa = protons + neutron;
    Massa.setText("Massa:" + massa);
}

public void Adicionar(){
    eletrons ++;
}

public void Subtrair(){
    eletrons --;
}

public void Verificar(){
    carga = protons - eletrons;

    Eletrons.setText("Elétrons: " + eletrons);
    Carga.setText("Carga: " + carga);

    if (carga == 0) {
        Carga.setText("Átomo neutro");
    } else if (carga > 0) {
        Carga.setText("Cátion");
    } else {
        Carga.setText("Ânion");
    }
}

public void Adicionar_N(){
    neutron ++;
    massa ++;
}

public void Subtrair_N(){
    if (neutron == protons) {
        Neutron.setText("Nao e possivel diminuir mais do que isso.");
    }
    else{
        neutron --;
        massa --;
    }
}

public void CarregarIsotopos() {

isotopos.put("Hidrogenio", new int[]{1,2,3,4,5,6,7,8,9,10});
radioativos.put("Hidrogenio", new boolean[]{false,false,true,true,true,true,true,true,true,true});

isotopos.put("Helio", new int[]{2,3,4,5,6,7,8,9,10,11});
radioativos.put("Helio", new boolean[]{true,false,false,true,true,true,true,true,true,true});

isotopos.put("Litio", new int[]{3,4,5,6,7,8,9,10,11,12});
radioativos.put("Litio", new boolean[]{true,true,true,false,false,true,true,true,true,true});

isotopos.put("Berilio", new int[]{4,5,6,7,8,9,10,11,12,13});
radioativos.put("Berilio", new boolean[]{true,true,true,true,true,false,true,true,true,true});

isotopos.put("Boro", new int[]{5,6,7,8,9,10,11,12,13,14});
radioativos.put("Boro", new boolean[]{true,true,true,true,true,false,false,true,true,true});

isotopos.put("Carbono", new int[]{6,7,8,9,10,11,12,13,14,15});
radioativos.put("Carbono", new boolean[]{true,true,true,true,true,true,false,false,true,true});

isotopos.put("Nitrogenio", new int[]{7,8,9,10,11,12,13,14,15,16});
radioativos.put("Nitrogenio", new boolean[]{true,true,true,true,true,true,true,false,false,true});

isotopos.put("Oxigenio", new int[]{8,9,10,11,12,13,14,15,16,17});
radioativos.put("Oxigenio", new boolean[]{true,true,true,true,true,true,true,true,false,false});

isotopos.put("Fluor", new int[]{9,10,11,12,13,14,15,16,17,18});
radioativos.put("Fluor", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Neonio", new int[]{10,11,12,13,14,15,16,17,18,19});
radioativos.put("Neonio", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Sodio", new int[]{11,12,13,14,15,16,17,18,19,20});
radioativos.put("Sodio", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Magnesio", new int[]{12,13,14,15,16,17,18,19,20,21});
radioativos.put("Magnesio", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Aluminio", new int[]{13,14,15,16,17,18,19,20,21,22});
radioativos.put("Aluminio", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Silicio", new int[]{14,15,16,17,18,19,20,21,22,23});
radioativos.put("Silicio", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Fosforo", new int[]{15,16,17,18,19,20,21,22,23,24});
radioativos.put("Fosforo", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Enxofre", new int[]{16,17,18,19,20,21,22,23,24,25});
radioativos.put("Enxofre", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Cloro", new int[]{17,18,19,20,21,22,23,24,25,26});
radioativos.put("Cloro", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Argonio", new int[]{18,19,20,21,22,23,24,25,26,27});
radioativos.put("Argonio", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Potassio", new int[]{19,20,21,22,23,24,25,26,27,28});
radioativos.put("Potassio", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Calcio", new int[]{20,21,22,23,24,25,26,27,28,29});
radioativos.put("Calcio", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Ferro", new int[]{26,27,28,29,30,31,32,33,34,35});
radioativos.put("Ferro", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Galio", new int[]{31,32,33,34,35,36,37,38,39,40});
radioativos.put("Galio", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Germanio", new int[]{32,33,34,35,36,37,38,39,40,41});
radioativos.put("Germanio", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Arsenio", new int[]{33,34,35,36,37,38,39,40,41,42});
radioativos.put("Arsenio", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Selenio", new int[]{34,35,36,37,38,39,40,41,42,43});
radioativos.put("Selenio", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Bromo", new int[]{35,36,37,38,39,40,41,42,43,44});
radioativos.put("Bromo", new boolean[]{true,true,true,true,true,true,true,true,true,true});

isotopos.put("Criptonio", new int[]{36,37,38,39,40,41,42,43,44,45});
radioativos.put("Criptonio", new boolean[]{true,true,true,true,true,true,true,true,true,true});

}



public void VerificarIsotopo() {
    
    Neutron.setText("Neutrons:" + neutron);
    Massa.setText("Massa:" + massa);

    int[] listaNeutrons = isotopos.get(nome);
    boolean[] listaRadioativos = radioativos.get(nome);

    if (listaNeutrons == null || listaRadioativos == null) {
        Isotopo.setText("Dados não encontrados");
        return;
    }

    for (int i = 0; i < listaNeutrons.length; i++) {

        if (listaNeutrons[i] == neutron) {

            if (listaRadioativos[i]) {
                Isotopo.setText("Isótopo radioativo");
            } else {
                Isotopo.setText("Isótopo estável");
            }

            return;
        }
    }

    Isotopo.setText("Isótopo não cadastrado");
}

public void Salvar(DefaultTableModel tabela) {

    carga = protons - eletrons;

    Object[] dados = {
        nome,
        protons,
        neutron,
        eletrons,
        massa,
        carga,
        Isotopo.getText()
    };

    tabela.addRow(dados);
}

public void MudarCor(Color cor) {
    jPanel2.setBackground(cor);
    jPanel3.setBackground(cor);
    jPanel4.setBackground(cor);
}

}

