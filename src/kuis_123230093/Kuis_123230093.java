/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis_123230093;
import java.util.Scanner;
import exception.InvalidRosterException;

/**
 *
 * @author Lab Informatika
 */
public class Kuis_123230093 {

    public static void registerTeam(Team t) throws InvalidRosterException{
        t.prepareArena();
        
        try{
            t.validateRoster();
            System.out.println("Roster Sesuai");
        }catch (InvalidRosterException e){
            throw new InvalidRosterException("Roster tidak sesuai!, " + e.getMessage());
        }
        
        t.calculateBonus();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nama;
        int point, roster;
        Scanner input = new Scanner(System.in);
        
        MobaTeam Moba1 = new MobaTeam();
        Moba1.setName("RRQ");
        Moba1.setPlayerCount(5);
        Moba1.joinMatch("MATCH-01");
        Moba1.setPoint(60);
        try{
            registerTeam(Moba1);
        }catch(InvalidRosterException e){
            System.out.println("Error : " + e.getMessage());
        }
        System.out.println("=============================================================================");
       
        FpsTeam FPS1 = new FpsTeam();
        FPS1.setName("AyamJago");
        FPS1.setPlayerCount(3);
        FPS1.joinMatch("MATCH-02");
        FPS1.setPoint(90);
        try{
            registerTeam(FPS1);
        }catch(InvalidRosterException e){
            System.out.println("Error : " + e.getMessage());
        }
        System.out.println("=============================================================================");

        MobaTeam Moba2 = new MobaTeam();
        Moba1.setName("EVOS");
        Moba1.setPlayerCount(5);
        Moba1.joinMatch("MATCH-03");
        Moba1.setPoint(10);
        try{
            registerTeam(Moba2);
        }catch(InvalidRosterException e){
            System.out.println("Error : " + e.getMessage());
        }
        
        
        
        
        
    }
    
}
