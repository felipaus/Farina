/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farinarestorante;

import static com.sun.glass.ui.Cursor.setVisible;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author felip
 */
public class FarinaRestorante {

    public static Pedido p;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner aux = new Scanner(System.in);
        int x = 1;
        int cant[] = new int[50];
        for (int i = 0; i < 50; i++) {
            cant[i] = 0;
        }
        while (x != 0) {
            int cerar = 50;
            for (int i = 0; i < cerar; i++) {
                System.out.println();
            }
            System.out.println("------Menu Principal-----");
            System.out.println("1-Nuevo Pedido");
            System.out.println("2-Acotar Stock");
            System.out.println("0-Finalizar");
            x = aux.nextInt();

            float pre = 100.0F;
            for (int i = 0; i < cerar; i++) {
                System.out.println();
            }
            switch (x) {
                case 1: {
                    p = new Pedido();
                    int j = 2;
                    while (j != 0) {
                        for (int i = 0; i < cerar; i++) {
                            System.out.println();
                        }
                        System.out.println("------carga de pedido------ ");
                        System.out.println("1-Pastas");
                        System.out.println("2-Paninis");
                        System.out.println("3-Piadinas");
                        System.out.println("4-Pizza y calzoni");
                        System.out.println("5-Empanadas");
                        System.out.println("6-Tartas");
                        System.out.println("7-Ensaladas");
                        System.out.println("8-Bebidas");
                        System.out.println("9-Modifciar Pedido");
                        System.out.println("10-Imprimir Pedido");
                        System.out.println("0-Terminar pedido");
                        j = aux.nextInt();
                        for (int i = 0; i < cerar; i++) {
                            System.out.println();
                        }
                        switch (j) {
                            case 1: {
                                System.out.println("-----------PASTAS---------");
                                System.out.println("1-Canelones de jamon y queso (porciones " + (30 - cant[1]) + ") , verduras (porciones " + (30 - cant[2]) + ")");
                                System.out.println("2-Lasagna de jamon y queso (pociones " + (30 - cant[3]) + ") , verdura (porciones " + (30 - cant[4]) + ")");
                                System.out.println("3-Farinata de jamon y quseo (pociones " + (30 - cant[5]) + ") , verdura (pociones " + (30 - cant[7]) + "), hongos(pociones " + (30 - cant[8]) + ")");
                                System.out.println("4-malfatti ricota y espinaca (pociones " + (30 - cant[9]) + ")");
                                System.out.println("5-ñoquis de papa (pociones " + (30 - cant[10]) + ") , calabaza (pociones " + (30 - cant[11]) + ") , rucula y napolitana (pociones " + (30 - cant[12]) + ")");
                                System.out.println("6-tagliatelle");
                                System.out.println("7-spaghetti");
                                System.out.println("8-fusilli");
                                int k = aux.nextInt();
                                for (int i = 0; i < cerar; i++) {
                                    System.out.println();
                                }
                                switch (k) {
                                    case 1: {
                                        System.out.println("------Relleno de Cnelones-----");
                                        System.out.println("1-jamon y queso");
                                        System.out.println("2-verduras");
                                        int l = aux.nextInt();
                                        for (int i = 0; i < cerar; i++) {
                                            System.out.println();
                                        }
                                        switch (l) {
                                            case 1: {
                                                if (cant[1] < 30) {
                                                    String s = salsas();
                                                    pre = 100.0F;
                                                    pastas pas = new pastas("canelon de jamon y queso", pre, s);
                                                    p.set_comida(pas);
                                                     
                                                }
                                               
                                                break;
                                            }
                                            case 2: {
                                                if (cant[2] < 30) {
                                                    String s = salsas();
                                                    pre = 100.0F;
                                                    pastas pas = new pastas("canelon de verduras", pre, s);
                                                    p.set_comida(pas);
                                                    cant[2]++;
                                                    
                                                }
                                                break;
                                            }

                                        }
                                        break;
                                    }

                                    case 2: {
                                        System.out.println("1-jamon y queso");
                                        System.out.println("2-verduras");

                                        int l = aux.nextInt();
                                        for (int i = 0; i < cerar; i++) {
                                            System.out.println();
                                        }
                                        switch (l) {
                                            case 1: {
                                                String s = salsas();
                                                pre = 120;
                                                pastas pas = new pastas("lasagna de jamon y queso", pre, s);
                                                p.set_comida(pas);
                                                break;
                                            }
                                            case 2: {
                                                String s = salsas();
                                                pre = 120;
                                                pastas pas = new pastas("lasagna de verduras", pre, s);
                                                p.set_comida(pas);

                                                break;
                                            }

                                        }
                                        break;
                                    }
                                    case 3: {

                                        System.out.println("1-jamon y queso");
                                        System.out.println("2-verduras");
                                        System.out.println("3-hongos");
                                        int l = aux.nextInt();
                                        for (int i = 0; i < cerar; i++) {
                                            System.out.println();
                                        }
                                        switch (l) {
                                            case 1: {
                                                String s = salsas();
                                                pre = 100;
                                                pastas pas = new pastas("farinatta de jamon y queso", pre, s);
                                                p.set_comida(pas);
                                                break;
                                            }
                                            case 2: {
                                                String s = salsas();
                                                pre = 100;
                                                pastas pas = new pastas("farinatta de verduras", pre, s);
                                                p.set_comida(pas);
                                                break;
                                            }
                                            case 3: {
                                                String s = salsas();
                                                pre = 100;
                                                pastas pas = new pastas("farinata de Homgos", pre, s);
                                                p.set_comida(pas);
                                            }

                                            break;
                                        }
                                        break;
                                    }

                                    case 4: {
                                        String s = salsas();
                                        pre = 90;
                                        pastas pas = new pastas("malfatti ricota y espinaca", pre, s);
                                        p.set_comida(pas);
                                        break;
                                    }
                                    case 5: {
                                        System.out.println("1-papa");
                                        System.out.println("2-calabaza");
                                        System.out.println("3-rucula y napolitana");
                                        int l = aux.nextInt();
                                        for (int i = 0; i < cerar; i++) {
                                            System.out.println();
                                        }
                                        switch (l) {
                                            case 1: {
                                                String s = salsas();
                                                pre = 90;
                                                pastas pas = new pastas("ñoquis papa", pre, s);
                                                p.set_comida(pas);
                                                break;
                                            }
                                            case 2: {
                                                String s = salsas();
                                                pre = 90;
                                                pastas pas = new pastas("ñoquis calabaza", pre, s);
                                                p.set_comida(pas);
                                                break;
                                            }
                                            case 3: {
                                                String s = salsas();
                                                pre = 90;
                                                pastas pas = new pastas("ñoquis rucula y napolitana", pre, s);
                                                p.set_comida(pas);
                                            }
                                            break;
                                        }
                                    }

                                    case 6: {
                                        String s = salsas();
                                        pre = 80;
                                        pastas pas = new pastas("Taglatelle de huevo", pre, s);
                                        p.set_comida(pas);
                                        break;
                                    }
                                    case 7: {
                                        String s = salsas();
                                        pre = 80;
                                        pastas pas = new pastas("Spaghetti", pre, s);
                                        p.set_comida(pas);
                                        break;
                                    }
                                    case 8: {
                                        String s = salsas();
                                        pre = 80;
                                        pastas pas = new pastas("fusilli", pre, s);
                                        p.set_comida(pas);
                                    }
                                }
                                break;

                            }

                            case 2: {
                                System.out.println("----------PANINIS---------");
                                System.out.println("1-paninessa");
                                System.out.println("2-bisteca");
                                System.out.println("3-pollo all'italiana");
                                System.out.println("4-proscitto");
                                System.out.println("5-praga");
                                System.out.println("6-maialino");
                                System.out.println("7-club sandwitch");

                                int k = aux.nextInt();
                                for (int i = 0; i < cerar; i++) {
                                    System.out.println();
                                }
                                switch (k) {
                                    case 1: {

                                        Comidas com = new Comidas("paninessa", 130.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 2: {
                                        Comidas com = new Comidas("bisteca", 150.0F);
                                        p.set_comida(com);
                                        break;
                                    }

                                    case 3: {
                                        Comidas com = new Comidas("pollo all'italiana", 140.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 4: {
                                        Comidas com = new Comidas("proscitto", 130.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 5: {
                                        Comidas com = new Comidas("praga", 130.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 6: {
                                        Comidas com = new Comidas("maialino", 150.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 7: {
                                        Comidas com = new Comidas("club sandwitch", 190.0F);
                                        p.set_comida(com);
                                    }
                                }
                                break;
                            }

                            case 3: {
                                System.out.println("---------PIADINAS----------");
                                System.out.println("1-calabria");
                                System.out.println("2-venezia");
                                System.out.println("3-romagna");
                                System.out.println("4-parma");
                                int k = aux.nextInt();
                                for (int i = 0; i < cerar; i++) {
                                    System.out.println();
                                }
                                switch (k) {
                                    case 1: {
                                        Comidas com = new Comidas("calabria", 120.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 2: {
                                        Comidas com = new Comidas("venezia", 120.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 3: {
                                        Comidas com = new Comidas("romagna", 120.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 4: {
                                        Comidas com = new Comidas("parma", 140.0F);
                                        p.set_comida(com);
                                    }
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("-------------PIZZA Y CALZONI---------");
                                System.out.println("1-margherita");
                                System.out.println("2-prociutto cotto");
                                System.out.println("3-4 stagioni");
                                System.out.println("4-salsiccia");
                                System.out.println("5-diavola");
                                System.out.println("6-napolitana");

                                int k = aux.nextInt();
                                for (int i = 0; i < cerar; i++) {
                                    System.out.println();
                                }
                                switch (k) {
                                    case 1: {
                                        Comidas com = new Comidas("margherita", 150.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 2: {
                                        Comidas com = new Comidas("prociutto cotto", 180.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 3: {
                                        Comidas com = new Comidas("4 stagioni", 200.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 4: {
                                        Comidas com = new Comidas("salsiccia", 200.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 5: {
                                        Comidas com = new Comidas("diavola", 200.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 6: {
                                        Comidas com = new Comidas("napolitana ", 180.0F);
                                        p.set_comida(com);
                                    }
                                }
                                break;
                            }
                            case 5: {
                                System.out.println("-----------EMPANADAS--------------");
                                System.out.println("1-carne");
                                System.out.println("2-pollo");
                                System.out.println("3-jamon y muzzarella");
                                System.out.println("4-caprece");
                                System.out.println("5-fugazetta");
                                System.out.println("6-4 quesos");
                                System.out.println("7-panceta ");
                                System.out.println("8-arabe");
                                System.out.println("9-Champignons");
                                System.out.println("10-humita");
                                System.out.println("11-anana y azucar negra");
                                int k = aux.nextInt();
                                for (int i = 0; i < cerar; i++) {
                                    System.out.println();
                                }
                                System.out.println("Ingrse cantidad de Unidades");
                                int l = aux.nextInt();
                                switch (k) {
                                    case 1: {

                                        Comidas com = new Comidas("carne", 15.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }

                                        break;
                                    }
                                    case 2: {
                                        Comidas com = new Comidas("pollo", 15.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                    case 3: {
                                        Comidas com = new Comidas("jamon y muzzarella", 15.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                    case 4: {
                                        Comidas com = new Comidas("caprece", 15.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                    case 5: {
                                        Comidas com = new Comidas("fugazetta", 15.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                    case 6: {
                                        Comidas com = new Comidas("4 quesos ", 15.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                    case 7: {
                                        Comidas com = new Comidas("panceta", 15.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                    case 8: {
                                        Comidas com = new Comidas("arabe", 15.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                    case 9: {
                                        Comidas com = new Comidas("Champignons", 15.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                    case 10: {
                                        Comidas com = new Comidas("humita", 15.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                    case 11: {
                                        Comidas com = new Comidas("anana y azucar negra ", 15.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                }
                                break;
                            }
                            case 6: {
                                System.out.println("----------------TARTAS----------");
                                System.out.println("1-praga");
                                System.out.println("2-Humita");
                                System.out.println("3-zucca");
                                System.out.println("4-amatriciana");
                                System.out.println("5-tobbo");
                                System.out.println("6-4 quesos");
                                System.out.println("7-mediteranea");
                                int k = aux.nextInt();
                                for (int i = 0; i < cerar; i++) {
                                    System.out.println();
                                }
                                System.out.println("Ingrse cantidad de Porciones");
                                int l = aux.nextInt();
                                switch (k) {
                                    case 1: {
                                        Comidas com = new Comidas("praga", 80.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                    case 2: {
                                        Comidas com = new Comidas("Humita", 80.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                    }
                                    break;
                                    case 3: {
                                        Comidas com = new Comidas("zucca", 80.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                    case 4: {
                                        Comidas com = new Comidas("amatriciana", 80.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                    case 5: {
                                        Comidas com = new Comidas("tobbo", 80.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                    case 6: {
                                        Comidas com = new Comidas("4 quesos", 80.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                    case 7: {
                                        Comidas com = new Comidas("mediteranea", 80.0F);
                                        for (int i = 0; i < l; i++) {
                                            p.set_comida(com);
                                        }
                                        break;
                                    }
                                }
                                break;
                            }
                            case 7: {
                                System.out.println("1-caprese");
                                System.out.println("2-pollo");
                                System.out.println("3-capri");
                                int k = aux.nextInt();
                                for (int i = 0; i < cerar; i++) {
                                    System.out.println();
                                }
                                switch (k) {
                                    case 1: {
                                        Comidas com = new Comidas("caprese", 90.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 2: {
                                        Comidas com = new Comidas("pollo", 90.0F);
                                        p.set_comida(com);
                                        break;
                                    }
                                    case 3: {
                                        Comidas com = new Comidas("capri", 90.0F);
                                        p.set_comida(com);
                                    }
                                }
                                break;
                            }
                            case 8: {
                            }
                            case 9: {
                                System.out.println("Precione el numero de la comida a eliminar");
                                System.out.println("0-cancelar");
                                for (int q = 0; q < p.get_CantidadDeElementos(); q++) {
                                    Comidas Com = p.get_comida(q);
                                    System.out.println("-     " + (q + 1) + "-" + Com.get_nombre() + "      " + Com.get_precio() + " $ \n");
                                }
                                int k = aux.nextInt();
                                if (k != 0) {
                                    p.borrar_comida(k);
                                }
                                for (int i = 0; i < cerar; i++) {
                                    System.out.println();
                                }
                                break;
                            }
                            case 10: {

                                Tiket TK = new Tiket();
                                TK.setVisible(true);
                                for (int i = 0; i < cerar; i++) {
                                    System.out.println();
                                }
                                for (int i = 0; i < cerar; i++) {
                                    System.out.println();
                                }

                                break;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                   
                    }
                    break;
                }
            }
        }
    

    public static String salsas() {
        Scanner aux = new Scanner(System.in);
        System.out.println("Salsas de acompañamiento para pastas");
        System.out.println("1-fileto");
        System.out.println("2-boglonesa");
        System.out.println("3-putanesca");
        System.out.println("4-panceta");
        System.out.println("5-4 quesos");
        System.out.println("6-champignons");
        System.out.println("7-mediteranea");
        System.out.println("8-Blanca");
        System.out.println("9-rosa");
        System.out.println("10-Frutti mare");
        System.out.println("11-Otras");

        int m = aux.nextInt();
   
        switch (m) {
            case 1: {
                return "fileto";
            }
            case 2: {
                return "boglonesa";
            }
            case 3: {
                return "putanesca";
            }
            case 4: {
                return "panceta";
            }
            case 5: {
                return "4 quesos";
            }
            case 6: {
                return "champignons";
            }
            case 7: {
                return "mediteranea";
            }
            case 8: {
                return "Blanca";
            }
            case 9: {
                return "rosa";
            }
            case 10: {
                return "Frutti mare";
            }
            case 11: {
                return "Otras";
            }
        }
         for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        return null;
    }
}
