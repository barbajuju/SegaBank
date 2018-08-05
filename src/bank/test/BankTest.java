package bank.test;

import bank.model.SimpleAccount;

import java.util.Scanner;

public class BankTest {

    private static SimpleAccount currentAccount;
    private static Scanner scanner = new Scanner( System.in );

    public static void main( String[] args ) {

        dspMainMenu();
    }

    public static void dspMainMenu() {
        int response;
        do {
            System.out.println( "*****************************************" );
            System.out.println( "*****************Menu********************" );
            System.out.println( "* 1 - Lister les comptes                *" );
            System.out.println( "* 2 - Ajouter un compte                 *" );
            System.out.println( "* 3 - Gérer un compte                   *" );
            System.out.println( "*****************************************" );
            System.out.println( "*****************************************" );
            System.out.print( "* Entrez votre choix : " );
            response = scanner.nextInt();
        } while ( 0 >= response || response > 4 );
        scanner.nextLine();
        switch ( response ) {
            case 1:
                listAccount();
                break;
            case 2:
                addAccount();
                break;
            case 3:
                ManageAccount();
                break;
        }
    }

    public static void listAccount() {
        System.out.println( "************************************************" );
        System.out.println( "****************Liste des comptes***************" );
        System.out.print( "Voici la liste des comptes : " );
    }

    public static void addAccount() {
        System.out.println( "************************************************" );
        System.out.println( "****************Ajout d'un compte***************" );
        System.out.print( "Entrez le type de compte à créer : " );
    }

    public static void ManageAccount() {
        System.out.println( "************************************************" );
        System.out.println( "**************Gestion d'un compte***************" );
        System.out.print( "Entrez le numéro du compte à gérer : " );
    }
}
